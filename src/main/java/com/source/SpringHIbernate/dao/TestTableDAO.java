package com.source.SpringHIbernate.dao;

import com.source.SpringHIbernate.entity.TestTable;

public interface TestTableDAO {
	public void addPerson(TestTable testTable);
	public void deletePerson(Integer personId);
}
