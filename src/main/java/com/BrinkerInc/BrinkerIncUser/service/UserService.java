package com.BrinkerInc.BrinkerIncUser.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.BrinkerInc.BrinkerIncUser.dto.UserDto;
import com.BrinkerInc.BrinkerIncUser.entity.User;
import com.BrinkerInc.BrinkerIncUser.mapper.UserMapper;
import com.BrinkerInc.BrinkerIncUser.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	
	public UserDto addUser(UserDto dto) {
		
		User user = repo.save(UserMapper.INSTANCE.mapUserDtoToUser(dto));
		
		return UserMapper.INSTANCE.mapUserToUserDto(user);
		
	}
	
	
	public ResponseEntity<UserDto> findUserById(Integer id){
		
		Optional<User> byId = repo.findById(id);
		
		if(byId.isPresent()) {
			
			User user = byId.get();
			
			return new ResponseEntity<>(UserMapper.INSTANCE.mapUserToUserDto(user),HttpStatus.OK);
			
		}else {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	
	
	public List<UserDto> getAllUsers(){
		
		List<User> users = repo.findAll();
		
		List<UserDto> dto = users.stream().map(user->UserMapper.INSTANCE.mapUserToUserDto(user)).toList();
		
		return dto;
	}

}
