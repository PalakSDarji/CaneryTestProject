package com.palak.canerytestproject.ui.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.palak.canerytestproject.R
import com.palak.canerytestproject.databinding.FragmentProfileBinding
import com.palak.canerytestproject.model.Address
import com.palak.canerytestproject.model.User
import com.palak.canerytestproject.ui.SecondActivity

class ProfileFragment : Fragment() {

    private var _binding : FragmentProfileBinding? = null
    private lateinit var viewModel : ProfileViewModel

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        _binding = FragmentProfileBinding.inflate(inflater,container,false)

        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)

        viewModel.profileName.observe(viewLifecycleOwner){
            binding.tvProfileName.text = it
        }

        binding.btnMore.setOnClickListener {
            val intent : Intent = Intent(activity, SecondActivity::class.java)
            val user = User("Palak", Address(1))
            intent.putExtra("User",user)
            startActivity(intent)
        }

        return binding.root
    }
}