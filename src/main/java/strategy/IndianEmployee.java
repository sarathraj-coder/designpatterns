package strategy;

public class IndianEmployee extends Employee {
    public IndianEmployee(String name, String jobid) {
        super(name, jobid);
        sc = new ScaleB1();
    }

    @Override
    public void useSalaryScale() {
        sc.provideSalaryScale();
    }
}
