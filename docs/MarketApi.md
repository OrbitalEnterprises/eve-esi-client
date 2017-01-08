# MarketApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMarketsPrices**](MarketApi.md#getMarketsPrices) | **GET** /markets/prices/ | List market prices
[**getMarketsRegionIdHistory**](MarketApi.md#getMarketsRegionIdHistory) | **GET** /markets/{region_id}/history/ | List historical market statistics in a region
[**getMarketsRegionIdOrders**](MarketApi.md#getMarketsRegionIdOrders) | **GET** /markets/{region_id}/orders/ | List orders in a region


<a name="getMarketsPrices"></a>
# **getMarketsPrices**
> List&lt;GetMarketsPrices200Ok&gt; getMarketsPrices(datasource)

List market prices

Return a list of prices  ---  Alternate route: &#x60;/v1/markets/prices/&#x60;  Alternate route: &#x60;/legacy/markets/prices/&#x60;  Alternate route: &#x60;/dev/markets/prices/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetMarketsPrices200Ok> result = apiInstance.getMarketsPrices(datasource);
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

### Return type

[**List&lt;GetMarketsPrices200Ok&gt;**](GetMarketsPrices200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsRegionIdHistory"></a>
# **getMarketsRegionIdHistory**
> List&lt;GetMarketsRegionIdHistory200Ok&gt; getMarketsRegionIdHistory(regionId, typeId, datasource)

List historical market statistics in a region

Return a list of historical market statistics for the specified type in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/history/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/history/&#x60;   ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Integer regionId = 56; // Integer | Return statistics in this region
Integer typeId = 56; // Integer | Return statistics for this type
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetMarketsRegionIdHistory200Ok> result = apiInstance.getMarketsRegionIdHistory(regionId, typeId, datasource);
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

### Return type

[**List&lt;GetMarketsRegionIdHistory200Ok&gt;**](GetMarketsRegionIdHistory200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMarketsRegionIdOrders"></a>
# **getMarketsRegionIdOrders**
> List&lt;GetMarketsRegionIdOrders200Ok&gt; getMarketsRegionIdOrders(regionId, orderType, typeId, page, datasource)

List orders in a region

Return a list of orders in a region  ---  Alternate route: &#x60;/v1/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/legacy/markets/{region_id}/orders/&#x60;  Alternate route: &#x60;/dev/markets/{region_id}/orders/&#x60;   ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.MarketApi;


MarketApi apiInstance = new MarketApi();
Integer regionId = 56; // Integer | Return orders in this region
String orderType = "all"; // String | Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders. 
Integer typeId = 56; // Integer | Return orders only for this type
Integer page = 1; // Integer | Which page to query, only used for querying without type_id. Starting at 1 
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetMarketsRegionIdOrders200Ok> result = apiInstance.getMarketsRegionIdOrders(regionId, orderType, typeId, page, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MarketApi#getMarketsRegionIdOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Integer**| Return orders in this region |
 **orderType** | **String**| Filter buy/sell orders, return all orders by default. If you query without type_id, we always return both buy and sell orders.  | [default to all] [enum: buy, sell, all]
 **typeId** | **Integer**| Return orders only for this type | [optional]
 **page** | **Integer**| Which page to query, only used for querying without type_id. Starting at 1  | [optional] [default to 1]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetMarketsRegionIdOrders200Ok&gt;**](GetMarketsRegionIdOrders200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

