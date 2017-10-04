/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package ratatouillerestapp.upc.edu.pe.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import ratatouillerestapp.upc.edu.pe.data.network.model.BlogResponse;
import ratatouillerestapp.upc.edu.pe.data.network.model.OpenSourceResponse;
import ratatouillerestapp.upc.edu.pe.di.ActivityContext;
import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpView;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPagerAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceAdapter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceMvpView;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourcePresenter;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginMvpView;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.MainInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.MainMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.MainPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogPresenter;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashMvpView;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashPresenter;
import ratatouillerestapp.upc.edu.pe.utils.rx.AppSchedulerProvider;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView, SplashMvpInteractor> provideSplashPresenter(
            SplashPresenter<SplashMvpView, SplashMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView, AboutMvpInteractor> provideAboutPresenter(
            AboutPresenter<AboutMvpView, AboutMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView, LoginMvpInteractor> provideLoginPresenter(
            LoginPresenter<LoginMvpView, LoginMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView, MainMvpInteractor> provideMainPresenter(
            MainPresenter<MainMvpView, MainMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView,
            RatingDialogMvpInteractor> provideRateUsPresenter(

            RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView, FeedMvpInteractor> provideFeedPresenter(
            FeedPresenter<FeedMvpView, FeedMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView,
            OpenSourceMvpInteractor> provideOpenSourcePresenter(

            OpenSourcePresenter<OpenSourceMvpView, OpenSourceMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView, BlogMvpInteractor> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView, BlogMvpInteractor> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    @PerActivity
    SplashMvpInteractor provideSplashMvpInteractor(SplashInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    AboutMvpInteractor provideAboutMvpInteractor(AboutInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    LoginMvpInteractor provideLoginMvpInteractor(LoginInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    MainMvpInteractor provideMainMvpInteractor(MainInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    RatingDialogMvpInteractor provideRatingDialogMvpInteractor(
            RatingDialogInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    FeedMvpInteractor provideFeedMvpInteractor(FeedInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    OpenSourceMvpInteractor provideOpenSourceMvpInteractor(
            OpenSourceInteractor interactor) {
        return interactor;
    }

    @Provides
    @PerActivity
    BlogMvpInteractor provideBlogMvpInteractor(BlogInteractor interactor) {
        return interactor;
    }
}
