package cn.goktech.vo;

import java.util.List;

public class CaidData {
	private String id;
	private String text;
	private boolean checked;
	private List<CaidData> children;

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<CaidData> getChildren() {
		return children;
	}

	public void setChildren(List<CaidData> children) {
		this.children = children;
	}
	
}
