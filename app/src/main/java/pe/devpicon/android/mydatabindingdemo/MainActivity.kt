package pe.devpicon.android.mydatabindingdemo

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import pe.devpicon.android.mydatabindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this@MainActivity, R
                .layout.activity_main)
        val product = Product("1", "Arroz", "250.50")
        binding.product = product


    }
}
