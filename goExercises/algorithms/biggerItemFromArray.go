package main

func biggerItemFromArray(arr []int) int {
	var bigger int
	for _, item := range arr {
		if item > bigger {
			bigger = item
		}
	}
	return bigger
}
