# SearchApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdSearch**](SearchApi.md#getCharactersCharacterIdSearch) | **GET** /v3/characters/{character_id}/search/ | Search on a string
[**getSearch**](SearchApi.md#getSearch) | **GET** /v2/search/ | Search on a string


<a name="getCharactersCharacterIdSearch"></a>
# **getCharactersCharacterIdSearch**
> GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(categories, characterId, search, acceptLanguage, datasource, ifNoneMatch, language, strict, token)

Search on a string

Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds

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
String acceptLanguage = "en-us"; // String | Language to use in the response
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String language = "en-us"; // String | Language to use in the response, takes precedence over Accept-Language
Boolean strict = false; // Boolean | Whether the search should be a strict match
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdSearchOk result = apiInstance.getCharactersCharacterIdSearch(categories, characterId, search, acceptLanguage, datasource, ifNoneMatch, language, strict, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getCharactersCharacterIdSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station, structure]
 **characterId** | **Integer**| An EVE character ID |
 **search** | **String**| The string to search on |
 **acceptLanguage** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdSearchOk**](GetCharactersCharacterIdSearchOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> GetSearchOk getSearch(categories, search, acceptLanguage, datasource, ifNoneMatch, language, strict)

Search on a string

Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
List<String> categories = Arrays.asList("categories_example"); // List<String> | Type of entities to search for
String search = "search_example"; // String | The string to search on
String acceptLanguage = "en-us"; // String | Language to use in the response
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String language = "en-us"; // String | Language to use in the response, takes precedence over Accept-Language
Boolean strict = false; // Boolean | Whether the search should be a strict match
try {
    GetSearchOk result = apiInstance.getSearch(categories, search, acceptLanguage, datasource, ifNoneMatch, language, strict);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventory_type, region, solar_system, station]
 **search** | **String**| The string to search on |
 **acceptLanguage** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **String**| Language to use in the response, takes precedence over Accept-Language | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]

### Return type

[**GetSearchOk**](GetSearchOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

