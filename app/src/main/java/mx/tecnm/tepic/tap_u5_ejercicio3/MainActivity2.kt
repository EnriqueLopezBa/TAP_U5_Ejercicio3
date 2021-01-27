package mx.tecnm.tepic.tap_u5_ejercicio3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button.setOnClickListener {
            var cadena = editText.text.toString().toLowerCase()
            if (cadena.startsWith("sol")) {
                imageView.setImageDrawable(getDrawable(R.drawable.iconfinder_07_sun_smile_happy_emoticon_weather_smiley_3375693))
            } else if (cadena.startsWith("luna")) {
                imageView.setImageDrawable(getDrawable(R.drawable.iconfinder_04_moon_sleepy_night_emoticon_weather_smiley_3375696))
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.iconfinder_05_cloud_smile_cloudy_emoticon_weather_smiley_3375695))
            }
        }
        setTitle("(C) Enrique Lopez")
        checkBox.setOnClickListener {
            checkBox2.isChecked = false
            if (checkBox.isChecked) {
                setTitle("(C) Enrique Lopeez")
            } else {
                setTitle("Ejercicio3")
            }
        }
        checkBox2.setOnClickListener {
            checkBox.isChecked = false;
            if (checkBox2.isChecked) {
                setTitle("Hola como estas")
            } else {
                setTitle("Ejercicio3")
            }
        }

        radioButton.setOnClickListener {
            pollito()
        }
        radioButton2.setOnClickListener {
            pollito()
        }
        switch2.setOnClickListener {
            if (switch2.isChecked) {
                imageView.setImageDrawable(getDrawable(R.drawable.vacio))
            } else {
                imageView.setImageDrawable(getDrawable(R.drawable.iconfinder_curllip_34885))
            }
        }

        toggleButton.setOnClickListener {
            var color = "El color es "+ spinner.selectedItem.toString()
            if(toggleButton.isChecked) {

                Toast.makeText(this, color, Toast.LENGTH_SHORT).show()
            }else{
                AlertDialog.Builder(this).setMessage(color).setTitle("El elegido es: ").setPositiveButton("ok"){d, i ->}.show()
            }
        }
    }

    fun pollito() {
        if (radioButton.isChecked) {
            Toast.makeText(this, "Soltero(A)", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Casado(A)", Toast.LENGTH_SHORT).show()
        }
    }
}