package com.mikaelson.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	public static String formatDate(String partern,Date date) {
		return new SimpleDateFormat(partern).format(date) ;
	}
}
