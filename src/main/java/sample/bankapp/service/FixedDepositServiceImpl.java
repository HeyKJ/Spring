package sample.bankapp.service;

import sample.bankapp.FixedDepositDetails;
import sample.bankapp.dao.FixedDepositDao;

public class FixedDepositServiceImpl implements FixedDepositService {
	private FixedDepositDao fixedDepositDao;

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositService#createFixedDeposit(sample.bankapp.FixedDepositDetails)
	 */
	public boolean createFixedDeposit(FixedDepositDetails fdd){
		fixedDepositDao.createFixedDeposit(fdd);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositService#getFixedDepositDetails(long)
	 */
	public FixedDepositDetails getFixedDepositDetails(long id){
		return fixedDepositDao.getFixedDepositDetails(id);
	}
}
