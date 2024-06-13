class Solution:
    def minMovesToSeat(self, seats: List[int], students: List[int]) -> int:
        seats.sort()
        students.sort()

        minimum = 0
        for i in range(len(seats)):
            minimum += abs(students[i] - seats[i])

        return minimum