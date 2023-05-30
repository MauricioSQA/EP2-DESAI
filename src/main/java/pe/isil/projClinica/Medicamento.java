package pe.isil.projClinica;

import jakarta.persistence.*;

@Entity
@Table(name ="Medicamento")
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idMedicamento;
    private String nombreMedicamento;
    private String laboratorio;
    private String tipoMedicamento;
    private String miligramos;

    public Medicamento() {
    }

    public Medicamento(long idMedicamento, String nombreMedicamento, String laboratorio, String tipoMedicamento, String miligramos) {
        this.idMedicamento = idMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.laboratorio = laboratorio;
        this.tipoMedicamento = tipoMedicamento;
        this.miligramos = miligramos;
    }

    public long getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(long idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public String getMiligramos() {
        return miligramos;
    }

    public void setMiligramos(String miligramos) {
        this.miligramos = miligramos;
    }
}
