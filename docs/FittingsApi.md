# FittingsApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdFittingsFittingId**](FittingsApi.md#deleteCharactersCharacterIdFittingsFittingId) | **DELETE** /v1/characters/{character_id}/fittings/{fitting_id}/ | Delete fitting
[**getCharactersCharacterIdFittings**](FittingsApi.md#getCharactersCharacterIdFittings) | **GET** /v2/characters/{character_id}/fittings/ | Get fittings
[**postCharactersCharacterIdFittings**](FittingsApi.md#postCharactersCharacterIdFittings) | **POST** /v2/characters/{character_id}/fittings/ | Create fitting


<a name="deleteCharactersCharacterIdFittingsFittingId"></a>
# **deleteCharactersCharacterIdFittingsFittingId**
> deleteCharactersCharacterIdFittingsFittingId(characterId, fittingId, datasource, token)

Delete fitting

Delete a fitting from a character  --- 

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
Integer characterId = 56; // Integer | An EVE character ID
Integer fittingId = 56; // Integer | ID for a fitting of this character
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.deleteCharactersCharacterIdFittingsFittingId(characterId, fittingId, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#deleteCharactersCharacterIdFittingsFittingId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **fittingId** | **Integer**| ID for a fitting of this character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdFittings"></a>
# **getCharactersCharacterIdFittings**
> List&lt;GetCharactersCharacterIdFittings200Ok&gt; getCharactersCharacterIdFittings(characterId, datasource, ifNoneMatch, token)

Get fittings

Return fittings of a character  ---  This route is cached for up to 300 seconds

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
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdFittings200Ok> result = apiInstance.getCharactersCharacterIdFittings(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#getCharactersCharacterIdFittings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdFittings200Ok&gt;**](GetCharactersCharacterIdFittings200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postCharactersCharacterIdFittings"></a>
# **postCharactersCharacterIdFittings**
> PostCharactersCharacterIdFittingsCreated postCharactersCharacterIdFittings(characterId, fitting, datasource, token)

Create fitting

Save a new fitting for a character  --- 

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
Integer characterId = 56; // Integer | An EVE character ID
PostCharactersCharacterIdFittingsFitting fitting = new PostCharactersCharacterIdFittingsFitting(); // PostCharactersCharacterIdFittingsFitting | Details about the new fitting
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    PostCharactersCharacterIdFittingsCreated result = apiInstance.postCharactersCharacterIdFittings(characterId, fitting, datasource, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FittingsApi#postCharactersCharacterIdFittings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **fitting** | [**PostCharactersCharacterIdFittingsFitting**](PostCharactersCharacterIdFittingsFitting.md)| Details about the new fitting |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**PostCharactersCharacterIdFittingsCreated**](PostCharactersCharacterIdFittingsCreated.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

