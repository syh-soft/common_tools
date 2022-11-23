package com.syh.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author syh
 * @date 2022-10-09 11:01
 */
public class RandomGroup {

    /**
     *
     * @param nums 人数
     * @param n 小组数
     */
    public static void getRandomGroup(int nums,int n){
        if(nums%n != 0||nums==0||n==0){
            System.out.println("人数不足");
        }
        else {
            int num = nums/n;
            List<List<Integer>> storage = new ArrayList<>();
            for(int i = 0; i < n; i++){
                storage.add(new ArrayList<>());
            }
            Random random = new Random();
            for(int i = 0; i < nums;){
                int val = random.nextInt(n);
                if(storage.get(val).size()< num){
                    storage.get(val).add(i+1);
                    i++;
                }
            }
            for(int i = 0; i < n; i++){
                System.out.println(storage.get(i));
            }
        }

    }

    public static void main(String[] args) {

        getRandomGroup(50,5);
    }
}
