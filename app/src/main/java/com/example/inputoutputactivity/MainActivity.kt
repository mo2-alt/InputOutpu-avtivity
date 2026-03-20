package com.example.inputoutputactivity

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    enum class Language {
        ENGLISH,
        NDEBELE,
        PEDI,
        SOTHO,
        SWATI,
        TSONGA,
        TSWANA,
        VENDA,
        XHOSA,
        ZULU,
        AFRIKAANS
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // get the button using the id we set on the user interface
        val Clickmebutton = findViewById<Button>(R.id.Clickmebutton)
        val welcomeText = findViewById<TextView>(R.id.displayTxt)
        val nameTextField = findViewById<EditText>(R.id.editTextText)
        val zuluSwitch = findViewById<Switch>(R.id.switch1)
        val spinner = findViewById<Spinner>(R.id.spinner)

        spinner.adapter = ArrayAdapter<MainActivity.Language>(this,
            android.R.layout.simple_list_item_1, Language.values())
        

        // add code to the button that happens when it id clicked
        Clickmebutton?.setOnClickListener() {

            var greeting: String
            var zulu: Boolean = zuluSwitch.isChecked
            var age: Int = 20

//            Toast.makeText(this@MainActivity, "Button Clicked", Toast.LENGTH_LONG).show()
//
//            if (zulu)
//                greeting = "Mogammad, ${nameTextField.text}!"
//            if ((nameTextField.text.toString() == "Mogammad" ||
//                        nameTextField.text.toString() == "Mogammad")
//                && age > 20
//            )
//                greeting = "Yo, ${nameTextField.text}!"
//
//            welcomeText.text = " welcome " + nameTextField.text
        }
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }