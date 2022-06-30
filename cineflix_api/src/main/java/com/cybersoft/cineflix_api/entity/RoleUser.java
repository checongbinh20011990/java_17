package com.cybersoft.cineflix_api.entity;

import java.util.Set;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;

@Entity(name = "role_user")
@IdClass(RoleUserId.class)
public class RoleUser {
	
	@Id
	private long role_id;
	
	@Id
	private long user_id;

	public long getRole_id() {
		return role_id;
	}

	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	
	
	
//	@EmbeddedId
//	private RoleUserId id;
//
//	public RoleUserId getId() {
//		return id;
//	}
//
//	public void setId(RoleUserId id) {
//		this.id = id;
//	}
	
	
}
