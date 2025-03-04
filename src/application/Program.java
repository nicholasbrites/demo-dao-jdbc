package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		Department obj = new Department(1, "books");
		
		System.out.println(obj);
		
		Seller seller = new Seller(21, "bob", "bob@gmail", new Date(), 3000.00, obj);

		System.out.println(seller);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
	}

}
