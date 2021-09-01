package com.lordsam.ask.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lordsam.ask.databinding.FragmentLearningBinding
import com.lordsam.ask.view.adapters.HorizontalAdapter


class LearningFragment : Fragment() {

    private var binding :FragmentLearningBinding?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLearningBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arr = arrayOf("a","b","c","d","e","f")

        binding!!.rvHInternship.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding!!.rvHInternship.adapter = HorizontalAdapter(requireContext(), arr)

        binding!!.rvHTraining.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding!!.rvHTraining.adapter = HorizontalAdapter(requireContext(), arr)

        binding!!.rvHWorkshop.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding!!.rvHWorkshop.adapter = HorizontalAdapter(requireContext(), arr)
    }

    override fun onDestroy() {
        super.onDestroy()
        binding= null
    }


}