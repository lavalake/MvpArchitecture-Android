package com.qingmei2.module.testframework.tools

import java.io.File

/**
 * Created by QingMei on 2017/11/6.
 * desc:
 */
object MockAssetReader {

    private val BASE_PATH = "module_core/src/test/java/com/qingmei2/module/testframework/tools/data"
    val USER_DATA = BASE_PATH + "/userJson_test"
    val error = BASE_PATH + "/error"

    fun readFile(path: String): String = file2String(File(path))

    fun file2String(f: File, charset: String = "UTF-8"): String = f.readText(Charsets.UTF_8)

}