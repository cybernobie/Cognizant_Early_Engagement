package com.cts.service;

public class BillingException extends Exception {
    public BillingException() {
        super();
    }

    public BillingException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public BillingException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }

    public BillingException(String arg0) {
        super(arg0);
    }

    public BillingException(Throwable arg0) {
        super(arg0);
    }
}
