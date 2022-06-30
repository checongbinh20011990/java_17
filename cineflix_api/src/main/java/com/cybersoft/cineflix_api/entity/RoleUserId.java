package com.cybersoft.cineflix_api.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/* class này chứa 2 khoá chính của bảng trung gian trong quan hệ nhiều nhiều */
//@Embeddable
public class RoleUserId implements Serializable{
	private long role_id;
	private long user_id;
	
	public RoleUserId(long roleid, long userid) {
		// TODO Auto-generated constructor stub
		this.role_id = role_id;
		this.user_id = user_id;
	}
}
