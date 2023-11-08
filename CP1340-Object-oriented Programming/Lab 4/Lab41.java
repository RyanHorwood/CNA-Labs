//Lab 41
//Student Name: Ryan Horwood
//Student Number: 20170290
//Date: 11-12-2022

class Test {
    public static void main(String[] args) {
		Policy p = new Policy("Sammy", 54321, 60000);
        SalesPerson s = new SalesPerson("Troy", 400, 12, p);
        
        System.out.println(s);
		
    }
}
class Employee {
    protected String name;
	protected int salary;
	protected int id;
    
    public Employee(String name, int salary, int id) {
        this.name = name;
		this.salary = salary;
		this.id = id;
    }
 
}
class SalesPerson extends Employee {
	protected Policy p;
	
    public SalesPerson(String name, int salary, int id, Policy p) {
        super(name, salary, id);
		this.p = p;
    }
	
	public String toString(){
		String All = "Employee: " + name + ", Salary: " + salary + ", ID: " + id + ", and policy: " + p;
		return All;
    }
	
}
class Policy {
    private String Beneficiary;
    private int pid;
	private int amount;
    
    public Policy() {
        Beneficiary = "Tommy";
		pid = 12345;
		amount = 75000;
    }
    
    public Policy(String Beneficiary,int pid, int amount) {
        this.Beneficiary = Beneficiary;
        this.pid = pid;
		this.amount = amount;
    }
    
    public String toString() {
        String s = "Beneficiary: " + Beneficiary + " pid: " + pid + " amount: " + amount;
        return s;
    }
}