package pl.metman.apps.sb.metman.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetManRestControler {
	@RequestMapping("/")
	public String index() {
		return "Cześć";
	}
}
