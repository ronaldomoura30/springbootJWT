package com.selecao.pitang.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selecao.pitang.model.UserModel;
import com.selecao.pitang.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("me")
	public List<UserModel> encontrarUsuario(@PathVariable("id") Long id, HttpServletResponse response) {
		
		return userRepository.findAll();
	}
	
	@PostMapping("signup")
	public UserModel adicionar(@Valid @RequestBody UserModel usuario) {
		return userRepository.save(usuario);
	}
	
	@PostMapping("signin")
	public UserModel verificar(@Valid @RequestBody UserModel usuario) {
		return userRepository.save(usuario);
	}
}
