class Solution:
    def shift(self, arr):
        nonZero = [x for x in arr if x != 0]
        zero = [x for x in arr if x == 0]
        return nonZero + zero

    def applyOperations(self, nums: List[int]) -> List[int]:
        for i in range(len(nums) - 1):
            if nums[i] == nums[i + 1]:
                nums[i] = nums[i] * 2
                nums[i + 1] = 0

        return self.shift(nums)