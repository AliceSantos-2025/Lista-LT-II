package Questão08.Questão08;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", \nBônus: R$ " + bonus + ", \nSalário Total: R$ " + calcularSalario();
    }
}
