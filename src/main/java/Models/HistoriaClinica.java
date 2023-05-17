package Models;

public class HistoriaClinica {
    private Integer idHistoriaClinica;
    private Integer idPaciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Integer idHistoriaClinica, Integer idPaciente) {
        this.idHistoriaClinica = idHistoriaClinica;
        this.idPaciente = idPaciente;
    }

    public Integer getIdHistoriaClinica() {
        return idHistoriaClinica;
    }

    public void setIdHistoriaClinica(Integer idHistoriaClinica) {
        this.idHistoriaClinica = idHistoriaClinica;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
}
