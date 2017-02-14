package com.project.app;

import java.sql.SQLException;

import com.project.service.Products;

public class App 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Products ap = new Products();
//		ap.createProductTable();
		ap.insert();
//		ap.viewProducts();
//		ap.deleteProduct();
		
		
	} 
}
