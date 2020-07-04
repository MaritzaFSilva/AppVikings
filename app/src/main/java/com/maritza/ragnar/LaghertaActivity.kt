package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_lagherta.*

class LaghertaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagherta)

        val bundle = Bundle()
        bundle.putString("origem", "Lagherta")

        val info = intent.extras?.getString("origem")
        txOrigem.text = "Você chegou nesse personagem através de: ${info}"

        btBjorn.setOnClickListener {
            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btRagnar.setOnClickListener {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
