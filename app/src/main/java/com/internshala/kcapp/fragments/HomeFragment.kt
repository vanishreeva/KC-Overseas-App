package com.internshala.kcapp.fragments

import android.Manifest
import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.findFragment
import androidx.media2.MediaController
import com.internshala.kcapp.R
import kotlinx.android.synthetic.main.fragment_contact.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.net.URI


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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
        val v = inflater.inflate(R.layout.fragment_home, container, false)


        val call = v.findViewById<Button>(R.id.book_button)

        call.setOnClickListener {
            call(v)
        }

        val usa = v.findViewById<ImageView>(R.id.home_usa)
        usa.setOnClickListener {
            val home_usa = usa()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,home_usa)
            transaction.addToBackStack(null).commit()
        }

        val canada = v.findViewById<ImageView>(R.id.home_canada)
        canada.setOnClickListener {
            val home_canada = canada()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,home_canada)
            transaction.addToBackStack(null).commit()
        }

        val uk = v.findViewById<ImageView>(R.id.home_uk)
        uk.setOnClickListener {
            val home_uk = uk()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,home_uk)
            transaction.addToBackStack(null).commit()
        }

        val australia = v.findViewById<ImageView>(R.id.home_australia)
        australia.setOnClickListener {
            val home_australia = australia()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,home_australia)
            transaction.addToBackStack(null).commit()
        }

        val germany = v.findViewById<ImageView>(R.id.home_germany)
        germany.setOnClickListener {
            val home_germany = germany()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,home_germany)
            transaction.addToBackStack(null).commit()
        }

        val test = v.findViewById<Button>(R.id.test_prep)
        test.setOnClickListener {
            val test_prep = test_prep()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,test_prep)
            transaction.addToBackStack(null).commit()
        }

        val test1 = v.findViewById<TextView>(R.id.sat)
        test1.setOnClickListener {
            val sat = sat()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,sat)
            transaction.addToBackStack(null).commit()
        }

        val test2 = v.findViewById<TextView>(R.id.act)
        test2.setOnClickListener {
            val act = act()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,act)
            transaction.addToBackStack(null).commit()
        }

        val test3 = v.findViewById<TextView>(R.id.gre)
        test3.setOnClickListener {
            val gre = gre()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,gre)
            transaction.addToBackStack(null).commit()
        }

        val test4 = v.findViewById<TextView>(R.id.gmat)
        test4.setOnClickListener {
            val gmat = gmat()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,gmat)
            transaction.addToBackStack(null).commit()
        }

        val test5 = v.findViewById<TextView>(R.id.ielts)
        test5.setOnClickListener {
            val ielts = ielts()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,ielts)
            transaction.addToBackStack(null).commit()
        }

        val test6 = v.findViewById<TextView>(R.id.pte)
        test6.setOnClickListener {
            val pte = pte()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,pte)
            transaction.addToBackStack(null).commit()
        }

        val test7 = v.findViewById<TextView>(R.id.toefl)
        test7.setOnClickListener {
            val to =toefl()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,to)
            transaction.addToBackStack(null).commit()
        }

        val test8 = v.findViewById<TextView>(R.id.duolingo)
        test8.setOnClickListener {
            val duo= duolingo()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.home_fragment,duo)
            transaction.addToBackStack(null).commit()
        }

        //val video = v.findViewById<VideoView>(R.id.video_view)


        //val mediaController = MediaController(getActivity())
        //mediaController.setAnchorView(video)

        //val offlineUri: Uri = Uri.parse("android.resource://"+ getActivity()?.getPackageName()+"/"+R.raw.bangalore_franchise_video)
        //video.setMediaController(mediaController)
        //video.setVideoURI(offlineUri)
        //video.start()



        return v
    }

    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "7259716255")
        startActivity(dialIntent)
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}