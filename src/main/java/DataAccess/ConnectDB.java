package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectDB {
    private final String username = "root";
    private final String password = "";
    private final String database = "develop";
    private final String puerto = "3306";
    private final String host = "localhost";
    private Connection connection;
    private static ConnectDB instance;

    //public static void main (String[] args) {
    public ConnectDB() {

        try{
            //Carga del Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Instanciar un String con el url de la bd
            String url = "jdbc:mysql://"+host+":"+puerto+"/"+database;

            //Establecer coneccion
            this.connection = DriverManager.getConnection(url, username, password);

            //aquí

        }catch(ClassNotFoundException | SQLException exception){
            System.out.println("Error: "+ exception.getMessage());
        }
    }

    public Connection getConnect(){
        if (connection == null) {
            instance = new ConnectDB();
        }
        return this.connection;
    }

    public static ConnectDB getInstance(){
        if (instance != null) {
            return instance;
        }
        instance = new ConnectDB();
        return instance;
    }

    public void close(Connection connection){
        try{
            if(connection.isClosed()) {
                System.out.println("Se cerró la conexión");
            }

        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        }
    }

}


