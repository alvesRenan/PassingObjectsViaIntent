package alves.renan.passingobjects

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSubmit.setOnClickListener {
            startActivity(
                    Intent(applicationContext, SecondActivity::class.java)
                            .putExtra("obj", Person(txtName.text.toString()))
            )
        }
    }

}
