package kr.ac.kumoh.s20200607.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20200607.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener {
            val uri = Uri.parse("https://www.velog.io/ssonzm/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:36.145014, 128.393047?z=17")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTelephone.setOnClickListener {
            val uri = Uri.parse("sms:010-1234-5678")
                val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}