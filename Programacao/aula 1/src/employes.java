public class employes {

    String name;
    double grossSalary;
    double Tax;

    public double netSalary(){
        return grossSalary - (Tax/100 * grossSalary);
    }

    public void incressSalary(double porcentage){
        this.grossSalary = grossSalary + (porcentage/100 * grossSalary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        Tax = tax;
    }
}

