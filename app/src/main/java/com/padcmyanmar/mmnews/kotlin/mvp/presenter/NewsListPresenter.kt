package com.padcmyanmar.mmnews.kotlin.mvp.presenter

import android.util.Log
import com.padcmyanmar.mmnews.kotlin.data.models.NewsAppModel
import com.padcmyanmar.mmnews.kotlin.data.vos.NewsVO
import com.padcmyanmar.mmnews.kotlin.events.DataEvent
import com.padcmyanmar.mmnews.kotlin.mvp.view.NewsList
import kotlinx.android.synthetic.main.activity_home.*
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class NewsListPresenter(var newsList: NewsList): BasePresenter() {




    fun loadNewsList () {
        Log.d("News load  model ","work")
        NewsAppModel.getInstance().loadNews()
    }


    override fun onStart() {

    }

    override fun onStop() {

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
       fun onNewsLoadedEvent(newsLoadedEvent: DataEvent.NewsLoadedEvent) {
        Log.d("News load event ","work")
        newsList.showNewsList(newsLoadedEvent.loadedNews as MutableList<NewsVO>)
       }

}