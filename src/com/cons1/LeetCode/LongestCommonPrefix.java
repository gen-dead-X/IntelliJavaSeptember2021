package com.cons1.LeetCode;/*
package com.cons1.LeetCode;

*/
/*
Input: strs = ["flower","flow","flight"]
Output: "fl"
*/


public class LongestCommonPrefix {
    public static void main(String[] args) {
//        String strs[] = {"flower", "flow", "flight"};
        String strs[] = {"fluler", "flu", "fluwer", "fluwer", "fluwer", "fluwer"};
        char cp = '\0';
        int c = 0;
        int j = 0;
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < strs.length; i++) {
            cp = strs[i].charAt(i);
//            System.out.println(cp);

            while (j < strs.length) {
//                System.out.println(strs[j].charAt(i));
                if (cp == strs[j].charAt(i)) {
                    c++;
                }


                j++;
            }
            if (c == strs.length)
                s.append(strs[i].charAt(i));

            j = 0;

            c = 0;

            if(strs[i].length() < strs.length)
                break;
        }

        System.out.println(s);

    }
}



