public class ChefeImediato extends Pessoa {

    public ChefeImediato(String nome, int idade, String codigo, double salario) {
        super(nome, idade, codigo, salario);
    }

    @Override
    public void ajustarSalario() {
        this.salario *= 1.05;
    }

    @Override
    public String toString(){
        return "Chefe Imediato" + super.toString();
    }
}
