/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leetcode;

import java.util.HashMap;
import java.util.Map;
import org.hsqldb.lib.StopWatch;

/**
 *
 * @author admin
 */
public class ValidAnagram {
    
    public static void main(String args[]){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        boolean result = isAnagram("anagram", "nagaram");
        stopWatch.stop();
        System.out.println(result+", took: "+stopWatch.currentElapsedTime());
    }
    
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>(); 
        for(Character c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        for(Character c: t.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0){
                return false;
            }else{
                map.put(c,map.get(c)-1);
            }
        }
        return true;
    }
}
