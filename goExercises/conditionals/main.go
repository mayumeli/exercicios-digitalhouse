package main

import "fmt"

func main() {
	phoneNumbers := map[string]int{
		"John": 123456789,
		"Jane": 987654321,
	}
	// first part of this if its initializing
	// we can get the value of the key and the ok value
	// if the key exists in the map, the code will run
	if _, ok := phoneNumbers["John"]; ok {
		fmt.Println("John's phone number is", phoneNumbers["John"])
	}

	number := 100
	guess := 40
	if guess < number {
		fmt.Println("Too low")
	}
	if guess > number {
		fmt.Println("Too high")
	}
	if guess == number {
		fmt.Println("You got it!")
	}

	// if else
	if guess < number {
		fmt.Println("Too low")
	} else if guess > number {
		fmt.Println("Too high")
	} else {
		fmt.Println("You got it!")
	}

	// switch case
	switch guess {
	case 1:
		fmt.Println("Too low")
	case 2:
		fmt.Println("Too high")
	case 3:
		fmt.Println("You got it!")
	default:
		fmt.Println("Default case")
	}
}
