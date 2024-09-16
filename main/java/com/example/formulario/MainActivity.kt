package com.example.formulario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString()
            val email = editTextEmail.text.toString()
            val phone = editTextPhone.text.toString()

            if (name.isEmpty()) {
                editTextName.error = "Por favor, ingresa tu nombre"
            } else if (email.isEmpty()) {
                editTextEmail.error = "Por favor, ingresa tu correo electrónico"
            } else if (phone.isEmpty()) {
                editTextPhone.error = "Por favor, ingresa tu número de teléfono"
            } else {

                Toast.makeText(this, "Formulario enviado correctamente", Toast.LENGTH_LONG).show()


            }
        }
    }
}
