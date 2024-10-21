public class Main {
    public static void main(String[] args) {
        // Criação do gerente
        Gerente gerente = new Gerente("Carlos Silva", 45, "G001", 10000.0, 2015, 2024);

        // Criação dos chefes imediatos
        ChefeImediato chefe1 = new ChefeImediato("João Souza", 40, "C001", 8000.0);
        ChefeImediato chefe2 = new ChefeImediato("Maria Lima", 38, "C002", 8500.0);
        ChefeImediato chefe3 = new ChefeImediato("Paula Andrade", 42, "C003", 8200.0);

        // Criação dos funcionários
        Funcionario func1 = new Funcionario("Lucas Pereira", 30, "F001", chefe1, 4000.0);
        Funcionario func2 = new Funcionario("Ana Costa", 28, "F002", chefe1, 4500.0);
        Funcionario func3 = new Funcionario("Marcos Silva", 33, "F003", chefe2, 4200.0);
        Funcionario func4 = new Funcionario("Julia Martins", 27, "F004", chefe2, 4100.0);
        Funcionario func5 = new Funcionario("Ricardo Alves", 35, "F005", chefe3, 4300.0);
        Funcionario func6 = new Funcionario("Fernanda Santos", 32, "F006", chefe3, 4400.0);

        // Ajuste de salários
        gerente.ajustarSalario();
        chefe1.ajustarSalario();
        chefe2.ajustarSalario();
        chefe3.ajustarSalario();

        func1.ajustarSalario();
        func2.ajustarSalario();
        func3.ajustarSalario();
        func4.ajustarSalario();
        func5.ajustarSalario();
        func6.ajustarSalario();

        // Exibição das informações
        System.out.println(gerente);
        System.out.println();

        System.out.println(chefe1);
        System.out.println("Liderados:");
        System.out.println(func1);
        System.out.println(func2);
        System.out.println();

        System.out.println(chefe2);
        System.out.println("Liderados:");
        System.out.println(func3);
        System.out.println(func4);
        System.out.println();

        System.out.println(chefe3);
        System.out.println("Liderados:");
        System.out.println(func5);
        System.out.println(func6);
    }
}
    

