package com.lordsam.ask.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordsam.ask.R
import com.lordsam.ask.databinding.FragmentServicesBinding


class ServicesFragment : Fragment() {

    private var binding :FragmentServicesBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentServicesBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.btnServicesApi.setOnClickListener {
            gotoForm("services_api")
        }
        binding!!.btnServicesSeo.setOnClickListener {
            gotoForm("services_seo")
        }
        binding!!.btnServicesWebsiteMaintenance.setOnClickListener {
            gotoForm("website_maintenance")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun gotoForm(type :String){
        findNavController().navigate(ServicesFragmentDirections.actionNavigationServicesToNavigationWebForm(type))
    }

}