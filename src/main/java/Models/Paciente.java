package Models;

public class Paciente {
    private Integer idPaciente;
    private String nombrePaciente;
    private String apelliPaciente;
    private String numdocPaciente;
    private String fechanUsuario;
    private String sexoPaciente;
    private String telefoPaciente;
    private String emailPacienteo;
    private String seguroPaciente;
    private String direccPaciente;

    public Paciente() {
    }
    public Paciente(Integer idPaciente, String nombrePaciente, String apelliPaciente, String numdocPaciente, String fechanUsuario, String sexoPaciente, String telefoPaciente, String emailPacienteo, String seguroPaciente, String direccPaciente) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apelliPaciente = apelliPaciente;
        this.numdocPaciente = numdocPaciente;
        this.fechanUsuario = fechanUsuario;
        this.sexoPaciente = sexoPaciente;
        this.telefoPaciente = telefoPaciente;
        this.emailPacienteo = emailPacienteo;
        this.seguroPaciente = seguroPaciente;
        this.direccPaciente = direccPaciente;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApelliPaciente() {
        return apelliPaciente;
    }

    public void setApelliPaciente(String apelliPaciente) {
        this.apelliPaciente = apelliPaciente;
    }

    public String getNumdocPaciente() {
        return numdocPaciente;
    }

    public void setNumdocPaciente(String numdocPaciente) {
        this.numdocPaciente = numdocPaciente;
    }

    public String getFechanUsuario() {
        return fechanUsuario;
    }

    public void setFechanUsuario(String fechanUsuario) {
        this.fechanUsuario = fechanUsuario;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getTelefoPaciente() {
        return telefoPaciente;
    }

    public void setTelefoPaciente(String telefoPaciente) {
        this.telefoPaciente = telefoPaciente;
    }

    public String getEmailPacienteo() {
        return emailPacienteo;
    }

    public void setEmailPacienteo(String emailPacienteo) {
        this.emailPacienteo = emailPacienteo;
    }

    public String getSeguroPaciente() {
        return seguroPaciente;
    }

    public void setSeguroPaciente(String seguroPaciente) {
        this.seguroPaciente = seguroPaciente;
    }

    public String getDireccPaciente() {
        return direccPaciente;
    }

    public void setDireccPaciente(String direccPaciente) {
        this.direccPaciente = direccPaciente;
    }
}
