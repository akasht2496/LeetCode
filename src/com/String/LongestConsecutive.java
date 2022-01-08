package com.String;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

	public static void main(String[] args) {
		int [] arr= {100,4,200,1,3,2,5};
		System.out.println(longestConsecutive(arr));
		
	}

	public static int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int num : nums){
            set.add(num);
        }
        int res=0;
        for(int num :nums){
            if(!set.contains(num-1)){
                int cur=num;
                int l=1;
                while(set.contains(cur+1)){
                    cur+=1;
                    l+=1;
                }
                res=Math.max(res,l);
            }
        }
        return res;
    }
	
}
