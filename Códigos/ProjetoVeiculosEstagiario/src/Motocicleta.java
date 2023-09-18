public class Motocicleta extends BaseVeiculosTerrestres {

    private String tipoManete;

    public String getTipoManete() {
        return tipoManete;
    }

    public void setTipoManete(String tipoManete) {
        this.tipoManete = tipoManete;
    }

    public Motocicleta() {
    }

    public Motocicleta(String chassi, String codigoRenavam, String tipoManete) {
        super(chassi, codigoRenavam);
        this.tipoManete = tipoManete;
    }

}
