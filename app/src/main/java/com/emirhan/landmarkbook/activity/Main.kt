package com.emirhan.landmarkbook.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emirhan.landmarkbook.modal.Landmark
import com.emirhan.landmarkbook.adapter.LandmarkAdapter
import com.emirhan.landmarkbook.R
import com.emirhan.landmarkbook.databinding.ActivityMainBinding

class Main : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buckinghamPalace = Landmark("Buckingham Palace","United Kingdom",
            R.drawable.buckingham_palace
        )
        val eiffelTower = Landmark("Eiffel","France", R.drawable.eiffel)
        val statuteOfLiberty = Landmark("Statute Of Liberty","United States",
            R.drawable.statute_of_liberty
        )
        val pisaTower = Landmark("Pisa Tower","Italy", R.drawable.pisa)
        val greatWallChina = Landmark("Great Wall of China","China", R.drawable.great_wall_china)

        landmarkList = arrayListOf()

        landmarkList.apply {
            add(buckinghamPalace)
            add(eiffelTower)
            add(statuteOfLiberty)
            add(pisaTower)
            add(greatWallChina)

        }
        val recyclerview = binding.recyclerview

        recyclerview.adapter = LandmarkAdapter(landmarkList)
        recyclerview.layoutManager = LinearLayoutManager(this)





    }
    // ListView
    //val listView = binding.listView
    //val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map { landmark -> landmark.name  })
    //listView.adapter = arrayAdapter

    /*listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->
        val intent = Intent(this,Detail::class.java).apply {
            putExtra("landmark",landmarkList[i])
        }
        startActivity(intent)
    }*/

    }