package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJdbc;
import model.dao.impl.SellerDaoJdbc;

public class DaoFactory {

	public static SellerDao createSellerDAO() {
		return new SellerDaoJdbc(DB.getConnection());
	}
	
	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJdbc(DB.getConnection());
	}
}
