package com.test;

public class Day01 {
    public static void main(String [] args){
        //System.out.println("hello World !");
//        int a = 1.1; //1.1是double类型的数据，不能直接赋值给int型变量；        正确示例：int a= (int)1.1;
//
//        int f = 2;//赋值正确;
//
//        char b = lemon;//赋值错误，lemon是一串字符，无法赋值给char型变量；      正确示例：String b = "lemon";
//
//        char c = %;//赋值错误，字符型数据应该用单引号标注；                    正确示例：char c =‘%’;
//
//        char p = "%";//赋值错误，双引号代表字符串，不能赋值给char类型变量；      正确示例：String p = "%";
//
//        char d = '%';//赋值正确;
//
//        long e = 1.1;//1.1是double类型的数据，不能直接赋值给long型变量；      正确示例：long e = (long)1.1;
//
//        long g = 3;//赋值正确;
//
//        float j = 2.3;//2.3是double类型的数据，不能直接赋值给float型变量；    正确示例：float j = 2.3f;  float j = (float)2.3;
//
//        float m = 2.3f;//赋值正确;
//
//        double n = 3.33;//赋值正确
        int x = 1;int y = 2;int z = 3;
        System.out.println(x+(--z));
    }

}
