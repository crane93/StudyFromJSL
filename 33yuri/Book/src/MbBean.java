// 데이터베이스에 있는 테이블 정보를 한꺼번에 가지고 오기
// 테이블을 객체화
public class MbBean {
	private String mb_name;
	private String mb_num;
	private String mb_phone;
	private String mb_addr;
	
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	public String getMb_num() {
		return mb_num;
	}
	public void setMb_num(String mb_num) {
		this.mb_num = mb_num;
	}
	public String getMb_phone() {
		return mb_phone;
	}
	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}
	public String getMb_addr() {
		return mb_addr;
	}
	public void setMb_addr(String mb_addr) {
		this.mb_addr = mb_addr;
	}
	
}
