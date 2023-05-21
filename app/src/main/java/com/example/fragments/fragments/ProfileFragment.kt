package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R
import com.example.fragments.databinding.ProfileFragmentBinding


@Suppress("UNREACHABLE_CODE")
class ProfileFragment : Fragment() {

    @Suppress("UNUSED_PARAMETER")
    private var _binding: ProfileFragmentBinding?
        get() = null
        set(value) = TODO()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        return binding.root
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        val infoTextView = view.findViewById(R.id.textView1)
        val infoTextViewETCF2m= view.findViewById(R.id.textView3)
        val infoTextViewETC1 = view.findViewById(R.id.textView2)
        val information = arguments?.getString("information")
        information.also { infoTextView.text = it }


        return view

    }

    }


private fun setOnClickListener(): Unit = TODO(reason = "Not yet implemented")