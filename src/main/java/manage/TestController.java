package manage;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import manage.token.User;

@RestController
public class TestController {

	private static final String template = "--> %s";

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/test")
	public Test greeting(@AuthenticationPrincipal User user) {
		
		return new Test(counter.incrementAndGet(),
				String.format(template, user.getName()));
	
	}

}
