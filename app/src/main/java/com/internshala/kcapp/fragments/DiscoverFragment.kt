package com.internshala.kcapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentTransaction
import com.internshala.kcapp.R
import kotlinx.android.synthetic.main.fragment_discover.*
import org.w3c.dom.Text

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DiscoverFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DiscoverFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_discover, container, false)


        val viewall = v.findViewById<Button>(R.id.viewall_discover)
        viewall.setOnClickListener {
            val view_all = viewall_services()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,view_all)
            transaction.addToBackStack(null).commit()
        }
        val cou = v.findViewById<CardView>(R.id.counselling)
        cou.setOnClickListener {
            val counselling = viewall_services()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,counselling)
            transaction.addToBackStack(null).commit()
        }
        val tes = v.findViewById<CardView>(R.id.test)
        tes.setOnClickListener {
            val tests = test_prep()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,tests)
            transaction.addToBackStack(null).commit()
        }

        val univer = v.findViewById<CardView>(R.id.university)
        univer.setOnClickListener {
            val uni = universities()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,uni)
            transaction.addToBackStack(null).commit()
        }

        val appl = v.findViewById<CardView>(R.id.application)
        appl.setOnClickListener {
            val apply = viewall_services()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,apply)
            transaction.addToBackStack(null).commit()
        }

        val edu_loan = v.findViewById<CardView>(R.id.edu)
        edu_loan.setOnClickListener {
            val edu =loans()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,edu)
            transaction.addToBackStack(null).commit()
        }

        val vis = v.findViewById<CardView>(R.id.visa)
        vis.setOnClickListener {
            val visa_pro = viewall_services()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,visa_pro)
            transaction.addToBackStack(null).commit()
        }

        val add = v.findViewById<CardView>(R.id.additional)
        add.setOnClickListener {
            val addi = viewall_services()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,addi)
            transaction.addToBackStack(null).commit()
        }

        val uni = v.findViewById<Button>(R.id.uni_knowmore)
        uni.setOnClickListener {
            val university = universities()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,university)
            transaction.addToBackStack(null).commit()

        }

        val usa = v.findViewById<ImageView>(R.id.usa)
        usa.setOnClickListener {
            val country1 = usa()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country1)
            transaction.addToBackStack(null).commit()

        }

        val nether = v.findViewById<ImageView>(R.id.netherlands)
        nether.setOnClickListener {
            val country2 = netherlands()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country2)
            transaction.addToBackStack(null).commit()

        }
        val can = v.findViewById<ImageView>(R.id.canada)
        can.setOnClickListener {
            val country3 = canada()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country3)
            transaction.addToBackStack(null).commit()

        }

        val swe = v.findViewById<ImageView>(R.id.sweden)
        swe.setOnClickListener {
            val country4 = sweden()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country4)
            transaction.addToBackStack(null).commit()

        }

        val ire = v.findViewById<ImageView>(R.id.ireland)
        ire.setOnClickListener {
            val country5 = ireland()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country5)
            transaction.addToBackStack(null).commit()

        }

        val aus = v.findViewById<ImageView>(R.id.australia)
        aus.setOnClickListener {
            val country6 = australia()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country6)
            transaction.addToBackStack(null).commit()

        }
        val fra = v.findViewById<ImageView>(R.id.france)
        fra.setOnClickListener {
            val country7 = france()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country7)
            transaction.addToBackStack(null).commit()

        }
        val newze = v.findViewById<ImageView>(R.id.newzealand)
        newze.setOnClickListener {
            val country8 = newzealand()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country8)
            transaction.addToBackStack(null).commit()

        }

        val ger = v.findViewById<ImageView>(R.id.germany)
        ger.setOnClickListener {
            val country9 = germany()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country9)
            transaction.addToBackStack(null).commit()

        }
        val sing = v.findViewById<ImageView>(R.id.singapore)
        sing.setOnClickListener {
            val country10 = singapore()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country10)
            transaction.addToBackStack(null).commit()

        }
        val king = v.findViewById<ImageView>(R.id.uk)
        king.setOnClickListener {
            val country11 = uk()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country11)
            transaction.addToBackStack(null).commit()

        }
        val du = v.findViewById<ImageView>(R.id.dubai)
        du.setOnClickListener {
            val country12 = dubai()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,country12)
            transaction.addToBackStack(null).commit()

        }

        val a = v.findViewById<ImageView>(R.id.blog2)
        a.setOnClickListener {
            val a1 = blog2()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,a1)
            transaction.addToBackStack(null).commit()

        }

        val b = v.findViewById<ImageView>(R.id.blog3)
        b.setOnClickListener {
            val a2 = blog3()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,a2)
            transaction.addToBackStack(null).commit()

        }
        val c = v.findViewById<ImageView>(R.id.blog1)
        c.setOnClickListener {
            val a3 = blog1()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,a3)
            transaction.addToBackStack(null).commit()

        }
        val blogs = v.findViewById<Button>(R.id.blogs_viewall)
        blogs.setOnClickListener {
            val blog = allblogs()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,blog)
            transaction.addToBackStack(null).commit()

        }

        val intern = v.findViewById<Button>(R.id.internship)
        intern.setOnClickListener {
            val inter = internships()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,inter)
            transaction.addToBackStack(null).commit()

        }
        val edu = v.findViewById<Button>(R.id.loans)
        edu.setOnClickListener {
            val edu_loan = loans()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,edu_loan)
            transaction.addToBackStack(null).commit()

        }

        val scho = v.findViewById<Button>(R.id.scholarship)
        scho.setOnClickListener {
            val scholar = scholarship()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.discover_fragment,scholar)
            transaction.addToBackStack(null).commit()

        }


        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DiscoverFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DiscoverFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}