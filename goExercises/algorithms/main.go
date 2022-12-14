package main

// to run Go code including 	adictional go files, look this:
// https://stackoverflow.com/questions/25171409/function-in-same-package-undefined

func main() {
	arrayExemple := []int{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	biggerItem := biggerItemFromArray(arrayExemple)
	println(biggerItem)

	isPrimeNumber := primeNumber(7)
	println(isPrimeNumber)

	celsius := fahrenheitToCelsius(100)
	println(celsius)

	note := proofNote(8, 4, 7)
	println(note)
}
