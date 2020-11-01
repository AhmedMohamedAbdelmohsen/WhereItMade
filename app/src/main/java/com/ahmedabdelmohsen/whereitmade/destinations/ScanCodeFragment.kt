package com.ahmedabdelmohsen.whereitmade.destinations

import android.Manifest
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.ahmedabdelmohsen.whereitmade.R
import com.google.zxing.Result
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.single.PermissionListener
import kotlinx.android.synthetic.main.fragment_scan_code.*
import me.dm7.barcodescanner.zxing.ZXingScannerView

class ScanCodeFragment : Fragment() {
    lateinit var scannerView: ZXingScannerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_code, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setScannerCodePermissions(view)
    }

    private fun setScannerCodePermissions(view: View) {
        Dexter.withActivity(requireActivity())
            .withPermission(android.Manifest.permission.CAMERA)
            .withListener(object : PermissionListener, ZXingScannerView.ResultHandler {
                override fun onPermissionGranted(response: PermissionGrantedResponse?) {
                    zxscan.setResultHandler(this)
                    zxscan.startCamera()
                }

                override fun onPermissionRationaleShouldBeShown(
                    permission: PermissionRequest?,
                    token: PermissionToken?
                ) {

                }

                override fun onPermissionDenied(response: PermissionDeniedResponse?) {
                    Toast.makeText(
                        requireActivity(),
                        "Please accept this permission",
                        Toast.LENGTH_SHORT
                    ).show()
                    view.findNavController()
                        .navigate(ScanCodeFragmentDirections.actionScanCodeFragmentToScanNowFragment())
                }

                override fun handleResult(rawResult: Result?) {
                    Toast.makeText(requireActivity(), "" + rawResult, Toast.LENGTH_SHORT).show()
                }

            }).check()
    }

    override fun onResume() {
        super.onResume()
        zxscan.startCamera()
    }
}

