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

package ratatouillerestapp.upc.edu.pe.di.component;

import dagger.Component;
import ratatouillerestapp.upc.edu.pe.di.PerActivity;
import ratatouillerestapp.upc.edu.pe.di.module.ActivityModule;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutFragment;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerFragment;
import ratatouillerestapp.upc.edu.pe.ui.feed.FeedActivity;
import ratatouillerestapp.upc.edu.pe.ui.feed.blogs.BlogFragment;
import ratatouillerestapp.upc.edu.pe.ui.feed.opensource.OpenSourceFragment;
import ratatouillerestapp.upc.edu.pe.ui.login.LoginActivity;
import ratatouillerestapp.upc.edu.pe.ui.main.MainActivity;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RateUsDialog;
import ratatouillerestapp.upc.edu.pe.ui.product.ProductFragment;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationActivity;
import ratatouillerestapp.upc.edu.pe.ui.reservation.ReservationFragment;
import ratatouillerestapp.upc.edu.pe.ui.splash.SplashActivity;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(ReservationActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

    void inject(CustomerFragment fragment);

    void inject(ProductFragment fragment);

    void inject(ReservationFragment fragment);

}
