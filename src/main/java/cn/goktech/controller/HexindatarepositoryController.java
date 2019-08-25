package cn.goktech.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageInfo;

import cn.goktech.pojo.Hexindatarepository;
import cn.goktech.service.HexindatarepositoryService;
import cn.goktech.util.POIUtils;

@Controller
@RequestMapping("/nianjian")
public class HexindatarepositoryController {
	@Autowired
	private HexindatarepositoryService hexindatarepositoryService;
	
	@ResponseBody
	@RequestMapping("/easyuiGetData")
	public Map<String, Object> easyuiGetData(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "2") int rows, String gsmc) {
		PageInfo<Hexindatarepository> pageInfo = hexindatarepositoryService.getAll(page, rows, gsmc);
		if(pageInfo != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("total", pageInfo.getTotal());
			map.put("rows", pageInfo.getList());
			return map;
		}
		return null;
	}
	
	@RequestMapping("/outFail")
	public void outFail(HttpServletResponse response) {
		List<Hexindatarepository> lists = hexindatarepositoryService.getAllFail();
		String data = JSON.toJSONString(lists);
		JSONArray body = JSON.parseArray(data);
		HSSFWorkbook hssfWorkbook = POIUtils.expExcel(new JSONArray(), body);
//		response.setCharacterEncoding("utf-8");
		 //1.设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("application/octet-stream");
        //2.设置文件头：最后一个参数是设置下载文件名(假如我们叫a.pdf)
        response.setHeader("Content-Disposition", "attachment;fileName=fail-list.xls");
		try {
			hssfWorkbook.write(response.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@ResponseBody
	@RequestMapping("/countData")
	public List<Map<String, Object>> countData() {
		return hexindatarepositoryService.countData();
	}
	
}
	
	
