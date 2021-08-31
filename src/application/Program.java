package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Digite a ID do funcionário:");
		int id = sc.nextInt();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===Teste 2: Seller findByDepartment ====");
		
		System.out.println("Digite o número do Departamento:");
		int idDep = sc.nextInt();
		Department department = new Department(idDep, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for (Seller obj : list ) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

}
