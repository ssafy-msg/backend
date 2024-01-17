package com.ssafy.msg.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	private String emailId;
	private String emailPassword;
	private String nickname;
	private String provider;
	private String role;
	private String identifier;
	private String refreshToken;
	private String signInTime;
	private String signUpTime;
}
