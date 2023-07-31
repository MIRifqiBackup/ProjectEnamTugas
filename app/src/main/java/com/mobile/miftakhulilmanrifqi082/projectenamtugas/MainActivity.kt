package com.mobile.miftakhulilmanrifqi082.projectenamtugas

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.mobile.miftakhulilmanrifqi082.projectenamtugas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val testData = createPhoneData()
        binding.rvParts.layoutManager = LinearLayoutManager(this)
        binding.rvParts.setHasFixedSize(true)
        binding.rvParts.adapter = ContactAdapter(testData, { phoneItem: PhoneData -> phoneItemClicked(phoneItem) })
    }
    private fun phoneItemClicked(phoneItem: PhoneData) {
        val showDetailActivityIntent = Intent(this, PhoneDetailActivity::class.java)
        // showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.contactName + " " + phoneItem.phone.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.contactName)
        showDetailActivityIntent.putExtra("phone", phoneItem.phone.toString())
        showDetailActivityIntent.putExtra("address", phoneItem.address)
        showDetailActivityIntent.putExtra("email", phoneItem.email)
        showDetailActivityIntent.putExtra("label", phoneItem.label)
        showDetailActivityIntent.putExtra("apps", phoneItem.apps)
        startActivity(showDetailActivityIntent)
    }
    private fun createPhoneData(): List<PhoneData> {
        val partList = ArrayList<PhoneData>()
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        partList.add(PhoneData("Miftakhul Ilman Rifqi", 6282251204797, "Ngemplak", "Bozzclax@gmail.com", "Teman", "WhatsApp,Facebook"))
        partList.add(PhoneData("Rizal😎", 6282251204790, "Klaten", "rizal.2002@gmail.com", "Teman", "WhatsApp"))
        partList.add(PhoneData("Delis Rahmawati", 6282251204791, "Air Upas", "delis.rahma46@gmail.com", "Pacar", "WhatsApp,Instagram"))
        return partList
    }
}
