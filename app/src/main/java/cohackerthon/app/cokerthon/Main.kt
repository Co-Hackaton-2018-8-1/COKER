package cohackerthon.app.cokerthon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wrap.setOnClickListener {
            val nextIntent = Intent(this, Clist::class.java)
            startActivity(nextIntent)
        }

        sur.setOnClickListener {
            val nextIntent = Intent(this, Clist::class.java)
            startActivity(nextIntent)
        }

        title1.setOnClickListener {
            val nextIntent = Intent(this, Clist::class.java)
            startActivity(nextIntent)
        }


    }
}
