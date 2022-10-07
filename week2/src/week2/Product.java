package week2;

public class Product {
 private int _id;
 private  String name;
 private String desciription;
 private double price;
 private int stockAmount;
public int get_id()
{
return _id;	
}
public void set_id(int _id) {
	this._id = _id;
}
public String getDesciription() {
	return desciription;
}
public void setDesciription(String desciription) {
	this.desciription = desciription;
}
public int getStockAmount() {
	return stockAmount;
}
public void setStockAmount(int stockAmount) {
	this.stockAmount = stockAmount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
 
}
