package com.ahmedabdelmohsen.whereitmade.destinations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ahmedabdelmohsen.whereitmade.R
import kotlinx.android.synthetic.main.fragment_scan_now.*


class ScanNowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_now, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        openScanCodeFragment(view)
    }

    private fun openScanCodeFragment(view: View) {
        btn_start_scan.setOnClickListener {
            view.findNavController()
                .navigate(ScanNowFragmentDirections.actionScanNowFragmentToScanCodeFragment())
        }
    }
}