package dev.mhr.entity;

import java.io.Serializable;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Teacher implements Serializable {

	private Long id;

	// Validationを追加
	@NotBlank
	@Size(max = 60)
	private String userName;

	// Validationを追加
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;

}