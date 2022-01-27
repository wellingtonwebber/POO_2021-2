package Lista01ex01;

public class Tecnico extends Assistente{

    protected double bonus;

    @Override
    public double ganhoAnual() {
        return (salario + bonus) * 12;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
