public class Main {
    public static void main(String[] args){

        Customer kevin = new Customer();
        System.out.println(kevin.getName() + " " + kevin.getCreditLimit() + " " + kevin.getEmail());

        Customer ivan = new Customer("Ivan","ivan@email.com");
        System.out.println(ivan.getName() + " " + ivan.getCreditLimit() + " " + ivan.getEmail());

        Customer ben = new Customer("Ben",50000,"ben@email.com");
        System.out.println(ben.getName() + " " + ben.getCreditLimit() + " " + ben.getEmail());
    }
}
