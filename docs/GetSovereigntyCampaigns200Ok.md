
# GetSovereigntyCampaigns200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attackersScore** | **Float** | Score for all attacking parties, only present in Defense Events.  |  [optional]
**campaignId** | **Integer** | Unique ID for this campaign. | 
**constellationId** | **Integer** | The constellation in which the campaign will take place.  | 
**defenderId** | **Integer** | Defending alliance, only present in Defense Events  |  [optional]
**defenderScore** | **Float** | Score for the defending alliance, only present in Defense Events.  |  [optional]
**eventType** | [**EventTypeEnum**](#EventTypeEnum) | Type of event this campaign is for. tcu_defense, ihub_defense and station_defense are referred to as \&quot;Defense Events\&quot;, station_freeport as \&quot;Freeport Events\&quot;.  | 
**participants** | [**List&lt;GetSovereigntyCampaignsParticipant&gt;**](GetSovereigntyCampaignsParticipant.md) | Alliance participating and their respective scores, only present in Freeport Events.  |  [optional]
**solarSystemId** | **Integer** | The solar system the structure is located in.  | 
**startTime** | [**DateTime**](DateTime.md) | Time the event is scheduled to start.  | 
**structureId** | **Long** | The structure item ID that is related to this campaign.  | 


<a name="EventTypeEnum"></a>
## Enum: EventTypeEnum
Name | Value
---- | -----
TCU_DEFENSE | &quot;tcu_defense&quot;
IHUB_DEFENSE | &quot;ihub_defense&quot;
STATION_DEFENSE | &quot;station_defense&quot;
STATION_FREEPORT | &quot;station_freeport&quot;



