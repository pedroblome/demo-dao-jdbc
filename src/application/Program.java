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

	}
}
