
# GetCorporationsCorporationIdStructures200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporationId** | **Integer** | ID of the corporation that owns the structure | 
**fuelExpires** | [**DateTime**](DateTime.md) | Date on which the structure will run out of fuel |  [optional]
**nextReinforceApply** | [**DateTime**](DateTime.md) | The date and time when the structure&#39;s newly requested reinforcement times (e.g. next_reinforce_hour and next_reinforce_day) will take effect |  [optional]
**nextReinforceHour** | **Integer** | The requested change to reinforce_hour that will take effect at the time shown by next_reinforce_apply |  [optional]
**nextReinforceWeekday** | **Integer** | The requested change to reinforce_weekday that will take effect at the time shown by next_reinforce_apply |  [optional]
**profileId** | **Integer** | The id of the ACL profile for this citadel | 
**reinforceHour** | **Integer** | The hour of day that determines the four hour window when the structure will randomly exit its reinforcement periods and become vulnerable to attack against its armor and/or hull. The structure will become vulnerable at a random time that is +/- 2 hours centered on the value of this property | 
**reinforceWeekday** | **Integer** | The day of the week when the structure exits its final reinforcement period and becomes vulnerable to attack against its hull. Monday is 0 and Sunday is 6 |  [optional]
**services** | [**List&lt;GetCorporationsCorporationIdStructuresService&gt;**](GetCorporationsCorporationIdStructuresService.md) | Contains a list of service upgrades, and their state |  [optional]
**state** | [**StateEnum**](#StateEnum) | state string | 
**stateTimerEnd** | [**DateTime**](DateTime.md) | Date at which the structure will move to it&#39;s next state |  [optional]
**stateTimerStart** | [**DateTime**](DateTime.md) | Date at which the structure entered it&#39;s current state |  [optional]
**structureId** | **Long** | The Item ID of the structure | 
**systemId** | **Integer** | The solar system the structure is in | 
**typeId** | **Integer** | The type id of the structure | 
**unanchorsAt** | [**DateTime**](DateTime.md) | Date at which the structure will unanchor |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ANCHOR_VULNERABLE | &quot;anchor_vulnerable&quot;
ANCHORING | &quot;anchoring&quot;
ARMOR_REINFORCE | &quot;armor_reinforce&quot;
ARMOR_VULNERABLE | &quot;armor_vulnerable&quot;
DEPLOY_VULNERABLE | &quot;deploy_vulnerable&quot;
FITTING_INVULNERABLE | &quot;fitting_invulnerable&quot;
HULL_REINFORCE | &quot;hull_reinforce&quot;
HULL_VULNERABLE | &quot;hull_vulnerable&quot;
ONLINE_DEPRECATED | &quot;online_deprecated&quot;
ONLINING_VULNERABLE | &quot;onlining_vulnerable&quot;
SHIELD_VULNERABLE | &quot;shield_vulnerable&quot;
UNANCHORED | &quot;unanchored&quot;
UNKNOWN | &quot;unknown&quot;



