package com.jdbctemp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbctemp.model.emp2;

@Repository("emp2Dao") 
public class emp2Dao {
	    
    JdbcTemplate template;

	

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
    public List<emp2>getAllEmployees(){
    	List<emp2>employees=template.query("select * from emp2",new RowMapper(){
    		     public Object mapRow(ResultSet rs,int rowNum)throws SQLException{
    		    	 emp2 emp = new emp2();
			        	emp.setEid((rs.getInt("eid")));
			        	emp.setFirstname(rs.getString("firstname"));
			        	emp.setLastname(rs.getString("lastname"));
			        	emp.setAge((rs.getInt("age")));
			        	emp.setSalary((rs.getInt("salary")));
			        	emp.setDepartmentid(rs.getInt("departmentid"));
			        	
			            return emp;
			        }
			    });
    	return employees;
    	}
    }
    