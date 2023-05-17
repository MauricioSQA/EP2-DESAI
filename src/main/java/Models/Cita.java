package Models;

public class Cita {
    private Integer idCita;
    private String fechaCita;
    private String horaCita;
    private Double precioCita;
    private Integer idPaciente;
    private Integer idMedico;

    public Cita() {
    }

    public Cita(Integer idCita, String fechaCita, String horaCita, Double precioCita, Integer idPaciente, Integer idMedico) {
        this.idCita = idCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.precioCita = precioCita;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public Double getPrecioCita() {
        return precioCita;
    }

    public void setPrecioCita(Double precioCita) {
        this.precioCita = precioCita;
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
}
