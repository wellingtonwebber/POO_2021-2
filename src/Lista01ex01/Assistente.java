package Lista01ex01;

public class Assistente extends Funcionario{

    protected int matricula;

    @Override
    public String exibeDados() {
        return "Nome: " + nome + "\nSalário R$" + salario + "\nMatrícula: " + matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
