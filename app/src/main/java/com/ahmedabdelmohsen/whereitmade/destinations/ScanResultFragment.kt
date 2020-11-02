package com.ahmedabdelmohsen.whereitmade.destinations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.ahmedabdelmohsen.whereitmade.R
import com.ahmedabdelmohsen.whereitmade.data.CountriesData
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import kotlinx.android.synthetic.main.fragment_scan_result.*
import kotlinx.android.synthetic.main.fragment_scan_result.adView

class ScanResultFragment : Fragment() {

    private var resultCode: String? = null
    private var barCodeString: String? = null
    private var barCodeInt: Int = 101010
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initializeMobileAds() //Ads
        setResults()
        getBack()
    }

    private fun initializeMobileAds() {
        MobileAds.initialize(requireActivity()) {}
        val adRequest = AdRequest.Builder().build()
        adView.loadAd(adRequest)

    }

    //set result and choose country
    private fun setResults() {
        resultCode = arguments?.getString("amount")
        if (resultCode != null) {
            barCodeString = resultCode!!.substring(0, 3)
            try {
                barCodeInt = barCodeString!!.toInt()
            } catch (e: Exception) {
                Toast.makeText(
                    requireActivity(),
                    "Please scan only barcode",
                    Toast.LENGTH_LONG
                ).show()
            }
        }

        val countryData = CountriesData(iv_country_flag, tv_country_name, barCodeInt)
        countryData.updateCountry()
    }

    private fun getBack() {
        fab_back.setOnClickListener { requireActivity().onBackPressed() }
    }
}