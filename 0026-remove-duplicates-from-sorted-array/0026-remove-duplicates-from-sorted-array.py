class Solution:
    def removeDuplicates(self, nums: list[int]) -> int:
        sets = set()
        duplicate = 0
        j = len(nums) - 1
        i = 0

        while i < len(nums):
            if i - 1 >= j:
                break

            if nums[i] in sets:
                nums[i], nums[j] = nums[j], nums[i]
                nums[j] = 101
                j -= 1
                duplicate += 1
            else:
                sets.add(nums[i])
                i += 1

        nums.sort()

        return len(nums) - duplicate