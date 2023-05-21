package com.example.fragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.fragments.R
import com.example.fragments.databinding.HomeFragmentBinding

@Suppress("UNUSED_EXPRESSION")
class HomeFragment : Fragment() {

    private var _binding: HomeFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = HomeFragmentBinding.inflate(/* inflater = */ inflater, /* parent = */
            container, /* attachToParent = */
            false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        Navigation.findNavController(view)

        binding.apply {
            button.setOnClickListener {
                val digit = editTextTextPersonName.text.toString()

                if (digit.isEmpty()) return@setOnClickListener

                digit.toInt()
                actionHomeFragmentToListFragment2()
                navigate()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null




    }
}

private fun navigate() {
    TODO("Not yet implemented")
}

private fun actionHomeFragmentToListFragment2(): Any {
    TODO("Not yet implemented")

}

class homefragment : Fragment() {
    private lateinit var editText:

    override override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        editText = view.findViewById(/* id = */ R.id.imageView)
        return view
    }

    fun deleteInformation() {
        editText.text.clear()
    }

    companion object
}
