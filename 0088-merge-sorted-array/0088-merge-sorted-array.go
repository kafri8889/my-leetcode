func merge(nums1 []int, m int, nums2 []int, n int) {
	for i := 0; i < len(nums1); i++ {
		if i >= m {
			nums1[i] = nums2[i-m]
		}
	}

	slices.Sort(nums1)
}