class Solution:
    def minimumSum(self, num: int) -> int:
        split = []

        while num > 0:
            split.append(num % 10)
            num //= 10

        msorted = sorted(split)
        return int(f"{msorted[0]}{msorted[2]}") + int(f"{msorted[1]}{msorted[3]}")