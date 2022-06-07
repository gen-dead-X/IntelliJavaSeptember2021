package com.cons1.LeetCode;

import java.util.*;

public class IntersectionofTwoArraysII {
/*    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int i: nums1){
            if(map1.containsKey(nums1[i]))
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            else
                map2.put(nums2[i], 1);
        }

        for(int i: nums2){
            if(map2.containsKey(nums2[i]))
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            else
                map2.put(nums2[i], 1);
        }

        for(Integer key : map1.keySet()){
            if(map2.containsKey(key)) {
                int x = Math.min(map2.get(key) , map1.get(key));
                while(x-- > 0)
                    list.add(map2.get(key));
            }
        }
        int arr[] = new int[list.size()];

        for(int i : arr)
            arr[i] = list.get(i);
        return arr;
    }*/

/*    public static int[] intersect(int[] nums1, int[] nums2) { //uses More Space
        List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++){
            if(hm1.containsKey(nums1[i])){
                hm1.put(nums1[i], nums1[i] + 1);
            }
            else
                hm1.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++){
            if(hm1.containsKey(nums2[i])){
                hm2.put(nums2[i], nums2[i] + 1);
            }
            else
                hm2.put(nums2[i], 1);
        }

        for(Integer key : hm1.keySet()){
            if(hm2.containsKey(key)){
                int x = Math.min(hm1.get(key), hm2.get(key));
                while(x-- > 0)
                    list.add(key);
            }
        }

        int res[] = new int[list.size()];
        for(int i=0; i < list.size(); i++)
            res[i] = list.get(i);

        return res;
    }*/

    public static int[] intersect(int[] nums1, int[] nums2) { //Much more optimized Version

        int length1 = nums1.length;
        int length2 = nums2.length;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

//        int[] arr = new int[length1 + length2]; //I'm using less space by returning the same availabe array. Nums1 or Nums2
        int i = 0 , j = 0, k = 0;

        while (i < length1 && j < length2) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else{
                nums1[k++] = nums1[i++];
                j++;
            }
        }

        return Arrays.copyOfRange(nums1, 0 , k);
    }

    public static void main(String[] args) {
        int nums1[] = {9,4,9,8,4};
        int nums2[] = {4,9,5};

        int arr1[] = intersect(nums1, nums2);

       /* for(int i : arr1)
            System.out.print(arr1[i] + " ");*/

        for (int i = 0 ; i < arr1.length ; i++)
            System.out.print(arr1[i] + " ");
    }
}
