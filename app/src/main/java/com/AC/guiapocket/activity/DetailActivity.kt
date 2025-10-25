package com.AC.guiapocket.activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.AC.guiapocket.R
import com.AC.guiapocket.databinding.ActivityDetailBinding
import com.AC.guiapocket.model.Service

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    private lateinit var service: Service

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        setupViews()
        setupListeners()
    }

    private fun loadData() {
        service = intent.getSerializableExtra("service_data") as? Service
            ?: throw IllegalStateException("Service object not found in Intent.")
    }

    private fun setupViews() {
        binding.imgDetailPhoto.setImageResource(service.imageId)
        binding.tvDetailName.text = getString(service.nameResId)
        binding.tvDetailCategory.text = "${getString(R.string.category_label)} ${getString(service.categoryResId)}"
        binding.tvDetailDescription.text = getString(service.descriptionResId)
    }

    private fun setupListeners() {
        binding.btnCall.setOnClickListener {
            callService(service.phone)
        }

        binding.btnWebsite.setOnClickListener {
            openWebsite(service.websiteUrl)
        }

        binding.btnMap.setOnClickListener {
            openMap(service.latitude, service.longitude)
        }
    }

    private fun callService(phoneNumber: String) {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:$phoneNumber")
        }
        try {
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, R.string.toast_call_fail, Toast.LENGTH_SHORT).show()
        }
    }

    private fun openWebsite(url: String) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(url)
        }
        try {
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, R.string.toast_website_fail, Toast.LENGTH_SHORT).show()
        }
    }

    private fun openMap(lat: Double, lon: Double) {
        val uri = Uri.parse("geo:$lat,$lon?q=$lat,$lon(Local do Serviço)")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        try {
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, R.string.toast_map_fail, Toast.LENGTH_SHORT).show()
        }
    }
}