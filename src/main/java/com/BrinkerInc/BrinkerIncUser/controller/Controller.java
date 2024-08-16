package com.BrinkerInc.BrinkerIncUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BrinkerInc.BrinkerIncUser.dto.UserDto;
import com.BrinkerInc.BrinkerIncUser.service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/adduser")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto dto){
		
		UserDto user = service.addUser(dto);
		
		
		return new ResponseEntity<>(user,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getuserbyid/{id}")
	public ResponseEntity<UserDto> getById(@PathVariable Integer id){
		
		return service.findUserById(id);
	}
	
	@GetMapping("/getallusers")
	public ResponseEntity<List<UserDto>> getById(){
		
		return new ResponseEntity<>(service.getAllUsers(),HttpStatus.OK);
	}

}
