package com.unionpay.acp.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DemoTest {

    public static void main(String args[]) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.parse("2019-03-06 23:59:59").toString());
    }
}
