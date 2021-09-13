package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao SellerDao = DaoFactory.createSellerDao();

		System.out.println("\n===TEST 1: seller findByDepartment =======");
		Seller seller = SellerDao.findById(3);
		System.out.println(seller);

		System.out.println("\n===TEST 2: seller findByDepartment =======");
		Department department = new Department(2, null);
		List<Seller> list = SellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n===TEST 2: seller findAll =======");

		list = SellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n===TEST 4: seller insert =======");
		Seller newSeller = new Seller(null, "greg","greg@gmail.com", new Date(), 4000.0, department);
		SellerDao.insert(newSeller);
		System.out.println("Inserted! New id = "+newSeller.getId());
		
		System.out.println("\n===TEST 5: Owner insert =======");
		Seller newOwner = new Seller(null, "sid","sidnando@gmail.com", new Date(), 120000.0, department);
		SellerDao.insert(newOwner);
		System.out.println("Inserted! New id = "+newOwner.getId());
	}
}
