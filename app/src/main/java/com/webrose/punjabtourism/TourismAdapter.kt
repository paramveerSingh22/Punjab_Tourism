package com.webrose.punjabtourism

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TourismAdapter(var context: Context, var list: ArrayList<TourismData>?) : RecyclerView.Adapter<TourismAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tourism_list, parent, false)

        return ViewHolder(view)

    }

    override fun getItemCount(): Int {

        return list?.size?:0
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.tvTitle.text= list?.get(position)?.title ?: ""
        holder.tvDesc.text= list?.get(position)?.description.toString()

        val filePath = "path_to_your_image_file"
        val reqWidth = 250 // Desired width
        val reqHeight = 250 // Desired height

        val bitmap = BitmapUtils.decodeSampledBitmapFromResource(context, list?.get(position)?.image?:0, reqWidth, reqHeight)

      //  val bitmap = BitmapFactory.decodeResource(holder.imageView.context.resources, list?.get(position)?.image?:0)
        holder.imageView.setImageBitmap(bitmap)

       //println("sffds-----"+list?.get(position)?.subList?.size.toString())

        holder.itemLayout.setOnClickListener {

            if (list?.get(position)?.description.isNullOrEmpty()) {

                val intent = Intent(context, StateTourismListActivity::class.java)
                intent.putExtra("title", list?.get(position)?.title)
                context.startActivity(intent)
            }
            else{

            }

        }

    }

    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivImage)
        val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        val tvDesc: TextView = itemView.findViewById(R.id.tvDescription)
        val itemLayout: LinearLayout = itemView.findViewById(R.id.itemLayout)



    }
}