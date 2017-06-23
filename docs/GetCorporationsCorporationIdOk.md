
# GetCorporationsCorporationIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allianceId** | **Integer** | id of alliance that corporation is a member of, if any |  [optional]
**ceoId** | **Integer** | ceo_id integer | 
**corporationDescription** | **String** | corporation_description string | 
**corporationName** | **String** | the full name of the corporation | 
**creationDate** | [**DateTime**](DateTime.md) | creation_date string |  [optional]
**creatorId** | **Integer** | creator_id integer | 
**faction** | [**FactionEnum**](#FactionEnum) | faction string |  [optional]
**memberCount** | **Integer** | member_count integer | 
**taxRate** | **Float** | tax_rate number | 
**ticker** | **String** | the short name of the corporation | 
**url** | **String** | url string | 


<a name="FactionEnum"></a>
## Enum: FactionEnum
Name | Value
---- | -----
MINMATAR | &quot;Minmatar&quot;
GALLENTE | &quot;Gallente&quot;
CALDARI | &quot;Caldari&quot;
AMARR | &quot;Amarr&quot;



