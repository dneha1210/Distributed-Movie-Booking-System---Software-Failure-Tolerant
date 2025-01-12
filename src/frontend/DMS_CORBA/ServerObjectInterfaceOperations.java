package frontend.DMS_CORBA;


/**
* DMS_CORBA/ServerObjectInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ServerObjectInterface.idl
* Monday, April 3, 2023 4:13:55 o'clock PM EDT
*/

public interface ServerObjectInterfaceOperations 
{
  String addMovieSlots (String movieID, String movieName, int bookingCapacity);
  String removeMovieSlots (String movieID, String movieName);
  String listMovieShowsAvailability (String movieName);
  String bookMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets);
  String getBookingSchedule (String customerID);
  String cancelMovieTickets (String customerID, String movieID, String movieName, int numberOfTickets);
  String exchangeTickets (String customerID, String movieID, String newMovieID, String oldMovieName, String movieName, int numberOfTickets);
} // interface ServerObjectInterfaceOperations
