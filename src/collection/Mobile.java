package collection;

public class Mobile implements Comparable<Mobile>{
	private String color;
	private String vendor;
	private int price;
	
	public Mobile(String vendor,int price,String color) {
		this.color = color;
		this.vendor = vendor;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [color=" + color + ", vendor=" + vendor + ", price=" + price
				+ "]";
	}

	@Override
	public int compareTo(Mobile o) {
			int p=vendor.compareTo( o.getVendor());
			return p;
	}
}
