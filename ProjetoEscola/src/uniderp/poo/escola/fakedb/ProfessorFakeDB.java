package uniderp.poo.escola.fakedb;

import java.time.LocalDate;
import java.util.ArrayList;

import uniderp.poo.escola.dominio.Professor;

public class ProfessorFakeDB {
    private ArrayList<Professor> tabela;

    public ArrayList<Professor> getTabela() {
        if (this.tabela == null) {
            this.tabela = new ArrayList<Professor>();
        }
        return this.tabela;
    }

    private void CarregarDados() {
        this.tabela = new ArrayList<Professor>();
        this.tabela.add(new Professor(1, LocalDate.now(), "Rua A, 47", "992647910", "Luiz", "064785", "983105",
                LocalDate.of(1980, 2, 15), "6498", "0123", LocalDate.of(2016, 1, 2), LocalDate.of(2026, 1, 2), "01"));
        this.tabela.add(new Professor(2, LocalDate.now(), "Rua B, 82", "991644832", "Simone", "984210", "647982",
                LocalDate.of(1981, 11, 1), "8721", "1234", LocalDate.of(2017, 12, 20), LocalDate.of(2027, 12, 20), "01"));
        this.tabela.add(new Professor(3, LocalDate.now(), "Rua C, 34", "993677999", "Noiza", "367029", "136407",
                LocalDate.of(1982, 7, 26), "3015", "2345", LocalDate.of(2016, 12, 15), LocalDate.of(2026, 12, 15), "01"));
        this.tabela.add(new Professor(4, LocalDate.now(), "Rua D, 99", "998245106", "Paulo", "134528", "981346",
                LocalDate.of(1983, 5, 17), "6982", "3456", LocalDate.of(2018, 1, 7), LocalDate.of(2028, 1, 7), "01"));
        this.tabela.add(new Professor(5, LocalDate.now(), "Rua E, 61", "996378114", "Allan", "870317", "675434",
                LocalDate.of(1984, 1, 30), "7946", "4567", LocalDate.of(2017, 1, 10),  LocalDate.of(2027, 1, 10), "01"));
    }

    public ProfessorFakeDB() {
        this.CarregarDados();
    }
}