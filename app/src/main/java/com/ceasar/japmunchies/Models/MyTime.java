package com.ceasar.japmunchies.Models;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyTime {
    private int second;
    private int minute;
    private int hour;
    private int day;
    private int month;
    private int year;


    public MyTime(){}

    public MyTime(int second,int minute,int hour,int day,int month,int year){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyTime(int second,int minute,int hour){
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public MyTime(Calendar c){
        this.second = c.get(Calendar.SECOND);
        this.minute = c.get(Calendar.MINUTE);
        this.hour = c.get(Calendar.HOUR);
        this.day = c.get(Calendar.DAY_OF_MONTH);
        this.month = c.get(Calendar.MONTH);
        this.year = c.get(Calendar.YEAR);
    }




    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }


    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month+1;
    }

    public void setMonth(int month) {
        this.month = month+1;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getComputerMonth(){
        return month;
    }

    public void setComputerMonth(int month){
        this.month = month;
    }


    public String getAbbreviatedMonth(){
        return getMonthName_Abbr(getMonth());
    }

    private static String getMonthName_Abbr(int month) {
        Calendar calx = Calendar.getInstance();
        calx.set(Calendar.MONTH, month-1);
        SimpleDateFormat month_date = new SimpleDateFormat("MMM");
        String month_name = month_date.format(calx.getTime());
        return month_name;
    }
}
