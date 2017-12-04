
# GetCorporationsCorporationIdStructures200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**structureId** | **Long** | The Item ID of the structure | 
**typeId** | **Integer** | The type id of the structure | 
**corporationId** | **Integer** | ID of the corporation that owns the structure | 
**systemId** | **Integer** | The solar system the structure is in | 
**profileId** | **Integer** | The id of the ACL profile for this citadel | 
**currentVul** | [**List&lt;GetCorporationsCorporationIdStructuresCurrentVul&gt;**](GetCorporationsCorporationIdStructuresCurrentVul.md) | This week&#39;s vulnerability windows, Monday is day 0 | 
**nextVul** | [**List&lt;GetCorporationsCorporationIdStructuresNextVul&gt;**](GetCorporationsCorporationIdStructuresNextVul.md) | Next week&#39;s vulnerability windows, Monday is day 0 | 
**fuelExpires** | [**LocalDate**](LocalDate.md) | Date on which the structure will run out of fuel |  [optional]
**services** | [**List&lt;GetCorporationsCorporationIdStructuresService&gt;**](GetCorporationsCorporationIdStructuresService.md) | Contains a list of service upgrades, and their state |  [optional]
**stateTimerStart** | [**LocalDate**](LocalDate.md) | Date at which the structure entered it&#39;s current state |  [optional]
**stateTimerEnd** | [**LocalDate**](LocalDate.md) | Date at which the structure will move to it&#39;s next state |  [optional]
**unanchorsAt** | [**LocalDate**](LocalDate.md) | Date at which the structure will unanchor |  [optional]



