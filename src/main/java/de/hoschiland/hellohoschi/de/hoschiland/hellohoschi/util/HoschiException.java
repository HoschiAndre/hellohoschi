package de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util;


import javax.ws.rs.core.Response.Status;

public class HoschiException extends RuntimeException {

    private final Status status;

    public HoschiException(Status status, String message) {
        super(message);
        this.status = status;
    }

    public Status getStatus() {return this.status;}

}
