# SkillsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdSkillqueue**](SkillsApi.md#getCharactersCharacterIdSkillqueue) | **GET** /characters/{character_id}/skillqueue/ | Get character&#39;s skill queue
[**getCharactersCharacterIdSkills**](SkillsApi.md#getCharactersCharacterIdSkills) | **GET** /characters/{character_id}/skills/ | Get character skills


<a name="getCharactersCharacterIdSkillqueue"></a>
# **getCharactersCharacterIdSkillqueue**
> List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt; getCharactersCharacterIdSkillqueue(characterId, datasource)

Get character&#39;s skill queue

List the configured skill queue for the given character  ---  Alternate route: &#x60;/v2/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/skillqueue/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/skillqueue/&#x60;   ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.SkillsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SkillsApi apiInstance = new SkillsApi();
Integer characterId = 56; // Integer | Character id of the target character
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetCharactersCharacterIdSkillqueue200Ok> result = apiInstance.getCharactersCharacterIdSkillqueue(characterId, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkillsApi#getCharactersCharacterIdSkillqueue");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| Character id of the target character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt;**](GetCharactersCharacterIdSkillqueue200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdSkills"></a>
# **getCharactersCharacterIdSkills**
> GetCharactersCharacterIdSkillsOk getCharactersCharacterIdSkills(characterId, datasource)

Get character skills

List all trained skills for the given character  ---  Alternate route: &#x60;/v3/characters/{character_id}/skills/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/skills/&#x60;   ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.SkillsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SkillsApi apiInstance = new SkillsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
try {
    GetCharactersCharacterIdSkillsOk result = apiInstance.getCharactersCharacterIdSkills(characterId, datasource);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkillsApi#getCharactersCharacterIdSkills");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**GetCharactersCharacterIdSkillsOk**](GetCharactersCharacterIdSkillsOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

