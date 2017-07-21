/**
 * 
 */
package com.rutvikpatel.ms.webclient;

import java.util.List;

/**
 * @author RutvikPatel
 *
 */
public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}
