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
> deleteCharactersCharacterIdContacts(characterId, contactIds, datasource)

Delete contacts

Bulk delete contacts  ---  Alternate route: &#x60;/v1/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/legacy/characters/{character_id}/contacts/&#x60;  Alternate route: &#x60;/dev/characters/{character_id}/contacts/&#x60; 

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
String datasource = "tranquility"; // String | The server name you would like data from
try {
    apiInstance.deleteCharactersCharacterIdContacts(characterId, contactIds, datasource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to edit |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContacts"></a>
# **getCharactersCharacterIdContacts**
> List&lt;GetCharactersCharacterIdContacts200Ok&gt; getCharactersCharacterIdContacts(characterId, page, datasource)

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
Integer page = 1; // Integer | page integer
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<GetCharactersCharacterIdContacts200Ok> result = apiInstance.getCharactersCharacterIdContacts(characterId, page, datasource);
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
 **page** | **Integer**| page integer | [optional] [default to 1]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

[**List&lt;GetCharactersCharacterIdContacts200Ok&gt;**](GetCharactersCharacterIdContacts200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCharactersCharacterIdContactsLabels"></a>
# **getCharactersCharacterIdContactsLabels**
> List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt; getCharactersCharacterIdContactsLabels(characterId, datasource)

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
try {
    List<GetCharactersCharacterIdContactsLabels200Ok> result = apiInstance.getCharactersCharacterIdContactsLabels(characterId, datasource);
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

### Return type

[**List&lt;GetCharactersCharacterIdContactsLabels200Ok&gt;**](GetCharactersCharacterIdContactsLabels200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="postCharactersCharacterIdContacts"></a>
# **postCharactersCharacterIdContacts**
> List&lt;Integer&gt; postCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource)

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
Float standing = 3.4F; // Float | Standing for the new contact
List<Integer> contactIds = Arrays.asList(new List<Integer>()); // List<Integer> | A list of contacts to add
Boolean watched = false; // Boolean | Whether the new contact should be watched, note this is only effective on characters
Long labelId = 0L; // Long | Add a custom label to the new contact
String datasource = "tranquility"; // String | The server name you would like data from
try {
    List<Integer> result = apiInstance.postCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource);
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
 **standing** | **Float**| Standing for the new contact |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to add |
 **watched** | **Boolean**| Whether the new contact should be watched, note this is only effective on characters | [optional] [default to false]
 **labelId** | **Long**| Add a custom label to the new contact | [optional] [default to 0]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

**List&lt;Integer&gt;**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="putCharactersCharacterIdContacts"></a>
# **putCharactersCharacterIdContacts**
> putCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource)

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
Float standing = 3.4F; // Float | Standing for the contact
List<Integer> contactIds = Arrays.asList(new List<Integer>()); // List<Integer> | A list of contacts to edit
Boolean watched = false; // Boolean | Whether the contact should be watched, note this is only effective on characters
Long labelId = 0L; // Long | Add a custom label to the contact, use 0 for clearing label
String datasource = "tranquility"; // String | The server name you would like data from
try {
    apiInstance.putCharactersCharacterIdContacts(characterId, standing, contactIds, watched, labelId, datasource);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#putCharactersCharacterIdContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| ID for a character |
 **standing** | **Float**| Standing for the contact |
 **contactIds** | **List&lt;Integer&gt;**| A list of contacts to edit |
 **watched** | **Boolean**| Whether the contact should be watched, note this is only effective on characters | [optional] [default to false]
 **labelId** | **Long**| Add a custom label to the contact, use 0 for clearing label | [optional] [default to 0]
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility, singularity]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

