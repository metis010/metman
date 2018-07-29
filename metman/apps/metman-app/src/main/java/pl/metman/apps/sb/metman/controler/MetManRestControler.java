package pl.metman.apps.sb.metman.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.metman.modules.authorization.logic.AuthorizationService;

@RestController
public class MetManRestControler {
	
	@Autowired
	private AuthorizationService auth;
	
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "mr nobody") String name) {
		return auth.hellow(name);
	}
}
