package com.example.easypaymentapp.ui.home

import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ImageSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.easypaymentapp.R
import com.example.easypaymentapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    lateinit var eyeButton: TextView
    lateinit var shareButton: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        eyeButton = root.findViewById(R.id.eyeButton)
        shareButton = root.findViewById(R.id.shareButton)

        ajoutImage()

        return root
    }

    private fun ajoutImage() {
        val text = ""

        val spannableString = SpannableString(" $text ")

        val drawableEye = ContextCompat.getDrawable(requireContext(), R.drawable.ic_eye_black_24dp)
        drawableEye?.setBounds(0, 0, drawableEye.intrinsicWidth, drawableEye.intrinsicHeight)
        val imageSpanStartEye = ImageSpan(drawableEye!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartEye, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        eyeButton.text = spannableString

        val drawableShare = ContextCompat.getDrawable(requireContext(), R.drawable.ic_share_black_24dp)
        drawableShare?.setBounds(0, 0, drawableShare.intrinsicWidth, drawableShare.intrinsicHeight)
        val imageSpanStartShare = ImageSpan(drawableShare!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartShare, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        shareButton.text = spannableString
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}