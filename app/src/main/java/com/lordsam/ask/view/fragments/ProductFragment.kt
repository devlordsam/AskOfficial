package com.lordsam.ask.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordsam.ask.databinding.FragmentProductBinding


class ProductFragment : Fragment() {

    private var binding :FragmentProductBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentProductBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.btnAndroidApi.setOnClickListener {
            gotoForm("android_api")
        }
        binding!!.btnAndroidApp.setOnClickListener {
            gotoForm("android_app")
        }
        binding!!.btnDesktopApi.setOnClickListener {
            gotoForm("desktop_api")
        }
        binding!!.btnDesktopApp.setOnClickListener {
            gotoForm("desktop_app")
        }
        binding!!.btnWebSite.setOnClickListener {
            gotoForm("website")
        }
        binding!!.btnWebApp.setOnClickListener {
            gotoForm("web_app")
        }
        binding!!.btnWebApi.setOnClickListener {
            gotoForm("web_api")
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }


    private fun gotoForm(type :String){
       findNavController().navigate(ProductFragmentDirections.actionNavigationProductToNavigationWebForm(type))
    }
}