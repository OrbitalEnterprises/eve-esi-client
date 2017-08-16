# CalendarApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdCalendar**](CalendarApi.md#getCharactersCharacterIdCalendar) | **GET** /characters/{character_id}/calendar/ | List calendar event summaries
[**getCharactersCharacterIdCalendarEventId**](CalendarApi.md#getCharactersCharacterIdCalendarEventId) | **GET** /characters/{character_id}/calendar/{event_id}/ | Get an event
[**putCharactersCharacterIdCalendarEventId**](CalendarApi.md#putCharactersCharacterIdCalendarEventId) | **PUT** /characters/{character_id}/calendar/{event_id}/ | Respond to an event


<a name="getCharactersCharacterIdCalendar"></a>
# **getCharactersCharacterIdCalendar**
> List&lt;GetCharactersCharacterIdCalendar200Ok&gt; getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, token, userAgent, xUserAgent)

List calendar event summaries

Get 50 event summaries from the calendar. If no event ID is given, the resource will return the next 50 chronological event summaries from now. If an event ID is specified, it will return the next 50 chronological event summaries from after that event.  --- Alternate route: &#x60;/v1/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/calendar/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/&#x60;  --- This route is cached for up to 5 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer fromEvent = 56; // Integer | The event ID to retrieve events from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdCalendar200Ok> result = apiInstance.getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#getCharactersCharacterIdCalendar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **fromEvent** | **Integer**| The event ID to retrieve events from | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdCalendar200Ok&gt;**](GetCharactersCharacterIdCalendar200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdCalendarEventId"></a>
# **getCharactersCharacterIdCalendarEventId**
> GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource, token, userAgent, xUserAgent)

Get an event

Get all the information for a specific event  --- Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60;  --- This route is cached for up to 5 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer eventId = 56; // Integer | The id of the event requested
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    GetCharactersCharacterIdCalendarEventIdOk result = apiInstance.getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#getCharactersCharacterIdCalendarEventId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **eventId** | **Integer**| The id of the event requested |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**GetCharactersCharacterIdCalendarEventIdOk**](GetCharactersCharacterIdCalendarEventIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCharactersCharacterIdCalendarEventId"></a>
# **putCharactersCharacterIdCalendarEventId**
> putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource, token, userAgent, xUserAgent)

Respond to an event

Set your response status to an event  --- Alternate route: &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer eventId = 56; // Integer | The ID of the event requested
PutCharactersCharacterIdCalendarEventIdResponse response = new PutCharactersCharacterIdCalendarEventIdResponse(); // PutCharactersCharacterIdCalendarEventIdResponse | The response value to set, overriding current value.
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#putCharactersCharacterIdCalendarEventId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **eventId** | **Integer**| The ID of the event requested |
 **response** | [**PutCharactersCharacterIdCalendarEventIdResponse**](PutCharactersCharacterIdCalendarEventIdResponse.md)| The response value to set, overriding current value. |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use if unable to set a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

