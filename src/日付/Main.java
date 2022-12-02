package 日付;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception{
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}
	
	/**
	 * Date型のみの使い方
	 * Java全バージョン適用
	 */
	private static void date() {
		// 現在時刻を取得
		Date date = new Date();
		System.out.println(date);
	}
	
	/**
	 * SimpleDateFormatの使い方
	 * Java1.1から使用可能
	 * @throws ParseException
	 */
	private static void simpleDateFormat() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = sdf.parse("2017/01/01 12:00:00");
		System.out.println(date.toString());
	}
	
	/**
	 * Calendarの使い方
	 */
	private static void calendar() {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.getWeekYear());
		calendar.add(Calendar.MONTH, 3);
		System.out.println(calendar.getWeekYear());
	}
	
	/**
	 * LocalDateの使い方
	 * 日時を取得することができる
	 */
	private static void localDate() {
		LocalDate date = LocalDate.now();
		System.out.println(date);
	}
	
	/**
	 * LocalTimeの使い方
	 * 時刻を取得することができる
	 */
	private static void localTime() {
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
	}
	
	/**
	 * LocalDateTimeの使い方
	 * 日付と時刻を取得することができる
	 */
	private static void localDateTime() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}
}
