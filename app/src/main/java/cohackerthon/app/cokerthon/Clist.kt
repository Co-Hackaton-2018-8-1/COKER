package cohackerthon.app.cokerthon

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_clist.*

class Clist : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clist)

        door_btn.setOnClickListener {
            val nextIntent = Intent(this, Detail::class.java)
            startActivity(nextIntent)
        }

        high_btn.setOnClickListener {
            val nextIntent = Intent(this, Detail2::class.java)
            startActivity(nextIntent)
        }

        people_btn.setOnClickListener {
            val nextIntent = Intent(this, Detail3::class.java)
            startActivity(nextIntent)
        }
    }
}
