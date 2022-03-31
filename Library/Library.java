import java.util.*;
class Library {
	String name;
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Book> books = new ArrayList<Book>();

	public Library(String name) {
		this.name = name;
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public boolean removeEmployee(int id) {
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getEmployeeId() == id) {
				employees.remove(i);
				return true;
			}
		}
		return false;
	}

	public int getNumberOfEmployees() {
		return employees.size();
	}

	public double getTotalSalary() {
		double total = 0;
		for (int i = 0; i < employees.size(); i++) {
			total += employees.get(i).getSalary();
		}
		return total;
	}

	public void addBook(Book book) {
		books.add(book);
		Collections.sort(books);
	}

	public void printInfoOfAllBooks() {
		for (int i = 0; i < this.books.size(); i++) {
			System.out.println("(id: " + this.books.get(i).getId() + ", name : " + this.books.get(i).getName() + ")");
		}
	}

	public int searchBookByName(String name) {
		int count = 0;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getName() == name)
				count++;
		}
		return count;
	}

	public int searchBookById(int id) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == id)
				return i;
		}
		return -1;
	}

	public Book borrowBook(int id) {
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			if (book.getId() == id) {
				books.remove(i);
				return book;
			}
		}
		return null;
	}

	public int returnBook(Book book) {
		books.add(book);
		Collections.sort(books);
		return book.getId();
	}

	public int getAmountOfBooks() {
		return books.size();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}