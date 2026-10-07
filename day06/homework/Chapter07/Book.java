package Chapter07;

public class Book {
	int price;
	Book(int price){
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [price=" + price + "]";
	}
}
