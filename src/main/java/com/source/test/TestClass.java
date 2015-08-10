package com.source.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.source.SpringHIbernate.bo.TestTableBO;
import com.source.SpringHIbernate.entity.TestTable;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("./resources/beanlocation.xml");
		TestTableBO testTableDao = (TestTableBO)context.getBean("TestTableBO");
		
		TestTable testTable = new TestTable( );
		testTable.setId(7);
		testTable.setFirstName("Cathy");
		testTable.setLastName("Smith");
		testTable.setAge(20);
		testTable.setDept("Electronics");
		
		testTableDao.addPerson(testTable);
		
		testTableDao.deletePerson(6);
		
	}

}
