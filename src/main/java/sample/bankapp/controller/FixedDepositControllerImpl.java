package sample.bankapp.controller;

import sample.bankapp.FixedDepositDetails;
import sample.bankapp.service.FixedDepositService;

public class FixedDepositControllerImpl implements FixedDepositController {
	private FixedDepositService fixedDepositService;
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#setFixedDepositService(sample.bankapp.FixedDepositServiceImpl)
	 */
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		this.fixedDepositService = fixedDepositService;
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#submit()
	 */
	public boolean submit(){
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(1, 10000, 365, "aaa@aaa.net"));
	}
	
	/* (non-Javadoc)
	 * @see sample.bankapp.FixedDepositController#get(long)
	 */
	public FixedDepositDetails get(long id){
		return fixedDepositService.getFixedDepositDetails(id);
	}
}
