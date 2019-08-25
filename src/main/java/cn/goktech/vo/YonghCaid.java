package cn.goktech.vo;

import java.util.List;

public class YonghCaid {
	private String id;
	private String name;
	private String url;
	private String parent;
	private String icon;
	
	public String getIcon() {
		return "";
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	private List<YonghCaid> childMenus;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public List<YonghCaid> getChildMenus() {
		return childMenus;
	}
	public void setChildMenus(List<YonghCaid> childMenus) {
		this.childMenus = childMenus;
	}
	
}
