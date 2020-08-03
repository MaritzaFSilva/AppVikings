package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ragnar.*
import kotlinx.android.synthetic.main.activity_ragnar.btBjorn
import kotlinx.android.synthetic.main.activity_ragnar.txOrigem
import kotlinx.android.synthetic.main.activity_rollo.*

class RagnarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        val bundle = Bundle()
        bundle.putString("origem",  getString(R.string.ragnar_name))

        val info = intent.extras?.getString("origem")
        txOrigem.text = getString(R.string.origin) + "${info}"

        btLagherta.setOnClickListener {
            val intent = Intent(this, LaghertaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        btBjorn.setOnClickListener {
            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

        btFloki.setOnClickListener {
            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
