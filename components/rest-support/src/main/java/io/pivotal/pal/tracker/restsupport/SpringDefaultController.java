package io.pivotal.pal.tracker.restsupport;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 780449
 */
@RestController
public class SpringDefaultController {

	/**
	 *
	 * @return
	 */
	@GetMapping("/")
    public String defaultRoute() {
        return "Noop!";
    }
}
