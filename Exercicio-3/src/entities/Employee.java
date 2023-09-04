package entities;

public class Employee {
    public String name;
    public double grossSalary; //salario bruto
    public double tax; //imposto

    //salario liquido
    public double netSalary(){

        return grossSalary - tax;
    }

    //incremento de salario
    public void increaseSalary(double git){

        grossSalary += grossSalary * percentage / 100;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", netSalary());
    }
}
