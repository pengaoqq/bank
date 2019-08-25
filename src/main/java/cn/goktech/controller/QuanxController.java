package cn.goktech.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.goktech.pojo.Quanx;
import cn.goktech.service.QuanxService;
import cn.goktech.util.Result;

@Controller
@RequestMapping("/quanx")
public class QuanxController {
	@Autowired
	private QuanxService quanxService;
	
	@ResponseBody
	@RequestMapping("/easyuiGetData")
	public Map<String, Object> easyuiGetData(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "2")int rows){
		PageInfo<Quanx> pageInfo = quanxService.getAll(page, rows);
		if(pageInfo != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("total", pageInfo.getTotal());
			map.put("rows", pageInfo.getList());
			return map;
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("/delQuanx")
	public Result delQuanx(String id) {
		int index = quanxService.delQuanx(id);
		if (index > 0) {
			return Result.success("删除成功");
		} else {
			return Result.fail("删除失败");
		}
	}

	@ResponseBody
	@RequestMapping("/queryQuanxById")
	public Result queryQuanxById(String id) {
		Quanx quanx = quanxService.queryQuanxById(id);
		if(quanx != null) {
			return Result.success(quanx);
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("/updQuanx")
	public Result updQuanx(Quanx quanx) {
		int index = quanxService.updQuanx(quanx);
		if(index == 1) {
			return Result.success("修改成功");
		}else {
			return Result.fail("修改失败");
		}
	}

	@ResponseBody
	@RequestMapping("/addQuanx")
	public Result addQuanx(Quanx quanx) {
		quanx.setId(UUID.randomUUID().toString());
		int index = quanxService.addQuanx(quanx);
		if(index > 0) {
			return Result.success("添加成功");
		}else {
			return Result.fail("添加失败");
		}
	}
}
	
	
