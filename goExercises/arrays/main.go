package main

import "fmt"

func main() {
	// 1- initialize array with 5 elements
	testArray := [5]int{1, 2, 3, 4, 5}
	fmt.Printf("1- %v\n", testArray)

	// 2- initialize array without specifying size
	testArrayWithLength := [...]int{1, 2, 3, 4, 5}
	fmt.Printf("2- %v\n", testArrayWithLength)

	// 3- initialize array with capacity of 5 elements to be filled later
	var costumers [5]string
	costumers[0] = "John"
	costumers[1] = "Doe"
	fmt.Printf("3- %v\n", costumers)

	// 4- the length of array is 5, but we only have 2 elements
	fmt.Printf("4- %v\n", len(costumers))

	// 5- we can also use the make function to create a slice (is a type of array, work as array)
	// make([]T, length, capacity)
	// the capacity is optional
	// the capacity is the maximum number of elements the array can hold
	// the length is the number of elements the array currently holds
	// the capacity must be greater than or equal to the length
	// if the capacity is not specified, it will be the same as the length
	ints := make([]int, 5)
	fmt.Printf("5- %v\n", ints)

	// 6- we can use make to create an empty slice (array) and use append to add itens to it
	// append will return a new slice (array) with the new item added
	// the original array will not be modified
	ints2 := make([]int, 0)
	ints2 = append(ints2, 1)
	ints2 = append(ints2, 2)
	ints2 = append(ints2, 3)
	fmt.Printf("6- %v\n", ints2)

	// 7- we can make the same thing as above using the shorthand syntax
	// this syntaxe also create a slice
	ints3 := []int{}
	ints3 = append(ints3, 1)
	ints3 = append(ints3, 2)
	fmt.Printf("7- %v\n", ints3)

	// 8- we can copy one array to another
	arrayOriginal := [...]int{1, 2, 3}
	arrayCopy := arrayOriginal
	// if we change the copy, the original will not be modified
	arrayCopy[0] = 4
	fmt.Printf("8- %v\n", arrayOriginal)
	fmt.Printf("8- %v\n", arrayCopy)

	// 9- we can copy one array to another with memory reference
	// this way, if we change the copy, the original will be modified
	arrayOriginal2 := [...]int{1, 2, 3}
	arrayCopy2 := &arrayOriginal2
	arrayCopy2[0] = 4
	fmt.Printf("9- %v\n", arrayOriginal2)
	fmt.Printf("9- %v\n", arrayCopy2)

	// 10- if we copy a slice to another, the original will be modified as default
	sliceTest := []int{1, 2, 3}
	sliceTestCopy := sliceTest
	sliceTestCopy[0] = 4
	fmt.Printf("10- %v\n", sliceTest)
	fmt.Printf("10- %v\n", sliceTestCopy)

	// 11- to copy a slice to another without memory reference,
	// and with some fun possibilities, we can use append
	sliceTest2 := []int{1, 2, 3, 4, 5}
	fmt.Printf("11- %v\n", sliceTest2)
	// first parameter refer to array original, in this case, we want to pick
	// elements before the index (index not included), and we can use
	// this parameter [:1] to it.
	// second parameter refer to pick
	// elements we want to add to our new array,
	// in this case, we want to pick all elements after the index (index included)
	// ... its like spread operation in JS.
	sliceTestCopy2 := append(sliceTest2[:1], sliceTest2[2:]...)
	fmt.Printf("11- %v\n", sliceTestCopy2)
	fmt.Printf("11- %v\n", sliceTest2)

}
