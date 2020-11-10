package com.ocp3;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] score = new int[3]; //有3科考試成績
        score[0] = 100; //國
        score[1] = 90; //英
        score[2] = 80; //數
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
