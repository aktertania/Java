package Lab4.Polymorphism.Inheritance;

public class InheritanceTest {

	
	    public static void main(String[] args) {
	        Employee employee = new Employee();

	        System.out.println(employee);

	        employee.setId(100);
	        employee.setName("Jamal");
	        System.out.println(employee);
	        employee.setSalary(10000);
	        System.out.println(employee);

	        Programmer programmer = new Programmer();
	        programmer.setId(200);
	        programmer.setName("Tania Akter");
	        programmer.setSalary(30000);
	        programmer.setBonus(300);
	        System.out.println(programmer);

	        programmer.totalSalary();
	        
	    }
	}
