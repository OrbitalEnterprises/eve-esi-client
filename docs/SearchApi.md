# SearchApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdSearch**](SearchApi.md#getCharactersCharacterIdSearch) | **GET** /characters/{character_id}/search/ | Search on a string
[**getSearch**](SearchApi.md#getSearch) | **GET** /search/ | Search on a string


<a name="getCharactersCharacterIdSearch"></a>
# **getCharactersCharacterIdSearch**
> GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent)

Search on a string

Search for entities that match a given sub-string.  --- Alternate route: &#x60;/v2/characters/{character_id}/search/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.SearchApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SearchApi apiInstance = new SearchApi();
List<String> categories = Arrays.asList("categories_example"); // List<String> | Type of entities to search for
Integer characterId = 56; // Integer | An EVE character ID
String search = "search_example"; // String | The string to search on
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
Boolean strict = false; // Boolean | Whether the search should be a strict match
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCharactersCharacterIdSearchOk result = apiInstance.getCharactersCharacterIdSearch(categories, characterId, search, datasource, language, strict, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getCharactersCharacterIdSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventorytype, region, solarsystem, station, structure, wormhole]
 **characterId** | **Integer**| An EVE character ID |
 **search** | **String**| The string to search on |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCharactersCharacterIdSearchOk**](GetCharactersCharacterIdSearchOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> GetSearchOk getSearch(categories, search, datasource, language, strict, userAgent, xUserAgent)

Search on a string

Search for entities that match a given sub-string.  --- Alternate route: &#x60;/v1/search/&#x60;  Alternate route: &#x60;/legacy/search/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
List<String> categories = Arrays.asList("categories_example"); // List<String> | Type of entities to search for
String search = "search_example"; // String | The string to search on
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
Boolean strict = false; // Boolean | Whether the search should be a strict match
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetSearchOk result = apiInstance.getSearch(categories, search, datasource, language, strict, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventorytype, region, solarsystem, station, wormhole]
 **search** | **String**| The string to search on |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetSearchOk**](GetSearchOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

