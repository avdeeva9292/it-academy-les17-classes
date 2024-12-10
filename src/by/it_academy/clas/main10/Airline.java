package by.it_academy.clas.main10;

import java.util.Objects;

public class Airline {
private String destination;
private int flightNumber;
private  double flightTime;
private String dayOfTheWeek;
 
public Airline() { }

public Airline(String destination, int flightNumber, double flightTime, String dayOfTheWeek) {
	this.destination = destination;
	this.flightNumber = flightNumber;
	this.flightTime = flightTime;
	this.dayOfTheWeek = dayOfTheWeek;
	}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getFlightNumber() {
	return flightNumber;
}

public void setFlightNumber(int flightNumber) {
	this.flightNumber = flightNumber;
}

public double getFlightTime() {
	return flightTime;
}

public void setFlightTime(double flightTime) {
	this.flightTime = flightTime;
}

public String getDayOfTheWeek() {
	return dayOfTheWeek;
}

@Override
public int hashCode() {
	return Objects.hash(dayOfTheWeek, destination, flightNumber, flightTime);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Airline other = (Airline) obj;
	return Objects.equals(dayOfTheWeek, other.dayOfTheWeek) && Objects.equals(destination, other.destination)
			&& flightNumber == other.flightNumber
			&& Double.doubleToLongBits(flightTime) == Double.doubleToLongBits(other.flightTime);
}

public void setDayOfTheWeek(String dayOfTheWeek) {
	this.dayOfTheWeek = dayOfTheWeek;
}

@Override
public String toString() {
	return "Airline [destination=" + destination + ", flightNumber=" + flightNumber + ", flightTime=" + flightTime
			+ ", dayOfTheWeek=" + dayOfTheWeek + "]";
}

}
