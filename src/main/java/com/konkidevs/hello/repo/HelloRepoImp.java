package com.konkidevs.hello.repo;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepoImp implements HelloRepo {

	@Override
	public String getGretting(String name) {
		return String.format("Hello %s!", name);
	}
	
}
