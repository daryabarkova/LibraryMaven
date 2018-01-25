package library.action.console;

import java.util.List;

import library.action.BaseAction;
import library.bean.Book;
import library.dao.BookDao;
import library.dao.file.simple.SimpleBookDaoImpl;

public class HelloWorldConsoleImpl implements BaseAction{
	
	private BookDao dao = new SimpleBookDaoImpl();

	@Override
	public void doSmth() {
		List <Book> books = dao.readAll();
		
		for (Book book : books){
			System.out.println(book);
		}
		
	}

}
