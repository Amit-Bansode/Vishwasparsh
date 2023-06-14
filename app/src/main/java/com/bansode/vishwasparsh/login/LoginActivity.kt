package com.bansode.vishwasparsh.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.bansode.vishwasparsh.R
import com.bansode.vishwasparsh.dashboard.AdminDashboardActivity
import com.bansode.vishwasparsh.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this@LoginActivity, R.layout.activity_login)
        binding.btLogin.setOnClickListener { launchAdminDashboard() }
    }

    fun launchAdminDashboard() {
        startActivity(Intent(this, AdminDashboardActivity::class.java))
    }
}