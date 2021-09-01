package com.lordsam.ask.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.lordsam.ask.databinding.FragmentFormBinding


class FormFragment : Fragment() {

    private var binding: FragmentFormBinding? = null
    private lateinit var type: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentFormBinding.inflate(inflater, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: FormFragmentArgs by navArgs()

        type = args.type

        when (type) {
            //product data
            "android_api" -> {
                binding!!.etType.setText("Android API")
            }
            "android_app" -> {
                binding!!.etType.setText("Android App")
            }
            "desktop_api" -> {
                binding!!.etType.setText("Desktop API")
            }
            "desktop_app" -> {
                binding!!.etType.setText("Desktop APP")
            }
            "website" -> {
                binding!!.etType.setText("Website")
            }
            "web_app" -> {
                binding!!.etType.setText("Web App")
            }
            "web_api" -> {
                binding!!.etType.setText("Web API")
            }

            //services data
            "services_api" -> {
                binding!!.etType.setText("API Service")
            }
            "services_seo" -> {
                binding!!.etType.setText("SEO Service")
            }
            "website_maintenance" -> {
                binding!!.etType.setText("Website Maintenance")
            }

            //solutions data
            "solution_desktop_hardware" -> {
                binding!!.etType.setText("Desktop Hardware Solution")
                filterSolutionForm()
            }
            "solution_desktop_software" -> {
                binding!!.etType.setText("Desktop Software Solution")
                filterSolutionForm()
            }
            "solution_mobile_phone_hardware" -> {
                binding!!.etType.setText("Mobile Phone Hardware Solution")
                filterSolutionForm()
            }
            "solution_mobile_phone_software" -> {
                binding!!.etType.setText("Mobile Phone Software Solution")
                filterSolutionForm()
            }
            "solution_other_hardware" -> {
                binding!!.etType.setText("Other Hardware Solution")
                filterSolutionForm()
            }
            "solution_other_software" -> {
                binding!!.etType.setText("Other Software Solution")
                filterSolutionForm()
            }
            "solution_technical" -> {
                binding!!.etType.setText("Technical Solution")
                filterSolutionForm()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun filterSolutionForm(){
        binding!!.tilDescription.hint = "Subject"
        binding!!.tilFeatures.hint = "Problem"
        binding!!.etFeatures.hint = ""
    }


}