package io.pivotal.pal.tracker.accounts;

import io.pivotal.pal.tracker.accounts.data.AccountDataGateway;
import io.pivotal.pal.tracker.users.data.UserDataGateway;
import io.pivotal.pal.tracker.users.data.UserRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 780449
 */
@Service
public class RegistrationService {

    private final UserDataGateway userDataGateway;
    private final AccountDataGateway accountDataGateway;

	/**
	 *
	 * @param userDataGateway
	 * @param accountDataGateway
	 */
	public RegistrationService(UserDataGateway userDataGateway, AccountDataGateway accountDataGateway) {
        this.userDataGateway = userDataGateway;
        this.accountDataGateway = accountDataGateway;
    }

	/**
	 *
	 * @param name
	 * @return
	 */
	@Transactional
    public UserRecord createUserWithAccount(String name) {
        UserRecord user = userDataGateway.create(name);
        accountDataGateway.create(user.id, String.format("%s's account", name));
        return user;
    }
}
