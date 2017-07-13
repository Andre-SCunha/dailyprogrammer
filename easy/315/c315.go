package main

import "fmt"

func main() {
   var a, b int
   fmt.Scanln(&a, &b)
   fmt.Print(a,"@",b,"=",xorMultiplier(a, b),"\n")
}

func xorMultiplier (a, b int) int{
    var div, op int
    if a < b {
        div = a
        op = b
    } else{
        div = b
        op = a
    }
    res := 0
    
    //Iterating over the bits of div, and aplying xor
    for div > 0{
        res ^= op * (div%2)
        div /= 2
        op *= 2
    }
    
    return res
}