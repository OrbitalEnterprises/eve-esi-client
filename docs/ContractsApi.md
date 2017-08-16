# ContractsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdContracts**](ContractsApi.md#getCharactersCharacterIdContracts) | **GET** /characters/{character_id}/contracts/ | Get contracts
[**getCharactersCharacterIdContractsContractIdBids**](ContractsApi.md#getCharactersCharacterIdContractsContractIdBids) | **GET** /characters/{character_id}/contracts/{contract_id}/bids/ | Get contract bids
[**getCharactersCharacterIdContractsContractIdItems**](ContractsApi.md#getCharactersCharacterIdContractsContractIdItems) | **GET** /characters/{character_id}/contracts/{contract_id}/items/ | Get contract items


<a name="getCharactersCharacterIdContracts"></a>
# **getCharactersCharacterIdContracts**
> List&lt;GetCharactersCharacterIdContracts200Ok&gt; getCharactersCharacterIdContracts(characterId, datasource, token, userAgent, xUserAgent)

Get contracts

Returns contracts available to a character, only if the character is issuer, acceptor or assignee. Only returns contracts no older than 30 days, or if the status is \&quot;in_progress\&quot;.  --- Alternate route: &#x60;/v1/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contracts/&#x60;  --- This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdContracts200Ok> result = apiInstance.getCharactersCharacterIdContracts(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getCharactersCharacterIdContracts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdContracts200Ok&gt;**](GetCharactersCharacterIdContracts200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContractsContractIdBids"></a>
# **getCharactersCharacterIdContractsContractIdBids**
> List&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt; getCharactersCharacterIdContractsContractIdBids(characterId, contractId, datasource, token, userAgent, xUserAgent)

Get contract bids

Lists bids on a particular auction contract  --- Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/bids/&#x60;  --- This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer contractId = 56; // Integer | ID of a contract
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdContractsContractIdBids200Ok> result = apiInstance.getCharactersCharacterIdContractsContractIdBids(characterId, contractId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getCharactersCharacterIdContractsContractIdBids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **contractId** | **Integer**| ID of a contract |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdContractsContractIdBids200Ok&gt;**](GetCharactersCharacterIdContractsContractIdBids200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContractsContractIdItems"></a>
# **getCharactersCharacterIdContractsContractIdItems**
> List&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt; getCharactersCharacterIdContractsContractIdItems(characterId, contractId, datasource, token, userAgent, xUserAgent)

Get contract items

Lists Items and details of a particular contract  --- Alternate route: &#x60;/v1/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contracts/{contract_id}/items/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contracts/{contract_id}/items/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContractsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContractsApi apiInstance = new ContractsApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer contractId = 56; // Integer | ID of a contract
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdContractsContractIdItems200Ok> result = apiInstance.getCharactersCharacterIdContractsContractIdItems(characterId, contractId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContractsApi#getCharactersCharacterIdContractsContractIdItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **contractId** | **Integer**| ID of a contract |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdContractsContractIdItems200Ok&gt;**](GetCharactersCharacterIdContractsContractIdItems200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

