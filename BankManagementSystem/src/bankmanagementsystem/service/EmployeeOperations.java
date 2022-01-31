package bankmanagementsystem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankmanagementsystem.dao.CustomerDAO;
import bankmanagementsystem.dao.EmployeeDAO;
import bankmanagementsystem.model.Customer;
import bankmanagementsystem.model.Employee;

public class EmployeeOperations extends Employee{
	private char ch = 'y';
	Scanner sc = new Scanner(System.in);
	CustomerDAO custdao = new CustomerDAO();
	EmployeeDAO empdao = new EmployeeDAO();
	Customer cus = new Customer();
	List<Customer> cusList = new ArrayList<Customer>();
	public EmployeeOperations(String employeename) {
	
		this.setEmployeeName(employeename);
	}

	public void EmployeeOperations() {
		while(ch == 'y') {
		System.out.println("hello " + getEmployeeName());
		System.out.println("\n");
		System.out.println("please select below option to perform");
		System.out.println("1. to collect money");
		System.out.println("2. to open account");
		System.out.println("3.to close account");
		System.out.println("4.to provide information");
		System.out.println("5.to collect EMI");
		System.out.println("6. to loan request");
		System.out.println("7. logout");
		System.out.println("=======================================");
		int option = sc.nextInt();
		System.out.println("\n");
		
		switch(option) {
		
		case 1: 
			System.out.println("=======================================");
			System.out.println("please give money");
			System.out.println("=======================================");
			System.out.println("\n");
			
			break;
		case 2: 
			System.out.println("=======================================");
			System.out.println("open account");
			System.out.println("please enter customer Id");
		     cus.setCustomerId(sc.nextInt());
		     System.out.println("please enter customer name");
		     sc.nextLine();
		     cus.setCustomerName(sc.nextLine());
		     System.out.println("please enter customer address");
		     
		     cus.setCustomerAddress(sc.nextLine());
		     System.out.println("please create new customer account number");
		   
		     cus.setCustomerAcNo(sc.nextLine());
		     System.out.println("please enter account balance");
		     cus.setAccountbalance(sc.nextFloat());
		     System.out.println("please enter customer phone number");
		     cus.setCustomerPhn(sc.nextDouble());
		     empdao.addCustomer(cus);
		     cusList.add(cus);
		   
			System.out.println("=======================================");
			System.out.println("\n");
			
			break;
			
		case 3:
			System.out.println("=======================================");
			System.out.println("close account");
			System.out.println("enter account number to close");
			System.out.println("=======================================");
			Customer cusByAc = empdao.getCustomerByAc(sc.nextLine());
			cusList.remove(cusByAc);
			
			System.out.println("\n");
			break;
			
		case 4 :
			System.out.println("=======================================");
			System.out.println("provide information");
			System.out.println("Welcome to mouritech bank");
			System.out.println("our bank is the best bank in the worls");
			System.out.println("our bank offers best interest rates for loans");
			System.out.println("our bank offers zero balance accounts for students");
			
			System.out.println("\n");
			break;
			
		case 5 :
			System.out.println("=======================================");
			System.out.println("collect EMI's");
			System.out.println("=======================================");
			System.out.println("=======================================");
			System.out.println("\n");
			break;
			
		case 6 :
			System.out.println("=======================================");
			System.out.println("loan request");
			System.out.println("=======================================");
           	System.out.println("\n");
			break;

		case 7 :
			System.out.println("=======================================");
			System.out.println("thank you for using our services");
		    this.ch = 'E';
			MainMenu menu = new MainMenu();
			menu.loginDetails();
			menu.validate();
			System.out.println("\n");
			
			break;
			
			
			default:
				System.out.println("invalid option enter again");
				break;
		
		}
	
          }
		
	}
}