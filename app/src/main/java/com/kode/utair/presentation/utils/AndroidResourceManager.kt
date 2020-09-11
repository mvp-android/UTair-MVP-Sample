package com.kode.utair.presentation.utils

import android.content.Context
import com.kode.utair.domain.commons.ResourceManager
import javax.inject.Inject

class AndroidResourceManager @Inject constructor(
        private val context: Context
) : ResourceManager {

    override fun getString(resourceId: Int): String {
        return context.resources.getString(resourceId)
    }

    override fun getInteger(resourceId: Int): Int {
        return context.resources.getInteger(resourceId)
    }

}