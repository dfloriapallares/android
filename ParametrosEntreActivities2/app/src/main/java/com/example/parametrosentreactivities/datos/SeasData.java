package com.example.parametrosentreactivities.datos;

import com.example.parametrosentreactivities.beans.Usuario;

import java.util.ArrayList;

public class SeasData {
    private static Usuario usuario;
    private static ArrayList<Usuario> listaUsuarios;
    
    public static Usuario getUsuario() {
        return usuario;
    }

    public static void setUsuario(Usuario usuario) {
        SeasData.usuario = usuario;
    }
}
