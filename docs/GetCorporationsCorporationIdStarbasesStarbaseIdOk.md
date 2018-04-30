
# GetCorporationsCorporationIdStarbasesStarbaseIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowAllianceMembers** | **Boolean** | allow_alliance_members boolean | 
**allowCorporationMembers** | **Boolean** | allow_corporation_members boolean | 
**anchor** | [**AnchorEnum**](#AnchorEnum) | Who can anchor starbase (POS) and its structures | 
**attackIfAtWar** | **Boolean** | attack_if_at_war boolean | 
**attackIfOtherSecurityStatusDropping** | **Boolean** | attack_if_other_security_status_dropping boolean | 
**attackSecurityStatusThreshold** | **Float** | Starbase (POS) will attack if target&#39;s security standing is lower than this value |  [optional]
**attackStandingThreshold** | **Float** | Starbase (POS) will attack if target&#39;s standing is lower than this value |  [optional]
**fuelBayTake** | [**FuelBayTakeEnum**](#FuelBayTakeEnum) | Who can take fuel blocks out of the starbase (POS)&#39;s fuel bay | 
**fuelBayView** | [**FuelBayViewEnum**](#FuelBayViewEnum) | Who can view the starbase (POS)&#39;s fule bay. Characters either need to have required role or belong to the starbase (POS) owner&#39;s corporation or alliance, as described by the enum, all other access settings follows the same scheme | 
**fuels** | [**List&lt;GetCorporationsCorporationIdStarbasesStarbaseIdFuel&gt;**](GetCorporationsCorporationIdStarbasesStarbaseIdFuel.md) | Fuel blocks and other things that will be consumed when operating a starbase (POS) |  [optional]
**offline** | [**OfflineEnum**](#OfflineEnum) | Who can offline starbase (POS) and its structures | 
**online** | [**OnlineEnum**](#OnlineEnum) | Who can online starbase (POS) and its structures | 
**unanchor** | [**UnanchorEnum**](#UnanchorEnum) | Who can unanchor starbase (POS) and its structures | 
**useAllianceStandings** | **Boolean** | True if the starbase (POS) is using alliance standings, otherwise using corporation&#39;s | 


<a name="AnchorEnum"></a>
## Enum: AnchorEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;


<a name="FuelBayTakeEnum"></a>
## Enum: FuelBayTakeEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;


<a name="FuelBayViewEnum"></a>
## Enum: FuelBayViewEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;


<a name="OfflineEnum"></a>
## Enum: OfflineEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;


<a name="OnlineEnum"></a>
## Enum: OnlineEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;


<a name="UnanchorEnum"></a>
## Enum: UnanchorEnum
Name | Value
---- | -----
ALLIANCE_MEMBER | &quot;alliance_member&quot;
CONFIG_STARBASE_EQUIPMENT_ROLE | &quot;config_starbase_equipment_role&quot;
CORPORATION_MEMBER | &quot;corporation_member&quot;
STARBASE_FUEL_TECHNICIAN_ROLE | &quot;starbase_fuel_technician_role&quot;



