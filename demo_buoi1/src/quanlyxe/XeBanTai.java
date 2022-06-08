package quanlyxe;

public class XeBanTai extends Xe implements ActionCuaImp{
	
	@Override
	public void moCua() {
		System.out.println("Mở bằng cách kéo cửa");
		
	}
	
	@Override
	public void lanBanh() {
		// TODO Auto-generated method stub
		super.lanBanh();
		System.out.println("Xe bán tải đang lăn bánh");
		
	}
	
}

