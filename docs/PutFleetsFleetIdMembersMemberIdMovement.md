
# PutFleetsFleetIdMembersMemberIdMovement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | [**RoleEnum**](#RoleEnum) | If a character is moved to the &#x60;fleet_commander&#x60; role, neither &#x60;wing_id&#x60; or &#x60;squad_id&#x60; should be specified. If a character is moved to the &#x60;wing_commander&#x60; role, only &#x60;wing_id&#x60; should be specified. If a character is moved to the &#x60;squad_commander&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified. If a character is moved to the &#x60;squad_member&#x60; role, both &#x60;wing_id&#x60; and &#x60;squad_id&#x60; should be specified. | 
**squadId** | **Long** | squad_id integer |  [optional]
**wingId** | **Long** | wing_id integer |  [optional]


<a name="RoleEnum"></a>
## Enum: RoleEnum
Name | Value
---- | -----
FLEET_COMMANDER | &quot;fleet_commander&quot;
WING_COMMANDER | &quot;wing_commander&quot;
SQUAD_COMMANDER | &quot;squad_commander&quot;
SQUAD_MEMBER | &quot;squad_member&quot;



