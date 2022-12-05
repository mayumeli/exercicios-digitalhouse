package main

import (
	"fmt"
	"strconv"
)

var (
	textWithPackageScope string = "Im a package scope variable"
)

var TextWithGlobalScope string = "Im a global scope variable"

func main() {
	textWithFunctionScope := "Hello, go ! you are rate"
	numeroFloat := 10.
	numeroInt := int(numeroFloat)
	fmt.Println(textWithFunctionScope, strconv.Itoa(numeroInt))
	fmt.Println(textWithPackageScope)
	textWithPackageScope = "Im a package scope variable changed"
	// we can shadow the package scope variable
	fmt.Println(textWithPackageScope)
	fmt.Println(TextWithGlobalScope)

	imTrue := 1 == 1
	var imFalse bool
	fmt.Printf("%v, %T\n", imTrue, imTrue)
	fmt.Printf("%v, %T\n", imFalse, imFalse)

	textString := "Hi, Im a string"
	// strings in go are alias to bytes, we need to convert
	// we cannot change one character of a string
	fmt.Printf("%v, %T\n", string(textString[1]), textString)

	// we can use the rune type to change a character of a string
	// rune is an alias to int32
	textStringRune := []rune(textString)
	textStringRune[7] = '4'
	fmt.Printf("%v, %T\n", string(textStringRune), textStringRune)

	// we can use the byte type to change a character of a string
	// byte is an alias to uint8
	textStringByte := []byte(textString)
	textStringByte[7] = '4'
	fmt.Printf("%v, %T\n", string(textStringByte), textStringByte)

	numberOne := 1
	numberTwo := 2
	fmt.Println(numberOne*numberTwo + numberTwo)

	const constantText string = "Im a constant"
	fmt.Println(constantText)

	// we can use the iota to create a sequence of numbers
	// we can set iota for each const in this block, but its not necessary
	// iota is scoped to the constant block
	const (
		_ = iota // we can use the _ to ignore the first value
		one
		two
		three
	)
	fmt.Println(one, two, three)

}
