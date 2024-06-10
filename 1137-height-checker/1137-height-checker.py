class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        res = 0
        excepted = sorted(heights)

        for i in range(len(heights)):
            if heights[i] != excepted[i]:
                res += 1

        return res