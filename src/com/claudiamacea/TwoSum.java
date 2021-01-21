package com.claudiamacea;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] test = {1,2,3,4,11,6,13};
        int sum = 24;
            int[]result = TwoSum.twoSum(test,sum);
            System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> numbers = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(numbers.containsKey(complement)){
                return new int[] {i,numbers.get(complement)};
            }else{
                numbers.put(nums[i],i);
            }
        }
        throw new IllegalArgumentException("No such pair found!");
    }
}
