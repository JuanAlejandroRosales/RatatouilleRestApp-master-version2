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

import android.app.Application;
import android.content.Context;

import ratatouillerestapp.upc.edu.pe.BuildConfig;
import ratatouillerestapp.upc.edu.pe.R;
import ratatouillerestapp.upc.edu.pe.data.db.DbOpenHelper;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoMaster;
import ratatouillerestapp.upc.edu.pe.data.db.model.DaoSession;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHeader;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.network.AppApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.AppPreferencesHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;
import ratatouillerestapp.upc.edu.pe.di.ApiInfo;
import ratatouillerestapp.upc.edu.pe.di.ApplicationContext;
import ratatouillerestapp.upc.edu.pe.di.DatabaseInfo;
import ratatouillerestapp.upc.edu.pe.di.PreferenceInfo;
import ratatouillerestapp.upc.edu.pe.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @ApiInfo
    String provideApiKey() {
        return BuildConfig.API_KEY;
    }

    @Provides
    @PreferenceInfo
    String providePreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }

    @Provides
    @Singleton
    ApiHelper provideApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    ApiHeader.ProtectedApiHeader provideProtectedApiHeader(
            @ApiInfo String apiKey,
            PreferencesHelper preferencesHelper) {
        return new ApiHeader.ProtectedApiHeader(
                apiKey,
                preferencesHelper.getCurrentUserId(),
                preferencesHelper.getAccessToken());
    }

    @Provides
    @Singleton
    CalligraphyConfig provideCalligraphyDefaultConfig() {
        return new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build();
    }

    @Provides
    @Singleton
    DaoSession provideDaoSession(DbOpenHelper dbOpenHelper) {
        return new DaoMaster(dbOpenHelper.getWritableDb()).newSession();
    }
}
