package com.ecom.AmShop;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import javax.sql.DataSource;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AmShopApplication.class)
class AmShopApplicationTests {

	@Autowired
	DataSource dataSource;

	@Test
	public void connectionTest() throws SQLException
	{
		String schema = dataSource.getConnection().getCatalog();
		assertEquals("amshop_db", schema);
	}

	@Test
	void contextLoads() {
	}

}
