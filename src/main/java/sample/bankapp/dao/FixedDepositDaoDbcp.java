package sample.bankapp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import sample.bankapp.App;
import sample.bankapp.FixedDepositDetails;

public class FixedDepositDaoDbcp implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(App.class);
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	private DatabaseInfo databaseInfo;
	
	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}

	public FixedDepositDaoDbcp() {
		logger.info("FixedDepositDaoDbcp 객체 생성됨");
	}
	
	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}

	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

}
