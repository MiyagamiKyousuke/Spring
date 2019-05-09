package com.example.demo.form;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

public class LoginFormBeans {
	//ログインID
	@Getter
	@Setter
	@NotBlank
	private String loginId;
	//パスワード
	@Getter
	@Setter
	@NotBlank
	private String loginPass;

	/*public boolean passCheck() {
			boolean flag = false;
		if(loginPass.equals(loginPass2)) {
			flag = true;
		}

		return flag;

	}*/

}
