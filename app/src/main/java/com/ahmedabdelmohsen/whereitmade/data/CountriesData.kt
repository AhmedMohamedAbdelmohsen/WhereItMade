package com.ahmedabdelmohsen.whereitmade.data

import android.widget.ImageView
import android.widget.TextView
import com.ahmedabdelmohsen.whereitmade.R

class CountriesData {
    private var countryFlag: ImageView? = null
    private var nameCountry: TextView? = null
    private var barCode = 0

    constructor(countryFlag: ImageView, nameCountry: TextView, barCode: Int) {
        this.countryFlag = countryFlag
        this.nameCountry = nameCountry
        this.barCode = barCode
    }

    fun updateCountry() {


        /*mapFlag.put(890,R.drawable.flag_india);
        mapFlag.put(697,R.drawable.flag_china);
        mapName.put(890,"INDIA");
        mapName.put(697,"CHINA");

        countryFlag?.setImageResource(hashMap.get(barCode));
        nameCountry.setText(hashMapp.get(barCode));*/
        if (barCode in 0..19) {
            countryFlag?.setImageResource(R.drawable.flag_united_states)
            nameCountry!!.text = "USA"
        } else if (barCode in 30..39) {
            countryFlag?.setImageResource(R.drawable.flag_united_states)
            nameCountry!!.text = "USA"
        } else if (barCode in 60..99) {
            countryFlag?.setImageResource(R.drawable.flag_united_states)
            nameCountry!!.text = "USA"
        } else if (barCode in 100..139) {
            countryFlag?.setImageResource(R.drawable.flag_united_states)
            nameCountry!!.text = "USA"
        } else if (barCode in 300..379) {
            countryFlag?.setImageResource(R.drawable.flag_france)
            nameCountry!!.text = "FRANCE"
        } else if (barCode == 380) {
            countryFlag?.setImageResource(R.drawable.flag_bulgaria)
            nameCountry!!.text = "BULGARIA"
        } else if (barCode == 383) {
            countryFlag?.setImageResource(R.drawable.flag_slovenie)
            nameCountry!!.text = "SLOVENIA"
        } else if (barCode == 385) {
            countryFlag?.setImageResource(R.drawable.flag_croatia)
            nameCountry!!.text = "CROATIA"
        } else if (barCode ==
            387
        ) {
            countryFlag?.setImageResource(R.drawable.flag_bosnia)
            nameCountry!!.text = "BOSNIA"
        } else if (barCode == 389) {
            countryFlag?.setImageResource(R.drawable.flag_montenegro)
            nameCountry!!.text = "MONTENEGRO"
        } else if (barCode == 390) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "KOSOVO"
        } else if (barCode in 400..440) {
            countryFlag?.setImageResource(R.drawable.flag_germany)
            nameCountry!!.text = "GERMANY"
        } else if (barCode in 450..459) {
            countryFlag?.setImageResource(R.drawable.flag_japan)
            nameCountry!!.text = "JAPAN"
        } else if (barCode in 460..469) {
            countryFlag?.setImageResource(R.drawable.flag_russia)
            nameCountry!!.text = "RUSSIA"
        } else if (barCode == 470) {
            countryFlag?.setImageResource(R.drawable.flag_kyrgyzstan)
            nameCountry!!.text = "KYRGYZSTAN"
        } else if (barCode == 471) {
            countryFlag?.setImageResource(R.drawable.flag_taiwan)
            nameCountry!!.text = "TAIWAN"
        } else if (barCode == 474) {
            countryFlag?.setImageResource(R.drawable.flag_estonia)
            nameCountry!!.text = "ESTONIA"
        } else if (barCode == 475) {
            countryFlag?.setImageResource(R.drawable.flag_latvia)
            nameCountry!!.text = "LATVIA"
        } else if (barCode == 476) {
            countryFlag?.setImageResource(R.drawable.flag_azerbaijan)
            nameCountry!!.text = "AZERBAIJAN"
        } else if (barCode == 477) {
            countryFlag?.setImageResource(R.drawable.flag_lithuania)
            nameCountry!!.text = "LITHUANIA"
        } else if (barCode == 478) {
            countryFlag?.setImageResource(R.drawable.flag_uzbekistan)
            nameCountry!!.text = "UZBEKISTAN"
        } else if (barCode == 479) {
            countryFlag?.setImageResource(R.drawable.flag_sri_lanka)
            nameCountry!!.text = "SRI LANKA"
        } else if (barCode == 480) {
            countryFlag?.setImageResource(R.drawable.flag_philippines)
            nameCountry!!.text = "PHILIPPINES"
        } else if (barCode == 481) {
            countryFlag?.setImageResource(R.drawable.flag_belarus)
            nameCountry!!.text = "BELARUS"
        } else if (barCode == 482) {
            countryFlag?.setImageResource(R.drawable.flag_ukraine)
            nameCountry!!.text = "UKRAINE"
        } else if (barCode == 483) {
            countryFlag?.setImageResource(R.drawable.flag_turkmenistan)
            nameCountry!!.text = "TURKMENISTAN"
        } else if (barCode == 484) {
            countryFlag?.setImageResource(R.drawable.flag_moldova)
            nameCountry!!.text = "MOLDOVA"
        } else if (barCode == 485) {
            countryFlag?.setImageResource(R.drawable.flag_armenia)
            nameCountry!!.text = "ARMENIA"
        } else if (barCode == 486) {
            countryFlag?.setImageResource(R.drawable.flag_georgia)
            nameCountry!!.text = "GEORGIA"
        } else if (barCode == 487) {
            countryFlag?.setImageResource(R.drawable.flag_kazakhstan)
            nameCountry!!.text = "KAZAKHSTAN"
        } else if (barCode == 488) {
            countryFlag?.setImageResource(R.drawable.flag_tajikistan)
            nameCountry!!.text = "TAJIKISTAN"
        } else if (barCode == 489) {
            countryFlag?.setImageResource(R.drawable.flag_hong_kong)
            nameCountry!!.text = "HONG KONG"
        } else if (barCode in 490..499) {
            countryFlag?.setImageResource(R.drawable.flag_japan)
            nameCountry!!.text = "JAPAN"
        } else if (barCode in 500..509) {
            countryFlag?.setImageResource(R.drawable.flag_uk)
            nameCountry!!.text = "UK"
        } else if (barCode in 520..521) {
            countryFlag?.setImageResource(R.drawable.flag_greece)
            nameCountry!!.text = "GREECE"
        } else if (barCode == 528) {
            countryFlag?.setImageResource(R.drawable.flag_lebanon)
            nameCountry!!.text = "LEBANON"
        } else if (barCode == 529) {
            countryFlag?.setImageResource(R.drawable.flag_cyprus)
            nameCountry!!.text = "CYPRUS"
        } else if (barCode == 530) {
            countryFlag?.setImageResource(R.drawable.flag_albania)
            nameCountry!!.text = "ALBANIA"
        } else if (barCode == 531) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "NORTH MACEDONIA"
        } else if (barCode == 535) {
            countryFlag?.setImageResource(R.drawable.flag_malta)
            nameCountry!!.text = "MALTA"
        } else if (barCode == 539) {
            countryFlag?.setImageResource(R.drawable.flag_republic_of_ireland)
            nameCountry!!.text = "IRELAND"
        } else if (barCode in 540..549) {
            countryFlag?.setImageResource(R.drawable.flag_belgium_luxembourg)
            nameCountry!!.text = "BELGIUM"
        } else if (barCode == 560) {
            countryFlag?.setImageResource(R.drawable.flag_portugal)
            nameCountry!!.text = "PORTUGAL"
        } else if (barCode == 569) {
            countryFlag?.setImageResource(R.drawable.flag_iceland)
            nameCountry!!.text = "ICELAND"
        } else if (barCode in 570..579) {
            countryFlag?.setImageResource(R.drawable.flag_denmark)
            nameCountry!!.text = "DENMARK"
        } else if (barCode == 590) {
            countryFlag?.setImageResource(R.drawable.flag_poland)
            nameCountry!!.text = "POLAND"
        } else if (barCode == 594) {
            countryFlag?.setImageResource(R.drawable.flag_romania)
            nameCountry!!.text = "ROMANIA"
        } else if (barCode in 600..601) {
            countryFlag?.setImageResource(R.drawable.flag_south_africa)
            nameCountry!!.text = "SOUTH AFRICA"
        } else if (barCode == 603) {
            countryFlag?.setImageResource(R.drawable.flag_ghana)
            nameCountry!!.text = "GHANA"
        } else if (barCode == 604) {
            countryFlag?.setImageResource(R.drawable.flag_senegal)
            nameCountry!!.text = "SENEGAL"
        } else if (barCode == 608) {
            countryFlag?.setImageResource(R.drawable.flag_bahrain)
            nameCountry!!.text = "BAHRAIN"
        } else if (barCode == 609) {
            countryFlag?.setImageResource(R.drawable.flag_mauritius)
            nameCountry!!.text = "MAURITIUS"
        } else if (barCode == 611) {
            countryFlag?.setImageResource(R.drawable.flag_morocco)
            nameCountry!!.text = "MOROCCO"
        } else if (barCode == 613) {
            countryFlag?.setImageResource(R.drawable.flag_algeria)
            nameCountry!!.text = "ALGERIA"
        } else if (barCode == 615) {
            countryFlag?.setImageResource(R.drawable.flag_nigeria)
            nameCountry!!.text = "NIGERIA"
        } else if (barCode == 616) {
            countryFlag?.setImageResource(R.drawable.flag_kenya)
            nameCountry!!.text = "KENYA"
        } else if (barCode == 617) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "CAMEROON"
        } else if (barCode == 618) {
            countryFlag?.setImageResource(R.drawable.flag_ivory_coast)
            nameCountry!!.text = "IVORY COAST"
        } else if (barCode == 619) {
            countryFlag?.setImageResource(R.drawable.flag_tunisia)
            nameCountry!!.text = "TUNISIA"
        } else if (barCode == 620) {
            countryFlag?.setImageResource(R.drawable.flag_tanzania)
            nameCountry!!.text = "TANZANIA"
        } else if (barCode == 621) {
            countryFlag?.setImageResource(R.drawable.flag_syria)
            nameCountry!!.text = "SYRIA"
        } else if (barCode == 622) {
            countryFlag?.setImageResource(R.drawable.flag_egypt)
            nameCountry!!.text = "EGYPT"
        } else if (barCode == 623) {
            countryFlag?.setImageResource(R.drawable.flag_brunei)
            nameCountry!!.text = "BRUNEI"
        } else if (barCode == 624) {
            countryFlag?.setImageResource(R.drawable.flag_libya)
            nameCountry!!.text = "LIBYA"
        } else if (barCode == 625) {
            countryFlag?.setImageResource(R.drawable.flag_jordan)
            nameCountry!!.text = "JORDAN"
        } else if (barCode == 626) {
            countryFlag?.setImageResource(R.drawable.flag_iran)
            nameCountry!!.text = "IRAN"
        } else if (barCode == 627) {
            countryFlag?.setImageResource(R.drawable.flag_kuwait)
            nameCountry!!.text = "KUWAIT"
        } else if (barCode == 628) {
            countryFlag?.setImageResource(R.drawable.flag_saudi_arabia)
            nameCountry!!.text = "SAUDI ARABIA"
        } else if (barCode == 629) {
            countryFlag?.setImageResource(R.drawable.flag_united_arab_emirates)
            nameCountry!!.text = "UAE"
        } else if (barCode == 630) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "QATAR"
        } else if (barCode in 640..649) {
            countryFlag?.setImageResource(R.drawable.flag_finland)
            nameCountry!!.text = "FINLAND"
        } else if (barCode in 690..699) {
            countryFlag?.setImageResource(R.drawable.flag_china)
            nameCountry!!.text = "CHINA"
        } else if (barCode in 700..709) {
            countryFlag?.setImageResource(R.drawable.flag_norway)
            nameCountry!!.text = "NORWAY"
        } else if (barCode == 729) {
            countryFlag?.setImageResource(R.drawable.flag_israel)
            nameCountry!!.text = "ISRAEL"
        } else if (barCode in 730..739) {
            countryFlag?.setImageResource(R.drawable.flag_sweden)
            nameCountry!!.text = "SWEDEN"
        } else if (barCode == 740) {
            countryFlag?.setImageResource(R.drawable.flag_guatemala)
            nameCountry!!.text = "GUATEMALA"
        } else if (barCode == 741) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "EL SALVADOR"
        } else if (barCode == 742) {
            countryFlag?.setImageResource(R.drawable.flag_honduras)
            nameCountry!!.text = "HONDURAS"
        } else if (barCode == 743) {
            countryFlag?.setImageResource(R.drawable.flag_nicaragua)
            nameCountry!!.text = "NICARAGUA"
        } else if (barCode == 744) {
            countryFlag?.setImageResource(R.drawable.flag_costa_rica)
            nameCountry!!.text = "COSTA RICA"
        } else if (barCode == 745) {
            countryFlag?.setImageResource(R.drawable.flag_panama)
            nameCountry!!.text = "PANAMA"
        } else if (barCode == 746) {
            countryFlag?.setImageResource(R.drawable.flag_dominican_republic)
            nameCountry!!.text = "DOMINICAN PUBLIC"
        } else if (barCode == 750) {
            countryFlag?.setImageResource(R.drawable.flag_mexico)
            nameCountry!!.text = "MEXICO"
        } else if (barCode in 754..755) {
            countryFlag?.setImageResource(R.drawable.flag_canada)
            nameCountry!!.text = "CANADA"
        } else if (barCode == 759) {
            countryFlag?.setImageResource(R.drawable.flag_venezuela)
            nameCountry!!.text = "VENEZUELA"
        } else if (barCode in 760..769) {
            countryFlag?.setImageResource(R.drawable.flag_switzerland)
            nameCountry!!.text = "SWITZERLAND"
        } else if (barCode in 770..771) {
            countryFlag?.setImageResource(R.drawable.flag_colombia)
            nameCountry!!.text = "COLOMBIA"
        } else if (barCode == 773) {
            countryFlag?.setImageResource(R.drawable.flag_uruguay)
            nameCountry!!.text = "URUGUAY"
        } else if (barCode == 775) {
            countryFlag?.setImageResource(R.drawable.flag_peru)
            nameCountry!!.text = "PERU"
        } else if (barCode == 777) {
            countryFlag?.setImageResource(R.drawable.flag_bolivia)
            nameCountry!!.text = "BOLIVIA"
        } else if (barCode in 778..779) {
            countryFlag?.setImageResource(R.drawable.flag_argentina)
            nameCountry!!.text = "ARGENTINA"
        } else if (barCode == 780) {
            countryFlag?.setImageResource(R.drawable.flag_chile)
            nameCountry!!.text = "CHILE"
        } else if (barCode == 784) {
            countryFlag?.setImageResource(R.drawable.flag_paraguay)
            nameCountry!!.text = "PARAGUAY"
        } else if (barCode == 786) {
            countryFlag?.setImageResource(R.drawable.flag_ecuador)
            nameCountry!!.text = "ECUADOR"
        } else if (barCode in 789..790) {
            countryFlag?.setImageResource(R.drawable.flag_brazil)
            nameCountry!!.text = "BRAZIL"
        } else if (barCode in 800..839) {
            countryFlag?.setImageResource(R.drawable.flag_italy)
            nameCountry!!.text = "ITALY"
        } else if (barCode in 840..849) {
            countryFlag?.setImageResource(R.drawable.flag_spain)
            nameCountry!!.text = "SPAIN"
        } else if (barCode == 850) {
            countryFlag?.setImageResource(R.drawable.flag_cuba)
            nameCountry!!.text = "CUBA"
        } else if (barCode == 858) {
            countryFlag?.setImageResource(R.drawable.flag_slovakia)
            nameCountry!!.text = "SLOVAKIA"
        } else if (barCode == 859) {
            countryFlag?.setImageResource(R.drawable.flag_czech_republic)
            nameCountry!!.text = "CZECH REPUBLIC"
        } else if (barCode == 860) {
            countryFlag?.setImageResource(R.drawable.flag_serbia)
            nameCountry!!.text = "SERBIA"
        } else if (barCode == 865) {
            countryFlag?.setImageResource(R.drawable.flag_mongolia)
            nameCountry!!.text = "MONGOLIA"
        } else if (barCode == 867) {
            countryFlag?.setImageResource(R.drawable.flag_north_korea)
            nameCountry!!.text = "NORTH KOREA"
        } else if (barCode in 868..869) {
            countryFlag?.setImageResource(R.drawable.flag_turkey)
            nameCountry!!.text = "TURKEY"
        } else if (barCode in 870..879) {
            countryFlag?.setImageResource(R.drawable.flag_netherlands)
            nameCountry!!.text = "NETHERLANDS"
        } else if (barCode == 880) {
            countryFlag?.setImageResource(R.drawable.flag_south_korea)
            nameCountry!!.text = "SOUTH KOREA"
        } else if (barCode == 883) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "MYANMAR"
        } else if (barCode == 884) {
            countryFlag?.setImageResource(R.drawable.flag_cambodia)
            nameCountry!!.text = "CAMBODIA"
        } else if (barCode == 885) {
            countryFlag?.setImageResource(R.drawable.flag_thailand)
            nameCountry!!.text = "THAILAND"
        } else if (barCode == 888) {
            countryFlag?.setImageResource(R.drawable.flag_singapore)
            nameCountry!!.text = "SINGAPORE"
        } else if (barCode == 890) {
            countryFlag?.setImageResource(R.drawable.flag_india)
            nameCountry!!.text = "INDIA"
        } else if (barCode == 893) {
            countryFlag?.setImageResource(R.drawable.flag_vietnam)
            nameCountry!!.text = "VIETNAM"
        } else if (barCode == 896) {
            countryFlag?.setImageResource(R.drawable.flag_pakistan)
            nameCountry!!.text = "PAKISTAN"
        } else if (barCode == 899) {
            countryFlag?.setImageResource(R.drawable.flag_indonesia)
            nameCountry!!.text = "INDONESIA"
        } else if (barCode in 900..919) {
            countryFlag?.setImageResource(R.drawable.flag_austria)
            nameCountry!!.text = "AUSTRIA"
        } else if (barCode in 930..939) {
            countryFlag?.setImageResource(R.drawable.flag_australia)
            nameCountry!!.text = "AUSTRALIA"
        } else if (barCode in 940..949) {
            countryFlag?.setImageResource(R.drawable.flag_new_zealand)
            nameCountry!!.text = "NEW ZEALAND"
        } else if (barCode == 955) {
            countryFlag?.setImageResource(R.drawable.flag_malaysia)
            nameCountry!!.text = "MALAYSIA"
        } else if (barCode == 958) {
            countryFlag?.setImageResource(R.drawable.flag_macau)
            nameCountry!!.text = "MACAU"
        } else if (barCode in 978..979) {
            countryFlag?.setImageResource(0)
            nameCountry!!.text = "BOOKLAND"
        } else {
            countryFlag?.setImageResource(R.drawable.flag_default)
            nameCountry!!.text = "NOT FOUND"
        }
    }
}