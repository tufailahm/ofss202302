package com.resttraining;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employee")  
public class EmployeeController {
	
	@POST  	//create/insert
    @Path("/add") 		
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
    public Employee addUser(Employee employee) 
		{ 
        return employee;
		}
	
	@GET
	@Path("/getCustomerDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getDetails()
	{
		com.resttraining.Employee emp = new com.resttraining.Employee();
		emp.setEmployeeId(122);
		emp.setEmployeeName("Ahmed");
		emp.setSalary(340000);
		return emp;
	}
}
           
