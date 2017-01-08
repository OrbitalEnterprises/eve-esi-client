# IndustryApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIndustryFacilities**](IndustryApi.md#getIndustryFacilities) | **GET** /industry/facilities/ | List industry facilities
[**getIndustrySystems**](IndustryApi.md#getIndustrySystems) | **GET** /industry/systems/ | List solar system cost indices


<a name="getIndustryFacilities"></a>
# **getIndustryFacilities**
> List&lt;GetIndustryFacilities200Ok&gt; getIndustryFacilities(datasource)

List industry facilities

Return a list of industry facilities  ---  Alternate route: &#x60;/v1/industry/facilities/&#x60;  Alternate route: &#x60;/legacy/industry/facilities/&#x60;  Alternate route: &#x60;/dev/industry/facilities/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetIndustryFacilities200Ok> result = apiInstance.getIndustryFacilities(datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustryFacilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetIndustryFacilities200Ok&gt;**](GetIndustryFacilities200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getIndustrySystems"></a>
# **getIndustrySystems**
> List&lt;GetIndustrySystems200Ok&gt; getIndustrySystems(datasource)

List solar system cost indices

Return cost indices for solar systems  ---  Alternate route: &#x60;/v1/industry/systems/&#x60;  Alternate route: &#x60;/legacy/industry/systems/&#x60;  Alternate route: &#x60;/dev/industry/systems/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.IndustryApi;


IndustryApi apiInstance = new IndustryApi();
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetIndustrySystems200Ok> result = apiInstance.getIndustrySystems(datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IndustryApi#getIndustrySystems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetIndustrySystems200Ok&gt;**](GetIndustrySystems200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

