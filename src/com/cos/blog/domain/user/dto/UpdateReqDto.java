package com.cos.blog.domain.user.dto;

import lombok.Data;

@Data
public class UpdateReqDto {
	private String username;
	private String password;
	private String address;
}
