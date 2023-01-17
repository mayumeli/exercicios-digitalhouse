package com.example.firstexercise.controller

import com.example.firstexercise.model.Customer
import lombok.Getter
import lombok.Setter
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController {

    @GetMapping("/customer")
    fun getCustomer(): Customer {
        var costumer = Customer(1, "John")
        costumer.address = "123 Main Street"
        return costumer
    }

    @GetMapping("/array")
    fun getArray(): String {
        var myArray = arrayOf("one", "two", "three")
        // add elemento to array
        myArray += "four"
        // remove first element from array
        myArray = myArray.drop(1).toTypedArray()
        // create a string with all elements from array using loop
        var myString = ""
        for (element in myArray) {
            myString += element
            // add comma if not last element
            if (element != myArray.last()) {
                myString += ", "
            }
        }
        return myString
    }
}