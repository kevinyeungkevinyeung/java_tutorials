public class Worker {

    private String name;
    private String birthDate;
    private String endDate;

    public Worker(){

    }

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){

        int current_year = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (current_year - birthYear);
    }

    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }


    @Override
    public String toString() {
        return "Worker{" +
            " name='" + getName() + "'" +
            ", birthDate='" + getBirthDate() + "'" +
            ", endDate='" + getEndDate() + "'" +
            "}";
    }



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
}
