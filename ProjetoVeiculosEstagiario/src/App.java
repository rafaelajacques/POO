public class App {
    public static void main(String[] args) throws Exception {

        Aviao a1 = new Aviao(12, "Boeing", "727JK", "Boeing", "Branco", 4, 5000.00, 6000.00, "AJAX", 400.00, "Diesel",
                "Rafaela", "Mato Grosso do Sul", "Jardim", "Avião", 6, 250, 2019, 2018, 4, 250, 4, 125);
        a1.imprimir();

        System.out.println("-----------------------------------");

        Carro c1 = new Carro(13, "Gol", "GHJ123", "G3", "Branco", 2, 1000.00, 1500.00, "VOLKSWAGEM", 150.00, "Gasolina",
                "Rafaela", "Mato Grosso do Sul", "Bonito", "Particular", 1, 5, 2023, 2022, 4, "abc234", "dfg456", 4);
        c1.imprimir();

        System.out.println("-----------------------------------");

        Caminhao n1 = new Caminhao(14, "TIOZAO", "HJK789", "Bitrem", "Branco", 8, 3000.00, 4500.00, "VOLVO", 150.00,
                "Diesel",
                "Rafaela", "Mato Grosso do Sul", "Campo Grande", "Carga", 2, 2, 2017, 2016, 8, "hyt853", "pol716",
                "Indivisivel", 2);
        n1.imprimir();

        System.out.println("-----------------------------------");

        Onibus o1 = new Onibus(15, "Linha 070", "YON806", "Escolar", "Amarelo", 2, 500.00, 1000.00, "MERCEDES", 200.00,
                "Diesel", "Rafaela", "Mato Grosso do Sul", "Dourados", "Transporte", 2, 40, 2019, 2019, 6, "tqp913",
                "nrc594", 25, 3);
        o1.imprimir();

        System.out.println("-----------------------------------");

        Motocicleta m1 = new Motocicleta(16, "Titan", "LKA613", "Street", "Vermelha", 1, 250.00, 400.00, "HONDA",
                100.00,
                "Gasolina", "Rafaela", "Mato Grosso do Sul", "Três Lagoas", "Particular", 1, 2, 2020, 2019, 2, "tqp913",
                "nrc594", "Esportivo");
        m1.imprimir();
    }
}