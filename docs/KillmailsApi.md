# KillmailsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdKillmailsRecent**](KillmailsApi.md#getCharactersCharacterIdKillmailsRecent) | **GET** /characters/{character_id}/killmails/recent/ | List kills and losses
[**getKillmailsKillmailIdKillmailHash**](KillmailsApi.md#getKillmailsKillmailIdKillmailHash) | **GET** /killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail


<a name="getCharactersCharacterIdKillmailsRecent"></a>
# **getCharactersCharacterIdKillmailsRecent**
> List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt; getCharactersCharacterIdKillmailsRecent(characterId, maxCount, maxKillId, datasource)

List kills and losses

Return a list of character&#39;s recent kills and losses  ---  Alternate route: &#x60;/v1/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/killmails/recent/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/killmails/recent/&#x60;   ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.KillmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

KillmailsApi apiInstance = new KillmailsApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer maxCount = 50; // Integer | How many killmails to return at maximum
Integer maxKillId = 56; // Integer | Only return killmails with ID smaller than this. 
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetCharactersCharacterIdKillmailsRecent200Ok> result = apiInstance.getCharactersCharacterIdKillmailsRecent(characterId, maxCount, maxKillId, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getCharactersCharacterIdKillmailsRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **maxCount** | **Integer**| How many killmails to return at maximum | [optional] [default to 50]
 **maxKillId** | **Integer**| Only return killmails with ID smaller than this.  | [optional]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;**](GetCharactersCharacterIdKillmailsRecent200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKillmailsKillmailIdKillmailHash"></a>
# **getKillmailsKillmailIdKillmailHash**
> GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHash(killmailId, killmailHash, datasource)

Get a single killmail

Return a single killmail from its ID and hash  ---  Alternate route: &#x60;/v1/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/legacy/killmails/{killmail_id}/{killmail_hash}/&#x60;  Alternate route: &#x60;/dev/killmails/{killmail_id}/{killmail_hash}/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.KillmailsApi;


KillmailsApi apiInstance = new KillmailsApi();
Integer killmailId = 56; // Integer | The killmail ID to be queried
String killmailHash = "killmailHash_example"; // String | The killmail hash for verification
String datasource = "tranquility"; // String | The server name you would like data from
try {
    GetKillmailsKillmailIdKillmailHashOk result = apiInstance.getKillmailsKillmailIdKillmailHash(killmailId, killmailHash, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getKillmailsKillmailIdKillmailHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **killmailId** | **Integer**| The killmail ID to be queried |
 **killmailHash** | **String**| The killmail hash for verification |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**GetKillmailsKillmailIdKillmailHashOk**](GetKillmailsKillmailIdKillmailHashOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

