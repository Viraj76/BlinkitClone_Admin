package com.example.adminblinkitclone.fragments

import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.adminblinkitclone.Constants

import com.example.adminblinkitclone.R
import com.example.adminblinkitclone.databinding.FragmentAddProductBinding

class AddProductFragment : Fragment() {

    private lateinit var binding : FragmentAddProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddProductBinding.inflate(layoutInflater)
        setStatusBarColor()

        setAutoCompleteTextViews()

        onImageSelectClicked()
        return binding.root
    }

    private fun onImageSelectClicked() {
        binding.btnSelectImage.setOnClickListener {

        }
    }

    private fun setAutoCompleteTextViews() {
        val units = ArrayAdapter(requireContext() , R.layout.show_list, Constants.allUnitsOfProducts)
        val category = ArrayAdapter(requireContext() , R.layout.show_list, Constants.allProductsCategory)
        val productType = ArrayAdapter(requireContext() , R.layout.show_list, Constants.allProductType)

        binding.apply {
            etProductUnit.setAdapter(units)
            etProductCategory.setAdapter(category)
            etProductType.setAdapter(productType)
        }
    }


    private fun setStatusBarColor() {
        activity?.window?.apply {
            val statusBarColors = ContextCompat.getColor(requireContext(), R.color.yellow)
            statusBarColor = statusBarColors
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }
        }
    }
}