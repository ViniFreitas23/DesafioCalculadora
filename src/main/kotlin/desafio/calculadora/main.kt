package desafio.calculadora

import java.util.Scanner

fun main() {
    println("""
        
        Bem vindo (a) a calculadora do Vinicius!
        
        Para prosseguir selecione um modo e depois os valores que deseja calcular!
        (1) - Soma
        (2) - Subtração
        (3) - Divisão
        (4) - Multiplicação        
    """.trimIndent())
    val input = Scanner(System.`in`)
    val m = input.nextInt()
    val x = input.nextInt()
    val y = input.nextInt()

    if (m == 1){
        println("SOMA = " + (x + y))
    }else if (m == 2){
        println("SUBTRAÇÃO = " + (x - y))
    }else if (m == 3){
        println("DIVISÃO = " + (x / y))
    }else if (m == 4){
        println("MULTIPLICAÇÃO = " + (x * y))
    }else{
        println("Erro! Favor selecionar uma opção corretamente!")
    }
}