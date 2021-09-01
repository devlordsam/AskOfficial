package com.lordsam.ask.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.lordsam.ask.databinding.FragmentProfileBinding
import com.lordsam.ask.viewmodel.ProfileViewModel

class ProfileFragment : Fragment() {

    private lateinit var profileViewModel: ProfileViewModel
    private var binding: FragmentProfileBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        profileViewModel =
            ViewModelProvider(this).get(ProfileViewModel::class.java)

        binding = FragmentProfileBinding.inflate(inflater, container, false)

        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.tvProfileOrders.setOnClickListener {
            gotoOrders()
        }

        binding!!.tvProfileEdit.setOnClickListener {
            gotoEditProfile()
        }

        binding!!.tvProfileSettings.setOnClickListener {
            gotoSettings()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    private fun gotoOrders(){
        findNavController().navigate(ProfileFragmentDirections.actionNavigationProfileToNavigationOrders())
    }

    private fun gotoSettings(){
        findNavController().navigate(ProfileFragmentDirections.actionNavigationProfileToNavigationSettings())
    }

    private fun gotoEditProfile(){
        findNavController().navigate(ProfileFragmentDirections.actionNavigationProfileToNavigationEditProfile())
    }
}