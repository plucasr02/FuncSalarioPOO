package Application;
import java.util.Locale;
import java.util.Scanner;
import entities.Salario;

public class Funcionario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salario funcionario = new Salario();

        System.out.println("Name: ");
        funcionario.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        funcionario.GrossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: "+funcionario.name+ ", "+funcionario.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        funcionario.percentage = sc.nextDouble();

        System.out.println("Updated data: "+funcionario.name+ ", "+funcionario.IncreaseSalary());
        

        sc.close();
    }  
}
