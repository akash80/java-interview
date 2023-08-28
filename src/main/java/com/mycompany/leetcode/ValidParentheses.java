/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

import java.util.Stack;

/**
 *
 * @author admin
 */
public class ValidParentheses {
    public static void main(String args[]){
        isValid("({}})[]");
    }
    
    public static boolean isValid(String s) {
        Stack<Character> data = new Stack<>();
        for(int i=0; i<s.length();i++){
            Character c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                data.push(s.charAt(i));
            }else{
                if(!data.isEmpty()){
                    int char1 = c;
                    int char2 = data.peek();
                    if(char2 == char1-1 || char2 == char1-2){
                        data.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(data.isEmpty())
            return true;
        else
            return false;    
    }
}
