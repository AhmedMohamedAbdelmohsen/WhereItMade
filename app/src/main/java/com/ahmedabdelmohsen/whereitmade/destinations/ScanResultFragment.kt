package com.ahmedabdelmohsen.whereitmade.destinations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmedabdelmohsen.whereitmade.R
import com.ahmedabdelmohsen.whereitmade.data.CountriesData
import kotlinx.android.synthetic.main.fragment_scan_result.*

class ScanResultFragment : Fragment() {

    private var resultCode: String? = null
    private var barCodeString: String? = null
    private var barCodeInt: Int = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_scan_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setResults()
    }

    //set result and choose country
    private fun setResults() {
        resultCode = arguments?.getString("amount")
        if (resultCode != null) {
            barCodeString = resultCode!!.substring(0, 3)
        }
        barCodeInt = barCodeString!!.toInt()

        val countryData: CountriesData = CountriesData(iv_country_flag, tv_country_name, barCodeInt)
        countryData.updateCountry()
    }
}