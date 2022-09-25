package com.japik.services.usersdatabase.shared;

import com.japik.utils.databasequery.req.*;

import java.rmi.RemoteException;

public interface IUser extends IQueryMaker {
    IGetFieldRequest<Object> reqId() throws RemoteException;
    IFieldRequest<String> reqUsername() throws RemoteException;
    IFieldRequest<String> reqEmail() throws RemoteException;

    IGetFieldRequest<Boolean> reqVerifyPassword(byte[] pass) throws RemoteException;
    IOperationRequest reqSetPassword(byte[] pass) throws RemoteException;

    /**
     * Request all data in one request
     * @throws UserNotFoundException
     * @throws DatabaseQueryException
     * @throws OnResolveQueryException
     */
    @Override
    void queryGet() throws RemoteException, UserNotFoundException, DatabaseQueryException, OnResolveQueryException;

    /**
     * Save all changes in one request
     * @throws UserNotFoundException
     * @throws DatabaseQueryException
     * @throws OnUpdateQueryException
     */
    @Override
    void queryUpdate() throws RemoteException, UserNotFoundException, DatabaseQueryException, OnUpdateQueryException;

    /**
     * Create new user
     * @throws UserAlreadyExistsException
     * @throws DatabaseQueryException
     */
    @Override
    void queryInsert() throws RemoteException, UserAlreadyExistsException, DatabaseQueryException;
}
