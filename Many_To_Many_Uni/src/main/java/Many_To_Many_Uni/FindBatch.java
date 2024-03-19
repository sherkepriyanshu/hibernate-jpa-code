package Many_To_Many_Uni;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindBatch {

	public static void main(String[] args) {
		String name=new Scanner(System.in).next(); 
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");

		EntityManager manager = factory.createEntityManager();
		
		Batch b = manager.find(Batch.class,name);
				
				
				
				
				
				
				
				
			
		System.out.println(b.getStudents());
	}
}
