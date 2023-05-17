package Models;

public class Receta {
    private Integer idReceta;
    private Integer idPaciente;
    private Integer idMedico;
    private Integer idCitaMedica;

    public Receta() {
    }

    public Receta(Integer idReceta, Integer idPaciente, Integer idMedico, Integer idCitaMedica) {
        this.idReceta = idReceta;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.idCitaMedica = idCitaMedica;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(Integer idMedico) {
        this.idMedico = idMedico;
    }

    public Integer getIdCitaMedica() {
        return idCitaMedica;
    }

    public void setIdCitaMedica(Integer idCitaMedica) {
        this.idCitaMedica = idCitaMedica;
    }
}
