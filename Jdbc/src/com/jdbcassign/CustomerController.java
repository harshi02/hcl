package com.jdbcassign;
import java.sql.Connection;
import java.util.Date;
import java.util.List;
import java.util.Optional;



public class CustomerController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = ConnectionFactory.getConnection();
		if (connection != null)
			System.out.println("sucess");

		CustomerDao dao = new CustomerDaoImplementation();

// get customer by id

		System.out.println(dao.getCustomerById(3));

// get selected customer

		List<Customer> customers = dao.getSelectedCustomer(500000);
		customers.forEach(c -> System.out.println(c));

	}

}