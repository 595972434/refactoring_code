package chapter01.ver02;

import chapter01.ver01.Customer;
import chapter01.ver01.Movie;
import chapter01.ver01.Rental;
import org.testng.annotations.Test;

public class CustomerTest {

	@Test
	public void statement() {
		Customer customer = new Customer("John");
		String title = "Titanic";
		int priceCode = 2;
		int _daysRented = 7;
		Movie movie = new Movie(title, priceCode);
		Rental rental = new Rental(movie, _daysRented);
		customer.addRental(rental);
		String result = customer.statement();
		System.out.println(result);
	}
}
