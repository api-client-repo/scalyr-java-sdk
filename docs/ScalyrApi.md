# ScalyrApi

All URIs are relative to *https://www.scalyr.com/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUserToGroup**](ScalyrApi.md#addUserToGroup) | **POST** /addUsersToGroup | This method adds one or more users to a group.


<a name="addUserToGroup"></a>
# **addUserToGroup**
> UpdateUsers addUserToGroup(usersToGroupRequest)

This method adds one or more users to a group.

This method adds one or more users to a group.

### Example
```java
// Import classes:
//import Scalyr.ApiException;
//import org.openapitools.client.api.ScalyrApi;


ScalyrApi apiInstance = new ScalyrApi();
UsersToGroup usersToGroupRequest = new UsersToGroup(); // UsersToGroup | Users that need to be added to the group
try {
    UpdateUsers result = apiInstance.addUserToGroup(usersToGroupRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ScalyrApi#addUserToGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usersToGroupRequest** | [**UsersToGroup**](UsersToGroup.md)| Users that need to be added to the group |

### Return type

[**UpdateUsers**](UpdateUsers.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

