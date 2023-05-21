package com.example.fragments.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R
import com.example.fragments.databinding.ListFragmentBinding


@Suppress("UNREACHABLE_CODE")
class ListFragment : Fragment() {

    private var _binding: ListFragmentBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {
        _binding = ListFragmentBinding.inflate(inflater, container, false)
        return binding.root
        val view = inflater.inflate(R.layout.profile_fragment, container, false)
        val backButton = view.findViewById<Button>(R.id.button22)
        backButton.setOnClickListener {
            Homefragment.popBackStack()
        }
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Navigation.findNavController(view)

        binding.apply {
            setOnClickListener()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

private fun setOnClickListener(): Unit = TODO(reason = "Not yet implemented")

