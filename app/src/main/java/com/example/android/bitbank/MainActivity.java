package com.example.android.bitbank;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import static com.example.android.bitbank.GlobalAccess.COMPLETED_ONBOARDING_PREF_NAME;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences =
                PreferenceManager.getDefaultSharedPreferences(this);
        // Check if we need to display our OnboardingFragment
        if (!sharedPreferences.getBoolean(COMPLETED_ONBOARDING_PREF_NAME, false)) {
            // The user hasn't seen the OnboardingFragment yet, so show it
            startActivity(new Intent(this, BoardingActivity.class));
        }
    }
}
