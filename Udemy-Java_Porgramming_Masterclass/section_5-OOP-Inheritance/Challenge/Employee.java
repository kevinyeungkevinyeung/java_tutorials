public class Employee extends Worker {
    private long employeedId;
    private String hireDate;
    private static int employeeNo = 1;

    Employee(String name, String hireDate, String birthDate){
        super(name, birthDate);
        this.employeedId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return " Employee{" +
            " employeedId='" + getEmployeedId() + "'" +
            ", hireDate='" + getHireDate() + "'" +
            "}" + super.toString();
    }


    public long getEmployeedId() {
        return this.employeedId;
    }

    public void setEmployeedId(long employeedId) {
        this.employeedId = employeedId;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }


}
