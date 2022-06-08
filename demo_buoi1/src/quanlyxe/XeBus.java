package quanlyxe;

public class XeBus extends Xe implements ActionCuaImp {
	private String nguoiSoatVe;

	@Override
	public void moCua() {
		System.out.println("Mở hai cửa");
	}
	
	public String getNguoiSoatVe() {
		return nguoiSoatVe;
	}

	public void setNguoiSoatVe(String nguoiSoatVe) {
		this.nguoiSoatVe = nguoiSoatVe;
	}
	
	
}
