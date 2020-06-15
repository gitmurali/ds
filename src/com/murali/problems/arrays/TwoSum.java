package com.murali.problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int nums[] = {2, 7, 11, 15};
    int len = nums.length;
    int target = 18;
    int result[] = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < len; i++) {
      if(map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
      } else {
        map.put(nums[i], i);
      }
    }
    System.out.println("result: " + Arrays.toString(result));
  }
}
