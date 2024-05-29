package dto.mapper;

import dto.UserDto;
import entities.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserMapper {
    public User toEntity(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setSummary(userDto.getBio());
        user.setUsername(userDto.getNickname());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setBirthdate(LocalDate.from(userDto.getBirthDate().atStartOfDay()));
        return user;
    }
}
