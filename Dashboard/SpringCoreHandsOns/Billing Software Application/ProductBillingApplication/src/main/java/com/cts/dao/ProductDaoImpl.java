package com.cts.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.bean.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	// wire dependency

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Product getProductDetails(int product_code) {
		// add your code here
		String query = "select * from product where product_code = ?";

//		return jdbcTemplate.queryForObject(query, new Object[] { product_code },
//				new BeanPropertyRowMapper<>(Product.class));

		// The below implementation using a 'custom RowMapper' is a better approach
		// compared to the above, as it's faster. ('Ctrl + Click' on =>
		// 'BeanPropertyRowMapper' and navigate to 'mapRow' method implementation
		// at the bottom, to understand why)

		return jdbcTemplate.queryForObject(query, new Object[] { product_code }, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Product(rs.getInt("product_code"), rs.getString("product_name"),
						rs.getString("product_category"), rs.getString("product_desc"), rs.getDouble("product_price"));
			}
		});

	}
}
