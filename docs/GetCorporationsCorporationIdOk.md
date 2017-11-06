
# GetCorporationsCorporationIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporationName** | **String** | the full name of the corporation | 
**ticker** | **String** | the short name of the corporation | 
**memberCount** | **Integer** | member_count integer | 
**ceoId** | **Integer** | ceo_id integer | 
**allianceId** | **Integer** | id of alliance that corporation is a member of, if any |  [optional]
**corporationDescription** | **String** | corporation_description string | 
**taxRate** | **Float** | tax_rate number | 
**creationDate** | [**DateTime**](DateTime.md) | creation_date string |  [optional]
**creatorId** | **Integer** | creator_id integer | 
**url** | **String** | url string | 
**faction** | [**FactionEnum**](#FactionEnum) | faction string |  [optional]


<a name="FactionEnum"></a>
## Enum: FactionEnum
Name | Value
---- | -----
MINMATAR | &quot;Minmatar&quot;
GALLENTE | &quot;Gallente&quot;
CALDARI | &quot;Caldari&quot;
AMARR | &quot;Amarr&quot;



