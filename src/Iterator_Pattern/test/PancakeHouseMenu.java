package Iterator_Pattern.test;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenu {
	ArrayList menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList();

		addItem("레큘러 팬케이크 세트",
				"달걀 후라이와 소시지가 곁들여진 팬케이크",
				true,
				2.99);

		addItem("블루베리 팬케이크",
				"신선한 블루베리와 블루베리 시럽으로 만든 팬케이크",
				true,
				3.49);
	}
	public void addItem(String name, String description,
						boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	public ArrayList getMenuItems()
	{
		return menuItems;
	}
}
