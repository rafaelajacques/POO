public abstract class BaseIdentificador {

    protected int codigo;
    protected String nome;
    protected String placa;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public BaseIdentificador() {
    }

    public BaseIdentificador(int codigo, String nome, String placa) {
        this.codigo = codigo;
        this.nome = nome;
        this.placa = placa;
    }

}
