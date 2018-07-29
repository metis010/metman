package pl.metman.modules.authorization.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationBean implements AuthorizationService {

	private final String name;

	@Autowired
	public AuthorizationBean(@Value("${auth.name}") String name) {
		this.name = name;
		
	}
	
	@Override
	public String hellow(String guest) {
		return name+":Hellow from the other site " + guest;
	}
}
