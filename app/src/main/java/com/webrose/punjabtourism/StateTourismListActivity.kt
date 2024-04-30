package com.webrose.punjabtourism

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class StateTourismListActivity :AppCompatActivity() {
    private var list :ArrayList<TourismData>?= ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)

        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        tvTitle.text=intent.getStringExtra("title")

        if (intent.getStringExtra("title")=="Amritsar") {

            val goldenTemple = TourismData(
                R.drawable.ic_golden_temple,
                "Sri Harmandir Sahib (Golden Temple)",
                this.getString(R.string.golden_temple_desc)
            )
            val durgianaTemple = TourismData(
                R.drawable.durgaina_temple,
                "Durgiana Temple",
                this.getString(R.string.durgiana_temple)
            )
            val ramTirath = TourismData(
                R.drawable.ram_teerth,
                "Ram Tirath",
                this.getString(R.string.ram_tirath)
            )
            val wagahBorder = TourismData(
                R.drawable.wagah_border,
                "Wagah Border",
                this.getString(R.string.wagah_border)
            )
            val jallianWalaBagh = TourismData(
                R.drawable.wagah_border,
                "Jallian Wala Bagh",
                this.getString(R.string.jallian_wala_bagh)
            )
            val ranjitSinghMusium = TourismData(
                R.drawable.maharaja_ranjit_singh_museum,
                "Maharaja Ranjit Singh Museum",
                this.getString(R.string.maharaja_ranjit_singh_meusium)
            )
            val gobindgarhFort = TourismData(
                R.drawable.gobindgarh_fort,
                "Gobindgarh Fort",
                this.getString(R.string.gobindgarh_fort)
            )
            val pullKanjari = TourismData(
                R.drawable.pul_kanjari,
                "Pull Kanjari",
                this.getString(R.string.pull_kanjari)
            )

            list?.add(goldenTemple)
            list?.add(durgianaTemple)
            list?.add(ramTirath)
            list?.add(wagahBorder)
            list?.add(jallianWalaBagh)
            list?.add(ranjitSinghMusium)
            list?.add(gobindgarhFort)
            list?.add(pullKanjari)
        }

        val adapter = TourismAdapter(this, list)
        recyclerView.adapter = adapter

    }
}