package io.pivotal.pal.tracker.users;

import io.pivotal.pal.tracker.users.data.UserDataGateway;
import io.pivotal.pal.tracker.users.data.UserRecord;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 780449
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserDataGateway gateway;

	/**
	 *
	 * @param gateway
	 */
	public UserController(UserDataGateway gateway) {
        this.gateway = gateway;
    }

	/**
	 *
	 * @param userId
	 * @return
	 */
	@GetMapping("/{userId}")
    public UserInfo show(@PathVariable long userId) {
        UserRecord record = gateway.find(userId);

        if (record == null) {
            return null;
        }

        return new UserInfo(record.id, record.name, "user info");
    }
}
