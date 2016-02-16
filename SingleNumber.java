/*Given an array of integers, every element appears twice except for one. 
 * Find that single one.
 * 
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		if (nums.length < 2) {
			return nums[0];
		}

		java.util.Arrays.sort(nums);

		for (int i = 0; i < nums.length - 1;) {
			if (nums[i] == nums[i + 1]) {
				i += 2;
			} else {
				return nums[i];
			}
		}

		return nums[nums.length - 1];
	}
}