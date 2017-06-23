# WalletApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdWallets**](WalletApi.md#getCharactersCharacterIdWallets) | **GET** /characters/{character_id}/wallets/ | List wallets and balances
[**getCharactersCharacterIdWalletsJournal**](WalletApi.md#getCharactersCharacterIdWalletsJournal) | **GET** /characters/{character_id}/wallets/journal/ | Get character wallet journal


<a name="getCharactersCharacterIdWallets"></a>
# **getCharactersCharacterIdWallets**
> List&lt;GetCharactersCharacterIdWallets200Ok&gt; getCharactersCharacterIdWallets(characterId, datasource, token, userAgent, xUserAgent)

List wallets and balances

List your wallets and their balances. Characters typically have only one wallet, with wallet_id 1000 being the master wallet.  ---  Alternate route: &#x60;/v1/characters/{character_id}/wallets/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/wallets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/wallets/&#x60;   ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

WalletApi apiInstance = new WalletApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdWallets200Ok> result = apiInstance.getCharactersCharacterIdWallets(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getCharactersCharacterIdWallets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdWallets200Ok&gt;**](GetCharactersCharacterIdWallets200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdWalletsJournal"></a>
# **getCharactersCharacterIdWalletsJournal**
> List&lt;GetCharactersCharacterIdWalletsJournal200Ok&gt; getCharactersCharacterIdWalletsJournal(characterId, datasource, fromId, token, userAgent, xUserAgent)

Get character wallet journal

Retrieve character wallet journal  ---  Alternate route: &#x60;/v1/characters/{character_id}/wallets/journal/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/wallets/journal/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/wallets/journal/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.WalletApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

WalletApi apiInstance = new WalletApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
Long fromId = 789L; // Long | Only show journal entries happened before the transaction referenced by this id
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdWalletsJournal200Ok> result = apiInstance.getCharactersCharacterIdWalletsJournal(characterId, datasource, fromId, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WalletApi#getCharactersCharacterIdWalletsJournal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **fromId** | **Long**| Only show journal entries happened before the transaction referenced by this id | [optional]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdWalletsJournal200Ok&gt;**](GetCharactersCharacterIdWalletsJournal200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

