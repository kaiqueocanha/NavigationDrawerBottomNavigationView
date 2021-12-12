package com.ocanha.navigationdrawerbottomnavigationview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.ocanha.navigationdrawerbottomnavigationview.R
import com.ocanha.navigationdrawerbottomnavigationview.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private lateinit var _binding: HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater)
        return _binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding.btnNotificacoe.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_notificationsFragment)

        }

        _binding.btnPerfil.setOnClickListener {

            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)

        }

    }
}