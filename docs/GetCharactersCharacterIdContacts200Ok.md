
# GetCharactersCharacterIdContacts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**standing** | **Float** | Standing of the contact | 
**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) | contact_type string | 
**contactId** | **Integer** | contact_id integer | 
**isWatched** | **Boolean** | Whether this contact is being watched |  [optional]
**isBlocked** | **Boolean** | Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false |  [optional]
**labelId** | **Long** | Custom label of the contact |  [optional]


<a name="ContactTypeEnum"></a>
## Enum: ContactTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;



