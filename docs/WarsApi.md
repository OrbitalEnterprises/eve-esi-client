# WarsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWars**](WarsApi.md#getWars) | **GET** /wars/ | List wars
[**getWarsWarId**](WarsApi.md#getWarsWarId) | **GET** /wars/{war_id}/ | Get war information
[**getWarsWarIdKillmails**](WarsApi.md#getWarsWarIdKillmails) | **GET** /wars/{war_id}/killmails/ | List kills for a war


<a name="getWars"></a>
# **getWars**
> List&lt;Integer&gt; getWars(page, datasource)

List wars

Return a list of wars  ---  Alternate route: &#x60;/v1/wars/&#x60;  Alternate route: &#x60;/legacy/wars/&#x60;  Alternate route: &#x60;/dev/wars/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.WarsApi;


WarsApi apiInstance = new WarsApi();
Integer page = 1; // Integer | Which page to query, starting at 1, 2000 wars per page.
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<Integer> result = apiInstance.getWars(page, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarsApi#getWars");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Integer**| Which page to query, starting at 1, 2000 wars per page. | [optional] [default to 1]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarsWarId"></a>
# **getWarsWarId**
> GetWarsWarIdOk getWarsWarId(warId, datasource)

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
try {
    GetWarsWarIdOk result = apiInstance.getWarsWarId(warId, datasource);
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

### Return type

[**GetWarsWarIdOk**](GetWarsWarIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWarsWarIdKillmails"></a>
# **getWarsWarIdKillmails**
> List&lt;GetWarsWarIdKillmails200Ok&gt; getWarsWarIdKillmails(warId, page, datasource)

List kills for a war

Return a list of kills related to a war  ---  Alternate route: &#x60;/v1/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/legacy/wars/{war_id}/killmails/&#x60;  Alternate route: &#x60;/dev/wars/{war_id}/killmails/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.WarsApi;


WarsApi apiInstance = new WarsApi();
Integer warId = 56; // Integer | A valid war ID
Integer page = 1; // Integer | Which page to query, starting at 1, 2000 killmails per page.
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetWarsWarIdKillmails200Ok> result = apiInstance.getWarsWarIdKillmails(warId, page, datasource);
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
 **page** | **Integer**| Which page to query, starting at 1, 2000 killmails per page. | [optional] [default to 1]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetWarsWarIdKillmails200Ok&gt;**](GetWarsWarIdKillmails200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

