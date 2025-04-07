package com.lerning.joblisting.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lerning.joblisting.bean.Post;
import com.lerning.joblisting.bean.PostRepo;

import springfox.documentation.annotations.ApiIgnore;

@RestController
public class PostController {
	
	@Autowired
	private PostRepo postRepo;
	
	
//	public PostController(PostRepo postRepo) {
//		this.postRepo=postRepo;
//	}
	
	@ApiIgnore
	@RequestMapping("/")
	public void redirect(HttpServletResponse response) {
		try {
			response.sendRedirect("/swagger-ui.html");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@GetMapping("/allPost")
	public List<Post> getAllPosts(){
		
		
		return postRepo.findAll();
	}
	
	@GetMapping("/allPost")
	public List<Post> getAllPosts2(){
		
		
		return postRepo.findAll();
	}
	
	@GetMapping("/getByExp/{exp}")
	public Optional<Post> getByExp(@PathVariable String exp){
		
		
		return Optional.ofNullable(postRepo.findByExp(exp));
	}
	
	@PostMapping("/addPost")
	public Post addPost(@RequestBody Post post) {
		postRepo.save(post);
		return post;
		
	}
	

}
