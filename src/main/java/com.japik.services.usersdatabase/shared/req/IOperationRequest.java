package com.japik.services.usersdatabase.shared.req;

import com.japik.utils.RunnableThrow;

public interface IOperationRequest {
    boolean isResolved();
    IOperationRequest onResolve(RunnableThrow runnable);
}
