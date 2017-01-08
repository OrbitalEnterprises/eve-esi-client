# SearchApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdSearch**](SearchApi.md#getCharactersCharacterIdSearch) | **GET** /characters/{character_id}/search/ | Search on a string
[**getSearch**](SearchApi.md#getSearch) | **GET** /search/ | Search on a string


<a name="getCharactersCharacterIdSearch"></a>
# **getCharactersCharacterIdSearch**
> GetCharactersCharacterIdSearchOk getCharactersCharacterIdSearch(characterId, search, categories, language, strict, datasource)

Search on a string

Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v2/characters/{character_id}/search/&#x60;   ---  This route is cached for up to 3600 seconds

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
Integer characterId = 56; // Integer | An EVE character ID
String search = "search_example"; // String | The string to search on
List<String> categories = Arrays.asList("categories_example"); // List<String> | Type of entities to search for
String language = "en-us"; // String | Search locale
Boolean strict = false; // Boolean | Whether the search should be a strict match
String datasource = "tranquility"; // String | The server name you would like data from
try {
    GetCharactersCharacterIdSearchOk result = apiInstance.getCharactersCharacterIdSearch(characterId, search, categories, language, strict, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getCharactersCharacterIdSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **search** | **String**| The string to search on |
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventorytype, region, solarsystem, station, structure, wormhole]
 **language** | **String**| Search locale | [optional] [default to en-us] [enum: en-us, de, fr, ru, ja, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**GetCharactersCharacterIdSearchOk**](GetCharactersCharacterIdSearchOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSearch"></a>
# **getSearch**
> GetSearchOk getSearch(search, categories, language, strict, datasource)

Search on a string

Search for entities that match a given sub-string.  ---  Alternate route: &#x60;/v1/search/&#x60;  Alternate route: &#x60;/legacy/search/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.SearchApi;


SearchApi apiInstance = new SearchApi();
String search = "search_example"; // String | The string to search on
List<String> categories = Arrays.asList("categories_example"); // List<String> | Type of entities to search for
String language = "en-us"; // String | Search locale
Boolean strict = false; // Boolean | Whether the search should be a strict match
String datasource = "tranquility"; // String | The server name you would like data from
try {
    GetSearchOk result = apiInstance.getSearch(search, categories, language, strict, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#getSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **search** | **String**| The string to search on |
 **categories** | [**List&lt;String&gt;**](String.md)| Type of entities to search for | [enum: agent, alliance, character, constellation, corporation, faction, inventorytype, region, solarsystem, station, wormhole]
 **language** | **String**| Search locale | [optional] [default to en-us] [enum: en-us, de, fr, ru, ja, zh]
 **strict** | **Boolean**| Whether the search should be a strict match | [optional] [default to false]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**GetSearchOk**](GetSearchOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

