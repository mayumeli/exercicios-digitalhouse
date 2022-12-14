package main

func checkWeight(n float32, biggest float32) float32 {
	if n == biggest {
		return n * 5
	} else {
		return n * 2.5
	}
}

func getBiggerNumber(numbers []float32) float32 {
	var bigger float32
	for _, number := range numbers {
		if number > bigger {
			bigger = number
		}
	}
	return bigger
}

func proofNote(n1 float32, n2 float32, n3 float32) float32 {
	bigger := getBiggerNumber([]float32{n1, n2, n3})
	return (checkWeight(n1, bigger) + checkWeight(n2, bigger) + checkWeight(n3, bigger)) / 10
}
