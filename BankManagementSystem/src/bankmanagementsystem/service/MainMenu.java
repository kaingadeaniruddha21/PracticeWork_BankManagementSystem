package bankmanagementsystem.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import bankmanagementsystem.model.Login;
import bankmanagementsystem.utils.DBConnection;

public class MainMenu {
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	Login log = new  Login();
	Scanner sc = new Scanner(System.in);
	public MainMenu() {
		conn = DBConnection.getDBConnection();
		
	}
	
	

	public void loginDetails() {
		
		System.out.println("\n" + "please enter your username");
		log.setUserName(sc.nextLine());
		System.out.println("please enter your password");
		String pw = sc.nextLine();
	    if(log.isValidPassword(pw)) {
		log.setPassWord(pw);
		}
	   
	}
	
	    public void validate() {
		String selectStmt = "select * from userlist where username = ? and userpassword = ?";
		 try {
			pstmt = conn.prepareStatement(selectStmt);
			pstmt.setString(1, log.getUserName());
			pstmt.setString(2, log.getPassWord());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString("userrole").equals("employee")) {
					EmployeeOperations eo = new EmployeeOperations(rs.getString("username"));
					eo.EmployeeOperations();
				}
					
				else {
				
					CustomerOperations co = new CustomerOperations(rs.getString("username"));
					co.customerOptions();
				}
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
}
}
	

