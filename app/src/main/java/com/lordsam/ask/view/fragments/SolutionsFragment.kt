package com.lordsam.ask.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.lordsam.ask.R
import com.lordsam.ask.databinding.FragmentSolutionsBinding

class SolutionsFragment : Fragment() {

    private var binding :FragmentSolutionsBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSolutionsBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.btnSolutionsDesktop.setOnClickListener {
            gotoForm("solution_desktop_hardware")
        }
        binding!!.btnSolutionsDesktopSoftware.setOnClickListener {
            gotoForm("solution_desktop_software")
        }
        binding!!.btnSolutionsMobilePhone.setOnClickListener {
            gotoForm("solution_mobile_phone_hardware")
        }
        binding!!.btnSolutionsMobilePhoneSoftware.setOnClickListener {
            gotoForm("solution_mobile_phone_software")
        }
        binding!!.btnSolutionsOtherHardware.setOnClickListener {
            gotoForm("solution_other_hardware")
        }
        binding!!.btnSolutionsOtherSoftware.setOnClickListener {
            gotoForm("solution_other_software")
        }
        binding!!.btnSolutionsTechnical.setOnClickListener {
            gotoForm("solution_technical")
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun gotoForm(type :String){
        findNavController().navigate(SolutionsFragmentDirections.actionNavigationSolutionsToNavigationWebForm(type))
    }

}