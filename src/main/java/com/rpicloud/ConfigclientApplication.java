package com.rpicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
	/*SQLExec sqlExec=new SQLExec();
	sqlExec.setUserid("user");
	sqlExec.setPassword("passowrd");
	sqlExec.setUrl("jdbc:mysql://localhost:3306/dbname");
	sqlExec.setDriver("com.mysql.jdbc.Driver");
	sqlExec.setProject(new Project());
	sqlExec.setSrc(new File("c:/test.sql"));
	sqlExec.execute();*/

}