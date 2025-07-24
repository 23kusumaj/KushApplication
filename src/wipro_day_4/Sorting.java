package wipro_day_4;
import java.util.List;
import java.util.ArrayList;
class Employee{
	String name;
	int id;
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public String toString() {
		return "ID:" + id + ", Name: " +name;
	}
}

public class Sorting {
	public static void main(String[] args) {
		List<Employee> employee= new ArrayList<>();
			employee.add(new Employee("A",01));
			employee.add(new Employee("X",02));
			employee.add(new Employee("C",03));
			employee.add(new Employee("I",04));
			employee.add(new Employee("F",05));
			
			System.out.println("Beffore Sorting:");
			
			for (Employee emp : employee) {
				System.out.println(emp);
			}
			employee.sort((e1,e2) ->e1.name.compareToIgnoreCase(e2.name));
			
			System.out.println("\nAfter Sorting by Name:");
			
			for (Employee emp : employee) {
				System.out.println(emp);
			}
			
		
	}

}
