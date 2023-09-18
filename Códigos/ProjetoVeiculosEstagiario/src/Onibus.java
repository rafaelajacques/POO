public class Onibus extends BaseVeiculosTerrestres {
    private int assentos;
    private int portas;

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public Onibus() {
    }

    public Onibus(String chassi, String codigoRenavam, int assentos, int portas) {
        super(chassi, codigoRenavam);
        this.assentos = assentos;
        this.portas = portas;
    }

}
