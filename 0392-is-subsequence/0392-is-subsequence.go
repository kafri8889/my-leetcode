func isSubsequence(s string, t string) bool {
	if len(s) == 0 {
		return true
	}

	// pointer u/ char yg akan di cek
	var currentChar uint8 = 0
	var subSequence string = ""

	for _, char := range t {
		if s[currentChar] == uint8(char) {
			subSequence += string(s[currentChar])
			currentChar++
		}

		if subSequence == s {
			return true
		}
	}

	return false
}