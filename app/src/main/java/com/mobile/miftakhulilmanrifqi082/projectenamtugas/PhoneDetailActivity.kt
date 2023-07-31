package com.mobile.miftakhulilmanrifqi082.projectenamtugas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mobile.miftakhulilmanrifqi082.projectenamtugas.databinding.ActivityPhoneDetailBinding

class PhoneDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPhoneDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPhoneDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            val partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            binding.tvItemId.text = partId
            val contactId = intentThatStartedThisActivity.getStringExtra("phone")
            binding.tvItemId2.text = contactId
            val addressId = intentThatStartedThisActivity.getStringExtra("address")
            binding.tvItemAddress.text = addressId
            val emailId = intentThatStartedThisActivity.getStringExtra("email")
            binding.tvItemEmail.text = emailId
            val labelId = intentThatStartedThisActivity.getStringExtra("label")
            binding.tvItemLabel.text = labelId
            val appsId = intentThatStartedThisActivity.getStringExtra("apps")
            binding.tvItemApps.text = appsId
        }
    }
}
