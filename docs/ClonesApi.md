# ClonesApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdClones**](ClonesApi.md#getCharactersCharacterIdClones) | **GET** /characters/{character_id}/clones/ | Get clones


<a name="getCharactersCharacterIdClones"></a>
# **getCharactersCharacterIdClones**
> GetCharactersCharacterIdClonesOk getCharactersCharacterIdClones(characterId, datasource)

Get clones

A list of the character&#39;s clones  ---  Alternate route: &#x60;/v2/characters/{character_id}/clones/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/clones/&#x60;   ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ClonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ClonesApi apiInstance = new ClonesApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
try {
    GetCharactersCharacterIdClonesOk result = apiInstance.getCharactersCharacterIdClones(characterId, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClonesApi#getCharactersCharacterIdClones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**GetCharactersCharacterIdClonesOk**](GetCharactersCharacterIdClonesOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

