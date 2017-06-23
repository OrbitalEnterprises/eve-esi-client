# ContactsApi

All URIs are relative to *https://esi.tech.ccp.is/latest*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCharactersCharacterIdContacts**](ContactsApi.md#deleteCharactersCharacterIdContacts) | **DELETE** /characters/{character_id}/contacts/ | Delete contacts
[**getCharactersCharacterIdContacts**](ContactsApi.md#getCharactersCharacterIdContacts) | **GET** /characters/{character_id}/contacts/ | Get contacts
[**getCharactersCharacterIdContactsLabels**](ContactsApi.md#getCharactersCharacterIdContactsLabels) | **GET** /characters/{character_id}/contacts/labels/ | Get contact labels
[**postCharactersCharacterIdContacts**](ContactsApi.md#postCharactersCharacterIdContacts) | **POST** /characters/{character_id}/contacts/ | Add contacts
[**putCharactersCharacterIdContacts**](ContactsApi.md#putCharactersCharacterIdContacts) | **PUT** /characters/{character_id}/contacts/ | Edit contacts


<a name="deleteCharactersCharacterIdContacts"></a>
# **deleteCharactersCharacterIdContacts**
> deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token, userAgent, xUserAgent)

Delete contacts

Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
Integer characterId = 56; // Integer | ID for a character
List<Integer> contactIds = Arrays.asList(new List<Integer>()); // List<Integer> | A list of contacts to delete
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource, token, userAgent, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to delete |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContacts"></a>
# **getCharactersCharacterIdContacts**
> List&lt;GetCharactersCharacterIdContacts200Ok&gt; getCharactersCharacterIdContacts(characterId, datasource, page, token, userAgent, xUserAgent)

Get contacts

Return contacts of a character  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60;   ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
Integer characterId = 56; // Integer | ID for a character
String datasource = "tranquility"; // String | The server name you would like data from
Integer page = 1; // Integer | page integer
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdContacts200Ok> result = apiInstance.getCharactersCharacterIdContacts(characterId, datasource, page, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **page** | **Integer**| page integer | [optional] [default to 1]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdContacts200Ok&gt;**](GetCharactersCharacterIdContacts200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContactsLabels"></a>
# **getCharactersCharacterIdContactsLabels**
> List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt; getCharactersCharacterIdContactsLabels(characterId, datasource, token, userAgent, xUserAgent)

Get contact labels

Return custom labels for contacts the character defined  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/labels/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/labels/&#x60;   ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
Integer characterId = 56; // Integer | ID for a character
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<GetCharactersCharacterIdContactsLabels200Ok> result = apiInstance.getCharactersCharacterIdContactsLabels(characterId, datasource, token, userAgent, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getCharactersCharacterIdContactsLabels");
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

[**List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt;**](GetCharactersCharacterIdContactsLabels200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdContacts"></a>
# **postCharactersCharacterIdContacts**
> List&lt;Integer&gt; postCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent)

Add contacts

Bulk add contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
Integer characterId = 56; // Integer | ID for a character
List<Integer> contactIds = Arrays.asList(new List<Integer>()); // List<Integer> | A list of contacts to add
Float standing = 3.4F; // Float | Standing for the new contact
String datasource = "tranquility"; // String | The server name you would like data from
Long labelId = 0L; // Long | Add a custom label to the new contact
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
Boolean watched = false; // Boolean | Whether the new contact should be watched, note this is only effective on characters
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    List<Integer> result = apiInstance.postCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#postCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to add |
 **standing** | **Float**| Standing for the new contact |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **labelId** | **Long**| Add a custom label to the new contact | [optional] [default to 0]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **watched** | **Boolean**| Whether the new contact should be watched, note this is only effective on characters | [optional] [default to false]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCharactersCharacterIdContacts"></a>
# **putCharactersCharacterIdContacts**
> putCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent)

Edit contacts

Bulk edit contacts with same settings  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 

### Example
```java
// Import classes:
//import enterprises.orbital.eve.esi.client.invoker.ApiClient;
//import enterprises.orbital.eve.esi.client.invoker.ApiException;
//import enterprises.orbital.eve.esi.client.invoker.Configuration;
//import enterprises.orbital.eve.esi.client.invoker.auth.*;
//import enterprises.orbital.eve.esi.client.api.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ContactsApi apiInstance = new ContactsApi();
Integer characterId = 56; // Integer | ID for a character
List<Integer> contactIds = Arrays.asList(new List<Integer>()); // List<Integer> | A list of contacts to edit
Float standing = 3.4F; // Float | Standing for the contact
String datasource = "tranquility"; // String | The server name you would like data from
Long labelId = 0L; // Long | Add a custom label to the contact, use 0 for clearing label
String token = "token_example"; // String | Access token to use, if preferred over a header
String userAgent = "userAgent_example"; // String | Client identifier, takes precedence over headers
Boolean watched = false; // Boolean | Whether the contact should be watched, note this is only effective on characters
String xUserAgent = "xUserAgent_example"; // String | Client identifier, takes precedence over User-Agent
try {
    apiInstance.putCharactersCharacterIdContacts(characterId, contactIds, standing, datasource, labelId, token, userAgent, watched, xUserAgent);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#putCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to edit |
 **standing** | **Float**| Standing for the contact |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]
 **labelId** | **Long**| Add a custom label to the contact, use 0 for clearing label | [optional] [default to 0]
 **token** | **String**| Access token to use, if preferred over a header | [optional]
 **userAgent** | **String**| Client identifier, takes precedence over headers | [optional]
 **watched** | **Boolean**| Whether the contact should be watched, note this is only effective on characters | [optional] [default to false]
 **xUserAgent** | **String**| Client identifier, takes precedence over User-Agent | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

