package com.foodzz.entity;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Offers {
	private int height = 350;
	private String active;
	private String imageName;
	private String label;
	private String discription;

	public static List<Offers> getOfferList() {
		List<Offers> list = Arrays.asList(new Offers("active","p1.png", "First Offer", "Today only 50% off"),
				new Offers("","logo.PNG", "Second Offer", "Today only 50% off"),
				new Offers("","p2.jpg", "Third Offer", "Today only 50% off"),
				new Offers("","p1.png", "Fourth Offer", "Today only 50% off"),	
				new Offers("","p2.jpg", "Fifth Offer", "Today only 50% off")

);
		return list;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Offers() {
	}

	public Offers(String active, String imageName, String label, String discription) {
		this.active = active;
		this.imageName = imageName;
		this.label = label;
		this.discription = discription;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return String.format("Offers [height=%s, imageName=%s, label=%s, discription=%s]", height, imageName, label,
				discription);
	}

}
