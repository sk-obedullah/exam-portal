package com.examserver.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Role role;
}
