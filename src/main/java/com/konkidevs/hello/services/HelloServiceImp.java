package com.konkidevs.hello.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.konkidevs.hello.repo.HelloRepo;

@Service
public class HelloServiceImp implements HelloService {
	
	@Autowired
	private HelloRepo helloRepo;

	@Override
	public String sayHello(String name) {
		return helloRepo.getGretting(name != null && !name.isEmpty() ? name : "tú");
	}
	
}
