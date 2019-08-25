package cn.goktech.util;

public class Result {
	private int code;	//状态码
	private String message;	//提示信息
	private Object data;	//返回用户的数据
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	public static Result success() {
		Result result = new Result();
		result.setCode(1);
		return result;
	}
	
	//请求成功
	public static Result success(Object data) {
		Result result = new Result();
		result.setCode(1);
		result.setData(data);
		return result;
	}
	
	//请求失败
	public static Result fail(String msg) {
		Result result = new Result();
		result.setCode(-1);
		result.setMessage(msg);
		return result;
	}
	@Override
	public String toString() {
		return "Result [code=" + code + ", message=" + message + ", data=" + data + "]";
	}
	
}
