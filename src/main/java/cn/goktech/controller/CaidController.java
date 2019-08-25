package cn.goktech.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.goktech.pojo.Caid;
import cn.goktech.service.CaidService;
import cn.goktech.vo.CaidData;
import cn.goktech.vo.YonghCaid;

@Controller
@RequestMapping("/caid")
public class CaidController {
	@Autowired
	private CaidService caidService;
	
	@ResponseBody
	@RequestMapping("/getAll")
	public List<CaidData> getAll(){
		List<CaidData> list = caidService.getAll();
		return list;
	}

	@ResponseBody
	@RequestMapping("/getAllCaidAndUserRights")
	public List<CaidData> getAllCaidAndUserRights(String quanxId){
		List<CaidData> list = caidService.getAllCaidAndUserRights(quanxId);
		return list;
	}
	
	@RequestMapping("/save")
	public String save(Caid caid, HttpServletResponse response) throws IOException{
		caidService.save(caid);
		return "redirect:/page/cate_list.html";
	}

	@RequestMapping("/delete")
	public void delete(Caid caid,HttpServletResponse response) throws IOException{
		caidService.delete(caid);
	}
	
	@RequestMapping("/edit")
	public String edit(Caid caid) {
		int i = caidService.edit(caid);
		return "redirect:/page/cate_list.html";
	}
	
	@ResponseBody
	@RequestMapping("/getQuanxzAll")
	public List<YonghCaid> getQuanxzAll(String quanxzId){
		List<YonghCaid> list = caidService.getQuanxzAll(quanxzId);
		List<YonghCaid> finalList = new ArrayList<YonghCaid>();
		YonghCaid mainMenu = new YonghCaid();
		mainMenu.setId("1");
		mainMenu.setName("主菜单");
		mainMenu.setParent("0");
		mainMenu.setChildMenus(list);
		finalList.add(mainMenu);
		return finalList;
	}
	
}
	
	
