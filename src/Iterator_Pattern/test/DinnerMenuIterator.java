package Iterator_Pattern.test;

import java.awt.*;

// DinnerMenu에서 사용할 수 있는 Iterator 클래스
public class DinnerMenuIterator implements Iterator
{
	MenuItem[] items;
	int position = 0;

	public DinnerMenuIterator(MenuItem[] items)
	{
		this.items = items;
	}
	public Object next()
	{
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
	public boolean hasNext()
	{
		if( position >= items.length || items[position]==null )
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}

// DinnerMenu식당에서 Iterator 사용하기
public class DinnerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	// 생성자

	// addItem 메소드 호출

	public Iterator createIterator()
	{
		return new DinnerMenuIterator(menuItems);
	}

	// 기타 메소드
}
