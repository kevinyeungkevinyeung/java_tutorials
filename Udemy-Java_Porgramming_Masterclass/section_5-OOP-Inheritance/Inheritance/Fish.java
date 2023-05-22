public class Fish extends Animal {
    private int gills;
    private int fins;


    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscle(){
        System.out.print("Backfin moving ");
    }

    private void moveBackFin(){
        System.out.print("backfin moving");
    }

    @Override
    public void move(String speed){
        super.move(speed);
        moveMuscle();

        if(speed == "fast"){
            moveBackFin();
        }

        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish {" +
            " gills='" + getGills() + "'" +
            ", fins='" + getFins() + "'" +
            "} Animal" + super.toString();
    }

    public int getGills() {
        return this.gills;
    }

    public void setGills(int gills) {
        this.gills = gills;
    }

    public int getFins() {
        return this.fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

}
