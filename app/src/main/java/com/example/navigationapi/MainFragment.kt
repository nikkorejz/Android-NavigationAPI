package com.example.navigationapi

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val controller = findNavController()
        val options = NavOptions.Builder()
        with(options) {
            setEnterAnim(R.anim.anim_open)
            setExitAnim(R.anim.anim_close)
//            ---
//            setPopEnterAnim(R.anim.anim_open)
//            setPopExitAnim(R.anim.anim_close)
        }

        view.findViewById<Button>(R.id.Frag1).setOnClickListener {
//            controller.navigate(R.id.fragment1)
            controller.navigate(R.id.fragment1, null, options.build())
        }

        view.findViewById<Button>(R.id.Frag2).setOnClickListener {
//            controller.navigate(R.id.fragment2)
            controller.navigate(R.id.fragment2, null, options.build())
        }
    }
}