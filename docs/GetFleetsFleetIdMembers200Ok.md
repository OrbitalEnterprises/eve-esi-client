
# GetFleetsFleetIdMembers200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**characterId** | **Integer** | character_id integer | 
**shipTypeId** | **Integer** | ship_type_id integer | 
**wingId** | **Long** | ID of the wing the member is in. If not applicable, will be set to -1 | 
**squadId** | **Long** | ID of the squad the member is in. If not applicable, will be set to -1 | 
**role** | [**RoleEnum**](#RoleEnum) | Member’s role in fleet | 
**roleName** | **String** | Localized role names | 
**joinTime** | [**DateTime**](DateTime.md) | join_time string | 
**takesFleetWarp** | **Boolean** | Whether the member take fleet warps | 
**solarSystemId** | **Integer** | Solar system the member is located in | 
**stationId** | **Long** | Station in which the member is docked in, if applicable |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
FLEET_COMMANDER | &quot;fleet_commander&quot;
WING_COMMANDER | &quot;wing_commander&quot;
SQUAD_COMMANDER | &quot;squad_commander&quot;
SQUAD_MEMBER | &quot;squad_member&quot;



