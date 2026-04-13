package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Books");
		System.out.println(dp);
		
		Seller seller = new Seller(1,"Alex", "alex@gmail.com", new Date(), 2000.00, dp);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(seller);
	}

}
