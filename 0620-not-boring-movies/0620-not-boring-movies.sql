# Write your MySQL query statement below
SELECT id, movie, description, rating FROM Cinema WHERE NOT description='boring' AND id % 2 != 0 ORDER BY rating DESC