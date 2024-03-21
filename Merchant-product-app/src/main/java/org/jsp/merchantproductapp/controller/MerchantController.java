package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dto.Merchant;

public class MerchantController {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("1.Save Merchant");
		System.out.println("2. Update Merchant");
		System.out.println("3. Find Merchant By Id");
		System.out.println("4. Verfiy Merchant by phone and password");
		System.out.println("5. Verfiy Merchant by email and password");
		System.out.println("6. To Break");
		int expression = sc.nextInt();
		switch (expression)
		{
		case 1:
			Merchant m = new Merchant();
			m.setName(sc.next());
			m.setPhone(sc.nextLong());
			m.setEmail(sc.next());
			m.setPassword(sc.next());
			
			
			MerchantDao m1 = new MerchantDao();
			m1.saveMerchant(m);
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
