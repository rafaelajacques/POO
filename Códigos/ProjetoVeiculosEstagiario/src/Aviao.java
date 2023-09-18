public class Aviao extends BaseVeiculos {

    private int assentos;
    private int turbinas;
    private int janelas;

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public int getTurbinas() {
        return turbinas;
    }

    public void setTurbinas(int turbinas) {
        this.turbinas = turbinas;
    }

    public Aviao() {
    }

    public Aviao(int codigo, String nome, String chassi, String placa, String codigoRenavam, String modelo, String cor,
            int eixos, double pesoLiquido, double pesoTotal, String fabricante, double potencia, String tipoCombustivel,
            String nomeProprietario, String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores,
            int qtdeOcupantes, int anoModelo, int anoFabricacao, int rodas, int assentos, int turbinas, int janelas) {
        super(codigo, nome, chassi, placa, codigoRenavam, modelo, cor, eixos, pesoLiquido, pesoTotal, fabricante,
                potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes, anoModelo, anoFabricacao, rodas);
        this.assentos = assentos;
        this.turbinas = turbinas;
        this.janelas = janelas;
    }

}
