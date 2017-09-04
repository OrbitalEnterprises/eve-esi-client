# FactionWarfareApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFwLeaderboards**](FactionWarfareApi.md#getFwLeaderboards) | **GET** /fw/leaderboards/ | List of the top factions in faction warfare
[**getFwLeaderboardsCharacters**](FactionWarfareApi.md#getFwLeaderboardsCharacters) | **GET** /fw/leaderboards/characters/ | List of the top pilots in faction warfare
[**getFwLeaderboardsCorporations**](FactionWarfareApi.md#getFwLeaderboardsCorporations) | **GET** /fw/leaderboards/corporations/ | List of the top corporations in faction warfare
[**getFwStats**](FactionWarfareApi.md#getFwStats) | **GET** /fw/stats/ | An overview of statistics about factions involved in faction warfare
[**getFwSystems**](FactionWarfareApi.md#getFwSystems) | **GET** /fw/systems/ | Ownership of faction warfare systems
[**getFwWars**](FactionWarfareApi.md#getFwWars) | **GET** /fw/wars/ | Data about which NPC factions are at war


<a name="getFwLeaderboards"></a>
# **getFwLeaderboards**
> GetFwLeaderboardsOk getFwLeaderboards(datasource, userAgent, xUserAgent)

List of the top factions in faction warfare

Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday.  --- Alternate route: &#x60;/v1/fw/leaderboards/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/&#x60;  Alternate route: &#x60;/dev/fw/leaderboards/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetFwLeaderboardsOk result = apiInstance.getFwLeaderboards(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwLeaderboards");
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

[**GetFwLeaderboardsOk**](GetFwLeaderboardsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwLeaderboardsCharacters"></a>
# **getFwLeaderboardsCharacters**
> GetFwLeaderboardsCharactersOk getFwLeaderboardsCharacters(datasource, userAgent, xUserAgent)

List of the top pilots in faction warfare

Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday.  --- Alternate route: &#x60;/v1/fw/leaderboards/characters/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/characters/&#x60;  Alternate route: &#x60;/dev/fw/leaderboards/characters/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetFwLeaderboardsCharactersOk result = apiInstance.getFwLeaderboardsCharacters(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwLeaderboardsCharacters");
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

[**GetFwLeaderboardsCharactersOk**](GetFwLeaderboardsCharactersOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwLeaderboardsCorporations"></a>
# **getFwLeaderboardsCorporations**
> GetFwLeaderboardsCorporationsOk getFwLeaderboardsCorporations(datasource, userAgent, xUserAgent)

List of the top corporations in faction warfare

Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday.  --- Alternate route: &#x60;/v1/fw/leaderboards/corporations/&#x60;  Alternate route: &#x60;/legacy/fw/leaderboards/corporations/&#x60;  Alternate route: &#x60;/dev/fw/leaderboards/corporations/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetFwLeaderboardsCorporationsOk result = apiInstance.getFwLeaderboardsCorporations(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwLeaderboardsCorporations");
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

[**GetFwLeaderboardsCorporationsOk**](GetFwLeaderboardsCorporationsOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwStats"></a>
# **getFwStats**
> List&lt;GetFwStats200Ok&gt; getFwStats(datasource, userAgent, xUserAgent)

An overview of statistics about factions involved in faction warfare

Statistical overviews of factions involved in faction warfare  --- Alternate route: &#x60;/v1/fw/stats/&#x60;  Alternate route: &#x60;/legacy/fw/stats/&#x60;  Alternate route: &#x60;/dev/fw/stats/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetFwStats200Ok> result = apiInstance.getFwStats(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwStats");
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

[**List&lt;GetFwStats200Ok&gt;**](GetFwStats200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwSystems"></a>
# **getFwSystems**
> List&lt;GetFwSystems200Ok&gt; getFwSystems(datasource, userAgent, xUserAgent)

Ownership of faction warfare systems

An overview of the current ownership of faction warfare solar systems  --- Alternate route: &#x60;/v1/fw/systems/&#x60;  Alternate route: &#x60;/legacy/fw/systems/&#x60;  Alternate route: &#x60;/dev/fw/systems/&#x60;  --- This route is cached for up to 1800 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetFwSystems200Ok> result = apiInstance.getFwSystems(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwSystems");
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

[**List&lt;GetFwSystems200Ok&gt;**](GetFwSystems200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFwWars"></a>
# **getFwWars**
> List&lt;GetFwWars200Ok&gt; getFwWars(datasource, userAgent, xUserAgent)

Data about which NPC factions are at war

Data about which NPC factions are at war  --- Alternate route: &#x60;/v1/fw/wars/&#x60;  Alternate route: &#x60;/legacy/fw/wars/&#x60;  Alternate route: &#x60;/dev/fw/wars/&#x60;  --- This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.FactionWarfareApi;


FactionWarfareApi apiInstance = new FactionWarfareApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetFwWars200Ok> result = apiInstance.getFwWars(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FactionWarfareApi#getFwWars");
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

[**List&lt;GetFwWars200Ok&gt;**](GetFwWars200Ok.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

