package com.mobile.miftakhulilmanrifqi082.projectenamtugas

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mobile.miftakhulilmanrifqi082.projectenamtugas.databinding.ContactListItemBinding

class ContactAdapter(val phoneItemList: List<PhoneData>, val clickListener: (PhoneData) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var binding: ContactListItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ContactListItemBinding.inflate(inflater)
        return PartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as PartViewHolder).bind(phoneItemList[position], clickListener)
    }

    override fun getItemCount() = phoneItemList.size

    class PartViewHolder(val dataViewHolder: ContactListItemBinding) : RecyclerView.ViewHolder(dataViewHolder.root) {
        fun bind(phone: PhoneData, clickListener: (PhoneData) -> Unit) {
            dataViewHolder.tvPartItemName.text = phone.contactName
            dataViewHolder.tvPartId.text = phone.phone.toString()
            itemView.setOnClickListener { clickListener(phone) }
        }
    }
}
