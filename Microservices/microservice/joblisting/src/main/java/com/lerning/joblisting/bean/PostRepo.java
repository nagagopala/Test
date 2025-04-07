package com.lerning.joblisting.bean;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String>{

	public Post  findByExp(String exp);
	
}
