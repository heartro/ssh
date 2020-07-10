package com.zhangwei.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 請求參數到java.util.Date類型的轉換器
 * 
 * @author ZhangWei
 *
 */
public class DateTimeConverter implements Converter<String, Date> {
	public static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");


	public Date convert(String dateStr) {
		Date date = null;
		try {
			date = dateTimeFormat.parse(dateStr);
		} catch (ParseException e) {
			try {
				date = dateFormat.parse(dateStr);
			} catch (ParseException e1) {
				try{
					date = dateFormat2.parse(dateStr);
				}catch (ParseException e2){

				}
			}
		}
		return date;
	}
}