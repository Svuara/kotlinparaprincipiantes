@file:Suppress("SyntaxError")

package com.example.kotlinparaprincipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //variablesYConstantes()
        sentenciaIf()

    }

// 1 VARIABLES
    // 2 TIPOS DE DATOS
    // 3 SANTENCIAS IF
    private fun variablesYConstantes() {

        // Variables

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
    /* tipos de datos
    */
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
}