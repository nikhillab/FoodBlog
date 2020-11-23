package com.foodzz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RecipeDescription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int time;
	private String process;
	private String summary;
	private int serves;

	public RecipeDescription() {
	}
	

	public RecipeDescription(int time, String process, String summary, int serves) {
		this.time = time;
		this.process = process;
		this.summary = summary;
		this.serves = serves;
	}


	public static RecipeDescription recipeDescription() {
		RecipeDescription description = new RecipeDescription();
		description.setTime(45);
		description.setSummary("Serves 3 to 4 At least 5 hours and up to overnight");
		description.setProcess("1. \n"
				+ "Combine the paprika, black pepper, garlic powder, oregano, and cayenne in a small bowl and mix thoroughly with a fork. \n"
				+ " \n" + "2. \n"
				+ "Whisk the buttermilk, egg, 1 tablespoon salt, and 2 tablespoons of the spice mixture in a large bowl. Add the chicken pieces and toss and turn to coat. Transfer the contents"
				+ " of the bowl to a gallon-sized zipper-lock freezer bag and refrigerate for at least 4 hours,"
				+ " and up to overnight, flipping the bag occasionally to redistribute the contents and coat the chicken evenly."
				+ "3. \n"
				+ "Whisk together the flour, cornstarch, baking powder, 2 teaspoons salt, and the remaining spice mixture in a large bowl. Add 3 tablespoons of the marinade from the"
				+ " zipper-lock bag and work it into the flour with your fingertips. Remove one piece of chicken from the bag, allowing excess buttermilk to drip off, drop the chicken"
				+ " into the flour mixture, and toss to coat. Continue adding chicken pieces to the flour mixture one at a time until they are all in the bowl. Toss the chicken until "
				+ "every piece is thoroughly coated, pressing with your hands to get the flour to adhere in a thick layer.Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui. Suspendisse potenti. Vestibulum ac pellentesque tortor. Aenean congue sed metus in iaculis. Cras a tortor enim. Phasellus posuere vestibulum ipsum, eget lobortis purus. Orci varius natoque penatibus et magni. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum nec varius dui. Suspendisse potenti. Vestibulum ac pellentesque tortor. Aenean congue sed metus in iaculis. Cras a tortor enim. Phasellus posuere vestibulum ipsum, eget lobortis purus. Orci varius natoque penatibus et magni Combine the paprika, black pepper, garlic powder, oregano, and cayenne in a small bowl and mix thoroughly with a fork. 2. Whisk the buttermilk, egg, 1 tablespoon salt, and 2 tablespoons of the spice mixture in a large bowl. Add the chicken pieces and toss and turn to coat. Transfer the contents of the bowl to a gallon-sized zipper-lock freezer bag and refrigerate for at least 4 hours, and up to overnight, flipping the bag occasionally to redistribute the contents and coat the chicken evenly.3. Whisk together the flour, cornstarch, baking powder, 2 teaspoons salt, and the remaining spice mixture in a large bowl. Add 3 tablespoons of the marinade from the zipper-lock bag and work it into the flour with your fingertips. Remove one piece of chicken from the bag, allowing excess buttermilk to drip off, drop the chicken into the flour mixture, and toss to coat. Continue adding chicken pieces to the flour mixture one at a time until they are all in the bowl. Toss the chicken until every piece is thoroughly coated, pressing with your hands to get the flour to adhere in a thick layer., summary=Serves 3 to 4 At least 5 hours and up to overnight].");
		description.setServes(5);
		return description;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getServes() {
		return serves;
	}

	public void setServes(int serves) {
		this.serves = serves;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return String.format("RecipeDescription [time=%s, process=%s, summary=%s, serves=%s]", time, process, summary,
				serves);
	}

}
