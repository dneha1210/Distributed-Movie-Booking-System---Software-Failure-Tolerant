package Replica1.movieTicketBookingSystem.user;

import Replica1.util.db.MovieTicketBookingDB;

import java.rmi.RemoteException;

public class Customer extends User {
    public Customer(MovieTicketBookingDB db, String hostname, String portNum) throws RemoteException {
        super(db,hostname,portNum);
        // TODO Auto-generated constructor stub
    }
}
