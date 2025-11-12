package com.example.brees.ui.frags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.brees.adapter.UserInfoAdapter
import com.example.brees.data.UserInfoModel
import com.example.brees.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater)
        val view = binding.root


        // Create a list of user info
        val infos = ArrayList<UserInfoModel>()
        infos.add(UserInfoModel("Boudia Feriel", "610000.00 DA"))
        infos.add(UserInfoModel("Boudia Rayane", "606000.00 DA"))

        // Set up the RecyclerView
        val adapter = UserInfoAdapter(infos, requireContext())
        binding.userInfo.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.userInfo.adapter = adapter


        return view
    }


}