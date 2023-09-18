public class BaseVeiculosTerrestres extends BaseVeiculos {

    protected String chassi;
    protected String codigoRenavam;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public BaseVeiculosTerrestres() {
    }

    public BaseVeiculosTerrestres(String chassi, String codigoRenavam) {
        this.chassi = chassi;
        this.codigoRenavam = codigoRenavam;
    }

}
