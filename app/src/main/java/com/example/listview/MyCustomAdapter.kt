package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyCustomAdapter(var ctx: Context, var ourResource: Int,
                      var items: ArrayList<Model>):ArrayAdapter<Model>(ctx, ourResource, items) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflator = LayoutInflater.from(ctx)
        val view =layoutInflator.inflate(ourResource, null)

        // goto layout and get the links to our items
        val name = view.findViewById<TextView>(R.id.name)
        val extra = view.findViewById<TextView>(R.id.extraText)
        val img = view.findViewById<ImageView>(R.id.img1)

        name.text = items[position].Name
        extra.text = items[position].extraText
        img.setImageDrawable(ctx.resources.getDrawable(items[position].img))


        return view
    }


}