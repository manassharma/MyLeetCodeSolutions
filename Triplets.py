'''Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity. '''

import sys
class Solution(object):
    def increasingTriplet(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if(len(nums)<3):
            return False

        a = nums[0]
        max = sys.maxint

        for i in range(0, len(nums)):
            temp = nums[i]
            if(temp>a and temp<max):
                max = temp
            if(temp>max):
                return True
            if(temp<a):
                a = temp
        
        return False