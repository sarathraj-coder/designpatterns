package strategy;

public abstract   class Employee {
    protected String name;
    protected String jobid;
    protected ISalaryScale sc;

    public Employee(String name, String jobid) {
        this.name = name;
        this.jobid = jobid;
    }


    public void setSalaryScale(ISalaryScale sc){
        this.sc=sc;
    }

    public abstract void useSalaryScale();
}
