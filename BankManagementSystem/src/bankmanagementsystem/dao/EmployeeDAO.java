package bankmanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import bankmanagementsystem.model.Customer;
import bankmanagementsystem.utils.DBConnection;

public class EmployeeDAO {

	Customer cus = new Customer();
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	Scanner sc = new Scanner(System.in);


	public EmployeeDAO(){
		conn = DBConnection.getDBConnection();
	}
	
	public Customer  addCustomer(Customer cust) {
		
		try {
			pstmt = conn.prepareStatement("insert into customerlist values(?,?,?,?,?,?);");
			pstmt.setInt(1, cust.getCustomerId());
			pstmt.setString(2, cust.getCustomerName());
			pstmt.setString(3, cust.getCustomerAddress());
			pstmt.setString(4, cust.getCustomerAcNo());
			pstmt.setFloat(5, cust.getAccountbalance());
			pstmt.setDouble(6, cust.getCustomerPhn());
			int i = pstmt.executeUpdate();
			if(i!=0) {
				System.out.println("Inserted");
			}else {
				System.out.println("Not Inserted");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return cust;
		
	}

	public Customer getCustomerByAc(String accountnumber) {
		Customer cus = new Customer();
		try {
			pstmt = conn.prepareStatement("select * from customerlist where customerAcNo = ?");
			pstmt.setString(1, accountnumber);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				
				cus.setCustomerId(rs.getInt("customerid"));
				cus.setCustomerName(rs.getString("customername"));
				cus.setCustomerAddress(rs.getString("customerAddress"));
				cus.setCustomerAcNo(rs.getString("customerAcNo"));
				cus.setAccountbalance(rs.getFloat("accountbalance"));
				cus.setCustomerPhn(rs.getDouble("customerPhn"));
				
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return cus;
	}
}