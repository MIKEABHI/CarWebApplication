package com.javacode;

import com.Database.CarDetails;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// carDao class 
public class CarDao {
	//car details registration
	public int insertDetails(CarDetails cars) throws ClassNotFoundException {
		
		String queryInsert = "INSERT INTO cars( cname, model, color, brand, company, myear) VALUES ( ?, ?, ?, ?,?,?);";
		
		int status = 0;
		
		 try {
			    Connection con = Connector.getConnection();
		 	
	        	 PreparedStatement pstmt = con.prepareStatement(queryInsert);
                 pstmt.setString(1, cars.getCname());
                 pstmt.setString(2, cars.getModel());
                 pstmt.setString(3, cars.getColor());
                 pstmt.setString(4, cars.getBrand());
                 pstmt.setString(5, cars.getCompany());
                 pstmt.setString(6, cars.getMyear());
                 status = pstmt.executeUpdate();
		
		 } catch (SQLException e) {
			 printSQLException(e);
		 }
		       
	  return status;	
	}
	
	//show car records
	public ResultSet showDetail() throws ClassNotFoundException {
		
		String queryselect ="SELECT *FROM cars";
		
		try {
			
			 Connection con = Connector.getConnection();
			
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(queryselect);
			System.out.print("in show");
		  return rs;
		} catch (SQLException e) {
			printSQLException(e);
		}
		return null;	
	}
	
	//search car details
	public ResultSet searchCar(String cat , String search) throws ClassNotFoundException {
		
		String querysearch = null;
		
		 switch (cat) {
		case "myear":
			querysearch = "SELECT *FROM cars where myear like ?";
			System.out.println("into search");
			break;
		case "color":
			querysearch = "SELECT *FROM cars where color like ?";
			break;
		case "model":
			querysearch = "SELECT *FROM cars where model like ?";
			break;
		case "brand":
			querysearch = "SELECT *FROM cars where brand like ?";
			break;
		case "company":
			querysearch = "SELECT *FROM cars where company like ?";
			break;
		case "cname":
			querysearch = "SELECT *FROM cars where cname like ?";
			break;
		default:
			break;
		}
		try {

			 Connection con = Connector.getConnection();
			 PreparedStatement pstmt = con.prepareStatement(querysearch);
			 pstmt.setString(1,"%"+search+"%");
			 ResultSet rs1 = pstmt.executeQuery();
			return rs1;
		} catch (SQLException e) {
			printSQLException(e);
		}
		return null;
	}
	// Compare two Car Details
	public ResultSet[] compareCar(String cat , String search1, String search2) throws ClassNotFoundException {
		
		String querysearch = null;
		
		 switch (cat) {
			case "myear":
				querysearch = "SELECT *FROM cars where myear like ?";
				break;
			case "color":
				querysearch = "SELECT *FROM cars where color like ?";
				break;
			case "model":
				querysearch = "SELECT *FROM cars where model like ?";
				break;
			case "brand":
				querysearch = "SELECT *FROM cars where brand like ?";
				break;
			case "company":
				querysearch = "SELECT *FROM cars where company like ?";
				break;
			case "cname":
				querysearch = "SELECT *FROM cars where cname like ?";
				break;
			default:
				break;
			}
		
		try {
			ResultSet[] rs = new ResultSet[2] ;
			System.out.println(search1);
			System.out.println(search2);
			 Connection con = Connector.getConnection();
			 PreparedStatement pstmt = con.prepareStatement(querysearch);
			 pstmt.setString(1,"%"+search1+"%");
			 rs[0] = pstmt.executeQuery();
			 pstmt = con.prepareStatement(querysearch);
			 pstmt.setString(1,"%"+search2+"%");
			 rs[1]= pstmt.executeQuery();
			 return rs;
			
		} catch (SQLException e) {
			printSQLException(e);
		}
		
		return null;
	}
	
	  private void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
          }
}
	
