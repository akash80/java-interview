/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

/**
 *
 * @author admin
 */
public class StockBuySell {
    public int maxProfit(int[] prices) {
        int purchase = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int p: prices){
            if(p<purchase){
                purchase = p;
            }else{
                if(p-purchase>profit){
                    profit = p-purchase;
                }
            }
        }
        if(profit>0){
            return profit;
        }
        return 0;
    }
}
