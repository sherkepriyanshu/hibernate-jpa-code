package One_To_Many_Uni;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveEmployeeAndDepartment {

	
	public static void main(String[] args) {
		
		Department d = new Department();
		d.setName("development");
		d.setLocation("Hyderabad");
		
		
		Employee e1 = new Employee();
		e1.setName("Priyanshu");
		e1.setSalary(66666);
		e1.setDesg("developer");
		
		Employee e2 = new Employee();
		e2.setName("Himanshu");
		e2.setSalary(75000);
		e2.setDesg("Deputy Manager");
		
		Employee e3 = new Employee();
		e3.setName("Tushar");
		e3.setSalary(37500);
		e3.setDesg("Software Engineer");
		
		
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		
		
		d.setEmps(Arrays.asList(e1,e2,e3));
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		manager.persist(d);
		transaction.begin();
		transaction.commit();
		
	}
}
