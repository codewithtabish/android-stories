package com.example.newsalter.screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.PopupMenu
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.newsalter.R
import com.example.newsalter.adapters.CollectionAdapter
import com.example.newsalter.databinding.ActivityMainBinding
import com.example.newsalter.models.CollectionModel
import com.example.newsalter.utils.dummy

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var layoutObj: Any
    lateinit var collectionList: ArrayList<CollectionModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        layoutObj = layoutInflater


        binding = ActivityMainBinding.inflate(layoutObj as LayoutInflater)
        setContentView(binding.root)
        collectionList = ArrayList()
        binding.toolbar.title = "Stories"

        putData()
        loadCollections()
        binding.menuImage.setOnClickListener {
            showMenuOnImage()
        }


    }

    private fun showMenuOnImage() {
        // Assuming you have a reference to the vertical dots image view

        // Create a PopupMenu and inflate the menu
        val popupMenu = PopupMenu(this, binding.menuImage)
        popupMenu.menuInflater.inflate(R.menu.collection_menu, popupMenu.menu)

        // Set the gravity to right-align the PopupMenu
        popupMenu.gravity = Gravity.END

        // Set the click listener for the menu items
        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.rate_app -> {
                    // Handle Menu Item 1 click
                    true
                }

                R.id.shareApp -> {
                    // Handle Menu Item 2 click
                    true
                }


                else -> false
            }
        }

        // Show the PopupMenu
        popupMenu.show()
    }


    private fun putData() {
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQnhMzyTEgFydwcSejP8EGglrQG_rK3wWLjpg&usqp=CAU",
                "Animal Stories "
            )
        )
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXgH-IXZjIoH5sic_uycBf1nE2btamovMibQ&usqp=CAU",
                "Short Stories "
            )
        )
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXgH-IXZjIoH5sic_uycBf1nE2btamovMibQ&usqp=CAU",
                "Short Stories "
            )
        )
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXgH-IXZjIoH5sic_uycBf1nE2btamovMibQ&usqp=CAU",
                "Short Stories "
            )
        )
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXgH-IXZjIoH5sic_uycBf1nE2btamovMibQ&usqp=CAU",
                "Short Stories "
            )
        )
        collectionList.add(
            CollectionModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRXgH-IXZjIoH5sic_uycBf1nE2btamovMibQ&usqp=CAU",
                "Moral Stories "
            )
        )
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
        collectionList.add(CollectionModel(dummy.imageAddress1, "Moral Stories "))
    }


    private fun loadCollections() {
        binding.mainRecyclerView.adapter = CollectionAdapter(this, collectionList)
        binding.mainRecyclerView.layoutManager = LinearLayoutManager(this)


    }

}
