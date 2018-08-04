package pl.metman.modules.authorization.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import pl.metman.modules.authorization.repo.AuthorizationRepo;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

	private final String name;

	@Autowired
	private AuthorizationRepo repo;
	
	@Autowired
	public AuthorizationServiceImpl(@Value("${auth.name}") String name) {
		this.name = name;
		
	}
	
	@Override
	public String hellow(String guest) {
		repo.printProperties();
		return name+":Hellow from the other site " + guest;
	}
}
