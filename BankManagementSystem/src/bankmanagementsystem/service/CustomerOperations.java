package bankmanagementsystem.service;

import java.util.Scanner;

import bankmanagementsystem.dao.CustomerDAO;
import bankmanagementsystem.dao.EmployeeDAO;
import bankmanagementsystem.model.Customer;

public class CustomerOperations extends Customer{

	

	Scanner sc = new Scanner(System.in);
	private char ch = 'y';
	Customer cus = new Customer();
	CustomerDAO custdao = new CustomerDAO();
	EmployeeDAO empdao = new EmployeeDAO();
	
	public CustomerOperations(String customerName) {
       this.setCustomerName(customerName);
	}
	
	

	public void customerOptions() {
		
		  while(ch == 'y') {
		    System.out.println("hello " + getCustomerName());
		    System.out.println("\n");
			System.out.println("please select below option to perform");
			System.out.println("1. to do general enquiry");
			System.out.println("2. to view your balance");
			System.out.println("3. to deposit money");
			System.out.println("4.to withdraw money");
			System.out.println("5.to open account");
			System.out.println("6.to close account");
			System.out.println("7. to barrow loan");
			System.out.println("8. to pay EMI's");
			System.out.println("9.apply for online banking");
			System.out.println("10.logout");
    			System.out.println("=======================================");
    			int option = sc.nextInt();
    			System.out.println("\n");
    			
    			switch(option) {
    			
    			case 1: 
    				System.out.println("=======================================");
    				System.out.println("Welcome to demo bank");
    				System.out.println("our bank is the best bank in the worls");
    				System.out.println("our bank offers best interest rates for loans");
    				System.out.println("our bank offers zero balance accounts for students");
    				System.out.println("=======================================");
    				System.out.println("\n");
    				
    				break;
    			case 2: 
    				System.out.println("=======================================");
    				System.out.println("enter your account number to view balance");
    				sc.nextLine();
    				Customer cusByAc = empdao.getCustomerByAc(sc.nextLine());
    				System.out.println("Balance =" + cusByAc.getAccountbalance());
    				System.out.println("=======================================");
    				System.out.println("\n");
    				
    				break;
    				
    			case 3:
    				System.out.println("=======================================");
    				System.out.println("enter your account number to deposit amount");
    				sc.nextLine();
    				Customer cusByAc1 = custdao.getCustomerByAc(sc.nextLine());
    				System.out.println("enter amount to deposit");
    				custdao.depositAmount(sc.nextFloat());
    				System.out.println("=======================================");
    				
    				System.out.println("\n");
    				break;
    				
    			case 4 :
    				System.out.println("=======================================");
    				System.out.println("enter your account number to withdraw amount");
    				sc.nextLine();
    				Customer cusByAc2 = custdao.getCustomerByAc(sc.nextLine());
    				System.out.println("enter amount to withdraw");
    				custdao.withdrawAmount(sc.nextFloat());
    				System.out.println("=======================================");	
    				System.out.println("\n");
    				break;
    				
    			case 5 :
    				System.out.println("=======================================");
    				System.out.println("open account");
    				System.out.println("=======================================");
    				System.out.println("=======================================");
    				System.out.println("\n");
    				break;
    				
    			case 6 :
    				System.out.println("=======================================");
    				System.out.println("close account");
    				System.out.println("=======================================");
                   	System.out.println("\n");
    				break;
    			case 7 :
    				System.out.println("=======================================");
    				System.out.println("borrow loan");
    				System.out.println("=======================================");
    			
    				System.out.println("\n");
    				
    				break;
    			case 8 :
    				System.out.println("=======================================");
    				System.out.println("pay EMI's");
    				System.out.println("=======================================");
    			
    				System.out.println("\n");
    				
    				break;
    			case 9 :
    				System.out.println("=======================================");
    				System.out.println("apply for online NETbanking");
    				System.out.println("=======================================");
    			
    				System.out.println("\n");
    				
    				break;
    			case 10 :
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
	
