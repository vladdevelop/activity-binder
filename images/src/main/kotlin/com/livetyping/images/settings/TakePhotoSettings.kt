package com.livetyping.images.settings

import android.content.Context
import java.io.File


abstract class TakePhotoSettings {

    abstract val providerAuthority: String

    abstract val tagPath: String

    abstract val attrName: String

    abstract val attrPath: String

    abstract val fileName: String

   internal abstract fun getFilePath(context: Context):File
}
