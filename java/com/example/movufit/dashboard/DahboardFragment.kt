package com.example.movufit.dashboard

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.movufit.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // grab the TextView by its ID and (optionally) change it
        val welcome = view.findViewById<TextView>(R.id.welcomeText)
        welcome.text = "Welcome to MovuFit!"  // you can customize it here
    }
}
