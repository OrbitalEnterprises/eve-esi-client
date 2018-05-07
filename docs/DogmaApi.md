# DogmaApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDogmaAttributes**](DogmaApi.md#getDogmaAttributes) | **GET** /v1/dogma/attributes/ | Get attributes
[**getDogmaAttributesAttributeId**](DogmaApi.md#getDogmaAttributesAttributeId) | **GET** /v1/dogma/attributes/{attribute_id}/ | Get attribute information
[**getDogmaEffects**](DogmaApi.md#getDogmaEffects) | **GET** /v1/dogma/effects/ | Get effects
[**getDogmaEffectsEffectId**](DogmaApi.md#getDogmaEffectsEffectId) | **GET** /v2/dogma/effects/{effect_id}/ | Get effect information


<a name="getDogmaAttributes"></a>
# **getDogmaAttributes**
> List&lt;Integer&gt; getDogmaAttributes(datasource, ifNoneMatch, userAgent, xUserAgent)

Get attributes

Get a list of dogma attribute ids  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.DogmaApi;


DogmaApi apiInstance = new DogmaApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getDogmaAttributes(datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DogmaApi#getDogmaAttributes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDogmaAttributesAttributeId"></a>
# **getDogmaAttributesAttributeId**
> GetDogmaAttributesAttributeIdOk getDogmaAttributesAttributeId(attributeId, datasource, ifNoneMatch, userAgent, xUserAgent)

Get attribute information

Get information on a dogma attribute  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.DogmaApi;


DogmaApi apiInstance = new DogmaApi();
Integer attributeId = 56; // Integer | A dogma attribute ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetDogmaAttributesAttributeIdOk result = apiInstance.getDogmaAttributesAttributeId(attributeId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DogmaApi#getDogmaAttributesAttributeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributeId** | **Integer**| A dogma attribute ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetDogmaAttributesAttributeIdOk**](GetDogmaAttributesAttributeIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDogmaEffects"></a>
# **getDogmaEffects**
> List&lt;Integer&gt; getDogmaEffects(datasource, ifNoneMatch, userAgent, xUserAgent)

Get effects

Get a list of dogma effect ids  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.DogmaApi;


DogmaApi apiInstance = new DogmaApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getDogmaEffects(datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DogmaApi#getDogmaEffects");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDogmaEffectsEffectId"></a>
# **getDogmaEffectsEffectId**
> GetDogmaEffectsEffectIdOk getDogmaEffectsEffectId(effectId, datasource, ifNoneMatch, userAgent, xUserAgent)

Get effect information

Get information on a dogma effect  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.DogmaApi;


DogmaApi apiInstance = new DogmaApi();
Integer effectId = 56; // Integer | A dogma effect ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetDogmaEffectsEffectIdOk result = apiInstance.getDogmaEffectsEffectId(effectId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DogmaApi#getDogmaEffectsEffectId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **effectId** | **Integer**| A dogma effect ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetDogmaEffectsEffectIdOk**](GetDogmaEffectsEffectIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

