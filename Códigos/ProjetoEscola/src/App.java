import java.util.ArrayList;

import uniderp.poo.escola.dominio.*;
import uniderp.poo.escola.fakedb.*;

public class App {
    public static void main(String[] args) throws Exception {
        AlunoFakeDB db = new AlunoFakeDB();
        ArrayList<Aluno> lista = db.getTabela();
        System.out.println("### Início de Execução. ###");
        for (Aluno aluno : lista) {
            System.out.println("-----------------------------------");
            aluno.Imprimir();
        }
        System.out.println("### Final de Execução. ###");
    }
}