package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        val bundle = Bundle()
        bundle.putString("origem", "Floki")

        val info = intent.extras?.getString("origem")
        txOrigem.text = "Você chegou nesse personagem através de: ${info}"

        btRagnar.setOnClickListener {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
