package cn.goktech.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;

import cn.goktech.pojo.Dazyhkh;
import cn.goktech.service.KaiHuService;
import cn.goktech.util.Result;

@Controller
@RequestMapping("/kaiHu")
public class KaiHuController {
	int i = 100;
	@Autowired
	private KaiHuService kaiHuService;
	
	@ResponseBody
	@RequestMapping("/easyuiGetData")
	public Map<String, Object> easyuiGetData(@RequestParam(defaultValue = "1")int page,@RequestParam(defaultValue = "2") int rows){
		PageInfo<Dazyhkh> pageInfo = kaiHuService.getAll(page, rows);
		if(pageInfo != null) {
			Map<String, Object> map = new HashMap<>();
			map.put("total", pageInfo.getTotal());
			map.put("rows", pageInfo.getList());
			return map;
		}
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/checkData")
	public Result checkData(String companyCode){
		return Result.success();
	}
	
	@RequestMapping("/save")
	public String save(Dazyhkh dazyhkh){
		dazyhkh.setId(UUID.randomUUID().toString());
		dazyhkh.setJigid("010101");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String dateStr = sdf.format(new Date());
		if(i == 1000) {
			i = 100;
		}
		dateStr = dateStr + ++i;
		dazyhkh.setLiush(dateStr);
		boolean flag = kaiHuService.save(dazyhkh);
		return "redirect:/page/KaiHulist.html";
	}
	
}
	
	
