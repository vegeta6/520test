package com.offcn.controller;

public class Demo {
    public static void main(String[] args) {
        int i = 1 , j = 2, k = 5 , num = 0;
        for (int a = 0; a <= 10; a ++) {
            for (int b = 0; b <= 10; b++) {
                for (int c = 0; c <= 10; c++) {
                    if (i * a + j * b + k * c == 10) {
                        num ++;
                        System.out.println(i + "*" + a + "+" + j + "*" + b + "+" + k + "*" + c + "= 10");
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("共有" + num + "种方案");
    }

}
