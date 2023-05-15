package com.example.recipebox

import androidx.fragment.app.Fragment

class BurgerActivity : SingleFragmentActivity() {
    override fun createFragment(): Fragment {
        return BurgerFragment.newInstance()
    }
}
