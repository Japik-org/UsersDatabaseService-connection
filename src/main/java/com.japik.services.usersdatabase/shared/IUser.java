package com.japik.services.usersdatabase.shared;

import com.japik.services.usersdatabase.shared.req.IFieldRequest;
import com.japik.services.usersdatabase.shared.req.IGetFieldRequest;
import com.japik.services.usersdatabase.shared.req.IOperationRequest;

public interface IUser {
    IGetFieldRequest<Long> reqId();
    IFieldRequest<String> reqUsername();
    IFieldRequest<String> reqEmail();

    IGetFieldRequest<Boolean> reqVerifyPassword(byte[] pass) throws Throwable;
    IOperationRequest reqSetPassword(byte[] pass) throws Throwable;

    /** Request all data in one request */
    void queryGet() throws Throwable;

    /** Save all changes in one request */
    void queryUpdate() throws Throwable;

    /** Create new user */
    void queryInsert() throws Throwable;
}
