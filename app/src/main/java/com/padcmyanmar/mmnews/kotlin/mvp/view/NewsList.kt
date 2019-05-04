package com.padcmyanmar.mmnews.kotlin.mvp.view

import com.padcmyanmar.mmnews.kotlin.data.vos.NewsVO

interface NewsList {

    fun showNewsList(list : MutableList<NewsVO>)

}