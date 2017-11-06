
# GetCharactersCharacterIdChatChannelsBlocked

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessorId** | **Integer** | ID of a blocked channel member | 
**accessorType** | [**AccessorTypeEnum**](#AccessorTypeEnum) | accessor_type string | 
**reason** | **String** | Reason this accessor is blocked |  [optional]
**endAt** | [**DateTime**](DateTime.md) | Time at which this accessor will no longer be blocked |  [optional]


<a name="AccessorTypeEnum"></a>
## Enum: AccessorTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;



