package com.source.SpringHIbernate.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.source.SpringHIbernate.entity.TestTable;

@Repository("testTableDao")
public class TestTableDAOImpl implements TestTableDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void addPerson(TestTable testTable) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().save(testTable);
		
	}

	@Transactional
	public void deletePerson(Integer personId) {
		// TODO Auto-generated method stub
		TestTable t = (TestTable)this.sessionFactory.getCurrentSession().load(TestTable.class, personId);
		
		if (t != null) {
			this.sessionFactory.getCurrentSession().delete(t);
		}
	}

}
