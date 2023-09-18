public class Carro extends BaseVeiculosTerrestres {

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Carro() {
    }

    public Carro(String chassi, String codigoRenavam, int portas) {
        super(chassi, codigoRenavam);
        this.portas = portas;
    }

}
