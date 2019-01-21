package Show;

public class Seat {
	
	private String name;
	
	
	Seat(){
		name = null;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public void cancel() {
		name = null;		//취소하면 이름 지움
	}
	
	
	public void reserve(String name) {
		this.name = name;
	}
	
	
	
	public boolean isOccupied() {
		if(name == null)		//예약안되있음
			return false;
		else
			return true;
	}
	
	
	public boolean match(String name) {
		return (name.equals(this.name));
	}
	
	
}
