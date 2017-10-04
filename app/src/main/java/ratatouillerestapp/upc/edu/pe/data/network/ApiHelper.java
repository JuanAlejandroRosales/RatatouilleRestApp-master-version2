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

package ratatouillerestapp.upc.edu.pe.data.network;

import ratatouillerestapp.upc.edu.pe.data.network.model.BlogResponse;
import ratatouillerestapp.upc.edu.pe.data.network.model.LoginRequest;
import ratatouillerestapp.upc.edu.pe.data.network.model.LoginResponse;
import ratatouillerestapp.upc.edu.pe.data.network.model.LogoutResponse;
import ratatouillerestapp.upc.edu.pe.data.network.model.OpenSourceResponse;

import javax.inject.Singleton;

import io.reactivex.Observable;

/**
 * Created by janisharali on 27/01/17.
 */

@Singleton
public interface ApiHelper {

    ApiHeader getApiHeader();

    Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Observable<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Observable<LogoutResponse> doLogoutApiCall();

    Observable<BlogResponse> getBlogApiCall();

    Observable<OpenSourceResponse> getOpenSourceApiCall();
}
