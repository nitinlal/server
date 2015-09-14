package chapter.one;

import java.util.ArrayList;
import java.util.List;

public class FilterApple {

	static List<Apple> filterHeavierGreenApples(List<Apple> apples) {
		List<Apple> heavierFilteredApples = new ArrayList<Apple>();
		for (Apple apple : apples) {
			if (apple.getWeight() > 150f
					|| apple.getColor().equalsIgnoreCase(
							Apple.Color.GREEN.toString())) {
				heavierFilteredApples.add(apple);
			}
		}
		return heavierFilteredApples;
	}

	public static void main(String args[]) {

		Apple one = new Apple();
		one.setColor("green").setWeight(165f);

		Apple two = new Apple();
		two.setColor("red").setWeight(149.6f);

		List<Apple> listTobeFiltered = new ArrayList<Apple>();
		listTobeFiltered.add(one);
		listTobeFiltered.add(two);

		System.out.println(filterHeavierGreenApples(listTobeFiltered)); //ugly way of filtering 
		
		/**
		 * enter pridicate
		 */
		
		
		

	}
}
