package main

func main() {
	for i := 0; i < 3; i++ {
		println(i)
	}

	i2 := 0
	for ; i2 < 3; i2++ {
		println(i2)
	}

	i3 := 0
	for i3 < 3 {
		println(i3)
		i3++
	}

	array := []int{1, 2, 3}
	for k, v := range array {
		println(k, v)
	}

	stringTest := "abc"
	for k, v := range stringTest {
		println(k, v)
	}

	mapTest := map[string]string{
		"key1": "value1",
		"key2": "value2",
		"key3": "value3",
	}

	for k, v := range mapTest {
		println(k, v)
	}

}
