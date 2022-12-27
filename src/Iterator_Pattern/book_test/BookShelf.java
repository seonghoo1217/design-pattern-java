package Iterator_Pattern.book_test;

import java.util.Iterator;

public class BookShelf implements Aggregate{
	private Book[] books; // 책의 집합
	private int last = 0; // 마지막 책이 꽂힌 위치

	public BookShelf(int size) {
		books = new Book[size];
	}

	public Book getBook(int index) {
		return books[index];
	}

	public int getLength() {
		return last;
	}

	// 책꽂이에 책을 꽂는다
	public void appendBook(Book book) {
		if (last < books.length) {
			this.books[last] = book;
			last++;
		} else {
			System.out.println("책꽂이가 꽉 찼습니다!");
		}
	}

	@Override
	public Iterator createIterator() {
		return new BookShelfIterator(this);
	}
}

