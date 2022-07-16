package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findByID(3);
		System.out.println(seller);

		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 3: seller findAll ===");
		list = sellerDao.findAll();

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== TEST 4: seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());

		System.out.println("\n=== TEST 5: seller update ===");
		seller = sellerDao.findByID(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");

		System.out.println("\n=== TEST 6: seller delete ===");
		System.out.print("Enter id for delete test: ");
		sellerDao.deleteByID(Integer.valueOf(input.nextLine()));
		System.out.println("Delete completed!");
		
		input.close();
		
	}
}
