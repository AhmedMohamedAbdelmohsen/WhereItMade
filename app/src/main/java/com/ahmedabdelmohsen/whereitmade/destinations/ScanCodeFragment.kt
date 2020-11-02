package com.ahmedabdelmohsen.whereitmade.destinations

import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ahmedabdelmohsen.whereitmade.R
import com.google.zxing.Result
import kotlinx.android.synthetic.main.fragment_scan_code.*
import me.dm7.barcodescanner.zxing.ZXingScannerView

class ScanCodeFragment : Fragment(), ZXingScannerView.ResultHandler {
    private var view1: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.view1 = view
        zxscan.setResultHandler(this)
        zxscan.startCamera()
        checkPermissions()
    }

    private val accessLocation = 123

    // check if camera has permission or not to use
    private fun checkPermissions() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ActivityCompat.checkSelfPermission(
                    requireActivity(),
                    android.Manifest.permission.CAMERA
                ) != PackageManager.PERMISSION_GRANTED
            )
                requestPermissions(
                    arrayOf(android.Manifest.permission.CAMERA),
                    accessLocation
                )
            return
        }

        Toast.makeText(requireActivity(), "access allowed", Toast.LENGTH_LONG).show()
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        when (requestCode) {
            accessLocation -> {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    zxscan.setResultHandler(this)
                    zxscan.startCamera()
                    Toast.makeText(requireActivity(), "access allowed", Toast.LENGTH_LONG).show()
                } else {
                    view1!!.findNavController()
                        .navigate(ScanCodeFragmentDirections.actionScanCodeFragmentToScanNowFragment())
                    Toast.makeText(requireActivity(), "access denied", Toast.LENGTH_LONG).show()
                }
            }
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onResume() {
        super.onResume()
        zxscan.setResultHandler(this)
        zxscan.startCamera()
    }

    override fun onPause() {
        super.onPause()
        zxscan.stopCamera()
    }

    //send result to the fragment of results
    override fun handleResult(rawResult: Result?) {
        val bundle = bundleOf("amount" to rawResult.toString())
        view1!!.findNavController()
            .navigate(R.id.action_scanCodeFragment_to_scanResultFragment, bundle)
        Toast.makeText(requireActivity(), "" + rawResult, Toast.LENGTH_SHORT).show()
    }
}

