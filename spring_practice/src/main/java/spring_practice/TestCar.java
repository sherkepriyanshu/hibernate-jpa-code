package spring_practice;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
public class TestCar {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("Car.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Car c =(Car) factory.getBean("myCar", Car.class);
		c.Start();
		
		
	}
}
