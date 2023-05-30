package Models;

public class Usuario {
    private Integer idUsuario;
    private String nombreUsuario;
    private String apelliUsuario;
    private String emailUsuario;
    private String contraUsuario;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombreUsuario, String apelliUsuario, String emailUsuario, String contraUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apelliUsuario = apelliUsuario;
        this.emailUsuario = emailUsuario;
        this.contraUsuario = contraUsuario;
    }
// setters y getters
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApelliUsuario() {
        return apelliUsuario;
    }

    public void setApelliUsuario(String apelliUsuario) {
        this.apelliUsuario = apelliUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContraUsuario() {
        return contraUsuario;
    }

    public void setContraUsuario(String contraUsuario) {
        this.contraUsuario = contraUsuario;
    }
}
