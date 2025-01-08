class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        k = 0  # Tracks the count of elements not equal to val
        for i in nums:  # Loop through the elements, not indexes
            if i != val:  # Check the value, not nums[i]
                nums[k] = i  # Place the valid element at the front
                k += 1  # Increment k for valid elements
        return k
