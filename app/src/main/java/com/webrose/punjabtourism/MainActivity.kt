package com.webrose.punjabtourism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<TourismData>? = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addData()
    }

    private fun addData() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val amritsar = TourismData(R.drawable.ic_golden_temple, "Amritsar", "")

        val goldenTemple= TourismData(R.drawable.ic_golden_temple, "Sri Harmandir Sahib (Golden Temple)", this.getString(R.string.golden_temple_desc))
        val durgianaTemple= TourismData(R.drawable.durgaina_temple, "Durgiana Temple", this.getString(R.string.durgiana_temple))
        val ramTirath= TourismData(R.drawable.ram_teerth, "Ram Tirath", this.getString(R.string.ram_tirath))
        val wagahBorder= TourismData(R.drawable.wagah_border, "Wagah Border", this.getString(R.string.wagah_border))
        val jallianWalaBagh= TourismData(R.drawable.wagah_border, "Jallian Wala Bagh", this.getString(R.string.jallian_wala_bagh))
        val ranjitSinghMusium= TourismData(R.drawable.maharaja_ranjit_singh_museum, "Maharaja Ranjit Singh Museum", this.getString(R.string.maharaja_ranjit_singh_meusium))
        val gobindgarhFort= TourismData(R.drawable.gobindgarh_fort, "Gobindgarh Fort", this.getString(R.string.gobindgarh_fort))
        val pullKanjari= TourismData(R.drawable.pul_kanjari, "Pull Kanjari", this.getString(R.string.pull_kanjari))

       /* amritsar.subList?.add(goldenTemple)
        amritsar.subList?.add(durgianaTemple)
        amritsar.subList?.add(ramTirath)
        amritsar.subList?.add(wagahBorder)
        amritsar.subList?.add(jallianWalaBagh)
        amritsar.subList?.add(ranjitSinghMusium)
        amritsar.subList?.add(gobindgarhFort)
        amritsar.subList?.add(pullKanjari)*/

        list?.add(amritsar)


        val gurdasPur = TourismData(R.drawable.gurdaspur, "Gurdaspur", "")
        list?.add(gurdasPur)

        val pthankot = TourismData(R.drawable.pthankot, "Pthankot", "")
        list?.add(pthankot)

        val kapurthala = TourismData(R.drawable.kpurthala, "Kapurthala", "")
        list?.add(kapurthala)

        val jalandhar = TourismData(R.drawable.jalandhar, "Jalandhar", "")
        list?.add(jalandhar)

        val ludhiana = TourismData(R.drawable.ludhiana, "Ludhiana", "")
        list?.add(ludhiana)

        val sasNagar = TourismData(R.drawable.sas_nagar, "SAS Nagar", "")
        list?.add(sasNagar)

        val patiala = TourismData(R.drawable.patiala, "Patiala", "")
        list?.add(patiala)

        val bathinda = TourismData(R.drawable.bathinda, "Bathinda", "")
        list?.add(bathinda)

        val rupnagar = TourismData(R.drawable.rupnagar, "Rupnagar", "")
        list?.add(rupnagar)

        val anandpurSahib = TourismData(R.drawable.anandpur_sahib, "Anandpur Sahib", "")
        list?.add(anandpurSahib)

        val hoshiarpur = TourismData(R.drawable.hoshiarpur, "Hoshiarpur", "")
        list?.add(hoshiarpur)

        val sangrur = TourismData(R.drawable.sangrur, "Sangrur", "")
        list?.add(sangrur)

        val fatehgarhSahib = TourismData(R.drawable.fatehgarh_sahib, "Fatehgarh Sahib", "")
        list?.add(fatehgarhSahib)

        val adapter = TourismAdapter(this, list)
        recyclerView.adapter = adapter

    }
}