package com.pluralcamp.classes;

public class Color {
	
	//atributos
	private int red;
	private int green;
	private int blue;
	
	//Constructores
	public Color() {}
	
	public Color(int red, int green, int blue) {
		this.setRed(red);
		this.setGreen(green);
		this.setBlue(blue);
	}

	
	//getters / setters
	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	
}
