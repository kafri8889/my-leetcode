class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        diff = ""
        counts = Counter(s)
        countt = Counter(t)

        for (key, value) in countt.items():
            if value > counts[key] or key not in counts:
                diff += key

        return diff