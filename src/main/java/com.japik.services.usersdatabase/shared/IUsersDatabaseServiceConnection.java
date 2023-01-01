package com.japik.services.usersdatabase.shared;

import com.japik.service.IServiceConnection;

import java.rmi.RemoteException;

public interface IUsersDatabaseServiceConnection extends IServiceConnection {
    IUsersCollection getUsersCollection() throws RemoteException;
}
