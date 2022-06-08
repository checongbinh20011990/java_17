package com.cybersoft.movie_clix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name = "loaiphim_phim")
public class LoaiPhimPhim {
	
	@Id
	@GeneratedValue
	private long id;
	
//	@Column(name = "id_phim")
//	private long id_phim;
	
	@ManyToOne
	@JoinColumn(name = "id_phim")
	private Phim phim;
	
	@ManyToOne(targetEntity = LoaiPhim.class)
	@JoinColumn(name = "id_loaiphim")
	private LoaiPhim loaiPhim1;
	
//	@Column(name = "id_loaiphim")
//	private int id_loaiphim;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	public LoaiPhim getLoaiPhim() {
		return loaiPhim1;
	}

	public void setLoaiPhim(LoaiPhim loaiPhim) {
		this.loaiPhim1 = loaiPhim;
	}

//	public long getId_phim() {
//		return id_phim;
//	}
//
//	public void setId_phim(long id_phim) {
//		this.id_phim = id_phim;
//	}
//
//	public int getId_loaiphim() {
//		return id_loaiphim;
//	}
//
//	public void setId_loaiphim(int id_loaiphim) {
//		this.id_loaiphim = id_loaiphim;
//	}
	
	
	
	
}
