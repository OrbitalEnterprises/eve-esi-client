# FittingsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdFittingsFittingId**](FittingsApi.md#deleteCharactersCharacterIdFittingsFittingId) | **DELETE** /characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
[**getCharactersCharacterIdFittings**](FittingsApi.md#getCharactersCharacterIdFittings) | **GET** /characters/{character_id}/fittings/ | Get fittings
[**postCharactersCharacterIdFittings**](FittingsApi.md#postCharactersCharacterIdFittings) | **POST** /characters/{character_id}/fittings/ | Create fitting


<a name="deleteCharactersCharacterIdFittingsFittingId"></a>
# **deleteCharactersCharacterIdFittingsFittingId**
> deleteCharactersCharacterIdFittingsFittingId(characterId, fittingId, datasource, token, userAgent, xUserAgent)

Delete fitting

Delete a fitting from a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/{fitting_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/{fitting_id}/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.FittingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

FittingsApi apiInstance = new FittingsApi();
Integer characterId = 56; // Integer | ID for a character
Integer fittingId = 56; // Integer | ID for a fitting of this character
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.deleteCharactersCharacterIdFittingsFittingId(characterId, fittingId, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#deleteCharactersCharacterIdFittingsFittingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **fittingId** | **Integer**| ID for a fitting of this character |
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

<a name="getCharactersCharacterIdFittings"></a>
# **getCharactersCharacterIdFittings**
> List&lt;GetCharactersCharacterIdFittings200Ok&gt; getCharactersCharacterIdFittings(characterId, datasource, token, userAgent, xUserAgent)

Get fittings

Return fittings of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60;   ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.FittingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

FittingsApi apiInstance = new FittingsApi();
Integer characterId = 56; // Integer | ID for a character
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdFittings200Ok> result = apiInstance.getCharactersCharacterIdFittings(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#getCharactersCharacterIdFittings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdFittings200Ok&gt;**](GetCharactersCharacterIdFittings200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdFittings"></a>
# **postCharactersCharacterIdFittings**
> PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittings(characterId, datasource, fitting, token, userAgent, xUserAgent)

Create fitting

Save a new fitting for a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/fittings/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/fittings/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.FittingsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

FittingsApi apiInstance = new FittingsApi();
Integer characterId = 56; // Integer | ID for a character
String datasource = "tranquility"; // String | The server name you would like data from
PostCharactersCharacterIdFittingsFitting fitting = new PostCharactersCharacterIdFittingsFitting(); // PostCharactersCharacterIdFittingsFitting | Details about the new fitting
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    PostCharactersCharacterIdFittingsCreated result = apiInstance.postCharactersCharacterIdFittings(characterId, datasource, fitting, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#postCharactersCharacterIdFittings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **fitting** | [**PostCharactersCharacterIdFittingsFitting**](PostCharactersCharacterIdFittingsFitting.md)| Details about the new fitting | [optional]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**PostCharactersCharacterIdFittingsCreated**](PostCharactersCharacterIdFittingsCreated.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

