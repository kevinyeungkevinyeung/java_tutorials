public class Dog extends Animal {
    
    private String eatShape;
    private String tailShape;

    public Dog(){
        super("Mutt","Big",50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String eatShape, String tailShape) {
        super(
                type, 
                weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight
            );

        this.eatShape = eatShape;
        this.tailShape = tailShape;
    }

    public void makeNoise(){
        if (type == "Wolf"){
            System.out.print("Ow Woooo!");
        }
      bark();
      System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        // System.out.println("Dogs walk, run and wag their tail");
        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }

        System.out.println();
    }

    private void bark(){
        System.out.print("Woof! ");
    }

    private void run(){
        System.out.print("Dog Running ");
    }

    private void walk(){
        System.out.print("Dog Walking ");
    }

    private void wagTail(){
        System.out.print("Tail Wagging ");
    }


    @Override
    public String toString() {
        return "Dog{" +
            " eatShape='" + getEatShape() + "'" +
            ", tailShape='" + getTailShape() + "'" +
            "} Animal" + super.toString();
    }


    public String getEatShape() {
        return this.eatShape;
    }

    public void setEatShape(String eatShape) {
        this.eatShape = eatShape;
    }

    public String getTailShape() {
        return this.tailShape;
    }

    public void setTailShape(String tailShape) {
        this.tailShape = tailShape;
    }


}
