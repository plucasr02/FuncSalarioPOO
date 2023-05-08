package entities;

public class Salario {

    public String name;
    public Double GrossSalary;
    public Double tax;
    public Double percentage;

    public Double NetSalary(){
        return this.GrossSalary - this.tax;
    }

    public Double IncreaseSalary(){
        Double retirar = this.GrossSalary * this.percentage/100;
        return (this.GrossSalary + retirar) - this.tax;
    }
}
