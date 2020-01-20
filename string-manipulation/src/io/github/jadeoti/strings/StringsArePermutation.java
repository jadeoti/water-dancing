package io.github.jadeoti.strings;

import java.util.HashMap;

public class StringsArePermutation {
    public static void main(String[] args) {

        System.out.println(isPermutation("ejie", "jie"));

    }

    static boolean isPermutation(String s, String t){

        if(s == null || t == null) return false;

        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                int count = map.get(c);
                map.put(c, count + 1);
            }
        }

        for(char c : t.toCharArray()){
            int count = map.get(c);
            count = count - 1;
            map.put(c, count);
            if(count < 0) return false;
        }

        return true;
    }
}
