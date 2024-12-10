package by.it_academy.clas.main10;

import java.util.ArrayList;
import java.util.List;


public class AirlineList {

	private List<Airline> airlines;

	public AirlineList() {
		airlines = new ArrayList<Airline>();
	}

	public boolean add(Airline ai) {
		return airlines.add(ai);
	}

	public boolean delete(int flightNumberAirline) {
		int deleteIndex = -1;
		for (int i = 0; i < airlines.size(); i++) {
			if (airlines.get(i).getFlightNumber() == flightNumberAirline) {
				deleteIndex = i;
				break;
			}
		}

		if (deleteIndex < 0) {
			return false;
		}

		airlines.remove(deleteIndex);
		return true;
	}

	public Airline findByDestination(String destinatoin) {

		for (int i = 0; i < airlines.size(); i++) {
			Airline ai = airlines.get(i);
			
			String destinationAirline = ai.getDestination();
			if (destinationAirline.contains(destinatoin)) {
				return ai;
			}
		}

		return null;
	}

	public Airline findByDayOfTheWeek(String dayOfTheWeek) {

		for (int i = 0; i < airlines.size(); i++) {
			Airline ai = airlines.get(i);
			
			String dayOfTheWeeknAirline = ai.getDayOfTheWeek();
			if (dayOfTheWeeknAirline.contains(dayOfTheWeek)) {
				return ai;
			}
		}

		return null;
	}
	public Airline findByDayOfTheWeekForTime(String dayOfTheWeek, double flightTime) {

		for (int i = 0; i < airlines.size(); i++) {
			Airline ai = airlines.get(i);
			double flightTimeAirline = ai.getFlightTime();
			String dayOfTheWeeknAirline = ai.getDayOfTheWeek();
			if (dayOfTheWeeknAirline.contains(dayOfTheWeek) && flightTimeAirline > flightTime) {
				return ai;
			}
		}

		return null;
	}


}



