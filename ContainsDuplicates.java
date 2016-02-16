import java.util.HashMap;
import java.util.Map;

/* Given an array of integers and an integer k, 
 * find out whether there are two distinct indices i and j 
 * in the array such that nums[i] = nums[j] and 
 * the difference between i and j is at most k.
 */
public class ContainsDuplicates {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> dupMap = new HashMap<Integer, Integer>();

		boolean flag = false;

		if (nums.length == 0) {
			return false;
		}

		else {
			for (int i = 0; i < nums.length; i++) {
				if (dupMap.containsKey(nums[i])) {
					int index = dupMap.get(nums[i]);
					if ((i - index) <= k) {
						flag = true;
					} else {
						dupMap.put(nums[i], i);
					}
				} else {
					dupMap.put(nums[i], i);
				}
			}
		}

		if (flag == true) {
			return true;
		}
		return false;
	}
}
