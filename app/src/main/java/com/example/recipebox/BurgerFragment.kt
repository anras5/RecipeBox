package com.example.recipebox

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.core.content.ContextCompat

class BurgerFragment : Fragment() {
    private lateinit var mSceneView: View
    private lateinit var mSunView: View
    private lateinit var mSkyView: View
    private var mBlueSkyColor: Int = 0
    private var mSunsetSkyColor: Int = 0
    private var mNightSkyColor: Int = 0

    companion object {
        fun newInstance(): BurgerFragment {
            return BurgerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_burger, container, false)
        mSceneView = view
        mSunView = view.findViewById(R.id.sun)
        mSkyView = view.findViewById(R.id.sky)

        val resources = requireContext().resources
        mBlueSkyColor = ContextCompat.getColor(requireContext(), R.color.blue_sky)
        mSunsetSkyColor = ContextCompat.getColor(requireContext(), R.color.sunset_sky)
        mNightSkyColor = ContextCompat.getColor(requireContext(), R.color.night_sky)

        mSceneView.setOnClickListener {
            startAnimation()
        }


        return view
    }

    private fun startAnimation() {
        val sunYStart = mSunView.top.toFloat()
        val sunYEnd = mSkyView.height.toFloat()

        val heightAnimator = ObjectAnimator.ofFloat(mSunView, "y", sunYStart, sunYEnd)
            .setDuration(3000)
        heightAnimator.interpolator = AccelerateInterpolator()

        val sunsetSkyAnimator = ObjectAnimator.ofArgb(mSkyView, "backgroundColor", mBlueSkyColor, mSunsetSkyColor)
            .setDuration(3000)
        sunsetSkyAnimator.setEvaluator(ArgbEvaluator())

        val nightSkyAnimator = ObjectAnimator.ofArgb(mSkyView, "backgroundColor", mSunsetSkyColor, mNightSkyColor)
            .setDuration(1500)
        nightSkyAnimator.setEvaluator(ArgbEvaluator())

        val animatorSet = AnimatorSet()
        animatorSet.play(heightAnimator)
            .with(sunsetSkyAnimator)
            .before(nightSkyAnimator)

        animatorSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
                activity?.finish()
            }
        })
        animatorSet.start()
    }

}
