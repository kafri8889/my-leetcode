func twoSum(nums []int, target int) []int {
	var mmap = make(map[int]int)

	for i := 0; i < len(nums); i++ {
		// Cek apakah elemen dari "nums" di index ke-i ada di dalam "mmap"
		if _, contains := mmap[nums[i]]; contains {
			return []int{mmap[nums[i]], i}
		} else {
			mmap[target-nums[i]] = i
		}
	}
	
	return []int {}
}