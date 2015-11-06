package com.pgfmusic.simpleserverloginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/*
 * This activity is the first of the "real" app, where user is redirected after successful
 * authentication. Here it just shows the user email, as returned from the server and stored in
 * Aplicacion.Usuario field
 */


public class DestinationActivity extends AppCompatActivity {

    TextView tv_userEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destination);

        tv_userEmail = (TextView) findViewById(R.id.tv_user_email);
        Aplicacion app = (Aplicacion) getApplicationContext();
        String userEmail = app.getUsuario();
        tv_userEmail.setText(userEmail);
    }
}
