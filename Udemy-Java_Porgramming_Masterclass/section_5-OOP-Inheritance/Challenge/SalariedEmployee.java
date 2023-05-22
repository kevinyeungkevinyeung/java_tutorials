public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary){
        super(name, hireDate, birthDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;

        System.out.println(isRetired ? "Retired" : "Not Retired");
    }

    @Override
    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? (0.9 * paycheck) : paycheck;

        return (int) adjustedPay;
    }


    @Override
    public String toString() {
        return "SalariedEmployee {" +
            " annualSalary='" + getAnnualSalary() + "'" +
            ", isRetired='" + isIsRetired() + "'" +
            "}" + super.toString();
    }

    public double getAnnualSalary() {
        return this.annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public boolean isIsRetired() {
        return this.isRetired;
    }

    public boolean getIsRetired() {
        return this.isRetired;
    }

    public void setIsRetired(boolean isRetired) {
        this.isRetired = isRetired;
    }


}
