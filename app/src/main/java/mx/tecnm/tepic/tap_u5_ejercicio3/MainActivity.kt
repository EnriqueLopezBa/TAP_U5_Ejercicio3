package mx.tecnm.tepic.tap_u5_ejercicio3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menupal.setOnItemClickListener { parent, view, position, id ->
            when (position) {
                0 -> {
                    var main2 = Intent(this, MainActivity2::class.java)
                    startActivity(main2)
                }
                1 -> {
                    startActivity(Intent(this, MainActivity3::class.java))
                }
                2 -> {
                    startActivity(Intent(this, MainActivity4::class.java))
                }
                3 -> {
                    startActivity(Intent(this, MainActivity5::class.java))
                }
            }
        }
    }
}