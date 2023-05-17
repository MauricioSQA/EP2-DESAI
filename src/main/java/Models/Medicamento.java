package Models;

public class Medicamento {
    private Integer idMedicamento;
    private String nombreMedicamento;
    private String concenMedicamento;
    private String descrMedicamento;
    private Double precioMedicamento;

    public Medicamento() {
    }

    public Integer getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(Integer idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getConcenMedicamento() {
        return concenMedicamento;
    }

    public void setConcenMedicamento(String concenMedicamento) {
        this.concenMedicamento = concenMedicamento;
    }

    public String getDescrMedicamento() {
        return descrMedicamento;
    }

    public void setDescrMedicamento(String descrMedicamento) {
        this.descrMedicamento = descrMedicamento;
    }

    public Double getPrecioMedicamento() {
        return precioMedicamento;
    }

    public void setPrecioMedicamento(Double precioMedicamento) {
        this.precioMedicamento = precioMedicamento;
    }
}

