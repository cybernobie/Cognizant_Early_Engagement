package com.cts.bank.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.cts.bank.exception.AccountTransactionException;

// SUT (System Under Test)
public class AccountDAO {

	private DataSource ds; // Dependency to be mocked

	public AccountDAO(DataSource ds) {
		super();
		this.ds = ds;
	}

	// Method to be tested
	public boolean deposit(String accNo, double amount) throws AccountTransactionException {
		try {
			if (accNo == null || accNo.isEmpty()) {
				throw new AccountTransactionException("Invalid account number");
			}

			if (amount <= 0) {
				throw new AccountTransactionException("Invalid amount");
			}

			Connection con = ds.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE ACCOUNT SET balance = balance + ? WHERE accNo = ?");
			ps.setDouble(1, amount);
			ps.setString(2, accNo);
			int result = ps.executeUpdate();
			return result > 0;
		} catch (SQLException ex) {
			throw new AccountTransactionException(ex.getMessage());
		}
	}

}
