@file:Suppress("SyntaxError")

package com.example.kotlinparaprincipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
       arrays()

    }

    private fun variablesYConstantes() {

        // 1 VARIABLES


        var miPrimerVariable = " hola Robertito "
        println(miPrimerVariable)

        miPrimerVariable = "Bienvenidos"
        println(miPrimerVariable)
        var miSegundaVariable = "suscribete"
        println(miSegundaVariable)
        miSegundaVariable = miPrimerVariable
        println(miSegundaVariable)
// constantes
        val miPrimerCosntante = "te gusta el tuto"
        println(miPrimerCosntante)

    }
    // 2 TIPOS DE DATOS

    // string cadena de tecxto


    private fun tiposDeDatos() {

        val myString: String = "Hola Robertito"
        val myString2 = "Bienvenidos"
        val myString3 = myString + " " + myString2
        println(myString3)

        // enteros (Byte, Short, int, long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3: Int = (myInt + myInt2)
        println(myInt3)
        // decimales (float double)
        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble + myDouble2 + myDouble3
        println(myDouble4)

    }
    // 3 SANTENCIAS IF

    private fun sentenciaIf(){
        val myNumber = 60
        if ((myNumber <= 10 && myNumber >5)  || myNumber == 53 ){
            println("$myNumber es menor o igual que 10 y mayor a 5 o igual a 53")
        }else if (myNumber == 60){
        println("myNumber es igual a 60 ")
        }
        else {
            println("$myNumber es mayor que 10 o menor o igual a 5 y no es igual a 53")

        }

    }
    //4 when con String
    fun sentenciawhen(){
        val country = "Canada"
        when(country){
            "España", "Bolivia", "Venezuela" ->{
               println("El idioma es Español")
        } "Mexico" -> {
            println("El idioma es Español")
        } "Perú" -> {
            println("El idioma es Español")
        } "Colombia" -> {
            println("El idioma es Español")
        } "Argentina" -> {
            println("El idioma es Español")
        } "EEUU" -> {
            println("El idioma es Ingles")
        } "Francia" -> {
            println("El idioma es Frances")

        }else -> {
            println("no conozco el idioma")
        }
    }
        //when con Int
        val age =28
        when (age){
            0,1,2 ->{
                println("Eres un bebe")
            } in 3 .. 10-> {
            println("Eres un niño")
        } in 11 .. 17 -> {
            println("Eres un adolecente")
        } in 18 .. 69 -> {
            println("Eres un adulto")
        } in 70 .. 99 -> {
            println("Eres un anciano")
        } else ->{
            println("Muerto")
        }
        }
}
        // 5 -arrays - arreglos
        fun arrays(){
        val nombre = "Roberto"
        val apellido = "Encina"
        val compañia = "Teto"
        val edad = "39"
            //no entiendo porque queda asi lo copie igual
            val myArrays :ArrayList<String> = arrayListOf<String>()
            //primero creas el array  = y esto seria que especificas que es una lista?

            myArrays.add(nombre)
            myArrays.add(apellido)
            myArrays.add(compañia)
            myArrays.add(edad)

            println(myArrays)

            myArrays.addAll(listOf("hola", "Bienvenidos"))
            println(myArrays)

            val nombre :String = myArray[2]
            println(nombre)




        }
}
