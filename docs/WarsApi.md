# WarsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWars**](WarsApi.md#getWars) | **GET** /wars/ | List wars
[**getWarsWarId**](WarsApi.md#getWarsWarId) | **GET** /wars/{war_id}/ | Get war information
[**getWarsWarIdKillmails**](WarsApi.md#getWarsWarIdKillmails) | **GET** /wars/{war_id}/killmails/ | List kills for a war


<a name="getWars"></a>
# **getWars**
> List&lt;Integer&gt; getWars(datasource, maxWarId, userAgent, xUserAgent)

List wars

Return a list of wars  ---  Alternate route: &#x60;/v1/wars/&#x60;  Alternate route: &#x60;/legacy/wars/&#x60;  Alternate route: &#x60;/dev/wars/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.WarsApi;


WarsApi apiInstance = new WarsApi();
String datasource = "tranquility"; // String | The server name you would like data from
Integer maxWarId = 56; // Integer | Only return wars with ID smaller than this.
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getWars(datasource, maxWarId, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarsApi#getWars");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **maxWarId** | **Integer**| Only return wars with ID smaller than this. | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarsWarId"></a>
# **getWarsWarId**
> GetWarsWarIdOk getWarsWarId(warId, datasource, userAgent, xUserAgent)

Get war information

Return details about a war  ---  Alternate route: &#x60;/v1/wars/{war_id}/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.WarsApi;


WarsApi apiInstance = new WarsApi();
Integer warId = 56; // Integer | ID for a war
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetWarsWarIdOk result = apiInstance.getWarsWarId(warId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarsApi#getWarsWarId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warId** | **Integer**| ID for a war |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetWarsWarIdOk**](GetWarsWarIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarsWarIdKillmails"></a>
# **getWarsWarIdKillmails**
> List&lt;GetWarsWarIdKillmails200Ok&gt; getWarsWarIdKillmails(warId, datasource, page, userAgent, xUserAgent)

List kills for a war

Return a list of kills related to a war  ---  Alternate route: &#x60;/v1/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/killmails/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.WarsApi;


WarsApi apiInstance = new WarsApi();
Integer warId = 56; // Integer | A valid war ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page to query, starting at 1
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetWarsWarIdKillmails200Ok> result = apiInstance.getWarsWarIdKillmails(warId, datasource, page, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarsApi#getWarsWarIdKillmails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **warId** | **Integer**| A valid war ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| Which page to query, starting at 1 | [optional] [default to 1]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetWarsWarIdKillmails200Ok&gt;**](GetWarsWarIdKillmails200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

