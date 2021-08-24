package com.jdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
@Component("edao")
public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;
    @Autowired
	public EmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);	}
	public int saveEmployee(Employee e) {
		String query = "insert into employee values('" + e.getId() + "','" + e.getName() + "','" + e.getSalary() + "')";
		return jdbcTemplate.update(query);		}
	public int updateEmployee(Employee e) {
		String query = "update employee set name='" + e.getName() + "',salary='" + e.getSalary() + "' where id='"
				+ e.getId() + "' ";
		return jdbcTemplate.update(query);		}
	public int deleteEmployee(Employee e) {
		String query = "delete from employee where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}	
	
	public List<Employee> getAllEmployees(){
		return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>(){
		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> list=new ArrayList<Employee>();
		while(rs.next()){
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setSalary(rs.getInt(3));
		list.add(e);	}
		return list;
		}});  
		}
	
}