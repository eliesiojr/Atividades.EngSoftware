import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do colaborador: ");
        String name = input.nextLine();

        System.out.println("Informe o salario do colaborador: ");
        double grossSalary = input.nextDouble();
        input.nextLine();

        System.out.println("informe a porcentagem de imposto sobre o salario: ");
        double Tax = input.nextDouble();
        input.nextLine();

        System.out.println("informe a porcentagem de aumento do salario");
        double porcentage = input.nextDouble();
        input.nextLine();

        employes trabalhador = new employes();
        trabalhador.setGrossSalary(grossSalary);
        trabalhador.setName(name);
        trabalhador.setTax(Tax);

        System.out.printf("Colaborador: %s\n salario liquido atual: %.2f\n", trabalhador.name, trabalhador.netSalary());
        trabalhador.incressSalary(porcentage);
        System.out.printf("Colaborador: %s\n salario liquido apos reajuste: %.2f\n", trabalhador.name, trabalhador.netSalary());
    }
}