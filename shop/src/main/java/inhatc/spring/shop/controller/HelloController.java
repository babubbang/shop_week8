package inhatc.spring.shop.controller;

import inhatc.spring.shop.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
public class HelloController {

    @GetMapping("/aa")
    public UserDto hello(){
        UserDto userDto = UserDto.builder().name("김길동").age(10).build();
        userDto.setAge(20);
        userDto.setName("홍길동");
        System.out.println("userDto :" + userDto);
        return userDto;
    }
}
