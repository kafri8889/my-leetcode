class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        deleted = 0
        i = 0
        j = len(nums) - 1
        while i < len(nums):
            print(nums, i, j)
            if nums[i] == val:
                nums[i], nums[j] = nums[j], nums[i]
                nums[j] = "_"
                j -= 1
                deleted += 1
            else:
                i += 1

            if i - 1 >= j:
                break

        return len(nums) - deleted