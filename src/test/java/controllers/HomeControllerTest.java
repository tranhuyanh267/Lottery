package controllers;


import org.junit.Assert;
import org.junit.Test;


public class HomeControllerTest {
	@Test
	public void shouldReturnIndexPage() {
		HomeController homeController = new HomeController();
		Assert.assertEquals("index", homeController.goHomePage());
	}

}
