package com.cybersoft.movie_clix.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.SqlResultSetMapping;

@Entity

public class DTPhim {

	@Id
	private long id;
	
	private String ten_phim;
	private String hinh_anh;
	private Date ngay_tao;
	private String mo_ta;

	public String getTen_phim() {
		return ten_phim;
	}

	public void setTen_phim(String ten_phim) {
		this.ten_phim = ten_phim;
	}

	public String getHinh_anh() {
		return hinh_anh;
	}

	public void setHinh_anh(String hinh_anh) {
		this.hinh_anh = hinh_anh;
	}

	public Date getNgay_tao() {
		return ngay_tao;
	}

	public void setNgay_tao(Date ngay_tao) {
		this.ngay_tao = ngay_tao;
	}

	public String getMo_ta() {
		return mo_ta;
	}

	public void setMo_ta(String mo_ta) {
		this.mo_ta = mo_ta;
	}
	
	
}
