package com.example.orm.hibernate_example;

import org.hibernate.Session;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
 
public class HibernateExampleApplication {

	public static void main(String[] args) {

		// Create a session
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			// Start a transaction
			session.beginTransaction();

			// 1. Create an Employee Object
			Employee employee = new Employee("Parth", 100000);

			// Save the employee object
			session.save(employee);

			// Commit the Transaction
			session.getTransaction().commit();

			// Get the employee ID after saving
			int empId = employee.getId();

			// Get a new session to fetch data
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();

			// 2. Retrieve employee based on the ID
			Employee retrievedEmployee = session.get(Employee.class, empId);

			// Output the retrieved employee details
			System.out.println("Retrieved Employee: " + retrievedEmployee.getName());

			// 3. Update employee
			retrievedEmployee.setSalary(50000000);
			session.getTransaction().commit();

			// 4. Delete the employee
			session = HibernateUtil.getSessionFactory().getCurrentSession();
			session.beginTransaction();
			session.delete(retrievedEmployee);
			session.getTransaction().commit();
		} finally {
			// HibernateUtil.getSessionFactory().close();
		}

		// SpringApplication.run(HibernateExampleApplication.class, args);
	}

}
