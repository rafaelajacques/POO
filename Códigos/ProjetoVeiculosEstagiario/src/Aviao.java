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

    public Aviao(int codigo, String nome, String placa, String modelo, String cor, int eixos, double pesoLiquido,
            double pesoTotal, String fabricante, double potencia, String tipoCombustivel, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, int anoModelo,
            int anoFabricacao, int rodas, int assentos, int turbinas, int janelas) {
        super(codigo, nome, placa, modelo, cor, eixos, pesoLiquido, pesoTotal, fabricante, potencia, tipoCombustivel,
                nomeProprietario, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores, qtdeOcupantes, anoModelo, anoFabricacao,
                rodas);
        this.assentos = assentos;
        this.turbinas = turbinas;
        this.janelas = janelas;
    }

    public void imprimir() {

        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Eixos: " + this.eixos);
        System.out.println("Peso Líquido: " + this.pesoLiquido);
        System.out.println("Peso Total: " + this.pesoTotal);
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Potência: " + this.potencia);
        System.out.println("Tipo de Combustível: " + this.tipoCombustivel);
        System.out.println("Nome do Proprietário: " + this.nomeProprietario);
        System.out.println("Estado: " + this.estadoUF);
        System.out.println("Cidade: " + this.cidadeUF);
        System.out.println("Tipo Veículo: " + this.tipoVeiculo);
        System.out.println("Quantidade de motores: " + this.qtdeMotores);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Ano do Modelo: " + this.anoModelo);
        System.out.println("Ano de Fabricacão: " + this.anoFabricacao);
        System.out.println("Rodas: " + this.rodas);
        System.out.println("Assentos: " + this.assentos);
        System.out.println("Quantidade de Turbinas: " + this.turbinas);
        System.out.println("Quantidade de Janelas: " + this.janelas);
        System.out.println("");
    }
}
