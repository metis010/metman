package pl.metman.modules.authorization.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationRepoImpl implements AuthorizationRepo {

	@Value("${spring.datasource.url}") 
	private String dbURL;
	
	@Value("${spring.datasource.username}")
	private String user;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	@Autowired
	private TestRepo test;
	
	@Override
	public void printProperties() {
		System.out.println(dbURL);
		System.out.println(user);
		System.out.println(password);
		List<TestEntity> findAll = test.findAll();
		findAll.stream().forEach(t -> System.out.println(t.toString()));
	}
}
