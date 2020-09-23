// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.implementation;

import com.azure.communication.administration.models.CommunicationIdentity;
import com.azure.communication.administration.models.CommunicationIdentityToken;
import com.azure.communication.administration.models.CommunicationIdentityUpdateRequest;
import com.azure.communication.administration.models.CommunicationTokenRequest;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in CommunicationIdentitys. */
public final class CommunicationIdentityImpl {
    /** The proxy service used to perform REST calls. */
    private final CommunicationIdentityService service;

    /** The service client containing this operation class. */
    private final CommunicationIdentityClientImpl client;

    /**
     * Initializes an instance of CommunicationIdentityImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    CommunicationIdentityImpl(CommunicationIdentityClientImpl client) {
        this.service = RestProxy.create(CommunicationIdentityService.class, client.getHttpPipeline());
        this.client = client;
    }

    /**
     * The interface defining all the services for CommunicationIdentityClientCommunicationIdentitys to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{endpoint}")
    @ServiceInterface(name = "CommunicationIdentity")
    private interface CommunicationIdentityService {
        @Post("/identities")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<CommunicationIdentity>> create(
                @HostParam("endpoint") String endpoint, @QueryParam("api-version") String apiVersion, Context context);

        @Delete("/identities/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Patch("/identities/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> update(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/merge-patch+json") CommunicationIdentityUpdateRequest body,
                Context context);

        @Post("/identities/{id}/token")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<CommunicationIdentityToken>> issueToken(
                @HostParam("endpoint") String endpoint,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") CommunicationTokenRequest body,
                Context context);
    }

    /**
     * Create a new identity.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentity>> createWithResponseAsync() {
        return FluxUtil.withContext(
                context -> service.create(this.client.getEndpoint(), this.client.getApiVersion(), context));
    }

    /**
     * Create a new identity.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentity>> createWithResponseAsync(Context context) {
        return service.create(this.client.getEndpoint(), this.client.getApiVersion(), context);
    }

    /**
     * Create a new identity.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentity> createAsync() {
        return createWithResponseAsync()
                .flatMap(
                        (Response<CommunicationIdentity> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a new identity.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentity> createAsync(Context context) {
        return createWithResponseAsync(context)
                .flatMap(
                        (Response<CommunicationIdentity> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a new identity.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentity create() {
        return createAsync().block();
    }

    /**
     * Create a new identity.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a communication identity.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentity create(Context context) {
        return createAsync(context).block();
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id) {
        return FluxUtil.withContext(
                context -> service.delete(this.client.getEndpoint(), id, this.client.getApiVersion(), context));
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id, Context context) {
        return service.delete(this.client.getEndpoint(), id, this.client.getApiVersion(), context);
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String id) {
        return deleteWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String id, Context context) {
        return deleteWithResponseAsync(id, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String id) {
        deleteAsync(id).block();
    }

    /**
     * Delete the identity, revoke all tokens of the identity and delete all associated data.
     *
     * @param id Identifier of the identity to be deleted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String id, Context context) {
        deleteAsync(id, context).block();
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String id, CommunicationIdentityUpdateRequest body) {
        return FluxUtil.withContext(
                context -> service.update(this.client.getEndpoint(), id, this.client.getApiVersion(), body, context));
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(
            String id, CommunicationIdentityUpdateRequest body, Context context) {
        return service.update(this.client.getEndpoint(), id, this.client.getApiVersion(), body, context);
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String id, CommunicationIdentityUpdateRequest body) {
        return updateWithResponseAsync(id, body).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> updateAsync(String id, CommunicationIdentityUpdateRequest body, Context context) {
        return updateWithResponseAsync(id, body, context).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String id, CommunicationIdentityUpdateRequest body) {
        updateAsync(id, body).block();
    }

    /**
     * Update an Identity.
     *
     * @param id Identifier of the identity.
     * @param body The properties of the identity to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void update(String id, CommunicationIdentityUpdateRequest body, Context context) {
        updateAsync(id, body, context).block();
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityToken>> issueTokenWithResponseAsync(
            String id, CommunicationTokenRequest body) {
        return FluxUtil.withContext(
                context ->
                        service.issueToken(this.client.getEndpoint(), id, this.client.getApiVersion(), body, context));
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CommunicationIdentityToken>> issueTokenWithResponseAsync(
            String id, CommunicationTokenRequest body, Context context) {
        return service.issueToken(this.client.getEndpoint(), id, this.client.getApiVersion(), body, context);
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityToken> issueTokenAsync(String id, CommunicationTokenRequest body) {
        return issueTokenWithResponseAsync(id, body)
                .flatMap(
                        (Response<CommunicationIdentityToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CommunicationIdentityToken> issueTokenAsync(
            String id, CommunicationTokenRequest body, Context context) {
        return issueTokenWithResponseAsync(id, body, context)
                .flatMap(
                        (Response<CommunicationIdentityToken> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentityToken issueToken(String id, CommunicationTokenRequest body) {
        return issueTokenAsync(id, body).block();
    }

    /**
     * Generate a new token for an identity.
     *
     * @param id Identifier of the identity to issue token for.
     * @param body Requesting scopes for the new token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CommunicationIdentityToken issueToken(String id, CommunicationTokenRequest body, Context context) {
        return issueTokenAsync(id, body, context).block();
    }
}