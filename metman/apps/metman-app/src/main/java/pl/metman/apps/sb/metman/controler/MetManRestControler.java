package pl.metman.apps.sb.metman.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.metman.modules.authorization.logic.AuthorizationBean;
import pl.metman.modules.authorization.logic.AuthorizationService;

@RestController
public class MetManRestControler {
	
	private AuthorizationService auth;
	
	@Autowired
	@Qualifier("auth")
	public void setAuth() {
		auth = new AuthorizationBean("Tom");
	}
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "mr nobody") String name) {
		return auth.hellow(name);
	}
}
