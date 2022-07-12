package com.japik.services.usersdatabase.shared;

import java.rmi.RemoteException;

public interface IUsersCollection {
    IUser prepareInsert(IUserInsert userInsert) throws RemoteException;

    IUser selectUserById(long id) throws RemoteException;
    IUser selectUserByUsername(String username) throws RemoteException;
}
