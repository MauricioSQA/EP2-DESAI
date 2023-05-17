package org.example;

import DataAccess.AD_Usuario;
import DataAccess.AD_Medico;
import Models.Usuario;
import Models.Medico;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario();

        usuario1.setNombreUsuario("Maria");
        usuario1.setApelliUsuario("Perez");
        usuario1.setEmailUsuario("mperez@outlook.com");
        usuario1.setContraUsuario("654321");

        AD_Usuario adUsuario = new AD_Usuario();
        boolean resultado = adUsuario.insertar(usuario1);

        if (resultado == true) {
            //se inserto el usuario y lo enviamos al login.jsp
            System.out.printf("Registrado");
        } else {
            //lo redirigimos al mismo formulario
            System.out.printf("No registrado!");
        }
    }
}