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

package ratatouillerestapp.upc.edu.pe.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import ratatouillerestapp.upc.edu.pe.R;
import ratatouillerestapp.upc.edu.pe.ui.base.BaseActivity;
import ratatouillerestapp.upc.edu.pe.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by janisharali on 27/01/17.
 */

public class LoginActivity extends BaseActivity implements LoginMvpView {


    public static final String REQUEST_METHOD = "POST";
    public static final int READ_TIMEOUT = 15000;
    public static final int CONNECTION_TIMEOUT = 15000;
    public static final String URL_STRING = "https://workspace-rest-juanalejandro.c9users.io/api/v1/user_tests/validate_user";
    //    public static final String URL_STRING = "http://localhost:3000/api/v1/new_sessions";

    @Inject
    LoginMvpPresenter<LoginMvpView, LoginMvpInteractor> mPresenter;

    @BindView(R.id.et_email)
    EditText mEmailEditText;

    @BindView(R.id.et_password)
    EditText mPasswordEditText;

    Button btnIngresar;

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(LoginActivity.this);

        mEmailEditText =  (EditText) findViewById(R.id.et_email);
        mPasswordEditText = (EditText) findViewById(R.id.et_password);
        btnIngresar = (Button) findViewById(R.id.btn_server_login);
         ;

//        EditText etLocation = (EditText) findViewById(R.id.et_email);
//        EditText etLocation =
//        Intent intent = new Intent();
//        intent.putExtra("location", etLocation.getText().toString());
//        startActivity(intent);
        btnIngresar.setOnClickListener(new View.OnClickListener() {
                                                       @Override
                                                       public void onClick(View v) {
                                                           UserLoginTask task = new UserLoginTask(mEmailEditText.getText().toString(),mPasswordEditText.getText().toString());
                                                           task.execute();
                                                       }
               });



    }

    @OnClick(R.id.btn_server_login)
    void onServerLoginClick(View v) {
        mPresenter.onServerLoginClick(mEmailEditText.getText().toString(),
                mPasswordEditText.getText().toString());
    }

    @OnClick(R.id.ib_google_login)
    void onGoogleLoginClick(View v) {
        mPresenter.onGoogleLoginClick();
    }

    @OnClick(R.id.ib_fb_login)
    void onFbLoginClick(View v) {
        mPresenter.onFacebookLoginClick();
    }

    @Override
    public void openMainActivity() {

//        Intent intent = MainActivity.getStartIntent(LoginActivity.this);
//        startActivity(intent);
//        finish();
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

    @Override
    protected void setUp() {

    }


    public class UserLoginTask extends AsyncTask<Void, Void, String> {

        private final String mEmail;
        private final String mPassword;
        String result;
        URL url = null;
        HttpURLConnection conn;
        UserLoginTask(String email, String password) {

            mEmail = email;
            mPassword = password;
        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO: attempt authentication against a network service.

            String result= null;
            String inputLine;

            try {
                //Create a URL object holding our url
//                String new_url = URL_STRING + "?emaik="+mEmail+ "&password=" +mPassword;
                URL myUrl = new URL(URL_STRING);
                //Create a connection
                HttpURLConnection connection =(HttpURLConnection)
                        myUrl.openConnection();

                //Set methods and timeouts
                connection.setRequestMethod(REQUEST_METHOD);
                connection.setReadTimeout(READ_TIMEOUT);
                connection.setConnectTimeout(CONNECTION_TIMEOUT);
//
//
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");

                // Append parameters to URL
                DataOutputStream out = new DataOutputStream(connection.getOutputStream());

                JSONObject jsonobj = new JSONObject();
                jsonobj.put("emaik", mEmail);
                jsonobj.put("password", mPassword);


                out.writeBytes(jsonobj.toString());
                out.flush();
                out.close();
                //Connect to our url
                connection.connect();

                int response_code = connection.getResponseCode();
                //Create a new InputStreamReader
                InputStream input = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input, "UTF-8"));
                String line;
                StringBuffer sb = new StringBuffer();
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
                input.close();
                result = sb.toString();
                Log.e("resultado response ",result);


            } catch (MalformedURLException e) {
                e.printStackTrace();
                result = null;
            } catch (IOException e) {
                e.printStackTrace();
                result = null;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return result;


            // TODO: register the new account here.

        }

        @Override
        protected void onPostExecute(String success) {
//            mAuthTask = null;
//            showProgress(false);
            Log.e("succes",success);
            JSONObject jsonObject = null;
            try {
                jsonObject = new JSONObject(success);
                if(!jsonObject.getBoolean("success"))
                {
                    Toast.makeText(LoginActivity.this,"User Password Incorrect"  + jsonObject.getString("success"), Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Toast.makeText(LoginActivity.this, jsonObject.getString("success"), Toast.LENGTH_SHORT).show();
//                    session.loginUser(jsonObject.getJSONObject("user").getString("email").toString(),mPassword,jsonObject.getString("auth_token"),true,jsonObject.getJSONObject("user").getJSONArray("buildings"));
                    Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                    //it's not contain key club or isnull so do this operation here
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void onCancelled() {
//            mAuthTask = null;
//            showProgress(false);
        }
    }



}
