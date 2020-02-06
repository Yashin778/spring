package com.jdbctemp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdbctemp.dao.emp2Dao;
import com.jdbctemp.model.emp2;

@Service
public class emp2Service{
@Autowired
emp2Dao empDao;
public List<emp2>getALLEmployees(){
	return empDao.getAllEmployees();
	
}

}
