class Employee extends Human {
    private int employeeId;
    private double salary;

    public Employee(int id,String name,int employeeid,double salary){
        super(id, name);
        this.employeeId = employeeid;
        this.salary = salary;
    }
    public int getEmployeeId(){
        return this.employeeId;
    }
    public void setEmployeeId(int id){
        this.employeeId = id;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
