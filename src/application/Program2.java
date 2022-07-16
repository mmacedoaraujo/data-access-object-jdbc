package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("------TEST 1 - delete method ------");
		departmentDao.deleteByID(7);
		System.out.println("Deleted successfully!");
		
		System.out.println("\n------TEST 2 - insert method ------");
		Department newDepartment = new Department(7, "Drinks");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n------TEST 3 - update method ------");
		newDepartment.setId(4);
		newDepartment.setName("Comics");
		departmentDao.update(newDepartment);
		System.out.println("Update completed!");
	}
}
