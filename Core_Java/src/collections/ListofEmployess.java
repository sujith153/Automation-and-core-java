package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListofEmployess {

	String name;
	int id;
	double salary;
	String country;

	ListofEmployess(String name, int id, double salary, String country) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.country = country;
	}

	void display() {
		System.out.println(id + "\t" + name + "\t" + country + "\t" + salary);
	}

	public static void main(String[] args) throws Exception{
		
		ListofEmployess f[] = new ListofEmployess[6];
		f[0] = new ListofEmployess("Sujith", 321, 32432, "India");
		f[1] = new ListofEmployess("Sujith", 321, 32432, "India");
		f[2] = new ListofEmployess("Sujith", 321, 32432, "India");
		f[3] = new ListofEmployess("Sujith", 321, 32432, "India");
		f[4] = new ListofEmployess("Sujith", 321, 32432, "India");
		f[5] = new ListofEmployess("Sujith", 321, 32432, "India");
		for (int i = 0; i < f.length; i++) {
			f[i].display();
		}
		List<Object[]> employees = new ArrayList<>();

        // Adding employees to the list
        employees.add(new Object[]{"Modi", 101, 55555.55, "India"});
        employees.add(new Object[]{"Bieden", 102, 66666.66, "USA"});

        // Printing the list of employees
        for (Object[] employee : employees) {
            System.out.println(Arrays.toString(employee));
        }
		
	}

}
