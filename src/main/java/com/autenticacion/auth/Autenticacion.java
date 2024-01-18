package com.autenticacion.auth;

public class Autenticacion {

    public boolean validarCredenciales(String user, String pass) {
        // Aquí podrías incluir la lógica para validar las credenciales, por ejemplo, consultando una base de datos o utilizando lógica de negocio
        // En este ejemplo, se valida un usuario y contraseña de forma estática
        return "user".equals(user) && "user".equals(pass);
    }
}
