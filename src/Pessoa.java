public class Pessoa {
protected String nome;
protected int idade ;
protected String codigo;
protected double salario;

public Pessoa(String nome, int idade, String codigo, double salario){
    this.nome = nome;
    this.idade = idade;
    this.codigo = codigo;
    this.salario = salario;
}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void ajustarSalario(){

    }

    @Override
    public String toString(){
    return "Nome"+ nome + "Idade" + idade + "Cogigo" + codigo + "Salario" + salario;
    }
}
