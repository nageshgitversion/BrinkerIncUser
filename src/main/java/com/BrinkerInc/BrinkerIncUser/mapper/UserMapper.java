package com.BrinkerInc.BrinkerIncUser.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.BrinkerInc.BrinkerIncUser.dto.UserDto;
import com.BrinkerInc.BrinkerIncUser.entity.User;

@Mapper
public interface UserMapper {
	
	
UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

User mapUserDtoToUser(UserDto userDto);

UserDto mapUserToUserDto(User user);

}
