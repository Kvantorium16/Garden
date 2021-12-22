package com.example.garden


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.garden.adapter.PlantCategoryAdapter
import com.example.garden.adapter.RcAdapter
import com.example.garden.adapter.categoryAdapter
import com.example.garden.model.Category
import com.example.garden.model.Plant
import com.example.garden.model.PlantCategory

import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Plant>
    lateinit var imageId : Array<Int>
    lateinit var title : Array<String>
    lateinit var item_derail: Array<String>
    private lateinit var newCategoryRecyclerView: RecyclerView
    private lateinit var newCategoryArrayList : ArrayList<Category>
    lateinit var  Id : Array<Int>
    lateinit var CategoryTitle : Array<String>
    private lateinit var newPlantCategoryRecyclerView: RecyclerView
    private lateinit var newPlantCategoryArrayList : ArrayList<PlantCategory>
    lateinit var titleIm : Array<Int>
    lateinit var mainTitle : Array<String>
     lateinit var title_item_detail : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**    val shopActivityButton = findViewById<Button>(R.id.buttonShop)
        shopActivityButton.setOnClickListener {
        val Intent = Intent(this, ID магазина класса ::class.java)
        } */


        /**    val searchActivityButton = findViewById<Button>(R.id.buttonSearch)
        shopActivityButton.setOnClickListener {
        val Intent = Intent(this, ID поиска класса ::class.java)
        } */


        /**    val profileActivityButton = findViewById<Button>(R.id.buttonProfile)
        shopActivityButton.setOnClickListener {
        val Intent = Intent(this, ID профиля класса ::class.java)
        } */



        titleIm= arrayOf(
            R.drawable.p1,
            R.drawable.ogr,
            R.drawable.pomidor
        )
        mainTitle= arrayOf(
            "Картофель",
            "Огурец",
            "Помидор"
        )
        title_item_detail= arrayOf(
            "Картофель, или Паслён клубоносный, — вид многолетних клубненосных травянистых растений из рода Паслён  семейства Паслёновые" +
                    ". Клубни картофеля являются важным пищевым продуктом. Плоды ядовиты в связи с содержанием в них соланина.",
            "Ягода",
            "Ягода"
        )
        Id = arrayOf(
            R.drawable.ic_category,
            R.drawable.ic_category,
            R.drawable.ic_category
        )
        CategoryTitle = arrayOf(
            "Овощи",
            "Фрукты",
            "Ягоды"
        )
        imageId = arrayOf(
            R.drawable.p1,
            R.drawable.ogr,
            R.drawable.pomidor
        )
        title = arrayOf(
            "Картофель",
            "Огурец",
            "Помидор"
        )
        item_derail = arrayOf(
            "Овощ",
            "Ягода",
            "Ягода"
        )
        newRecyclerView = findViewById(R.id.rcView)
        newRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<Plant>()
        getUserdata()
        newCategoryRecyclerView = findViewById(R.id.rcView2)
        newCategoryRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        newCategoryRecyclerView.setHasFixedSize(true)
        newCategoryArrayList = arrayListOf<Category>()
        getData()
        newPlantCategoryRecyclerView = findViewById(R.id.rcView3)
        newPlantCategoryRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false)
        newPlantCategoryRecyclerView.setHasFixedSize(true)
        newPlantCategoryArrayList = arrayListOf<PlantCategory>()
        getPlantData()
    }
    private fun getPlantData() {
        for (f in titleIm.indices) {
            val categoryplant = PlantCategory(titleIm[f], mainTitle[f], title_item_detail[f])
            newPlantCategoryArrayList.add(categoryplant)
        }
        newPlantCategoryRecyclerView.adapter = PlantCategoryAdapter(newPlantCategoryArrayList)
    }
    private fun getData() {
        for (u in Id.indices) {
            val category = Category(Id[u], CategoryTitle[u])
            newCategoryArrayList.add(category)
        }
        newCategoryRecyclerView.adapter = categoryAdapter(newCategoryArrayList)
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val plant = Plant(imageId[i], title[i], item_derail[i])
            newArrayList.add(plant)

        }
        newRecyclerView.adapter = RcAdapter(newArrayList)
    }
}
