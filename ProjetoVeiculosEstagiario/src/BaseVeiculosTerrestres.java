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

    public BaseVeiculosTerrestres(int codigo, String nome, String placa, String modelo, String cor, int eixos,
            double pesoLiquido, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, int anoModelo, int anoFabricacao, int rodas, String chassi, String codigoRenavam) {
        super(codigo, nome, placa, modelo, cor, eixos, pesoLiquido, pesoTotal, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, anoModelo, anoFabricacao,
                rodas);
        this.chassi = chassi;
        this.codigoRenavam = codigoRenavam;
    }

}