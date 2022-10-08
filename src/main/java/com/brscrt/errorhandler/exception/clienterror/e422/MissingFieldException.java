package com.brscrt.errorhandler.exception.clienterror.e422;

import com.brscrt.errorhandler.model.Error;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;

public final class MissingFieldException extends UnprocessableEntityException {

    private static final String REASON = "Missing Fields: %s";

    public MissingFieldException(@Nullable String referenceError, @NotNull String... attributes) {
        super(Error.builder()
                .reason(getReason(REASON, attributes))
                .referenceError(referenceError)
                .build());
    }
}
