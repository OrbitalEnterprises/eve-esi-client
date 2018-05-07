# RoutesApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRouteOriginDestination**](RoutesApi.md#getRouteOriginDestination) | **GET** /v1/route/{origin}/{destination}/ | Get route


<a name="getRouteOriginDestination"></a>
# **getRouteOriginDestination**
> List&lt;Integer&gt; getRouteOriginDestination(destination, origin, avoid, connections, datasource, flag, ifNoneMatch, userAgent, xUserAgent)

Get route

Get the systems between origin and destination  ---  This route is cached for up to 86400 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.RoutesApi;


RoutesApi apiInstance = new RoutesApi();
Integer destination = 56; // Integer | destination solar system ID
Integer origin = 56; // Integer | origin solar system ID
List<Integer> avoid = Arrays.asList(56); // List<Integer> | avoid solar system ID(s)
List<List<Integer>> connections = Arrays.asList(new List<Integer>()); // List<List<Integer>> | connected solar system pairs
String datasource = "tranquility"; // String | The server name you would like data from
String flag = "shortest"; // String | route security preference
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getRouteOriginDestination(destination, origin, avoid, connections, datasource, flag, ifNoneMatch, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RoutesApi#getRouteOriginDestination");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **destination** | **Integer**| destination solar system ID |
 **origin** | **Integer**| origin solar system ID |
 **avoid** | [**List&lt;Integer&gt;**](Integer.md)| avoid solar system ID(s) | [optional]
 **connections** | [**List&lt;List&lt;Integer&gt;&gt;**](List&lt;Integer&gt;.md)| connected solar system pairs | [optional]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **flag** | **String**| route security preference | [optional] [default to shortest] [enum: shortest, secure, insecure]
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

