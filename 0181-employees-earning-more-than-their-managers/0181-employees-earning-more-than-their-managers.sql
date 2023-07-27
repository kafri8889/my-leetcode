# Write your MySQL query statement below
SELECT A.name AS Employee FROM Employee A LEFT JOIN Employee B ON B.id=A.managerId WHERE A.managerID IS NOT NULL AND A.salary > B.salary