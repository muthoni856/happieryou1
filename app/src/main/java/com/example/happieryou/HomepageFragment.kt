package com.example.happieryou

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.happieryou.databinding.HomepageBinding


class HomepageFragment : Fragment() {
    private var _binding: HomepageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = HomepageBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView2.setOnClickListener {
            findNavController().navigate(R.id.action_HomepageFragment_to_HappyFragment)
        }

      binding.imageView4.setOnClickListener {
           findNavController().navigate(R.id.action_HomepageFragment_to_SadFragment)
       }

       binding.imageView5.setOnClickListener {
           findNavController().navigate(R.id.action_HomepageFragment_to_CoolFragment)
        }
        binding.imageView6.setOnClickListener {
            findNavController().navigate(R.id.action_HomepageFragment_to_AnxiousFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}