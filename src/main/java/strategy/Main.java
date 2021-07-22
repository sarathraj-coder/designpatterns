package strategy;


// strategy pattern designs a family of algorithms , encapsulates each one and makes them interchangeable
// When there is change in the spec in future . The future people should Thank you , not curse you ….
public class Main {
    public static void main(String[] args) {
        Employee sarath = new IndianEmployee("sarath","400");
        sarath.useSalaryScale();

        Employee khalid = new QatarEmployee("khalid","400");
        khalid.useSalaryScale();

        // change khalid scale --> interchange the algorithms -- strategy pattern
        System.out.println("new scale ");
        khalid.setSalaryScale(new ScaleB1());
        khalid.useSalaryScale();
    }
}
