
# GetCharactersCharacterIdContacts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contactId** | **Integer** | contact_id integer | 
**contactType** | [**ContactTypeEnum**](#ContactTypeEnum) | contact_type string | 
**isBlocked** | **Boolean** | Whether this contact is in the blocked list. Note a missing value denotes unknown, not true or false |  [optional]
**isWatched** | **Boolean** | Whether this contact is being watched |  [optional]
**labelIds** | **List&lt;Long&gt;** | label_ids array |  [optional]
**standing** | **Float** | Standing of the contact | 


<a name="ContactTypeEnum"></a>
## Enum: ContactTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;



