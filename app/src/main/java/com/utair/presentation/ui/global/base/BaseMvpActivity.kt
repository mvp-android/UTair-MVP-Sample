package com.utair.presentation.ui.global.base

import android.content.Context
import com.utair.presentation.ui.global.base.MvpAppCompatActivity
import io.github.inflationx.viewpump.ViewPumpContextWrapper

open class BaseMvpActivity : MvpAppCompatActivity() {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

}