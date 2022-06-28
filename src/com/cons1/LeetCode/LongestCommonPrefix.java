package com.cons1.LeetCode;/*
package com.cons1.LeetCode;

*/
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

//        String strs[] = {"flower", "flow", "flight"};
        HashMap< Integer, Character> map = new HashMap<Integer, Character>();

        int len = strs[0].length();

        String str = "";

        for (int i = 0 ; i < len ; i++) {
            char ch = strs[i].charAt(i);

            if(strs[i].length() < len)
                len = strs[i].length();
            if(i == 0){
                for (int j = i; i < strs[j].length(); j++)
                    map.put(i , ch);
            }
            for (int j = i; i < strs[j].length(); j++)

                    map.put(i, ch);

        }

        for (Integer name : map.keySet()){

        }








        return strs[0];
    }
}



