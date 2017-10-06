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

package ratatouillerestapp.upc.edu.pe.ui.main;


import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.ui.base.MvpPresenter;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
public interface MainMvpPresenter<V extends MainMvpView, I extends MainMvpInteractor>
        extends MvpPresenter<V, I> {

    void onDrawerOptionCustomerClick();

    void onDrawerOptionProductClick();

    void onDrawerOptionReservationClick();

    void onDrawerOptionAboutClick();

    void onDrawerOptionLogoutClick();

    void onDrawerRateUsClick();

    void onDrawerMyFeedClick();

    void onViewInitialized();

    void onCardExhausted();

    void onNavMenuCreated();
}
