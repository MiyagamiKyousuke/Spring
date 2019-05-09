package com.example.demo.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //getter,setterが使える
public class RegistConfirmForm {
	//名前
	@Getter
	@Setter
	@NotBlank
	@Size(min = 1, max = 20)
	private String name;
	//住所
	@Getter
	@Setter
	@NotBlank
	private String address;
	//ログインID
	@Getter
	@Setter
	@NotBlank
	@Length(min = 8)
	private String loginId;
	//パスワード
	@Getter
	@Setter
	@NotBlank
	@Length(min = 8)
	private String loginPass;
	//パスワード(確認用)
	@Getter
	@Setter
	@NotBlank
	@Length(min = 8)
	private String loginPass2;
}
