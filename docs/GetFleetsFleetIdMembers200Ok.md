
# GetFleetsFleetIdMembers200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**characterId** | **Integer** | character_id integer | 
**joinTime** | [**DateTime**](DateTime.md) | join_time string | 
**role** | [**RoleEnum**](#RoleEnum) | Member’s role in fleet | 
**roleName** | **String** | Localized role names | 
**shipTypeId** | **Integer** | ship_type_id integer | 
**solarSystemId** | **Integer** | Solar system the member is located in | 
**squadId** | **Long** | ID of the squad the member is in. If not applicable, will be set to -1 | 
**stationId** | **Long** | Station in which the member is docked in, if applicable |  [optional]
**takesFleetWarp** | **Boolean** | Whether the member take fleet warps | 
**wingId** | **Long** | ID of the wing the member is in. If not applicable, will be set to -1 | 


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
FLEET_COMMANDER | &quot;fleet_commander&quot;
WING_COMMANDER | &quot;wing_commander&quot;
SQUAD_COMMANDER | &quot;squad_commander&quot;
SQUAD_MEMBER | &quot;squad_member&quot;



