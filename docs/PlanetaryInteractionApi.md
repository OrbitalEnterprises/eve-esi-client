# PlanetaryInteractionApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdPlanets**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanets) | **GET** /characters/{character_id}/planets/ | Get colonies
[**getCharactersCharacterIdPlanetsPlanetId**](PlanetaryInteractionApi.md#getCharactersCharacterIdPlanetsPlanetId) | **GET** /characters/{character_id}/planets/{planet_id}/ | Get colony layout
[**getUniverseSchematicsSchematicId**](PlanetaryInteractionApi.md#getUniverseSchematicsSchematicId) | **GET** /universe/schematics/{schematic_id}/ | Get schematic information


<a name="getCharactersCharacterIdPlanets"></a>
# **getCharactersCharacterIdPlanets**
> List&lt;GetCharactersCharacterIdPlanets200Ok&gt; getCharactersCharacterIdPlanets(characterId, datasource, token, userAgent, xUserAgent)

Get colonies

Returns a list of all planetary colonies owned by a character.  --- Alternate route: &#x60;/v1/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/planets/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/planets/&#x60;  --- This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.PlanetaryInteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdPlanets200Ok> result = apiInstance.getCharactersCharacterIdPlanets(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getCharactersCharacterIdPlanets");
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

[**List&lt;GetCharactersCharacterIdPlanets200Ok&gt;**](GetCharactersCharacterIdPlanets200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdPlanetsPlanetId"></a>
# **getCharactersCharacterIdPlanetsPlanetId**
> GetCharactersCharacterIdPlanetsPlanetIdOk getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource, token, userAgent, xUserAgent)

Get colony layout

Returns full details on the layout of a single planetary colony, including links, pins and routes. Note: Planetary information is only recalculated when the colony is viewed through the client. Information will not update until this criteria is met.  --- Alternate route: &#x60;/v2/characters/{character_id}/planets/{planet_id}/&#x60;  --- This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.PlanetaryInteractionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer planetId = 56; // Integer | Planet id of the target planet
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCharactersCharacterIdPlanetsPlanetIdOk result = apiInstance.getCharactersCharacterIdPlanetsPlanetId(characterId, planetId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getCharactersCharacterIdPlanetsPlanetId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **planetId** | **Integer**| Planet id of the target planet |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCharactersCharacterIdPlanetsPlanetIdOk**](GetCharactersCharacterIdPlanetsPlanetIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniverseSchematicsSchematicId"></a>
# **getUniverseSchematicsSchematicId**
> GetUniverseSchematicsSchematicIdOk getUniverseSchematicsSchematicId(schematicId, datasource, userAgent, xUserAgent)

Get schematic information

Get information on a planetary factory schematic  --- Alternate route: &#x60;/v1/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/legacy/universe/schematics/{schematic_id}/&#x60;  Alternate route: &#x60;/dev/universe/schematics/{schematic_id}/&#x60;  --- This route is cached for up to 3600 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.api.PlanetaryInteractionApi;


PlanetaryInteractionApi apiInstance = new PlanetaryInteractionApi();
Integer schematicId = 56; // Integer | A PI schematic ID
String datasource = "tranquility"; // String | The server name you would like data from
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetUniverseSchematicsSchematicIdOk result = apiInstance.getUniverseSchematicsSchematicId(schematicId, datasource, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanetaryInteractionApi#getUniverseSchematicsSchematicId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **schematicId** | **Integer**| A PI schematic ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetUniverseSchematicsSchematicIdOk**](GetUniverseSchematicsSchematicIdOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

