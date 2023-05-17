package DataAccess;

import Models.Medicamento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AD_Medicamento {
    private PreparedStatement pst = null;
    private ResultSet rst;

    public boolean insertar(Medicamento medicamento){
        boolean resultado = false;
        Connection Conexion = null;

        try {
            Conexion = ConnectDB.getInstance().getConnect(); //creamos la conexion a la bd
            if (Conexion != null) {

                String SQL = "INSERT INTO medicamento(nombreMedicamento, concenMedicamento, descrMedicamento, precioMedicamento) VALUES(?,?,?,?)";
                pst = Conexion.prepareStatement(SQL);
                pst.setString(1,medicamento.getNombreMedicamento());
                pst.setString(2,medicamento.getConcenMedicamento());
                pst.setString(3,medicamento.getDescrMedicamento());
                pst.setDouble(4,medicamento.getPrecioMedicamento());
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
