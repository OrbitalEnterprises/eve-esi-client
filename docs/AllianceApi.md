# AllianceApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAlliances**](AllianceApi.md#getAlliances) | **GET** /v1/alliances/ | List all alliances
[**getAlliancesAllianceId**](AllianceApi.md#getAlliancesAllianceId) | **GET** /v3/alliances/{alliance_id}/ | Get alliance information
[**getAlliancesAllianceIdCorporations**](AllianceApi.md#getAlliancesAllianceIdCorporations) | **GET** /v1/alliances/{alliance_id}/corporations/ | List alliance&#39;s corporations
[**getAlliancesAllianceIdIcons**](AllianceApi.md#getAlliancesAllianceIdIcons) | **GET** /v1/alliances/{alliance_id}/icons/ | Get alliance icon


<a name="getAlliances"></a>
# **getAlliances**
> List&lt;Integer&gt; getAlliances(datasource, ifNoneMatch)

List all alliances

List all active player alliances  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.AllianceApi;


AllianceApi apiInstance = new AllianceApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    List<Integer> result = apiInstance.getAlliances(datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllianceApi#getAlliances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlliancesAllianceId"></a>
# **getAlliancesAllianceId**
> GetAlliancesAllianceIdOk getAlliancesAllianceId(allianceId, datasource, ifNoneMatch)

Get alliance information

Public information about an alliance  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.AllianceApi;


AllianceApi apiInstance = new AllianceApi();
Integer allianceId = 56; // Integer | An EVE alliance ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    GetAlliancesAllianceIdOk result = apiInstance.getAlliancesAllianceId(allianceId, datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllianceApi#getAlliancesAllianceId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **Integer**| An EVE alliance ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetAlliancesAllianceIdOk**](GetAlliancesAllianceIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlliancesAllianceIdCorporations"></a>
# **getAlliancesAllianceIdCorporations**
> List&lt;Integer&gt; getAlliancesAllianceIdCorporations(allianceId, datasource, ifNoneMatch)

List alliance&#39;s corporations

List all current member corporations of an alliance  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.AllianceApi;


AllianceApi apiInstance = new AllianceApi();
Integer allianceId = 56; // Integer | An EVE alliance ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    List<Integer> result = apiInstance.getAlliancesAllianceIdCorporations(allianceId, datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllianceApi#getAlliancesAllianceIdCorporations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **Integer**| An EVE alliance ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAlliancesAllianceIdIcons"></a>
# **getAlliancesAllianceIdIcons**
> GetAlliancesAllianceIdIconsOk getAlliancesAllianceIdIcons(allianceId, datasource, ifNoneMatch)

Get alliance icon

Get the icon urls for a alliance  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.AllianceApi;


AllianceApi apiInstance = new AllianceApi();
Integer allianceId = 56; // Integer | An EVE alliance ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    GetAlliancesAllianceIdIconsOk result = apiInstance.getAlliancesAllianceIdIcons(allianceId, datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AllianceApi#getAlliancesAllianceIdIcons");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allianceId** | **Integer**| An EVE alliance ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetAlliancesAllianceIdIconsOk**](GetAlliancesAllianceIdIconsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

