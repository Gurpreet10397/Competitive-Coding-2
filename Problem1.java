// Time complexity: O(n)
// Space Complexity:O(n)


public int[] twoSum(int[] nums, int target) {

    HashMap<Integer,Integer> map =  new HashMap<>(); // Map to store  value , index
    int [] ans = new int[2]; // array to store result

    for(int i = 0; i<nums.length;i++ ) // filling the map
    {
      
            map.put(nums[i],i);

    }
      
    for(int i=0;i<nums.length;i++)
    {
        if(map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i) // Check if target - num[i] present and index is not same in case of duplicates  eg. [3,3] t = 6
        {
            ans [0] = i;
            ans [1] = map.get(target-nums[i]);
        }
    }

    return ans;

    }