// link : https://leetcode.com/submissions/detail/909456665/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
                
        HashMap<Integer, Integer> hash1 = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            
            if(hash1.containsKey(nums[i])){
                int freq = hash1.get(nums[i]);
                hash1.put(nums[i], freq+1);
            }
            else{
                hash1.put(nums[i],1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash1.entrySet());

        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        ArrayList<Integer> ansNums = new ArrayList<>();
        
        for(int i=0; i<k && i<list.size(); i++){
            Map.Entry<Integer,Integer> temp = list.get(i);
            ansNums.add(Integer.valueOf(temp.getKey()));
        }

        int[] ans = new int[ansNums.size()];
        for(int i=0; i<ansNums.size(); i++){
            ans[i]=ansNums.get(i);
        }

        return ans;
    }
}