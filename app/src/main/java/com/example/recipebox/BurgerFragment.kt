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
import android.view.animation.AlphaAnimation
import androidx.core.content.ContextCompat

class BurgerFragment : Fragment() {
    private lateinit var mSceneView: View

    private lateinit var mBreadBottomView: View
    private lateinit var mPlateView: View
    private lateinit var mMeatView: View
    private lateinit var mCheeseView: View
    private lateinit var mPickle1View: View
    private lateinit var mPickle2View: View
    private lateinit var mPickle3View: View
    private lateinit var mBreadTopView: View
    private lateinit var mSesame1View: View
    private lateinit var mSesame2View: View
    private lateinit var mSesame3View: View
    private lateinit var mSesame4View: View
    private lateinit var mSesame5View: View
    private lateinit var mSesame6View: View
    private lateinit var mSesame7View: View

    companion object {
        fun newInstance(): BurgerFragment {
            return BurgerFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_burger, container, false)
        mSceneView = view
        mPlateView = view.findViewById(R.id.plate)
        mBreadBottomView = view.findViewById(R.id.bread_bottom)
        mMeatView = view.findViewById(R.id.meat)
        mCheeseView = view.findViewById(R.id.cheese)
        mPickle1View = view.findViewById(R.id.pickle1)
        mPickle2View = view.findViewById(R.id.pickle2)
        mPickle3View = view.findViewById(R.id.pickle3)
        mBreadTopView = view.findViewById(R.id.bread_top)
        mSesame1View = view.findViewById(R.id.sesame1)
        mSesame2View = view.findViewById(R.id.sesame2)
        mSesame3View = view.findViewById(R.id.sesame3)
        mSesame4View = view.findViewById(R.id.sesame4)
        mSesame5View = view.findViewById(R.id.sesame5)
        mSesame6View = view.findViewById(R.id.sesame6)
        mSesame7View = view.findViewById(R.id.sesame7)


//        val resources = requireContext().resources
//        mBlueSkyColor = ContextCompat.getColor(requireContext(), R.color.blue_sky)
//        mSunsetSkyColor = ContextCompat.getColor(requireContext(), R.color.sunset_sky)
//        mNightSkyColor = ContextCompat.getColor(requireContext(), R.color.night_sky)

        mSceneView.setOnClickListener {
            startAnimation()
        }

        return view
    }

    private fun startAnimation() {
        val heightDuration: Long = 1000
        val alphaDuration: Long = 500

        // Bread bottom
        val breadBottomYStart = mBreadBottomView.top.toFloat()
        val breadBottomYEnd = mPlateView.top.toFloat()
        val heightAnimatorBreadBottom = ObjectAnimator.ofFloat(mBreadBottomView, "y", breadBottomYStart, breadBottomYEnd + 20)
            .setDuration(heightDuration)
        heightAnimatorBreadBottom.interpolator = AccelerateInterpolator()
        val alphaAnimatorBreadBottom = ObjectAnimator.ofFloat(mBreadBottomView, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        // Meat
        val heightAnimatorMeat = ObjectAnimator.ofFloat(mMeatView, "y", breadBottomYStart, breadBottomYEnd + 50)
            .setDuration(heightDuration)
        heightAnimatorMeat.interpolator = AccelerateInterpolator()
        val alphaAnimatorMeat = ObjectAnimator.ofFloat(mMeatView, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        // Cheese
        val heightAnimatorCheese = ObjectAnimator.ofFloat(mCheeseView, "y", breadBottomYStart, breadBottomYEnd + 70)
            .setDuration(heightDuration)
        heightAnimatorCheese.interpolator = AccelerateInterpolator()
        val alphaAnimatorCheese = ObjectAnimator.ofFloat(mCheeseView, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        // Pickles
        val pickle1YStart = mPickle1View.top.toFloat()
        val heightAnimatorPickle1 = ObjectAnimator.ofFloat(mPickle1View, "y", pickle1YStart, breadBottomYEnd + 200)
            .setDuration(heightDuration)
        heightAnimatorPickle1.interpolator = AccelerateInterpolator()
        val alphaAnimatorPickle1 = ObjectAnimator.ofFloat(mPickle1View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val pickle2YStart = mPickle2View.top.toFloat()
        val heightAnimatorPickle2 = ObjectAnimator.ofFloat(mPickle2View, "y", pickle2YStart, breadBottomYEnd + 325)
            .setDuration(heightDuration)
        heightAnimatorPickle2.interpolator = AccelerateInterpolator()
        val alphaAnimatorPickle2 = ObjectAnimator.ofFloat(mPickle2View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val pickle3YStart = mPickle3View.top.toFloat()
        val heightAnimatorPickle3 = ObjectAnimator.ofFloat(mPickle3View, "y", pickle3YStart, breadBottomYEnd + 230)
            .setDuration(heightDuration)
        heightAnimatorPickle3.interpolator = AccelerateInterpolator()
        val alphaAnimatorPickle3 = ObjectAnimator.ofFloat(mPickle3View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        // Bread top
        val BreadTopYStart = mBreadTopView.top.toFloat()
        val heightAnimatorBreadTop = ObjectAnimator.ofFloat(mBreadTopView, "y", BreadTopYStart, breadBottomYEnd - 150)
            .setDuration(heightDuration)
        heightAnimatorPickle1.interpolator = AccelerateInterpolator()
        val alphaAnimatorBreadTop = ObjectAnimator.ofFloat(mBreadTopView, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        // Sesame
        val sesame1YStart = mSesame1View.top.toFloat()
        val heightAnimatorSesame1 = ObjectAnimator.ofFloat(mSesame1View, "y", sesame1YStart, breadBottomYEnd)
            .setDuration(heightDuration)
        heightAnimatorSesame1.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame1 = ObjectAnimator.ofFloat(mSesame1View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame2YStart = mSesame2View.top.toFloat()
        val heightAnimatorSesame2 = ObjectAnimator.ofFloat(mSesame2View, "y", sesame2YStart, breadBottomYEnd + 60)
            .setDuration(heightDuration)
        heightAnimatorSesame2.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame2 = ObjectAnimator.ofFloat(mSesame2View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame3YStart = mSesame3View.top.toFloat()
        val heightAnimatorSesame3 = ObjectAnimator.ofFloat(mSesame3View, "y", sesame3YStart, breadBottomYEnd + 120)
            .setDuration(heightDuration)
        heightAnimatorSesame3.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame3 = ObjectAnimator.ofFloat(mSesame3View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame4YStart = mSesame3View.top.toFloat()
        val heightAnimatorSesame4 = ObjectAnimator.ofFloat(mSesame4View, "y", sesame4YStart, breadBottomYEnd + 180)
            .setDuration(heightDuration)
        heightAnimatorSesame4.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame4 = ObjectAnimator.ofFloat(mSesame4View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame5YStart = mSesame5View.top.toFloat()
        val heightAnimatorSesame5 = ObjectAnimator.ofFloat(mSesame5View, "y", sesame5YStart, breadBottomYEnd + 200)
            .setDuration(heightDuration)
        heightAnimatorSesame5.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame5 = ObjectAnimator.ofFloat(mSesame5View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame6YStart = mSesame6View.top.toFloat()
        val heightAnimatorSesame6 = ObjectAnimator.ofFloat(mSesame6View, "y", sesame6YStart, breadBottomYEnd + 40)
            .setDuration(heightDuration)
        heightAnimatorSesame6.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame6 = ObjectAnimator.ofFloat(mSesame6View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)

        val sesame7YStart = mSesame7View.top.toFloat()
        val heightAnimatorSesame7 = ObjectAnimator.ofFloat(mSesame7View, "y", sesame7YStart, breadBottomYEnd + 120)
            .setDuration(heightDuration)
        heightAnimatorSesame7.interpolator = AccelerateInterpolator()
        val alphaAnimatorSesame7 = ObjectAnimator.ofFloat(mSesame7View, "alpha", 0f, 1f)
            .setDuration(alphaDuration)







        val animatorSet = AnimatorSet()

        val group1 = AnimatorSet()
        group1.playTogether(heightAnimatorBreadBottom, alphaAnimatorBreadBottom)
        val group2 = AnimatorSet()
        group2.playTogether(heightAnimatorMeat, alphaAnimatorMeat)
        val group3 = AnimatorSet()
        group3.playTogether(heightAnimatorCheese, alphaAnimatorCheese)
        val group4 = AnimatorSet()
        group4.playTogether(heightAnimatorPickle1, alphaAnimatorPickle1,
            heightAnimatorPickle2, alphaAnimatorPickle2,
            heightAnimatorPickle3, alphaAnimatorPickle3)
        val group5 = AnimatorSet()
        group5.playTogether(heightAnimatorBreadTop, alphaAnimatorBreadTop,
            heightAnimatorSesame1, alphaAnimatorSesame1,
            heightAnimatorSesame2, alphaAnimatorSesame2,
            heightAnimatorSesame3, alphaAnimatorSesame3,
            heightAnimatorSesame4, alphaAnimatorSesame4,
            heightAnimatorSesame5, alphaAnimatorSesame5,
            heightAnimatorSesame6, alphaAnimatorSesame6,
            heightAnimatorSesame7, alphaAnimatorSesame7,)

        animatorSet.playSequentially(group1, group2, group3, group4, group5)

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
