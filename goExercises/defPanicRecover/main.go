package main

import (
	"encoding/json"
	"log"
	"net/http"
)

func handleError(err error) {
	if err != nil {
		log.Fatal(err)
	}
}

type RandomFact struct {
	Fact string `json:"fact"`
}

func main() {
	http.HandleFunc("/", func(w http.ResponseWriter, r *http.Request) {

		res, err := http.Get("https://catfact.ninja/fact")
		handleError(err)

		defer res.Body.Close()
		// body, err := ioutil.ReadAll(res.Body)
		handleError(err)

		var randomFact RandomFact
		err = json.NewDecoder(res.Body).Decode(&randomFact)
		handleError(err)

		randomFactToJson, _ := json.Marshal(randomFact)

		w.Write(randomFactToJson)

	})
	err := http.ListenAndServe(":8080", nil)
	if err != nil {
		panic(err)
	}
}
