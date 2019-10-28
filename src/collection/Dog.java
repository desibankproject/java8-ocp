package collection;

/**
 * Dog class used for set and map
 */
public class Dog implements Comparable<Dog>{

	private String name;
	private String color;
	private int price;
	
	public Dog(){}
	
	public Dog(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	@Override
	public int compareTo(Dog o) {
		int p=0;
		if(name!=null){
			p=name.compareTo(o.name);//sorting name ascending
		}
		if(p==0 && color!=null){//if names are same then sorting 
			//descending as per color 
			p=o.name.compareTo(color);
		}
		return p;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", color=" + color + ", price=" + price
				+ "]";
	}
	
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	



	
	
	

}
