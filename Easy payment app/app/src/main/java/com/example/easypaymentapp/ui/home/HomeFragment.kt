package com.example.easypaymentapp.ui.home

import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ImageSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
    lateinit var allButton: TextView
    lateinit var activityButton: TextView
    lateinit var desktopButton: TextView
    lateinit var mobileButton: TextView
    lateinit var tabletButton: TextView
    lateinit var paypalLogo: TextView
    lateinit var starButton: TextView
    lateinit var lightShareButton: TextView

    lateinit var test: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        eyeButton = root.findViewById(R.id.eyeButton)
        shareButton = root.findViewById(R.id.shareButton)
        allButton = root.findViewById(R.id.allButton)
        activityButton = root.findViewById(R.id.activityButton)
        desktopButton = root.findViewById(R.id.desktopButton)
        mobileButton = root.findViewById(R.id.mobileButton)
        tabletButton = root.findViewById(R.id.tabletButton)
        paypalLogo = root.findViewById(R.id.paypalLogo)
        starButton = root.findViewById(R.id.starButton)
        lightShareButton = root.findViewById(R.id.lightShareButton)
        test = root.findViewById(R.id.test)

        ajoutImage()

        // Crée un dégradé de couleurs en utilisant les couleurs nommées
        val gradientDrawable = GradientDrawable(
            GradientDrawable.Orientation.TOP_BOTTOM, // Orientation du haut vers le bas
            intArrayOf(
                ContextCompat.getColor(requireContext(), R.color.startDegradeGreen), // Utilise les couleurs nommées
                ContextCompat.getColor(requireContext(), R.color.endDegradeYellow)
            )
        )

// Applique le dégradé à l'arrière-plan du TextView
        gradientDrawable.cornerRadius = 20f
        allButton.background = gradientDrawable

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

        val drawableAll = ContextCompat.getDrawable(requireContext(), R.drawable.ic_pie_black_24dp)
        drawableAll?.setBounds(0, 0, drawableAll.intrinsicWidth, drawableAll.intrinsicHeight)
        val imageSpanStartAll = ImageSpan(drawableAll!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartAll, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        allButton.text = spannableString

        val drawableActivity = ContextCompat.getDrawable(requireContext(), R.drawable.ic_chart_line_black_24dp)
        drawableActivity?.setBounds(0, 0, drawableActivity.intrinsicWidth, drawableActivity.intrinsicHeight)
        val imageSpanStartActivity = ImageSpan(drawableActivity!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartActivity, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        activityButton.text = spannableString

        val drawableDesktop = ContextCompat.getDrawable(requireContext(), R.drawable.ic_monitor_black_24dp)
        drawableDesktop?.setBounds(0, 0, drawableDesktop.intrinsicWidth, drawableDesktop.intrinsicHeight)
        val imageSpanStartDesktop = ImageSpan(drawableDesktop!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartDesktop, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        desktopButton.text = spannableString

        val drawableMobile = ContextCompat.getDrawable(requireContext(), R.drawable.ic_phone_check_menu_black_24dp)
        drawableMobile?.setBounds(0, 0, drawableMobile.intrinsicWidth, drawableMobile.intrinsicHeight)
        val imageSpanStartMobile = ImageSpan(drawableMobile!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartMobile, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mobileButton.text = spannableString

        val drawableTablet = ContextCompat.getDrawable(requireContext(), R.drawable.ic_tablet_black_24dp)
        drawableTablet?.setBounds(0, 0, drawableTablet.intrinsicWidth, drawableTablet.intrinsicHeight)
        val imageSpanStartTablet = ImageSpan(drawableTablet!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartTablet, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        tabletButton.text = spannableString

        val drawablePaypal = ContextCompat.getDrawable(requireContext(), R.drawable.ic_paypal_black_24dp)
        drawablePaypal?.setBounds(0, 0, drawablePaypal.intrinsicWidth, drawablePaypal.intrinsicHeight)
        val imageSpanStartPaypal = ImageSpan(drawablePaypal!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartPaypal, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        paypalLogo.text = spannableString

        val drawableStar = ContextCompat.getDrawable(requireContext(), R.drawable.ic_star_menu_black_24dp)
        drawableStar?.setBounds(0, 0, drawableStar.intrinsicWidth, drawableStar.intrinsicHeight)
        val imageSpanStartStar = ImageSpan(drawableStar!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartStar, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        starButton.text = spannableString

        val drawableLightShare = ContextCompat.getDrawable(requireContext(), R.drawable.ic_light_share_black_24dp)
        drawableLightShare?.setBounds(0, 0, drawableLightShare.intrinsicWidth, drawableLightShare.intrinsicHeight)
        val imageSpanStartLightShare = ImageSpan(drawableLightShare!!, ImageSpan.ALIGN_BOTTOM)
        spannableString.setSpan(imageSpanStartLightShare, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        lightShareButton.text = spannableString
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}