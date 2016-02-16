import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Boolean> check = new HashMap<Integer, Boolean>();
        for(int i=0;i<nums.length;i++){
            if(check.containsKey(nums[i])){
                return true;
            }
            else{
                check.put(nums[i], true);
            }
        }
        
        return false;
    }
}