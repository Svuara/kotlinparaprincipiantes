@file:Suppress("SyntaxError")

package com.example.kotlinparaprincipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



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
            val myFloat: float = 1.5f
            val myDouble = 1.5

            }
