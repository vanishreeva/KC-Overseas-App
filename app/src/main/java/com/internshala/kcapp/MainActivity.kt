package com.internshala.kcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.internshala.kcapp.fragments.ContactFragment
import com.internshala.kcapp.fragments.DiscoverFragment
import com.internshala.kcapp.fragments.FaqsFragment
import com.internshala.kcapp.fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val homeFragment = HomeFragment()
        val discoverFragment = DiscoverFragment()
        val contactFragment = ContactFragment()
        val faqsFragment = FaqsFragment()


        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_home -> makeCurrentFragment(homeFragment)
                R.id.ic_discover -> makeCurrentFragment(discoverFragment)
                R.id.ic_contact -> makeCurrentFragment(contactFragment)
                R.id.ic_faqs -> makeCurrentFragment(faqsFragment)

            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply { replace(R.id.fl_wrapper, fragment)
        commit()
        }
}