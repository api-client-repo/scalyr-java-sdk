/*
 * Scalyr API
 * You can use the Scalyr API to send and retrieve log data directly from Scalyr servers, as well as manage configuration files. It is usually most convenient to use the Scalyr Agent to send log files, and to view logs on the web site.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import Scalyr.ApiException;
import org.openapitools.client.model.UpdateUsers;
import org.openapitools.client.model.UsersToGroup;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScalyrApi
 */
@Ignore
public class ScalyrApiTest {

    private final ScalyrApi api = new ScalyrApi();

    
    /**
     * This method adds one or more users to a group.
     *
     * This method adds one or more users to a group.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        UsersToGroup usersToGroupRequest = null;
        UpdateUsers response = api.addUserToGroup(usersToGroupRequest);

        // TODO: test validations
    }
    
}
