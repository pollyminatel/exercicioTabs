package com.example.exercicioviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabGeral.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                when( tab?.position ){
                    0 -> {
                        val ft = supportFragmentManager.beginTransaction()
                        ft.replace(R.id.container, NaoSocioFragment())
                        ft.commit()

                    }
                    1 -> {
                        val ft = supportFragmentManager.beginTransaction()
                        ft.replace(R.id.container, SocioFragment())
                        ft.commit()
                    }
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                // Handle tab reselect
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                // Handle tab unselect
            }
        })

    }
}