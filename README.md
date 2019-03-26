# scalyr

Scalyr API
- API version: 1.0.0
  - Build date: 2019-03-26T23:26:10.462+08:00[Asia/Hong_Kong]

You can use the Scalyr API to send and retrieve log data directly from Scalyr servers, as well as manage configuration files. It is usually most convenient to use the Scalyr Agent to send log files, and to view logs on the web site.





## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.scalyr</groupId>
  <artifactId>scalyr</artifactId>
  <version>0.1.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.scalyr:scalyr:0.1.2"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/scalyr-0.1.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import Scalyr.*;
import Scalyr.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScalyrApi;

import java.io.File;
import java.util.*;

public class ScalyrApiExample {

    public static void main(String[] args) {
        
        ScalyrApi apiInstance = new ScalyrApi();
        UsersToGroup usersToGroupRequest = new UsersToGroup(); // UsersToGroup | Users that need to be added to the group
        try {
            UpdateUsers result = apiInstance.addUserToGroup(usersToGroupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScalyrApi#addUserToGroup");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.scalyr.com/api*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ScalyrApi* | [**addUserToGroup**](docs/ScalyrApi.md#addUserToGroup) | **POST** /addUsersToGroup | This method adds one or more users to a group.


## Documentation for Models

 - [UpdateUsers](docs/UpdateUsers.md)
 - [UsersToGroup](docs/UsersToGroup.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



