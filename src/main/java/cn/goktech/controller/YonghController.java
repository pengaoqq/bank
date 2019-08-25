package cn.goktech.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.goktech.pojo.Quanx;
import cn.goktech.pojo.Yongh;
import cn.goktech.service.YonghService;
import cn.goktech.util.ConstantsConfig;
import cn.goktech.util.Result;

@Controller
@RequestMapping("/yongh")
public class YonghController {
	@Autowired
	private YonghService yonghService;
	
	/**
	 * 登陆功能
	 * @param username
	 * @param password
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/login")
	public Result login(String username, String password, HttpSession session) {
		if(StringUtils.isEmpty(username)) {
			Result.fail("用户名不能为空！");
		}
		if(StringUtils.isEmpty(password)) {
			Result.fail("密码不能为空！");
		}
		//调用业务层的登陆方法
//		int index = yonghService.login(username, password, session);
		Yongh yongh = yonghService.login(username, password, session);
		if(yongh != null) {
			return Result.success(yongh.getJiaosid());
		}
		return Result.fail("用户名或密码错误！");
	}
	
	@ResponseBody
	@RequestMapping("/out")
	public Result out(HttpSession session) {
		session.invalidate();
		return Result.success();
	}
	
	/**
	 * 更新用户信息
	 * @param session
	 * @param yongh
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/getinfo")
	public Result getinfo(HttpSession session) {
		Yongh yongh = (Yongh) session.getAttribute(ConstantsConfig.SESSION_USER);
//		yongh.setYonghmm(null);
		return Result.success(yongh);
	}
	
	@RequestMapping("/updateUser")
	public void updateUser(HttpSession session, Yongh yongh, HttpServletResponse response) {
		response.setContentType("text/html;charset=utf-8");
		Yongh yonghSession = (Yongh) session.getAttribute(ConstantsConfig.SESSION_USER);
		yongh.setId(yonghSession.getId());
		boolean flag = yonghService.update(yongh);
		if(flag) {
			outMsg("更新成功", response);
		}else {
			outMsg("更新失败", response);
		}
		
	}
	
	public void outMsg(String msg, HttpServletResponse response) {
		try {
			response.getWriter().println("<script>alert('" + msg + "')</script>");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@ResponseBody
	@RequestMapping("/easyuiGetData")
	public Map<String, Object> easyuiGetData(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "2") int rows, String zh, String zt){
		PageInfo<Yongh> pageInfo = yonghService.getAll(page, rows, zh, zt);
		if(pageInfo != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("total", pageInfo.getTotal());
			map.put("rows", pageInfo.getList());
			return map;
		}
		return null;
	}
	
	@RequestMapping("/updYongh")
	@ResponseBody
	public Result updYongh(Yongh yongh) {
		int index = yonghService.updYongh(yongh);
		if(index == 1) {
			return Result.success("修改成功");
		}else {
			return Result.fail("修改失败");
		}
	}

	@RequestMapping("/queryYonghById")
	@ResponseBody
	public Result queryYonghById(String id) {
		Yongh yongh = yonghService.queryYonghById(id);
		if(yongh != null) {
			return Result.success(yongh);
		}
		return null;
	}

	@RequestMapping("/delYongh")
	@ResponseBody
	public Result delYongh(String id) {
		int index = yonghService.delYongh(id);
		if (index > 0) {
			return Result.success("删除成功");
		} else {
			return Result.fail("删除失败");
		}
	}
	
	@ResponseBody
	@RequestMapping("/addYongh")
	public Result addYongh(Yongh yongh) {
		yongh.setId(UUID.randomUUID().toString());
		int index = yonghService.addYongh(yongh);
		if(index > 0) {
			return Result.success("添加成功");
		}else {
			return Result.fail("添加失败");
		}
	}
	
}
	
	
