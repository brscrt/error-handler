package com.brscrt.errorhandler.exception.servererror.e501;

import com.brscrt.errorhandler.exception.ApiException;
import com.brscrt.errorhandler.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;

public class NotImplementedException extends ApiException {

    private static final String REASON = "Not Implemented";

    public NotImplementedException(@Nullable String referenceError) {
        super(HttpStatus.NOT_IMPLEMENTED, Error.builder()
                .reason(REASON)
                .referenceError(referenceError)
                .build());
    }

    protected NotImplementedException(@NotNull Error error) {
        super(HttpStatus.NOT_IMPLEMENTED, error);
    }
}
