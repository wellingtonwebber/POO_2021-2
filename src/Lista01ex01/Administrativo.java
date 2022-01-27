package Lista01ex01;

public class Administrativo extends Assistente{

    protected String turno;
    protected double adicionalNoturno; //porcentagem

    @Override
    public double ganhoAnual() {
        if(turno == "noite"){
            return (salario + (salario * (adicionalNoturno/100))) * 12;
        } else {
            return salario * 12;
        }
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(int adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }
}
