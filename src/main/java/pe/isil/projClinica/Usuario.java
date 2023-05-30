package pe.isil.projClinica;

import jakarta.persistence.*;

@Entity
@Table (name ="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;
    private String contra;

    public Usuario() {
    }

    public Usuario(Integer usuario, String nombre, String apellido, String email, String contra) {
        this.id = usuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.contra = contra;
    }

    public Integer getId() {
        return id;
    }

    public void setUsuario(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
}
