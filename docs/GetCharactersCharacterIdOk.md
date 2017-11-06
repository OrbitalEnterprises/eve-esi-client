
# GetCharactersCharacterIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name string | 
**description** | **String** | description string |  [optional]
**corporationId** | **Integer** | The character&#39;s corporation ID | 
**allianceId** | **Integer** | The character&#39;s alliance ID |  [optional]
**birthday** | [**DateTime**](DateTime.md) | Creation date of the character | 
**gender** | [**GenderEnum**](#GenderEnum) | gender string | 
**raceId** | **Integer** | race_id integer | 
**bloodlineId** | **Integer** | bloodline_id integer | 
**ancestryId** | **Integer** | ancestry_id integer |  [optional]
**securityStatus** | **Float** | security_status number |  [optional]
**factionId** | **Integer** | ID of the faction the character is fighting for, if the character is enlisted in Factional Warfare |  [optional]


<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
FEMALE | &quot;female&quot;
MALE | &quot;male&quot;



