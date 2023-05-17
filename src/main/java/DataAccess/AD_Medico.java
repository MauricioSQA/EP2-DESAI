package DataAccess;

import Models.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AD_Medico {
    private PreparedStatement pst = null;
    private ResultSet rst;

    public boolean insertar(Medico medico){
        boolean resultado = false;
        Connection Conexion = null;

        try {
            Conexion = ConnectDB.getInstance().getConnect(); //creamos la conexion a la bd
            if (Conexion != null) {

                String SQL = "INSERT INTO medico(nombreMedico, apelliMedico, sexoMedico, colegiMedico," +
                        "especiMedico, emailMedico, contraMedico) VALUES(?,?,?,?,?,?,?)";
                pst = Conexion.prepareStatement(SQL);

                pst.setString(1,medico.getNombreMedico());
                pst.setString(2,medico.getApelliMedico());
                pst.setString(3,medico.getSexoMedico());
                pst.setString(4,medico.getColegiMedico());
                pst.setString(5,medico.getEspeciMedico());
                pst.setString(6,medico.getEmailMedico());
                pst.setString(7,medico.getContraMedico());

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

}
