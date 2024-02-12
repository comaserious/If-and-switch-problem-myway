package com.leehojun.payment;

import java.util.Scanner;

public class PaymentWorkPlace {

    public void payment () {

        Scanner scr = new Scanner(System.in);
        System.out.print("몇월 인가요 ? : ");
        int month = scr.nextInt();
//        System.out.println("what day? : ");
//        int day = scr.nextInt();
//        System.out.println("what hour : ");
//        int hour =scr.nextInt();
        System.out.print("얼마나 결석했나요 ? : ");
        int absent = scr.nextInt();

//        int normalPay = 5800;
//        int specialPay = 10000;

        int unitDay = 0;


        switch (month) {
            case 2 :
                unitDay = 21;

                canAbsent(unitDay,absent);

                break;

            case 3 :
                unitDay = 20;

                canAbsent(unitDay,absent);


                break;

            case 4 :
                unitDay = 21;

                canAbsent(unitDay,absent);


                break;

            case 5 :
                unitDay = 19;

                canAbsent(unitDay,absent);


                break;

            case 6 :
                unitDay=20;

                canAbsent(unitDay,absent);


                break;

            case 7 :
                unitDay=21;

                canAbsent(unitDay,absent);


                break;

            case 8 :
                unitDay=10;

                canAbsent(unitDay,absent);


                break;


        }
    }

    public void canAbsent (int unitDay , int absent) {

        int canAbsent = (int)(unitDay*0.2)-absent;
        int payment = 15800*(unitDay-absent);

        if (canAbsent>0) {
            System.out.println("결석할수 있는 일수 : "+canAbsent);

            System.out.println("남은 기간 전부 출석 할 경우 받을 급여 : "+payment);

        }
        else if (canAbsent==0){
            System.out.println("더이상 결석할수 없습니다");

            System.out.println("남은 기간 전부 출석 할 경우 받을 급여 : "+payment);
        }
        else {
            System.out.println("출석수 부족으로 급여를 받을수 없습니다");
        }


    }



}
