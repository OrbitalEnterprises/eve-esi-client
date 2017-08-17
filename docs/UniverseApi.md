# UniverseApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUniverseBloodlines**](UniverseApi.md#getUniverseBloodlines) | **GET** /universe/bloodlines/ | Get bloodlines
[**getUniverseCategories**](UniverseApi.md#getUniverseCategories) | **GET** /universe/categories/ | Get item categories
[**getUniverseCategoriesCategoryId**](UniverseApi.md#getUniverseCategoriesCategoryId) | **GET** /universe/categories/{category_id}/ | Get item category information
[**getUniverseConstellations**](UniverseApi.md#getUniverseConstellations) | **GET** /universe/constellations/ | Get constellations
[**getUniverseConstellationsConstellationId**](UniverseApi.md#getUniverseConstellationsConstellationId) | **GET** /universe/constellations/{constellation_id}/ | Get constellation information
[**getUniverseFactions**](UniverseApi.md#getUniverseFactions) | **GET** /universe/factions/ | Get factions
[**getUniverseGraphics**](UniverseApi.md#getUniverseGraphics) | **GET** /universe/graphics/ | Get graphics
[**getUniverseGraphicsGraphicId**](UniverseApi.md#getUniverseGraphicsGraphicId) | **GET** /universe/graphics/{graphic_id}/ | Get graphic information
[**getUniverseGroups**](UniverseApi.md#getUniverseGroups) | **GET** /universe/groups/ | Get item groups
[**getUniverseGroupsGroupId**](UniverseApi.md#getUniverseGroupsGroupId) | **GET** /universe/groups/{group_id}/ | Get item group information
[**getUniverseMoonsMoonId**](UniverseApi.md#getUniverseMoonsMoonId) | **GET** /universe/moons/{moon_id}/ | Get moon information
[**getUniversePlanetsPlanetId**](UniverseApi.md#getUniversePlanetsPlanetId) | **GET** /universe/planets/{planet_id}/ | Get planet information
[**getUniverseRaces**](UniverseApi.md#getUniverseRaces) | **GET** /universe/races/ | Get character races
[**getUniverseRegions**](UniverseApi.md#getUniverseRegions) | **GET** /universe/regions/ | Get regions
[**getUniverseRegionsRegionId**](UniverseApi.md#getUniverseRegionsRegionId) | **GET** /universe/regions/{region_id}/ | Get region information
[**getUniverseStargatesStargateId**](UniverseApi.md#getUniverseStargatesStargateId) | **GET** /universe/stargates/{stargate_id}/ | Get stargate information
[**getUniverseStationsStationId**](UniverseApi.md#getUniverseStationsStationId) | **GET** /universe/stations/{station_id}/ | Get station information
[**getUniverseStructures**](UniverseApi.md#getUniverseStructures) | **GET** /universe/structures/ | List all public structures
[**getUniverseStructuresStructureId**](UniverseApi.md#getUniverseStructuresStructureId) | **GET** /universe/structures/{structure_id}/ | Get structure information
[**getUniverseSystemJumps**](UniverseApi.md#getUniverseSystemJumps) | **GET** /universe/system_jumps/ | Get system jumps
[**getUniverseSystemKills**](UniverseApi.md#getUniverseSystemKills) | **GET** /universe/system_kills/ | Get system kills
[**getUniverseSystems**](UniverseApi.md#getUniverseSystems) | **GET** /universe/systems/ | Get solar systems
[**getUniverseSystemsSystemId**](UniverseApi.md#getUniverseSystemsSystemId) | **GET** /universe/systems/{system_id}/ | Get solar system information
[**getUniverseTypes**](UniverseApi.md#getUniverseTypes) | **GET** /universe/types/ | Get types
[**getUniverseTypesTypeId**](UniverseApi.md#getUniverseTypesTypeId) | **GET** /universe/types/{type_id}/ | Get type information


<a name="getUniverseBloodlines"></a>
# **getUniverseBloodlines**
> List&lt;GetUniverseBloodlines200Ok&gt; getUniverseBloodlines(datasource, language, userAgent, xUserAgent)

Get bloodlines

Get a list of bloodlines  --- Alternate route: &#x60;/v1/universe/bloodlines/&#x60;  Alternate route: &#x60;/legacy/universe/bloodlines/&#x60;  Alternate route: &#x60;/dev/universe/bloodlines/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetUniverseBloodlines200Ok> result = apiInstance.getUniverseBloodlines(datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseBloodlines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetUniverseBloodlines200Ok&gt;**](GetUniverseBloodlines200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseCategories"></a>
# **getUniverseCategories**
> List&lt;Integer&gt; getUniverseCategories(datasource, userAgent, xUserAgent)

Get item categories

Get a list of item categories  --- Alternate route: &#x60;/v1/universe/categories/&#x60;  Alternate route: &#x60;/legacy/universe/categories/&#x60;  Alternate route: &#x60;/dev/universe/categories/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseCategories(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseCategories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseCategoriesCategoryId"></a>
# **getUniverseCategoriesCategoryId**
> GetUniverseCategoriesCategoryIdOk getUniverseCategoriesCategoryId(categoryId, datasource, language, userAgent, xUserAgent)

Get item category information

Get information of an item category  --- Alternate route: &#x60;/v1/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/legacy/universe/categories/{category_id}/&#x60;  Alternate route: &#x60;/dev/universe/categories/{category_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer categoryId = 56; // Integer | An Eve item category ID
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseCategoriesCategoryIdOk result = apiInstance.getUniverseCategoriesCategoryId(categoryId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseCategoriesCategoryId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Integer**| An Eve item category ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseCategoriesCategoryIdOk**](GetUniverseCategoriesCategoryIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseConstellations"></a>
# **getUniverseConstellations**
> List&lt;Integer&gt; getUniverseConstellations(datasource, userAgent, xUserAgent)

Get constellations

Get a list of constellations  --- Alternate route: &#x60;/v1/universe/constellations/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/&#x60;  Alternate route: &#x60;/dev/universe/constellations/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseConstellations(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseConstellations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseConstellationsConstellationId"></a>
# **getUniverseConstellationsConstellationId**
> GetUniverseConstellationsConstellationIdOk getUniverseConstellationsConstellationId(constellationId, datasource, language, userAgent, xUserAgent)

Get constellation information

Get information on a constellation  --- Alternate route: &#x60;/v1/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/legacy/universe/constellations/{constellation_id}/&#x60;  Alternate route: &#x60;/dev/universe/constellations/{constellation_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer constellationId = 56; // Integer | constellation_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseConstellationsConstellationIdOk result = apiInstance.getUniverseConstellationsConstellationId(constellationId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseConstellationsConstellationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **constellationId** | **Integer**| constellation_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseConstellationsConstellationIdOk**](GetUniverseConstellationsConstellationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseFactions"></a>
# **getUniverseFactions**
> List&lt;GetUniverseFactions200Ok&gt; getUniverseFactions(datasource, language, userAgent, xUserAgent)

Get factions

Get a list of factions  --- Alternate route: &#x60;/v1/universe/factions/&#x60;  Alternate route: &#x60;/legacy/universe/factions/&#x60;  Alternate route: &#x60;/dev/universe/factions/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetUniverseFactions200Ok> result = apiInstance.getUniverseFactions(datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseFactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetUniverseFactions200Ok&gt;**](GetUniverseFactions200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGraphics"></a>
# **getUniverseGraphics**
> List&lt;Integer&gt; getUniverseGraphics(datasource, userAgent, xUserAgent)

Get graphics

Get a list of graphics  --- Alternate route: &#x60;/v1/universe/graphics/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/&#x60;  Alternate route: &#x60;/dev/universe/graphics/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseGraphics(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseGraphics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGraphicsGraphicId"></a>
# **getUniverseGraphicsGraphicId**
> GetUniverseGraphicsGraphicIdOk getUniverseGraphicsGraphicId(graphicId, datasource, userAgent, xUserAgent)

Get graphic information

Get information on a graphic  --- Alternate route: &#x60;/v1/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/graphics/{graphic_id}/&#x60;  Alternate route: &#x60;/dev/universe/graphics/{graphic_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer graphicId = 56; // Integer | graphic_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseGraphicsGraphicIdOk result = apiInstance.getUniverseGraphicsGraphicId(graphicId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseGraphicsGraphicId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **graphicId** | **Integer**| graphic_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseGraphicsGraphicIdOk**](GetUniverseGraphicsGraphicIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGroups"></a>
# **getUniverseGroups**
> List&lt;Integer&gt; getUniverseGroups(datasource, page, userAgent, xUserAgent)

Get item groups

Get a list of item groups  --- Alternate route: &#x60;/v1/universe/groups/&#x60;  Alternate route: &#x60;/legacy/universe/groups/&#x60;  Alternate route: &#x60;/dev/universe/groups/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page of results to return
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseGroups(datasource, page, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseGroupsGroupId"></a>
# **getUniverseGroupsGroupId**
> GetUniverseGroupsGroupIdOk getUniverseGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent)

Get item group information

Get information on an item group  --- Alternate route: &#x60;/v1/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/universe/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/universe/groups/{group_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer groupId = 56; // Integer | An Eve item group ID
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseGroupsGroupIdOk result = apiInstance.getUniverseGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseGroupsGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| An Eve item group ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseGroupsGroupIdOk**](GetUniverseGroupsGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseMoonsMoonId"></a>
# **getUniverseMoonsMoonId**
> GetUniverseMoonsMoonIdOk getUniverseMoonsMoonId(moonId, datasource, userAgent, xUserAgent)

Get moon information

Get information on a moon  --- Alternate route: &#x60;/v1/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/legacy/universe/moons/{moon_id}/&#x60;  Alternate route: &#x60;/dev/universe/moons/{moon_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer moonId = 56; // Integer | moon_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseMoonsMoonIdOk result = apiInstance.getUniverseMoonsMoonId(moonId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseMoonsMoonId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **moonId** | **Integer**| moon_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseMoonsMoonIdOk**](GetUniverseMoonsMoonIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniversePlanetsPlanetId"></a>
# **getUniversePlanetsPlanetId**
> GetUniversePlanetsPlanetIdOk getUniversePlanetsPlanetId(planetId, datasource, userAgent, xUserAgent)

Get planet information

Get information on a planet  --- Alternate route: &#x60;/v1/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/legacy/universe/planets/{planet_id}/&#x60;  Alternate route: &#x60;/dev/universe/planets/{planet_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer planetId = 56; // Integer | planet_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniversePlanetsPlanetIdOk result = apiInstance.getUniversePlanetsPlanetId(planetId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniversePlanetsPlanetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planetId** | **Integer**| planet_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniversePlanetsPlanetIdOk**](GetUniversePlanetsPlanetIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseRaces"></a>
# **getUniverseRaces**
> List&lt;GetUniverseRaces200Ok&gt; getUniverseRaces(datasource, language, userAgent, xUserAgent)

Get character races

Get a list of character races  --- Alternate route: &#x60;/v1/universe/races/&#x60;  Alternate route: &#x60;/legacy/universe/races/&#x60;  Alternate route: &#x60;/dev/universe/races/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetUniverseRaces200Ok> result = apiInstance.getUniverseRaces(datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseRaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetUniverseRaces200Ok&gt;**](GetUniverseRaces200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseRegions"></a>
# **getUniverseRegions**
> List&lt;Integer&gt; getUniverseRegions(datasource, userAgent, xUserAgent)

Get regions

Get a list of regions  --- Alternate route: &#x60;/v1/universe/regions/&#x60;  Alternate route: &#x60;/legacy/universe/regions/&#x60;  Alternate route: &#x60;/dev/universe/regions/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseRegions(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseRegions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseRegionsRegionId"></a>
# **getUniverseRegionsRegionId**
> GetUniverseRegionsRegionIdOk getUniverseRegionsRegionId(regionId, datasource, language, userAgent, xUserAgent)

Get region information

Get information on a region  --- Alternate route: &#x60;/v1/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/legacy/universe/regions/{region_id}/&#x60;  Alternate route: &#x60;/dev/universe/regions/{region_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer regionId = 56; // Integer | region_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseRegionsRegionIdOk result = apiInstance.getUniverseRegionsRegionId(regionId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseRegionsRegionId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regionId** | **Integer**| region_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseRegionsRegionIdOk**](GetUniverseRegionsRegionIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStargatesStargateId"></a>
# **getUniverseStargatesStargateId**
> GetUniverseStargatesStargateIdOk getUniverseStargatesStargateId(stargateId, datasource, userAgent, xUserAgent)

Get stargate information

Get information on a stargate  --- Alternate route: &#x60;/v1/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/legacy/universe/stargates/{stargate_id}/&#x60;  Alternate route: &#x60;/dev/universe/stargates/{stargate_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer stargateId = 56; // Integer | stargate_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseStargatesStargateIdOk result = apiInstance.getUniverseStargatesStargateId(stargateId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseStargatesStargateId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stargateId** | **Integer**| stargate_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseStargatesStargateIdOk**](GetUniverseStargatesStargateIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStationsStationId"></a>
# **getUniverseStationsStationId**
> GetUniverseStationsStationIdOk getUniverseStationsStationId(stationId, datasource, userAgent, xUserAgent)

Get station information

Get information on a station  --- Alternate route: &#x60;/v2/universe/stations/{station_id}/&#x60;  Alternate route: &#x60;/dev/universe/stations/{station_id}/&#x60;  --- This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer stationId = 56; // Integer | station_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseStationsStationIdOk result = apiInstance.getUniverseStationsStationId(stationId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseStationsStationId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stationId** | **Integer**| station_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseStationsStationIdOk**](GetUniverseStationsStationIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStructures"></a>
# **getUniverseStructures**
> List&lt;Long&gt; getUniverseStructures(datasource, userAgent, xUserAgent)

List all public structures

List all public structures  --- Alternate route: &#x60;/v1/universe/structures/&#x60;  Alternate route: &#x60;/legacy/universe/structures/&#x60;  Alternate route: &#x60;/dev/universe/structures/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Long> result = apiInstance.getUniverseStructures(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseStructures");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Long&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseStructuresStructureId"></a>
# **getUniverseStructuresStructureId**
> GetUniverseStructuresStructureIdOk getUniverseStructuresStructureId(structureId, datasource, token, userAgent, xUserAgent)

Get structure information

Returns information on requested structure, if you are on the ACL. Otherwise, returns \&quot;Forbidden\&quot; for all inputs.  --- Alternate route: &#x60;/v1/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/legacy/universe/structures/{structure_id}/&#x60;  Alternate route: &#x60;/dev/universe/structures/{structure_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UniverseApi apiInstance = new UniverseApi();
Long structureId = 789L; // Long | An Eve structure ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseStructuresStructureIdOk result = apiInstance.getUniverseStructuresStructureId(structureId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseStructuresStructureId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **structureId** | **Long**| An Eve structure ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseStructuresStructureIdOk**](GetUniverseStructuresStructureIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystemJumps"></a>
# **getUniverseSystemJumps**
> List&lt;GetUniverseSystemJumps200Ok&gt; getUniverseSystemJumps(datasource, userAgent, xUserAgent)

Get system jumps

Get the number of jumps in solar systems within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with jumps will be listed  --- Alternate route: &#x60;/v1/universe/system_jumps/&#x60;  Alternate route: &#x60;/legacy/universe/system_jumps/&#x60;  Alternate route: &#x60;/dev/universe/system_jumps/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetUniverseSystemJumps200Ok> result = apiInstance.getUniverseSystemJumps(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseSystemJumps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetUniverseSystemJumps200Ok&gt;**](GetUniverseSystemJumps200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystemKills"></a>
# **getUniverseSystemKills**
> List&lt;GetUniverseSystemKills200Ok&gt; getUniverseSystemKills(datasource, userAgent, xUserAgent)

Get system kills

Get the number of ship, pod and NPC kills per solar system within the last hour ending at the timestamp of the Last-Modified header, excluding wormhole space. Only systems with kills will be listed  --- Alternate route: &#x60;/v2/universe/system_kills/&#x60;  Alternate route: &#x60;/dev/universe/system_kills/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetUniverseSystemKills200Ok> result = apiInstance.getUniverseSystemKills(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseSystemKills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetUniverseSystemKills200Ok&gt;**](GetUniverseSystemKills200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystems"></a>
# **getUniverseSystems**
> List&lt;Integer&gt; getUniverseSystems(datasource, userAgent, xUserAgent)

Get solar systems

Get a list of solar systems  --- Alternate route: &#x60;/v1/universe/systems/&#x60;  Alternate route: &#x60;/legacy/universe/systems/&#x60;  Alternate route: &#x60;/dev/universe/systems/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseSystems(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseSystems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSystemsSystemId"></a>
# **getUniverseSystemsSystemId**
> GetUniverseSystemsSystemIdOk getUniverseSystemsSystemId(systemId, datasource, language, userAgent, xUserAgent)

Get solar system information

Get information on a solar system  --- Alternate route: &#x60;/v2/universe/systems/{system_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer systemId = 56; // Integer | system_id integer
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseSystemsSystemIdOk result = apiInstance.getUniverseSystemsSystemId(systemId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseSystemsSystemId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **Integer**| system_id integer |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseSystemsSystemIdOk**](GetUniverseSystemsSystemIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseTypes"></a>
# **getUniverseTypes**
> List&lt;Integer&gt; getUniverseTypes(datasource, page, userAgent, xUserAgent)

Get types

Get a list of type ids  --- Alternate route: &#x60;/v1/universe/types/&#x60;  Alternate route: &#x60;/legacy/universe/types/&#x60;  Alternate route: &#x60;/dev/universe/types/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | Which page of results to return
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getUniverseTypes(datasource, page, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseTypesTypeId"></a>
# **getUniverseTypesTypeId**
> GetUniverseTypesTypeIdOk getUniverseTypesTypeId(typeId, datasource, language, userAgent, xUserAgent)

Get type information

Get information on a type  --- Alternate route: &#x60;/v2/universe/types/{type_id}/&#x60;  Alternate route: &#x60;/legacy/universe/types/{type_id}/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.UniverseApi;


UniverseApi apiInstance = new UniverseApi();
Integer typeId = 56; // Integer | An Eve item type ID
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseTypesTypeIdOk result = apiInstance.getUniverseTypesTypeId(typeId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UniverseApi#getUniverseTypesTypeId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | **Integer**| An Eve item type ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseTypesTypeIdOk**](GetUniverseTypesTypeIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

