
package com.ocp14_collection_list_map;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> pokers = new LinkedList<>(); 
        for (int i = 1; i < 10; i++) pokers.add(i+"");  
        pokers.add("J");pokers.add("Q");pokers.add("K");
        System.out.println(pokers);
        // 洗牌? 調換位置
        Collections.shuffle((List)pokers);
        System.out.println(pokers);
        // 拿牌
        String card1 = pokers.poll();
        String card2 = pokers.poll();
        System.out.println(card1);
        System.out.println(card2);
        // 計算分數
        double score = getScore(card1, card2);
        System.out.println(score);
        // double score = getScore(card1) + getScore(card2);        
        // 剩餘的牌
        System.out.println(pokers);
        
    }
    
    
    
    public static double getScore(String card1, String card2) {
        return getScore(card1) + getScore(card2);
    }
    
    
    public static double getScore(String card) {
        if("JQK".contains(card)) {
            return 0.5;
        } else {
            return Double.parseDouble(card); // 將字串轉為double
        }
    }
    
    
}
