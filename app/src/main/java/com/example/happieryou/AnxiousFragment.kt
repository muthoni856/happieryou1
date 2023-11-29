package com.example.happieryou

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.happieryou.databinding.AnxiouspageBinding


class AnxiousFragment :Fragment() {
    private var _binding: AnxiouspageBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = AnxiouspageBinding.inflate(inflater, container, false)
        return binding.root

    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
////        binding.buttonFirst.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
////        }
////
////        binding.button3.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_ThirdFragment)
////        }
////
////        binding.button4.setOnClickListener {
////            findNavController().navigate(R.id.action_FirstFragment_to_FourthFragment)
////        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}