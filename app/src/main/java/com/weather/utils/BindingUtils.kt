package com.weather.utils

import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.weather.R

object BindingUtils {

    @JvmStatic
    @BindingAdapter(value = ["imageUrl", "placeHolder"], requireAll = false)
    fun setImageUrl(
        imageView: ImageView,
        imageUrl: String,
        placeHolder: Int = R.drawable.ic_launcher_background
    ) {
        if (!TextUtils.isEmpty(imageUrl)) {
            /*val requestOptions = RequestOptions().placeholder(placeHolder).error(placeHolder)
            Glide.with(imageView.context)
                .load(imageUrl)
                .apply(requestOptions)
                .into(imageView)*/
        }
    }
/*
    @JvmStatic
    @BindingAdapter("setArticleAdapter")
    fun setArticleAdapter(recyclerView: RecyclerView, articles: List<Article> ?) {
        if (recyclerView.adapter != null && articles !=null) {
            val adapter = recyclerView.adapter as ArticleAdapter
            adapter.articleList = articles
        }
    }*/
}