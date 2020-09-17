package com.qw.photo.dispose.disposer

import com.qw.photo.pojo.DisposeResult
import java.io.File

/**
 * 图片处理接口
 * @author: george
 * @date: 2020-01-05
 */
interface ImageDisposer {

    /**
     * how to dispose your file, it will work on backGround thread
     * 处理图片 此方法本身会在额外的线程池处理
     * @param originPath 原图路径
     * @param targetSaveFile 指定要存如的路径
     */
    fun disposeImage(originPath: String, targetSaveFile: File?): DisposeResult

}