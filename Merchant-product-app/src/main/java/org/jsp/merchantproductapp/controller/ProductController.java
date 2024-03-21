package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dao.ProductDao;
import org.jsp.merchantproductapp.dto.Merchant;
import org.jsp.merchantproductapp.dto.Product;

public class ProductController {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.Save Product");
		System.out.println("2. Update Product");
		System.out.println("3.");
		System.out.println("4. ");
		System.out.println("5. ");
		System.out.println("6. To Break");
		int expression = sc.nextInt();
		switch (expression)
		{
		case 1:
			System.out.println("Enter the Merchant Id");
			int merchant_id = sc.nextInt();
			System.out.println("Enter the Brand , Category , Cost , Description of the product ");
			Product product = new Product();
			
			product.setBrand(sc.next());
			product.setCategory(sc.next());
			product.setCost(sc.nextDouble());
			product.setDescription(sc.next());
			ProductDao products = new ProductDao();
			products.saveProduct(product,merchant_id);
			
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		default:
		}
		}
	}
}
