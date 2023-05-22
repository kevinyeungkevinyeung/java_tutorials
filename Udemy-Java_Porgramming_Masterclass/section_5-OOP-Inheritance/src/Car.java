public class Car {

    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake(){
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;

        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return this.convertible;
    }

    public boolean getConvertible() {
        return this.convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void describeCar(){
        System.out.println(doors + "-Door " + 
                            color + " " + 
                            make + " " + 
                            model + " " + 
                            (convertible ? "Convertiable" : ""));
    }


    
}
