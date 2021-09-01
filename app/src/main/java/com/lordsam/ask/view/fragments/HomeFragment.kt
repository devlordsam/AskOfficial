package com.lordsam.ask.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.lordsam.ask.R
import com.lordsam.ask.databinding.FragmentHomeBinding
import com.lordsam.ask.view.activities.MainActivity
import com.lordsam.ask.viewmodel.HomeViewModel

class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var homeViewModel: HomeViewModel
    private var binding: FragmentHomeBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding!!.btnHomeProducts.setOnClickListener(this)
        binding!!.btnHomeServices.setOnClickListener(this)
        binding!!.btnHomeSolutions.setOnClickListener(this)
        binding!!.btnHomeStartLearning.setOnClickListener(this)

        return binding!!.root
    }

    override fun onResume() {
        super.onResume()
        if (requireActivity() is MainActivity){
            (activity as MainActivity?)?.showBotNav()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_home_products -> {
                gotoProducts()
            }
            R.id.btn_home_services -> {
                gotoServices()
            }
            R.id.btn_home_solutions -> {
                gotoSolutions()
            }
            R.id.btn_home_start_learning -> {
                gotoLearning()
            }
        }
    }

    private fun gotoProducts(){

        findNavController().navigate(
            HomeFragmentDirections.actionNavigationHomeToNavigationProduct()
        )

        if (requireActivity() is MainActivity){
            (activity as MainActivity?)?.hideBotNav()
        }
    }

    private fun gotoServices(){

        findNavController().navigate(
            HomeFragmentDirections.actionNavigationHomeToNavigationServices()
        )

        if (requireActivity() is MainActivity){
            (activity as MainActivity?)?.hideBotNav()
        }
    }

    private fun gotoSolutions(){

        findNavController().navigate(
            HomeFragmentDirections.actionNavigationHomeToNavigationSolutions()
        )

        if (requireActivity() is MainActivity){
            (activity as MainActivity?)?.hideBotNav()
        }
    }

    private fun gotoLearning(){

        findNavController().navigate(
            HomeFragmentDirections.actionNavigationHomeToNavigationLearning()
        )

        if (requireActivity() is MainActivity){
            (activity as MainActivity?)?.hideBotNav()
        }
    }
}