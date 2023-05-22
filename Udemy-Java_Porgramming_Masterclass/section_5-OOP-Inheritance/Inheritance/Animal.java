public class Animal {
    
    protected String type;
    private String size;
    private double weight;


    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal(){

    }


    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", size='" + getSize() + "'" +
            ", weight='" + getWeight() + "'" +
            "}";
    }

    public void move(String speed){
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }


    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
