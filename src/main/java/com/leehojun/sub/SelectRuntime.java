package com.leehojun.sub;

public class SelectRuntime {

    public void selection (int first , int second) {


        if (first<0 || second <0) {

            if (first > second) {

                System.out.println("B 방향으로 "+first+"분 걸립니다");
            }
            else {

                System.out.println("J 방향으로 "+second+"분 걸립니다");
            }
        }
        else if (first > second){

            System.out.println("J 방향으로 " + second+"분 걸립니다");
        }
        else {

            System.out.println("B 방향으로 " + first + "분 걸립니다");
        }



    }
}
