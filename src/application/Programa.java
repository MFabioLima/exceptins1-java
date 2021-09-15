package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.estidades.Reservas;

public class Programa {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Scanner sc = new  Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number");
		int number = sc.nextInt();
		System.out.print("Check-in Date (dd/MM/yyyy)");
		Date checkIn =sdf.parse(sc.next());
		
		System.out.print("Check-ou Date (dd/MM/yyyy)");
		Date checkOut =sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date be after check-im date");
		}
		else {
			Reservas Reservas = new Reservas(number, checkIn, checkOut);
			System.out.println("Reservayion: "+ Reservas);
			
			System.out.println();
			System.out.println("Entre data to updade the reservation: ");
			
			System.out.print("Check-in Date (dd/MM/yyyy)");
			checkIn =sdf.parse(sc.next());
			
			System.out.print("Check-ou Date (dd/MM/yyyy)");
			checkOut =sdf.parse(sc.next());
			
			Reservas.updareDatas(checkIn,checkOut);
			System.out.println("Reservayion: "+ Reservas);
		}
		
		sc.close();
	}

}
