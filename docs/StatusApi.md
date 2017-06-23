# StatusApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatus**](StatusApi.md#getStatus) | **GET** /status/ | Retrieve the uptime and player counts


<a name="getStatus"></a>
# **getStatus**
> GetStatusOk getStatus(datasource, userAgent, xUserAgent)

Retrieve the uptime and player counts

EVE Server status  ---  Alternate route: &#x60;/v1/status/&#x60;  Alternate route: &#x60;/legacy/status/&#x60;  Alternate route: &#x60;/dev/status/&#x60;   ---  This route is cached for up to 30 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.StatusApi;


StatusApi apiInstance = new StatusApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetStatusOk result = apiInstance.getStatus(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatusApi#getStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetStatusOk**](GetStatusOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

