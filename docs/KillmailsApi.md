# KillmailsApi

All URIs are relative to *https://esi.tech.ccp.is*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdKillmailsRecent**](KillmailsApi.md#getCharactersCharacterIdKillmailsRecent) | **GET** /v1/characters/{character_id}/killmails/recent/ | Get character kills and losses
[**getCorporationsCorporationIdKillmailsRecent**](KillmailsApi.md#getCorporationsCorporationIdKillmailsRecent) | **GET** /v1/corporations/{corporation_id}/killmails/recent/ | Get corporation kills and losses
[**getKillmailsKillmailIdKillmailHash**](KillmailsApi.md#getKillmailsKillmailIdKillmailHash) | **GET** /v1/killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail


<a name="getCharactersCharacterIdKillmailsRecent"></a>
# **getCharactersCharacterIdKillmailsRecent**
> List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt; getCharactersCharacterIdKillmailsRecent(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent)

Get character kills and losses

Return a list of character&#39;s recent kills and losses  ---  This route is cached for up to 120 seconds

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
String datasource = "tranquility"; // String | The server name you would like data from
Integer maxCount = 50; // Integer | How many killmails to return at maximum
Integer maxKillId = 56; // Integer | Only return killmails with ID smaller than this. 
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdKillmailsRecent200Ok> result = apiInstance.getCharactersCharacterIdKillmailsRecent(characterId, datasource, maxCount, maxKillId, token, userAgent, xUserAgent);
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
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **maxCount** | **Integer**| How many killmails to return at maximum | [optional] [default to 50]
 **maxKillId** | **Integer**| Only return killmails with ID smaller than this.  | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;**](GetCharactersCharacterIdKillmailsRecent200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCorporationsCorporationIdKillmailsRecent"></a>
# **getCorporationsCorporationIdKillmailsRecent**
> List&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt; getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, maxKillId, token, userAgent, xUserAgent)

Get corporation kills and losses

Get a list of corporation&#39;s recent kills and losses  ---  This route is cached for up to 300 seconds

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
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer maxKillId = 56; // Integer | Only return killmails with ID smaller than this
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdKillmailsRecent200Ok> result = apiInstance.getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, maxKillId, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getCorporationsCorporationIdKillmailsRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **maxKillId** | **Integer**| Only return killmails with ID smaller than this | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt;**](GetCorporationsCorporationIdKillmailsRecent200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getKillmailsKillmailIdKillmailHash"></a>
# **getKillmailsKillmailIdKillmailHash**
> GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHash(killmailHash, killmailId, datasource, userAgent, xUserAgent)

Get a single killmail

Return a single killmail from its ID and hash  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.KillmailsApi;


KillmailsApi apiInstance = new KillmailsApi();
String killmailHash = "killmailHash_example"; // String | The killmail hash for verification
Integer killmailId = 56; // Integer | The killmail ID to be queried
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetKillmailsKillmailIdKillmailHashOk result = apiInstance.getKillmailsKillmailIdKillmailHash(killmailHash, killmailId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getKillmailsKillmailIdKillmailHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **killmailHash** | **String**| The killmail hash for verification |
 **killmailId** | **Integer**| The killmail ID to be queried |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetKillmailsKillmailIdKillmailHashOk**](GetKillmailsKillmailIdKillmailHashOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

