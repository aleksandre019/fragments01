package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R
import com.example.fragments.databinding.HomeFragmentBinding

class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val onClickListener = binding.Button.setOnClickListener {
            val digit = binding.editTextTextPersonName.text.toString()

            if (digit.isEmpty()) return@setOnClickListener

            val action = HomeFragmentDirections.actionHomeFragmentToListFragment()
            Navigation.run { findNavController(view).navigate(action) }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class Homefragment : Fragment() {
    private lateinit var editText: EditText

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        editText = view.findViewById(R.id.imageView)
        return view
    }

    companion object {
        fun popBackStack() {
            TODO("Not yet implemented")
        }
    }

}
