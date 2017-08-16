# FactionWarfareApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFwStats**](FactionWarfareApi.md#getFwStats) | **GET** /fw/stats/ | An overview of statistics about factions involved in faction warfare
[**getFwWars**](FactionWarfareApi.md#getFwWars) | **GET** /fw/wars/ | Data about which NPC factions are at war


<a name="getFwStats"></a>
# **getFwStats**
> List&lt;GetFwStats200Ok&gt; getFwStats(datasource, userAgent, xUserAgent)

An overview of statistics about factions involved in faction warfare

Statistical overviews of factions involved in faction warfare  --- Alternate route: &#x60;/v1/fw/stats/&#x60;  Alternate route: &#x60;/legacy/fw/stats/&#x60;  Alternate route: &#x60;/dev/fw/stats/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetFwStats200Ok> result = apiInstance.getFwStats(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwStats");
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

[**List&lt;GetFwStats200Ok&gt;**](GetFwStats200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwWars"></a>
# **getFwWars**
> List&lt;GetFwWars200Ok&gt; getFwWars(datasource, userAgent, xUserAgent)

Data about which NPC factions are at war

Data about which NPC factions are at war  --- Alternate route: &#x60;/v1/fw/wars/&#x60;  Alternate route: &#x60;/legacy/fw/wars/&#x60;  Alternate route: &#x60;/dev/fw/wars/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetFwWars200Ok> result = apiInstance.getFwWars(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwWars");
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

[**List&lt;GetFwWars200Ok&gt;**](GetFwWars200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

