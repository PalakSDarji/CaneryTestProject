package com.palak.canerytestproject.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.palak.canerytestproject.databinding.FragmentMoreProfileBinding
import com.palak.canerytestproject.model.User

class MoreProfileFragment : Fragment(){

    private var _binding : FragmentMoreProfileBinding? = null
    private val binding get() = _binding!!

    private lateinit var moreProfileViewModel : MoreProfileViewModel

    private lateinit var user : User

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        moreProfileViewModel = ViewModelProvider(this).get(MoreProfileViewModel::class.java)
        _binding = FragmentMoreProfileBinding.inflate(inflater,container,false)


        return binding.root
    }
}