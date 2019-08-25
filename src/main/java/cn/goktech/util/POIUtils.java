package cn.goktech.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class POIUtils {
	/**
	 * 创建excel并填入数据
	 * 
	 * @author LiQuanhui
	 * @date 2017年11月24日 下午5:25:13
	 * @param head
	 *            数据头
	 * @param body
	 *            主体数据
	 * @return HSSFWorkbook
	 */
	public static HSSFWorkbook expExcel(JSONArray head, JSONArray body) {
		// 创建一个excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 创建一个sheet工作表
		HSSFSheet sheet = workbook.createSheet("学生信息");
		// 创建第0行表头，再在这行里在创建单元格，并赋值
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		for (int i = 0; i < head.size(); i++) {
			cell = row.createCell(i);
			cell.setCellValue(head.getString(i));// 设置值
		}
		// 将主体数据填入Excel中
		for (int i = 0, isize = body.size(); i < isize; i++) {
			row = sheet.createRow(i + 1);
//			JSONArray stuInfo = body.getJSONArray(i);
			JSONObject obj = body.getJSONObject(i);
			Collection<Object> values = obj.values();
			Object[] array = new Object[values.size()];
			values.toArray(array);
			System.out.println(values);
			for (int j = 0, jsize = array.length; j < jsize; j++) {
				cell = row.createCell(j);
				cell.setCellValue(array[j].toString());// 设置值
			}
		}
		return workbook;
	}

	public static void outFile(HSSFWorkbook workbook, String path) {
		OutputStream os = null;
		try {
			os = new FileOutputStream(new File(path));
			// HSSFWorkbook.write() 吧该表格对象写入到一个流里面
			workbook.write(os);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JSONArray head = new JSONArray();
		head.add("姓名");
		head.add("年龄");
		JSONArray row1 = new JSONArray();
		row1.add("张三");
		row1.add("11");
		JSONArray row2 = new JSONArray();
		row2.add("李四");
		row2.add("111");
		JSONArray body = new JSONArray();
		body.add(row1);
		body.add(row2);
		HSSFWorkbook hSSFWorkbook = expExcel(head, body);
		outFile(hSSFWorkbook, "f://text.xls");
	}
}
