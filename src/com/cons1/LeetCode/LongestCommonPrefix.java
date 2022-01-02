/*
package com.cons1.LeetCode;

*/
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*//*


public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        char common_prefix = (strs[0].charAt(0));
        String cp = String.valueOf(common_prefix);
        int flag = 0;

        for (int i = 1; i < strs.length; i++){
            if(strs[i].charAt(i) == common_prefix){
                System.out.println(common_prefix);
                continue;
            }
            else {
                common_prefix = 'x';
                break;
            }
        }
        System.out.println(common_prefix);
    }
}



Phone Kor
*/
