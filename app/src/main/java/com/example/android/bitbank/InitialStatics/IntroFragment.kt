package com.example.android.bitbank.InitialStatics


import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

import com.example.android.bitbank.R
import java.io.IOException


class IntroFragment : Fragment() {

    private val title: String? = null
    private val description: String? = null
    private var image_path: String? = null
    private val color_code: String? = null

    private val mParentLayout: LinearLayout? = null
    //private TextView mTitle, mDescription;
    private var mImageView: ImageView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_intro, container, false)
        val bundle = arguments

        //title = bundle.getString("title");
        //description = bundle.getString("description");
        image_path = bundle!!.getString("image")
        //color_code = bundle.getString("color");

        //mParentLayout = view.findViewById(R.id.parentLayout);
        //mParentLayout.setBackgroundColor(Color.parseColor(color_code));
        mImageView = view.findViewById(R.id.image)
        try {
            val inputStream = context!!.assets.open(image_path)
            mImageView!!.setImageBitmap(BitmapFactory.decodeStream(inputStream))
        } catch (e: IOException) {
            e.printStackTrace()
        }

        /*mTitle = view.findViewById(R.id.title);
        mDescription = view.findViewById(R.id.description);

        mTitle.setText(title);
        mDescription.setText(description);*/

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
