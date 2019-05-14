package de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util;

import javax.ws.rs.core.Response.Status;

public class MissingHoschiException extends HoschiException {

    public MissingHoschiException(Hoschi hoschi) {
        super(Status.NOT_FOUND, "Hoschi has not been found with ID: " + hoschi.getNickName());
    }

    public MissingHoschiException(String nickName) {
      super(Status.NOT_FOUND, "Hoschi has not been found with ID: " + nickName);
    }

}
