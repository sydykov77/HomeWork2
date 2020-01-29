package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Erzhan";
        int age = 61;
        int temperature = 15;


        if (20 < age && 45 > age) {
            if (-22 < temperature || 30 > temperature) {
                System.out.println("Вам нельзя на улицу");
            } else {
                System.out.println(name + " отправляйтесь в гости к своему другу");
            }
        }


        if (age < 20) {
            if (temperature >= 0 && temperature < 28) {
                System.out.println("Вам нельзя на улицу");
            } else {
                System.out.println(name + " отправляйтесь в гости к своему другу");
            }
        }
        if (age >= 45) {
            if (temperature >= -10 && temperature < 25) {
                System.out.println("Вам нельзя на улицу");
            } else {
                System.out.println(name + " отправляйтесь в гости к своему другу");
            }

        }


    }}

