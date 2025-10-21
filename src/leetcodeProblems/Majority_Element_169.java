package leetcodeProblems;

public class Majority_Element_169 {
        public int majorityElement(int[] nums) {
            int n = 0;
            int count = 0;
            for(int i=0; i<nums.length ; i++){
                if(count == 0){
                    n = nums[i];
                    count++;
                }else if(n != nums[i]){
                    count--;
                }else if(n == nums[i]){
                    count++;
                }

            }
            return n;
        }

    
}
