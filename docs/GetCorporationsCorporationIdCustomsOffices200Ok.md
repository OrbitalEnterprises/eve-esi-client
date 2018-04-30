
# GetCorporationsCorporationIdCustomsOffices200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allianceTaxRate** | **Float** | Only present if alliance access is allowed |  [optional]
**allowAccessWithStandings** | **Boolean** | standing_level and any standing related tax rate only present when this is true | 
**allowAllianceAccess** | **Boolean** | allow_alliance_access boolean | 
**badStandingTaxRate** | **Float** | bad_standing_tax_rate number |  [optional]
**corporationTaxRate** | **Float** | corporation_tax_rate number |  [optional]
**excellentStandingTaxRate** | **Float** | Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates |  [optional]
**goodStandingTaxRate** | **Float** | good_standing_tax_rate number |  [optional]
**neutralStandingTaxRate** | **Float** | neutral_standing_tax_rate number |  [optional]
**officeId** | **Long** | unique ID of this customs office | 
**reinforceExitEnd** | **Integer** | reinforce_exit_end integer | 
**reinforceExitStart** | **Integer** | Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack | 
**standingLevel** | [**StandingLevelEnum**](#StandingLevelEnum) | Access is allowed only for entities with this level of standing or better |  [optional]
**systemId** | **Integer** | ID of the solar system this customs office is located in | 
**terribleStandingTaxRate** | **Float** | terrible_standing_tax_rate number |  [optional]


<a name="StandingLevelEnum"></a>
## Enum: StandingLevelEnum
Name | Value
---- | -----
BAD | &quot;bad&quot;
EXCELLENT | &quot;excellent&quot;
GOOD | &quot;good&quot;
NEUTRAL | &quot;neutral&quot;
TERRIBLE | &quot;terrible&quot;



