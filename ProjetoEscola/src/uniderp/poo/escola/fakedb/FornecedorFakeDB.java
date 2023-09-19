package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Fornecedor;

public class FornecedorFakeDB {
    private ArrayList<Fornecedor> tabela;

    public ArrayList<Fornecedor> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Fornecedor>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Fornecedor>();
        this.tabela.add(new Fornecedor(6, LocalDate.now(), "Rua F, 28", "33657841", "Atacadão", "Atacadão LTDA", "123456", "789012",
            LocalDate.of(1985, 8, 12), "Insumos", LocalDate.of(2019, 3, 5), 36));
        this.tabela.add(new Fornecedor(7, LocalDate.now(), "Rua G, 75", "33698002", "Malharia K7", "Malharia K7 LTDA", "456789", "012345",
            LocalDate.of(1986, 12, 5), "Uniformes Escolares",LocalDate.of(2020, 7, 18), 36));
        this.tabela.add(new Fornecedor(8, LocalDate.now(), "Rua H, 12", "33571698", "Papelaria A4", "Papelaria A4 Eirele", "678901", "234567",
            LocalDate.of(1987, 4, 22), "Material de Escritório",  LocalDate.of(2017, 8, 15),36));
        this.tabela.add(new Fornecedor(9, LocalDate.now(), "Rua I, 51", "33226580", "Cerâmicas C.O", "Cerâmicas C.O Eirele", "890123", "456789",
            LocalDate.of(1988, 9, 8), "Pisos e revestimentos", LocalDate.of(2016, 5, 30), 36));
        this.tabela.add(new Fornecedor(10, LocalDate.now(), "Rua J, 93", "33674988", "Soluções TI", "Soluções TI Eirele", "901234", "567890",
            LocalDate.of(1989, 2, 17), "Soluções informáticas", LocalDate.of(2018, 11, 10), 36));
    }

    public FornecedorFakeDB() {
        this.CarregarDados();
    }
}