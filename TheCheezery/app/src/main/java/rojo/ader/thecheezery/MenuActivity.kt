package rojo.ader.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val colddrinks = findViewById(R.id.button_cold_drinks) as Button
        val hotdrinks = findViewById(R.id.button_hot_drinks) as Button
        val sweets = findViewById(R.id.button_sweets) as Button
        val salties = findViewById(R.id.button_salties) as Button

        colddrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", 0)
            startActivity(intent)
        }

        hotdrinks.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", 1)
            startActivity(intent)
        }

        sweets.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", 2)
            startActivity(intent)
        }

        salties.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo", 3)
            startActivity(intent)
        }
    }
}