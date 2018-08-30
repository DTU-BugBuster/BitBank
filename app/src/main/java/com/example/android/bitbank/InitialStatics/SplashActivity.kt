package com.example.android.bitbank.InitialStatics

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.preference.PreferenceManager
import android.support.v4.app.ActivityCompat
import android.widget.Toast
import com.example.android.bitbank.GlobalAccess
import com.example.android.bitbank.MainActivity
import com.example.android.bitbank.R


class SplashActivity : AppCompatActivity() {
    var permissionsStrings = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.MODIFY_AUDIO_SETTINGS,
            Manifest.permission.READ_PHONE_STATE,
            Manifest.permission.PROCESS_OUTGOING_CALLS,
            Manifest.permission.RECORD_AUDIO)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        if (!hasPermissions(context = this@SplashActivity)) {
            //we have to ask for permissions
            ActivityCompat.requestPermissions(this@SplashActivity, permissionsStrings, 131)

        } else {
            forDelay()
        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            131 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED
                        && grantResults[1] == PackageManager.PERMISSION_GRANTED
                        && grantResults[2] == PackageManager.PERMISSION_GRANTED
                        && grantResults[3] == PackageManager.PERMISSION_GRANTED
                        && grantResults[4] == PackageManager.PERMISSION_GRANTED) {
                    forDelay()
                } else {
                    Toast.makeText(this@SplashActivity, "Please grant all the permissions to continue", Toast.LENGTH_SHORT).show()
                    this.finish()
                }
                return
            }
            else -> {
                Toast.makeText(this@SplashActivity, "Something went wrong", Toast.LENGTH_SHORT).show()
                this.finish()
                return
            }
        }

    }

    fun hasPermissions(context: Context, vararg permissions: String): Boolean {
        var hasAllPermissions = true
        for (permission in permissions) {
            val res = context.checkCallingOrSelfPermission(permission)
            if (res != PackageManager.PERMISSION_GRANTED) {
                hasAllPermissions = false
            }
        }
        return hasAllPermissions
    }

    fun forDelay() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        Handler().postDelayed({
            // Check if we need to display our OnboardingFragment
            if (!sharedPreferences.getBoolean(GlobalAccess.COMPLETED_ONBOARDING_PREF_NAME, false)) {
                // The user hasn't seen the OnboardingFragment yet, so show it
                startActivity(Intent(this, IntroActivity::class.java))
            }else{
                startActivity(Intent(this, MainActivity::class.java))
            }
            this.finish()
        }, 1000) // temporarily decreasing the delay time for working...

    }
}

