package de.hoschiland.hellohoschi.de.hoschiland.hellohoschi.util;

import org.wildfly.common.annotation.NotNull;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class HoschiExceptionMapper implements ExceptionMapper<HoschiException> {


    @Override
    public Response toResponse(@NotNull HoschiException exception) {
        return Response.status(exception.getStatus()).entity(exception.getMessage()).build();
    }
}


