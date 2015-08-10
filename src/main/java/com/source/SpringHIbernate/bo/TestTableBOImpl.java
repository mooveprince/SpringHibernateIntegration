package com.source.SpringHIbernate.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.source.SpringHIbernate.dao.TestTableDAO;
import com.source.SpringHIbernate.entity.TestTable;

@Service("TestTableBO")
public class TestTableBOImpl implements TestTableBO{

	@Autowired
	TestTableDAO testTableDao;
	
	public void addPerson(TestTable testTable) {
		testTableDao.addPerson(testTable);
	}
	
	public void deletePerson(int id) {
		testTableDao.deletePerson(id);
	}
}
