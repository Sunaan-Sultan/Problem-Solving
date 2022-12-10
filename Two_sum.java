import java.util.*;
class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int nft = target - nums[i];

            if(hashmap.containsKey(nft)){
                return new int[]{hashmap.get(nft), i};
            }else{
                hashmap.put(nums[i],i);
            }
        }
        return null;
    }
}