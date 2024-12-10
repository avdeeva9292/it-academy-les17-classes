package by.it_academy.clas.main10;

import java.util.ArrayList;
import java.util.List;



public class Main {

	public static void main(String[] args) {
		List<Airline> airline = new ArrayList<Airline>();

		airline.add(new Airline ("Москва", 456, 15.22, "суббота"));
		airline.add(new Airline("Пекин", 642, 11.15, "понедельник"));
		airline.add(new Airline ("Дубай", 589, 07.52, "среда"));
		airline.add(new Airline("Казань", 934, 10.43, "пятница"));
		airline.add(new Airline("Варшава", 741, 16.24, "суббота"));

	
		for (int i = 0; i < airline.size(); i++) {
			Airline ai = airline.get(i);
			String message = "Пункт назначения="+ai.getDestination() + ", номер рейса="+ai.getFlightNumber()+", время вылета="+ai.getFlightTime()+", День недели="+ai.getDayOfTheWeek();
			System.out.println(i + " - " + message);
		}

	
AirlineList airlineList = new AirlineList();

airlineList.add(new Airline("Москва", 456, 15.20, "вторник"));
airlineList.add(new Airline("Пекин", 642, 11.15, "понедельник"));
airlineList.add(new Airline ("Дубай", 589, 07.52, "среда"));
airlineList.add(new Airline ("Казань", 934, 10.43, "пятница"));
airlineList.add(new Airline ("Варшава", 741, 16.24, "суббота"));

Airline airlines = airlineList.findByDestination("Дубай");


if (airlines != null) {
	System.out.println("-------------------Airline--------------------------");
	System.out.println("Airline: пункт назнаяения: " + airlines.getDestination());
	System.out.println("\t номер рейса: " + airlines.getFlightNumber());
	System.out.println("\t время вылета: " + airlines.getFlightTime());
	System.out.println("\t день недели: " + airlines.getDayOfTheWeek());
	System.out.println("-------------------------------------------------");
} else {
	System.out.println("Рейс с данными параметрами не найден");
}

System.out.println(); 


Airline airlines2 = airlineList.findByDayOfTheWeek("среда");

if (airlines2 != null) {
	System.out.println("-------------------Airline--------------------------");
	System.out.println("Airline: пункт назнаяения: " + airlines2.getDestination());
	System.out.println("\t номер рейса: " + airlines2.getFlightNumber());
	System.out.println("\t время вылета: " + airlines2.getFlightTime());
	System.out.println("\t день недели: " + airlines2.getDayOfTheWeek());
	System.out.println("-------------------------------------------------");
} else {
	System.out.println("Рейс с данными параметрами не найден");
}

System.out.println(); 


Airline airlines3 = airlineList.findByDayOfTheWeekForTime("суббота", 15.30);
if (airlines3 != null) {
	System.out.println("-------------------Airline--------------------------");
	System.out.println("Airline: пункт назнаяения: " + airlines3.getDestination());
	System.out.println("\t номер рейса: " + airlines3.getFlightNumber());
	System.out.println("\t время вылета: " + airlines3.getFlightTime());
	System.out.println("\t день недели: " + airlines3.getDayOfTheWeek());
	System.out.println("-------------------------------------------------");
} else {
	System.out.println("Рейс с данными параметрами не найден");
}

System.out.println(); 

}

}

		


	
