package icehs.science.chapter10;

public class IPhone extends Mobile{
	private String color;
	public IPhone() {
		super("IPhone");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
		System.out.println("IPhone : " + color);
	}
	
}
