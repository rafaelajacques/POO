public class Caminhao extends BaseVeiculosTerrestres {

    private String tipoCarga;
    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public Caminhao() {
    }

    public Caminhao(String chassi, String codigoRenavam, String tipoCarga, int portas) {
        super(chassi, codigoRenavam);
        this.tipoCarga = tipoCarga;
        this.portas = portas;
    }

}
