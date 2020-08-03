package com.maritza.ragnar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_floki.*
import kotlinx.android.synthetic.main.activity_floki.txOrigem
import kotlinx.android.synthetic.main.activity_rollo.*

class FlokiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floki)

        val bundle = Bundle()
        bundle.putString("origem",  getString(R.string.floki_name))

        val info = intent.extras?.getString("origem")
        txOrigem.text = getString(R.string.origin) + "${info}"

        btRagnar.setOnClickListener {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
