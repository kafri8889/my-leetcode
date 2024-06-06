class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        maps = {}
        mapt = {}
        absDiff = 0

        for i in range(len(s)):
            maps[s[i]] = i
            mapt[t[i]] = i

        for (key, value) in maps.items():
            absDiff += abs(value - mapt[key])

        return absDiff
