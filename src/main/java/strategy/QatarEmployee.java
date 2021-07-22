package strategy;

public class QatarEmployee extends Employee{
    public QatarEmployee(String name, String jobid) {
        super(name, jobid);
        sc = new ScaleB2();
    }

    @Override
    public void useSalaryScale() {
        sc.provideSalaryScale();
    }


}
