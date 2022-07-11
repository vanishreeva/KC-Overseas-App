package com.internshala.kcapp.fragments

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.FragmentTransaction
import com.internshala.kcapp.R



// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ContactFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ContactFragment : Fragment() {
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
        val v =inflater.inflate(R.layout.fragment_contact, container, false)
        val bt = v.findViewById<Button>(R.id.contact_button)
        bt.setOnClickListener {
            val webview = webview()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.contact_fragment,webview)
            transaction.addToBackStack(null).commit()
        }
        val loc = v.findViewById<ImageView>(R.id.location_contact)
        loc.setOnClickListener {
            val location = location()
            val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
            transaction.replace(R.id.contact_fragment,location)
            transaction.addToBackStack(null).commit()
        }

        val call = v.findViewById<ImageView>(R.id.call_contact)
        call.setOnClickListener {
           call(v)
        }

        val email = v.findViewById<ImageView>(R.id.email_contact)
        email.setOnClickListener {
            composeEmail("bangalore@kcoverseas.com")
        }

        return v
    }

    fun call(view: View) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:" + "7259716255")
        startActivity(dialIntent)
    }
    fun composeEmail(addresses: String) {
        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:"+"bangalore@kcoverseas.com") // only email apps should handle this
            putExtra(Intent.EXTRA_EMAIL, addresses)
        }
            startActivity(intent)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var button:Button = view.findViewById(R.id.contact_button)

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ContactFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ContactFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}