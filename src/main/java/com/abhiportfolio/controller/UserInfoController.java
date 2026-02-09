package com.abhiportfolio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhiportfolio.Dto.UserInfoDto;
import com.abhiportfolio.Service.UserInfoService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/contacts")
@RequiredArgsConstructor
public class UserInfoController {

	private final UserInfoService userInfoService;

	@PostMapping("/create")
	public ResponseEntity<UserInfoDto> createUser(@Valid @RequestBody UserInfoDto userInfoDto) {
		UserInfoDto saved = userInfoService.createUser(userInfoDto);

		return ResponseEntity.ok(saved);
	}
}
