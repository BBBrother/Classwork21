package com.example.classwork21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FragmentClass: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_maket, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val text = view.findViewById<TextView>(R.id.textone)
        text.setOnClickListener {
            val fragmentTwo = FragmentTwo()
            requireActivity().supportFragmentManager
                .beginTransaction()
                .replace(R.id.thisFrameLayout,fragmentTwo)
                .commit()
        }
    }
}