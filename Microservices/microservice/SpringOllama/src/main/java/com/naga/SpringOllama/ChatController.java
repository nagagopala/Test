package com.naga.SpringOllama;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
	
	@Autowired
	private ChatModel chatModel;
	
//	public ChatController(ChatModel chatModel) {
//		this.chatModel=chatModel;
//	}
	
	@GetMapping
	public String prompt(@RequestParam String m) {
		System.out.println("Received query "+m);
		String s= chatModel.call(m);
		System.out.println("Response sent "+s);
		return s;
	}

}
