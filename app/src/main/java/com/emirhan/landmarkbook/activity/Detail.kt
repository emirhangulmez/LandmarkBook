package com.emirhan.landmarkbook.activity


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emirhan.landmarkbook.modal.Landmark
import com.emirhan.landmarkbook.databinding.ActivityDetailBinding
import com.emirhan.landmarkbook.modal.SelectedLandmark

class Detail : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val intent = intent.getSerializableExtra("landmark") as Landmark
        val data = SelectedLandmark.selectedLandmark
        data?.let {
            binding.nameText.text = it.name
            binding.countryText.text = it.country
            binding.imageView.setImageResource(it.image)

        }

    }
}