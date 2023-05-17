package Models;

public class Medico {
    private Integer idMedico;
    private String nombreMedico;
    private String apelliMedico;
    private String sexoMedico;
    private String colegiMedico;
    private String especiMedico;
    private String emailMedico;
    private String contraMedico;

    public Medico() {
    }

    public Medico(Integer idMedico, String nombreMedico, String apelliMedico, String sexoMedico, String colegiMedico, String especiMedico, String emailMedico, String contraMedico) {
        this.idMedico = idMedico;
        this.nombreMedico = nombreMedico;
        this.apelliMedico = apelliMedico;
        this.sexoMedico = sexoMedico;
        this.colegiMedico = colegiMedico;
        this.especiMedico = especiMedico;
        this.emailMedico = emailMedico;
        this.contraMedico = contraMedico;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApelliMedico() {
        return apelliMedico;
    }

    public void setApelliMedico(String apelliMedico) {
        this.apelliMedico = apelliMedico;
    }

    public String getSexoMedico() {
        return sexoMedico;
    }

    public void setSexoMedico(String sexoMedico) {
        this.sexoMedico = sexoMedico;
    }

    public String getColegiMedico() {
        return colegiMedico;
    }

    public void setColegiMedico(String colegiMedico) {
        this.colegiMedico = colegiMedico;
    }

    public String getEspeciMedico() {
        return especiMedico;
    }

    public void setEspeciMedico(String especiMedico) {
        this.especiMedico = especiMedico;
    }

    public String getEmailMedico() {
        return emailMedico;
    }

    public void setEmailMedico(String emailMedico) {
        this.emailMedico = emailMedico;
    }

    public String getContraMedico() {
        return contraMedico;
    }

    public void setContraMedico(String contraMedico) {
        this.contraMedico = contraMedico;
    }
}
