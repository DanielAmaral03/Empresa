public class Funcionario extends Pessoa {
    private ChefeImediato chefeImediato;

    public Funcionario(String nome, int idade, String codigo, ChefeImediato chefeImediato, double salario) {
        super(nome, idade, codigo, salario);
        this.chefeImediato = chefeImediato;
    }

    @Override
    public void ajustarSalario() {
        this.salario *= 1.07; // Aumento de 7%
    }

    @Override
    public String toString() {
        return "Funcionário - " + super.toString() + ", Chefe Imediato: " + chefeImediato.nome;
    }
}
