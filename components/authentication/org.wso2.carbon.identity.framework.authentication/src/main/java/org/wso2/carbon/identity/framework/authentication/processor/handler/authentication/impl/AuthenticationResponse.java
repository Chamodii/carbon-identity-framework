package org.wso2.carbon.identity.framework.authentication.processor.handler.authentication.impl;


import org.wso2.carbon.identity.gateway.response.IdentityResponse;

public enum AuthenticationResponse {
    AUTHENTICATED,
    INCOMPLETE;

    private IdentityResponse.IdentityResponseBuilder identityResponseBuilder;

    public IdentityResponse.IdentityResponseBuilder getIdentityResponseBuilder() {
        return identityResponseBuilder;
    }

    public AuthenticationResponse setIdentityResponseBuilder(
            IdentityResponse.IdentityResponseBuilder identityResponseBuilder) {
        this.identityResponseBuilder = identityResponseBuilder;
        return this;
    }
}
