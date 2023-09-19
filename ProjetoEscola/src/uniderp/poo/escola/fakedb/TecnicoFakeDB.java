package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Tecnico;

public class TecnicoFakeDB {
    private ArrayList<Tecnico> tabela;

    public ArrayList<Tecnico> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Tecnico>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Tecnico>();
        this.tabela.add(new Tecnico(15, LocalDate.now(), "Rua K, 17", "997841235", "Raul", "123456", "789012",
                LocalDate.of(1985, 8, 12), "5678", "0123", LocalDate.of(2015, 3, 20), LocalDate.of(2025, 3, 20), "02"));
        this.tabela.add(new Tecnico(16, LocalDate.now(), "Rua L, 58", "998620156", "Claudio", "456789", "012345",
                LocalDate.of(1986, 10, 5), "8721", "1234", LocalDate.of(2014, 7, 18), LocalDate.of(2024, 7, 18), "02"));
        this.tabela.add(new Tecnico(17, LocalDate.now(), "Rua M, 93", "992357800", "Patricia", "678901", "234567",
                LocalDate.of(1987, 2, 22), "3015", "2345", LocalDate.of(2013, 5, 15), LocalDate.of(2023, 5, 15), "02"));
        this.tabela.add(new Tecnico(18, LocalDate.now(), "Rua N, 60", "991369988", "Sônia", "890123", "456789",
                LocalDate.of(1988, 7, 8), "6982", "3456", LocalDate.of(2012, 1, 7), LocalDate.of(2022, 1, 7), "01"));
        this.tabela.add(new Tecnico(19 , LocalDate.now(), "Rua O, 81", "993078445", "Bruno", "901234", "567890",
                LocalDate.of(1989, 1, 30), "7946", "4567", LocalDate.of(2011, 8, 10), LocalDate.of(2021, 8, 10), "01"));
    }

    public TecnicoFakeDB() {
        this.CarregarDados();
    }
}