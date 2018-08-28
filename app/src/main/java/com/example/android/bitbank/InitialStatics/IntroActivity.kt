package com.example.android.bitbank.InitialStatics

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import com.example.android.bitbank.GlobalAccess.COMPLETED_ONBOARDING_PREF_NAME
import com.example.android.bitbank.MainActivity
import com.example.android.bitbank.R

class IntroActivity : AppCompatActivity() {

    private var mViewPager: ViewPager? = null
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null
    private var mSkip: Button? = null
    private var mDot1: ImageView? = null
    private var mDot2: ImageView? = null
    private var mDot3: ImageView? = null
    private var mDot4: ImageView? = null
    private var mDot5: ImageView? = null
    private var mDot6: ImageView? = null
    private var mDot7: ImageView? = null
    private var mDot8: ImageView? = null
    private var mDot9: ImageView? = null
    private var mDot10: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_intro)

        mSectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        mViewPager = findViewById(R.id.intro_pager)
        mViewPager!!.adapter = mSectionsPagerAdapter
        mViewPager!!.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {

                when (position) {

                    0 -> {
                        mSkip!!.text = "SKIP"
                        mDot1!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    1 -> {
                        mSkip!!.text = "SKIP"
                        mDot2!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    2 -> {
                        mSkip!!.text = "SKIP"
                        mDot3!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    3 -> {
                        mSkip!!.text = "SKIP"
                        mDot4!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    4 -> {
                        mSkip!!.text = "SKIP"
                        mDot5!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    5 -> {
                        mSkip!!.text = "SKIP"
                        mDot6!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    6 -> {
                        mSkip!!.text = "SKIP"
                        mDot7!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    7 -> {
                        mSkip!!.text = "SKIP"
                        mDot8!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    8 -> {
                        mSkip!!.text = "SKIP"
                        mDot9!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot10!!.setImageResource(R.drawable.intro_dot_default)
                    }
                    9 -> {
                        mSkip!!.text = "DONE"
                        mDot10!!.setImageResource(R.drawable.intro_dot_selected)
                        mDot1!!.setImageResource(R.drawable.intro_dot_default)
                        mDot3!!.setImageResource(R.drawable.intro_dot_default)
                        mDot4!!.setImageResource(R.drawable.intro_dot_default)
                        mDot2!!.setImageResource(R.drawable.intro_dot_default)
                        mDot6!!.setImageResource(R.drawable.intro_dot_default)
                        mDot5!!.setImageResource(R.drawable.intro_dot_default)
                        mDot7!!.setImageResource(R.drawable.intro_dot_default)
                        mDot8!!.setImageResource(R.drawable.intro_dot_default)
                        mDot9!!.setImageResource(R.drawable.intro_dot_default)
                    }
                }

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })

        mSkip = findViewById(R.id.skip)
        mSkip!!.setOnClickListener {
            val sharedPreferencesEditor = PreferenceManager.getDefaultSharedPreferences(this@IntroActivity).edit()
            sharedPreferencesEditor.putBoolean(
                    COMPLETED_ONBOARDING_PREF_NAME, true)
            sharedPreferencesEditor.apply()

            finish()
            startActivity(Intent(this@IntroActivity, MainActivity::class.java))
        }
        mDot1 = findViewById(R.id.dot1)
        mDot2 = findViewById(R.id.dot2)
        mDot3 = findViewById(R.id.dot3)
        mDot4 = findViewById(R.id.dot4)
        mDot5 = findViewById(R.id.dot5)
        mDot6 = findViewById(R.id.dot6)
        mDot7 = findViewById(R.id.dot7)
        mDot8 = findViewById(R.id.dot8)
        mDot9 = findViewById(R.id.dot9)
        mDot10 = findViewById(R.id.dot10)


    }

    override fun onBackPressed() {
        if (mViewPager!!.currentItem == 0) {
            super.onBackPressed()
        } else {
            mViewPager!!.currentItem = mViewPager!!.currentItem - 1
        }
    }

    private inner class SectionsPagerAdapter(private val mContext: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment {
            val fragment = IntroFragment()
            val bundle = Bundle()

            when (position) {

                0 -> bundle.putString("image", "intro/bugbusters.jpg")
                1 -> bundle.putString("image", "intro/bugbusters.jpg")
                2 -> bundle.putString("image", "intro/bugbusters.jpg")
                3 -> bundle.putString("image", "intro/bugbusters.jpg")
                4 -> bundle.putString("image", "intro/bugbusters.jpg")
                5 -> bundle.putString("image", "intro/bugbusters.jpg")
                6 -> bundle.putString("image", "intro/bugbusters.jpg")
                7 -> bundle.putString("image", "intro/bugbusters.jpg")
                8 -> bundle.putString("image", "intro/bugbusters.jpg")
                9 -> bundle.putString("image", "intro/bugbusters.jpg")
            }
            fragment.arguments = bundle

            return fragment
        }

        override fun getCount(): Int {
            return 10
        }
    }

}
