import java.util.LinkedList;


public class room {
	LinkedList<time> room_ll = new LinkedList<time>();
	String campus;
	String building;
	String roomNumber;
	LinkedList<String> freetimes = new LinkedList<String>();
	
	public room(String campus, String building, String roomNumber) {
		// TODO Auto-generated constructor stub
		//this.room_ll = new LinkedList<time>();
		this.campus=campus;
		this.building=building;
		this.roomNumber=roomNumber;
	}

}
