package main

import (
	"fmt"
	"reflect"
)

func main() {
	// 1- we can create maps this way
	books := map[string]string{
		"book1": "author1",
		"book2": "author2",
		"book3": "author3",
	}
	fmt.Printf("1- %v\n", books)
	fmt.Printf("1- %v\n", books["book1"])

	// 2- we can use make too
	books2 := make(map[string]string)
	books2["book1"] = "author1"
	books2["book2"] = "author2"
	books2["book3"] = "author3"
	fmt.Printf("2- %v\n", books2)

	// 3 - we can know if a key exists in a map
	// note that y ou can destruct the value and the ok from key
	pop, ok := books2["book1"]
	fmt.Printf("3- %v %v\n", pop, ok)
	_, ok2 := books2["book4"]
	fmt.Printf("3- %v\n", ok2)

	// 4 - delete a key.
	// note that if you copy a map, the copy will be a reference to the original map
	newBooks2 := books2
	delete(books2, "book1")
	fmt.Printf("4- %v\n", books2)
	fmt.Printf("4- %v\n", newBooks2)

	// 5 - structures
	// its like a object entity in Java
	// we can name variables with first letter uppercase to export them
	type person struct {
		name string
		age  int
	}
	p := person{name: "John", age: 20}
	fmt.Printf("5- %v\n", p)

	// 6 - anonymous structures
	user := struct {
		name string
		age  int
	}{name: "John", age: 24}
	fmt.Printf("6- %v\n", user)

	// 7 - we can make a copy of a structure with or without pointer to the original
	p2 := p
	p2.name = "John2"
	p3 := &p
	p3.name = "John3"
	fmt.Printf("7- %v\n", p)
	fmt.Printf("7- %v\n", p2)
	fmt.Printf("7- %v\n", p3)

	// 8 - structures can extend other structures. they will remain independent. its like inheritance in POO
	type animal struct {
		name   string
		origin string
	}

	type dog struct {
		animal
		breed string
		speed float32
	}

	d := dog{}
	d.name = "dog1"
	d.origin = "origin1"
	d.breed = "breed1"
	d.speed = 10.0
	fmt.Printf("8- %v\n", d)

	// 9 - tags
	// we can add tags to structures to add metadata that can be used by other libraries
	type vehicle struct {
		name string `required max:"100"`
	}
	v := reflect.TypeOf(vehicle{})
	field, _ := v.FieldByName("name")
	fmt.Printf("9- %v\n", field.Tag)

}
