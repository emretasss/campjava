package week2;


public class ClassesWithAttributes {
	public static void main(String[] args) {
		Product product = new Product();
		product.set_id(212);
		product.setName("lenovo laptop");
		product.setPrice(12000);
		product.setStockAmount(3);
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

	}
}
