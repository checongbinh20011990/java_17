package com.cybersoft.movie_clix.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "quocgia")
public class QuocGia {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "ten_quocgia")
	private String ten_quocgia;
	
	@OneToMany(mappedBy = "quocGia")
	private Set<Phim> phims;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTen_quocgia() {
		return ten_quocgia;
	}
	public void setTen_quocgia(String ten_quocgia) {
		this.ten_quocgia = ten_quocgia;
	}
	
	
}
