package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public ProductRepository() {
		//상품 만들거 여기다 넣기
		Product phone = new Product("P1234", "iPhone XS", 1500000);
		phone.setDescription("아주조흔 핸트폰 예에에에에에 딩니폰 기종이다");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("new");
		phone.setFilename("P1234.PNG");	//이미지 파일 이름을 상품아이로 해야함
		//이런식으로 추가
		listOfProducts.add(phone);
	}
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	public Product getProductById(String productId) {
		Product productById = null;
		
		for(int i = 0; i < listOfProducts.size(); i ++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	public static ProductRepository getInstance() {
		return instance;
	}
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
