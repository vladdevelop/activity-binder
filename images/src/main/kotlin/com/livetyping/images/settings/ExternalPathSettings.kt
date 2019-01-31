package com.livetyping.images.settings

import android.content.Context
import android.os.Environment
import java.io.File

/**
 * crete file in storage/emulated/0/files/attrPath
 */
internal class ExternalPathSettings(override val attrName: String,
                                    override val attrPath: String?,
                                    override val fileName: String = "external_path_file")
    : TakePhotoSettings() {

    override fun getRootPath(context: Context) = Environment.getExternalStorageDirectory().path
}
