package com.faiz21.lab07

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.faiz21.lab07.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        val name = intent.getStringExtra("name")
        binding.nameTextView.text= name;
        val address = intent.getStringExtra("address")
        binding.AddressTextView.text= address;
        val city = intent.getStringExtra("city")
        binding.cityTextView.text= city;
        val province = intent.getStringExtra("province")
        binding.provinceTextView.text= province;
        val postcode = intent.getStringExtra("postcode")
        binding.postcodeTextView.text= postcode;
        val country = intent.getStringExtra("country")
        binding.countryTextView.text= country;




    }
}