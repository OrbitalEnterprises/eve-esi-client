# MarketApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdOrders**](MarketApi.md#getCharactersCharacterIdOrders) | **GET** /v2/characters/{character_id}/orders/ | List open orders from a character
[**getCharactersCharacterIdOrdersHistory**](MarketApi.md#getCharactersCharacterIdOrdersHistory) | **GET** /v1/characters/{character_id}/orders/history/ | List historical orders by a character
[**getCorporationsCorporationIdOrders**](MarketApi.md#getCorporationsCorporationIdOrders) | **GET** /v2/corporations/{corporation_id}/orders/ | List open orders from a corporation
[**getCorporationsCorporationIdOrdersHistory**](MarketApi.md#getCorporationsCorporationIdOrdersHistory) | **GET** /v1/corporations/{corporation_id}/orders/history/ | List historical orders from a corporation
[**getMarketsGroups**](MarketApi.md#getMarketsGroups) | **GET** /v1/markets/groups/ | Get item groups
[**getMarketsGroupsMarketGroupId**](MarketApi.md#getMarketsGroupsMarketGroupId) | **GET** /v1/markets/groups/{market_group_id}/ | Get item group information
[**getMarketsPrices**](MarketApi.md#getMarketsPrices) | **GET** /v1/markets/prices/ | List market prices
[**getMarketsRegionIdHistory**](MarketApi.md#getMarketsRegionIdHistory) | **GET** /v1/markets/{region_id}/history/ | List historical market statistics in a region
[**getMarketsRegionIdOrders**](MarketApi.md#getMarketsRegionIdOrders) | **GET** /v1/markets/{region_id}/orders/ | List orders in a region
[**getMarketsRegionIdTypes**](MarketApi.md#getMarketsRegionIdTypes) | **GET** /v1/markets/{region_id}/types/ | List type IDs relevant to a market
[**getMarketsStructuresStructureId**](MarketApi.md#getMarketsStructuresStructureId) | **GET** /v1/markets/structures/{structure_id}/ | List orders in a structure


<a name="getCharactersCharacterIdOrders"></a>
# **getCharactersCharacterIdOrders**
> List&lt;GetCharactersCharacterIdOrders200Ok&gt; getCharactersCharacterIdOrders(characterId, datasource, ifNoneMatch, token, userAgent, xUserAgent)

List open orders from a character

List open market orders placed by a character  ---  This route is cached for up to 1200 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

MarketApi apiInstance = new MarketApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdOrders200Ok> result = apiInstance.getCharactersCharacterIdOrders(characterId, datasource, ifNoneMatch, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getCharactersCharacterIdOrders");
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
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdOrders200Ok&gt;**](GetCharactersCharacterIdOrders200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdOrdersHistory"></a>
# **getCharactersCharacterIdOrdersHistory**
> List&lt;GetCharactersCharacterIdOrdersHistory200Ok&gt; getCharactersCharacterIdOrdersHistory(characterId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

List historical orders by a character

List cancelled and expired market orders placed by a character up to 90 days in the past.  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

MarketApi apiInstance = new MarketApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdOrdersHistory200Ok> result = apiInstance.getCharactersCharacterIdOrdersHistory(characterId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getCharactersCharacterIdOrdersHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdOrdersHistory200Ok&gt;**](GetCharactersCharacterIdOrdersHistory200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOrders"></a>
# **getCorporationsCorporationIdOrders**
> List&lt;GetCorporationsCorporationIdOrders200Ok&gt; getCorporationsCorporationIdOrders(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

List open orders from a corporation

List open market orders placed on behalf of a corporation  ---  This route is cached for up to 1200 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

MarketApi apiInstance = new MarketApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdOrders200Ok> result = apiInstance.getCorporationsCorporationIdOrders(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getCorporationsCorporationIdOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdOrders200Ok&gt;**](GetCorporationsCorporationIdOrders200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdOrdersHistory"></a>
# **getCorporationsCorporationIdOrdersHistory**
> List&lt;GetCorporationsCorporationIdOrdersHistory200Ok&gt; getCorporationsCorporationIdOrdersHistory(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

List historical orders from a corporation

List cancelled and expired market orders placed on behalf of a corporation up to 90 days in the past.  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Trader

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

MarketApi apiInstance = new MarketApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCorporationsCorporationIdOrdersHistory200Ok> result = apiInstance.getCorporationsCorporationIdOrdersHistory(corporationId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getCorporationsCorporationIdOrdersHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdOrdersHistory200Ok&gt;**](GetCorporationsCorporationIdOrdersHistory200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsGroups"></a>
# **getMarketsGroups**
> List&lt;Integer&gt; getMarketsGroups(datasource, ifNoneMatch, userAgent, xUserAgent)

Get item groups

Get a list of item groups  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getMarketsGroups(datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsGroupsMarketGroupId"></a>
# **getMarketsGroupsMarketGroupId**
> GetMarketsGroupsMarketGroupIdOk getMarketsGroupsMarketGroupId(marketGroupId, datasource, ifNoneMatch, language, userAgent, xUserAgent)

Get item group information

Get information on an item group  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Integer marketGroupId = 56; // Integer | An Eve item group ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetMarketsGroupsMarketGroupIdOk result = apiInstance.getMarketsGroupsMarketGroupId(marketGroupId, datasource, ifNoneMatch, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsGroupsMarketGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **marketGroupId** | **Integer**| An Eve item group ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetMarketsGroupsMarketGroupIdOk**](GetMarketsGroupsMarketGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsPrices"></a>
# **getMarketsPrices**
> List&lt;GetMarketsPrices200Ok&gt; getMarketsPrices(datasource, ifNoneMatch, userAgent, xUserAgent)

List market prices

Return a list of prices  ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetMarketsPrices200Ok> result = apiInstance.getMarketsPrices(datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsPrices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetMarketsPrices200Ok&gt;**](GetMarketsPrices200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsRegionIdHistory"></a>
# **getMarketsRegionIdHistory**
> List&lt;GetMarketsRegionIdHistory200Ok&gt; getMarketsRegionIdHistory(regionId, typeId, datasource, ifNoneMatch, userAgent, xUserAgent)

List historical market statistics in a region

Return a list of historical market statistics for the specified type in a region  ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Integer regionId = 56; // Integer | Return statistics in this region
Integer typeId = 56; // Integer | Return statistics for this type
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetMarketsRegionIdHistory200Ok> result = apiInstance.getMarketsRegionIdHistory(regionId, typeId, datasource, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsRegionIdHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Integer**| Return statistics in this region |
 **typeId** | **Integer**| Return statistics for this type |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetMarketsRegionIdHistory200Ok&gt;**](GetMarketsRegionIdHistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsRegionIdOrders"></a>
# **getMarketsRegionIdOrders**
> List&lt;GetMarketsRegionIdOrders200Ok&gt; getMarketsRegionIdOrders(orderType, regionId, datasource, ifNoneMatch, page, typeId, userAgent, xUserAgent)

List orders in a region

Return a list of orders in a region  ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String orderType = "all"; // String | Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.
Integer regionId = 56; // Integer | Return orders in this region
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
Integer typeId = 56; // Integer | Return orders only for this type
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetMarketsRegionIdOrders200Ok> result = apiInstance.getMarketsRegionIdOrders(orderType, regionId, datasource, ifNoneMatch, page, typeId, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsRegionIdOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderType** | **String**| Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders. | [default to all] [enum: buy, sell, all]
 **regionId** | **Integer**| Return orders in this region |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **typeId** | **Integer**| Return orders only for this type | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetMarketsRegionIdOrders200Ok&gt;**](GetMarketsRegionIdOrders200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsRegionIdTypes"></a>
# **getMarketsRegionIdTypes**
> List&lt;Integer&gt; getMarketsRegionIdTypes(regionId, datasource, ifNoneMatch, page, userAgent, xUserAgent)

List type IDs relevant to a market

Return a list of type IDs that have active orders in the region, for efficient market indexing.  ---  This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Integer regionId = 56; // Integer | Return statistics in this region
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getMarketsRegionIdTypes(regionId, datasource, ifNoneMatch, page, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsRegionIdTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Integer**| Return statistics in this region |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMarketsStructuresStructureId"></a>
# **getMarketsStructuresStructureId**
> List&lt;GetMarketsStructuresStructureId200Ok&gt; getMarketsStructuresStructureId(structureId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent)

List orders in a structure

Return all orders in a structure  ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.MarketApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

MarketApi apiInstance = new MarketApi();
Long structureId = 789L; // Long | Return orders in this structure
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetMarketsStructuresStructureId200Ok> result = apiInstance.getMarketsStructuresStructureId(structureId, datasource, ifNoneMatch, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsStructuresStructureId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **structureId** | **Long**| Return orders in this structure |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetMarketsStructuresStructureId200Ok&gt;**](GetMarketsStructuresStructureId200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

