''' Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
'''

class Solution(object):
    def hammingWeight(self, n):
        """
        :type n: int
        :rtype: int
        """
        str = "" + bin(n)
        temp = []
        temp = str
        count = 0
        for i in range(0, len(temp)):
            if(temp[i] == '1'):
                count += 1

        return count