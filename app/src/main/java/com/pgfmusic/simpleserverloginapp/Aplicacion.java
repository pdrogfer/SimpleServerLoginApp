package com.pgfmusic.simpleserverloginapp;

import android.app.Application;

/**
 * Created by USUARIO on 06/11/2015.
 */

// This is the proper way to store passwords. Never hardcoded, but retrieved from server and stored
// in usuario variable at run time
public class Aplicacion extends Application {

    private String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
