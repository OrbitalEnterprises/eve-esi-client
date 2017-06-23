# UserInterfaceApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUiAutopilotWaypoint**](UserInterfaceApi.md#postUiAutopilotWaypoint) | **POST** /ui/autopilot/waypoint/ | Set Autopilot Waypoint
[**postUiOpenwindowContract**](UserInterfaceApi.md#postUiOpenwindowContract) | **POST** /ui/openwindow/contract/ | Open Contract Window
[**postUiOpenwindowInformation**](UserInterfaceApi.md#postUiOpenwindowInformation) | **POST** /ui/openwindow/information/ | Open Information Window
[**postUiOpenwindowMarketdetails**](UserInterfaceApi.md#postUiOpenwindowMarketdetails) | **POST** /ui/openwindow/marketdetails/ | Open Market Details
[**postUiOpenwindowNewmail**](UserInterfaceApi.md#postUiOpenwindowNewmail) | **POST** /ui/openwindow/newmail/ | Open New Mail Window


<a name="postUiAutopilotWaypoint"></a>
# **postUiAutopilotWaypoint**
> postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token, userAgent, xUserAgent)

Set Autopilot Waypoint

Set a solar system as autopilot waypoint  ---  Alternate route: &#x60;/v2/ui/autopilot/waypoint/&#x60;  Alternate route: &#x60;/dev/ui/autopilot/waypoint/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Boolean addToBeginning = false; // Boolean | Whether this solar system should be added to the beginning of all waypoints
Boolean clearOtherWaypoints = false; // Boolean | Whether clean other waypoints beforing adding this one
Long destinationId = 789L; // Long | The destination to travel to, can be solar system, station or structure's id
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiAutopilotWaypoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addToBeginning** | **Boolean**| Whether this solar system should be added to the beginning of all waypoints | [default to false]
 **clearOtherWaypoints** | **Boolean**| Whether clean other waypoints beforing adding this one | [default to false]
 **destinationId** | **Long**| The destination to travel to, can be solar system, station or structure&#39;s id |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowContract"></a>
# **postUiOpenwindowContract**
> postUiOpenwindowContract(contractId, datasource, token, userAgent, xUserAgent)

Open Contract Window

Open the contract window inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/contract/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/contract/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer contractId = 56; // Integer | The contract to open
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.postUiOpenwindowContract(contractId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Integer**| The contract to open |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowInformation"></a>
# **postUiOpenwindowInformation**
> postUiOpenwindowInformation(targetId, datasource, token, userAgent, xUserAgent)

Open Information Window

Open the information window for a character, corporation or alliance inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/information/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/information/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/information/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer targetId = 56; // Integer | The target to open
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.postUiOpenwindowInformation(targetId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetId** | **Integer**| The target to open |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowMarketdetails"></a>
# **postUiOpenwindowMarketdetails**
> postUiOpenwindowMarketdetails(typeId, datasource, token, userAgent, xUserAgent)

Open Market Details

Open the market details window for a specific typeID inside the client  ---  Alternate route: &#x60;/v1/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/marketdetails/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/marketdetails/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer typeId = 56; // Integer | The item type to open in market window
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.postUiOpenwindowMarketdetails(typeId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowMarketdetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | **Integer**| The item type to open in market window |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postUiOpenwindowNewmail"></a>
# **postUiOpenwindowNewmail**
> postUiOpenwindowNewmail(newMail, datasource, token, userAgent, xUserAgent)

Open New Mail Window

Open the New Mail window, according to settings from the request if applicable  ---  Alternate route: &#x60;/v1/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/legacy/ui/openwindow/newmail/&#x60;  Alternate route: &#x60;/dev/ui/openwindow/newmail/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
PostUiOpenwindowNewmailNewMail newMail = new PostUiOpenwindowNewmailNewMail(); // PostUiOpenwindowNewmailNewMail | The details of mail to create
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.postUiOpenwindowNewmail(newMail, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowNewmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newMail** | [**PostUiOpenwindowNewmailNewMail**](PostUiOpenwindowNewmailNewMail.md)| The details of mail to create |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

