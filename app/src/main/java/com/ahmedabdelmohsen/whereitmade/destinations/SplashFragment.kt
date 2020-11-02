package com.ahmedabdelmohsen.whereitmade.destinations

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ahmedabdelmohsen.whereitmade.R


class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setPostDelayed(view)
    }

    private fun setPostDelayed(view: View) {
        Handler().postDelayed({
           view.findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToScanCodeFragment())
        }, 3500)
    }

}