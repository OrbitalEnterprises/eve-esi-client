# OpportunitiesApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdOpportunities**](OpportunitiesApi.md#getCharactersCharacterIdOpportunities) | **GET** /characters/{character_id}/opportunities/ | Get a character&#39;s completed tasks
[**getOpportunitiesGroups**](OpportunitiesApi.md#getOpportunitiesGroups) | **GET** /opportunities/groups/ | Get opportunities groups
[**getOpportunitiesGroupsGroupId**](OpportunitiesApi.md#getOpportunitiesGroupsGroupId) | **GET** /opportunities/groups/{group_id}/ | Get opportunities group
[**getOpportunitiesTasks**](OpportunitiesApi.md#getOpportunitiesTasks) | **GET** /opportunities/tasks/ | Get opportunities tasks
[**getOpportunitiesTasksTaskId**](OpportunitiesApi.md#getOpportunitiesTasksTaskId) | **GET** /opportunities/tasks/{task_id}/ | Get opportunities task


<a name="getCharactersCharacterIdOpportunities"></a>
# **getCharactersCharacterIdOpportunities**
> List&lt;GetCharactersCharacterIdOpportunities200Ok&gt; getCharactersCharacterIdOpportunities(characterId, datasource, token, userAgent, xUserAgent)

Get a character&#39;s completed tasks

Return a list of tasks finished by a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/opportunities/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/opportunities/&#x60;   ---  This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.OpportunitiesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

OpportunitiesApi apiInstance = new OpportunitiesApi();
Integer characterId = 56; // Integer | ID for a character
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdOpportunities200Ok> result = apiInstance.getCharactersCharacterIdOpportunities(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunitiesApi#getCharactersCharacterIdOpportunities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdOpportunities200Ok&gt;**](GetCharactersCharacterIdOpportunities200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpportunitiesGroups"></a>
# **getOpportunitiesGroups**
> List&lt;Integer&gt; getOpportunitiesGroups(datasource, userAgent, xUserAgent)

Get opportunities groups

Return a list of opportunities groups  ---  Alternate route: &#x60;/v1/opportunities/groups/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/&#x60;   ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.OpportunitiesApi;


OpportunitiesApi apiInstance = new OpportunitiesApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getOpportunitiesGroups(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunitiesApi#getOpportunitiesGroups");
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

<a name="getOpportunitiesGroupsGroupId"></a>
# **getOpportunitiesGroupsGroupId**
> GetOpportunitiesGroupsGroupIdOk getOpportunitiesGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent)

Get opportunities group

Return information of an opportunities group  ---  Alternate route: &#x60;/v1/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/groups/{group_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/groups/{group_id}/&#x60;   ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.OpportunitiesApi;


OpportunitiesApi apiInstance = new OpportunitiesApi();
Integer groupId = 56; // Integer | ID of an opportunities group
String datasource = "tranquility"; // String | The server name you would like data from
String language = "en-us"; // String | Language to use in the response
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetOpportunitiesGroupsGroupIdOk result = apiInstance.getOpportunitiesGroupsGroupId(groupId, datasource, language, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunitiesApi#getOpportunitiesGroupsGroupId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Integer**| ID of an opportunities group |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **language** | **String**| Language to use in the response | [optional] [default to en-us] [enum: de, en-us, fr, ja, ru, zh]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetOpportunitiesGroupsGroupIdOk**](GetOpportunitiesGroupsGroupIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOpportunitiesTasks"></a>
# **getOpportunitiesTasks**
> List&lt;Integer&gt; getOpportunitiesTasks(datasource, userAgent, xUserAgent)

Get opportunities tasks

Return a list of opportunities tasks  ---  Alternate route: &#x60;/v1/opportunities/tasks/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/&#x60;   ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.OpportunitiesApi;


OpportunitiesApi apiInstance = new OpportunitiesApi();
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.getOpportunitiesTasks(datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunitiesApi#getOpportunitiesTasks");
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

<a name="getOpportunitiesTasksTaskId"></a>
# **getOpportunitiesTasksTaskId**
> GetOpportunitiesTasksTaskIdOk getOpportunitiesTasksTaskId(taskId, datasource, userAgent, xUserAgent)

Get opportunities task

Return information of an opportunities task  ---  Alternate route: &#x60;/v1/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/legacy/opportunities/tasks/{task_id}/&#x60;  Alternate route: &#x60;/dev/opportunities/tasks/{task_id}/&#x60;   ---  This route expires daily at 11:05

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.OpportunitiesApi;


OpportunitiesApi apiInstance = new OpportunitiesApi();
Integer taskId = 56; // Integer | ID of an opportunities task
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetOpportunitiesTasksTaskIdOk result = apiInstance.getOpportunitiesTasksTaskId(taskId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OpportunitiesApi#getOpportunitiesTasksTaskId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taskId** | **Integer**| ID of an opportunities task |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetOpportunitiesTasksTaskIdOk**](GetOpportunitiesTasksTaskIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

