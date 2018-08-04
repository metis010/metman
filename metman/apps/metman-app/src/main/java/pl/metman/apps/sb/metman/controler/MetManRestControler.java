package pl.metman.apps.sb.metman.controler;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pl.metman.modules.authorization.logic.AuthorizationService;

@RestController
public class MetManRestControler {
	
	@Autowired
	private AuthorizationService auth;
	
	@Autowired
	private Environment environment;
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", defaultValue = "mr nobody") String name) {
		
		Iterator<PropertySource<?>> iterator = ((AbstractEnvironment)environment).getPropertySources().iterator();
		while(iterator.hasNext()) {
			PropertySource propertySource = (PropertySource) iterator.next();
			if (propertySource instanceof MapPropertySource) {
				((MapPropertySource)propertySource).getSource().entrySet().stream().filter(e -> e.getKey().startsWith("metman")).forEach(entry -> System.out.println(entry.getKey()+": " + entry.getValue()));
			}
		}
		return auth.hellow(name);
	}
}
