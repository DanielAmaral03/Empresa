public class Gerente extends Pessoa {
    private int anoInicio;
    private int anoFim;

    public Gerente(String nome, int idade, String codigo, double salario, int anoInicio, int anoFim) {
        super(nome, idade, codigo, salario);
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    @Override
    public void ajustarSalario() {
        this.salario *= 1.10;
    }

    @Override
    public String toString(){
        return "Ano de ínicio" + anoInicio + "Ano do fim" + anoFim;
    }
}
