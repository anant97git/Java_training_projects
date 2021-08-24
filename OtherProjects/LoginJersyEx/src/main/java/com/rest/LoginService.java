package com.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response; 
import java.sql.*;

@Path("/loginService")  
public class LoginService{  
    @POST  
    @Path("/logging")  
    public Response logUser(  
        @FormParam("empId") int empId,  
        @FormParam("empass") String empass) {

    	
    	try 
    	{
    		Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emailersystem", "root", "");
			Statement stmt = con.createStatement();
			String qry = "select * from emp where empId="+empId+" and empass='"+empass+"'";
			ResultSet rs = stmt.executeQuery(qry);
			
			System.out.println("hello");
			
			if (rs != null)
			{
				String name = "";
//				rs.last();
//				int rcount = rs.getRow();
				
				while(rs.next())
				{
					name = rs.getString(2);
				}
				
				if (name != null)
				{
					return Response.status(200)  
		    	            .entity(" Login  successful :- "+name)  
		    	            .build();
					
				}else 
				{
					return Response.status(404)  
		    	            .entity(" Login  unsuccessful ")  
		    	            .build();
				}
			}
			else
			{
				return Response.status(404)  
	    	            .entity(" Login  unsuccessful ")  
	    	            .build();
			}
    	}
    	catch(Exception e){
    		return Response.status(404)  
    	            .entity(" Login  unsuccessful ")  
    	            .build(); 
    	}
    }  
} 