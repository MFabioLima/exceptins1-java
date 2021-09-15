package model.estidades;

import java.text.SimpleDateFormat;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {

	private Integer roomNumbre;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservas(Integer roomNumbre, Date checkIn, Date checkOut) {
		this.roomNumbre = roomNumbre;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public Integer getRoomNumbre() {
		return roomNumbre;
	}
	public void setRoomNumbre(Integer roomNumbre) {
		this.roomNumbre = roomNumbre;
	}
	public Date getCheckIn() {
		return checkIn;
	}
 
	public Date getCheckOut() {
		return checkOut;
	}
 
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updareDatas(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public String toString() {
	     return "Room  " + roomNumbre 
	    		+ ", check-in: "
	    		+ sdf.format(checkIn)
	    		+  " , check-out: "
	    		+ sdf.format(checkOut)
	    		+ " , "
	    		+ duration()
	    		+ "  nights";
	} 
	
}
