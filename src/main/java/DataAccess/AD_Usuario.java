package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Models.Usuario;

public class AD_Usuario {
    private PreparedStatement pst = null;
    private ResultSet rst;

    public boolean insertar(Usuario usuario){
        boolean resultado = false;
        Connection Conexion = null;

        try {
            Conexion = ConnectDB.getInstance().getConnect(); //creamos la conexion a la bd
            if (Conexion != null) {

                String SQL = "INSERT INTO Usuario(nombreUsuario, apelliUsuario, emailUsuario, contraUsuario) VALUES(?,?,?,?)";
                pst = Conexion.prepareStatement(SQL);
                pst.setString(1,usuario.getNombreUsuario());
                pst.setString(2,usuario.getApelliUsuario());
                pst.setString(3,usuario.getEmailUsuario());
                pst.setString(4,usuario.getContraUsuario());


                int res = 0;
                res = pst.executeUpdate();
                if (res > 0) {
                    resultado = true;
                } else {
                    resultado = false;
                }

            } else {
                System.out.println("Error en la conexion a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectDB.getInstance().close(Conexion);
        }
        return resultado;
    }

    public Usuario login(String email)
    {
        Usuario usuario = null;
        Connection Conexion = null;

        try {
            Conexion = ConnectDB.getInstance().getConnect(); //creamos la conexion a la bd
            if (Conexion != null) {
                //Validar el email no exista en la base de datos
                String SQL = "SELECT * FROM usuario WHERE email = ?";
                pst = Conexion.prepareStatement(SQL);
                pst.setString(1, email);
                rst = pst.executeQuery();

                while(rst.next()){
                    if (rst.getInt("id") > 0) {
                        usuario = new Usuario();

                        usuario.setIdUsuario(rst.getInt("id"));
                        usuario.setNombreUsuario(rst.getString("nombre"));
                        usuario.setApelliUsuario(rst.getString("apellido"));
                        usuario.setEmailUsuario(rst.getString("email"));
                        usuario.setContraUsuario(rst.getString("password"));

                    }
                }

            } else {
                System.out.println("Error en la conexion a la base de datos");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            ConnectDB.getInstance().close(Conexion);
        }
        return usuario;
    }
}