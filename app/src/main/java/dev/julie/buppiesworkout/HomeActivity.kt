package dev.julie.buppiesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    lateinit var button_navigation:BottomNavigationView
    lateinit var fcvHome:FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        castviews()
        setupButtonNav()



    }
fun castviews(){
    button_navigation=findViewById(R.id.bottom_navigation)
    fcvHome=findViewById(R.id.fcvHome)
}
    fun setupButtonNav(){
         button_navigation.setOnItemSelectedListener(){item->
            when(item.itemId){
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,PlanFragment()).commit()
                    true
                }
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome,TrackFragment()).commit()
                    true

            }
                else->false

         }
    }
 }
}