package com.yeungkc.gank.io.view

import com.yeungkc.gank.io.view.IView

/**
 * Created by YeungKC on 16/2/24.
 *
 * @项目名: kc
 * @包名: gank.io.kc.view
 * @作者: YeungKC
 *
 * @描述：TODO
 */
interface IMainView : IView {
     fun onRequestError( str:String, isHaveCache:Boolean)
}
