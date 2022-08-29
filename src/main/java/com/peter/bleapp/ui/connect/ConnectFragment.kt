package com.peter.bleapp.ui.connect

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.peter.bleapp.LocationPermissionFragment
import com.peter.bleapp.databinding.FragmentConnectBinding

class ConnectFragment : Fragment() {

    private var _binding: FragmentConnectBinding? = null
    private fun hasLocationPermission(): Boolean {
        return ContextCompat.checkSelfPermission(
            requireContext(),
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    }
    private fun requestLocationPermission() {
        val locationAlert = LocationPermissionFragment()
        locationAlert.show(requireFragmentManager(), "locationAlertDialog")
    }
    private fun startBleScan() {
        if(!hasLocationPermission()) {
            requestLocationPermission()
        } else {
            //TODO implement stuff
        }
    }

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(ConnectViewModel::class.java)

        _binding = FragmentConnectBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.buttonScan.setOnClickListener { startBleScan()  }
        binding.buttonConnect.setOnClickListener {
            binding.buttonConnect.text = "Connect2"
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}