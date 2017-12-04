
# GetCharactersCharacterIdBlueprints200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **Long** | Unique ID for this item. | 
**typeId** | **Integer** | type_id integer | 
**locationId** | **Long** | References a solar system, station or item_id if this blueprint is located within a container. If the return value is an item_id, then the Character AssetList API must be queried to find the container using the given item_id to determine the correct location of the Blueprint. | 
**locationFlag** | [**LocationFlagEnum**](#LocationFlagEnum) | Type of the location_id | 
**quantity** | **Integer** | A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet). | 
**timeEfficiency** | **Integer** | Time Efficiency Level of the blueprint. | 
**materialEfficiency** | **Integer** | Material Efficiency Level of the blueprint. | 
**runs** | **Integer** | Number of runs remaining if the blueprint is a copy, -1 if it is an original. | 


<a name="LocationFlagEnum"></a>
## Enum: LocationFlagEnum
Name | Value
---- | -----
AUTOFIT | &quot;AutoFit&quot;
CARGO | &quot;Cargo&quot;
CORPSEBAY | &quot;CorpseBay&quot;
DRONEBAY | &quot;DroneBay&quot;
FLEETHANGAR | &quot;FleetHangar&quot;
DELIVERIES | &quot;Deliveries&quot;
HIDDENMODIFIERS | &quot;HiddenModifiers&quot;
HANGAR | &quot;Hangar&quot;
HANGARALL | &quot;HangarAll&quot;
LOSLOT0 | &quot;LoSlot0&quot;
LOSLOT1 | &quot;LoSlot1&quot;
LOSLOT2 | &quot;LoSlot2&quot;
LOSLOT3 | &quot;LoSlot3&quot;
LOSLOT4 | &quot;LoSlot4&quot;
LOSLOT5 | &quot;LoSlot5&quot;
LOSLOT6 | &quot;LoSlot6&quot;
LOSLOT7 | &quot;LoSlot7&quot;
MEDSLOT0 | &quot;MedSlot0&quot;
MEDSLOT1 | &quot;MedSlot1&quot;
MEDSLOT2 | &quot;MedSlot2&quot;
MEDSLOT3 | &quot;MedSlot3&quot;
MEDSLOT4 | &quot;MedSlot4&quot;
MEDSLOT5 | &quot;MedSlot5&quot;
MEDSLOT6 | &quot;MedSlot6&quot;
MEDSLOT7 | &quot;MedSlot7&quot;
HISLOT0 | &quot;HiSlot0&quot;
HISLOT1 | &quot;HiSlot1&quot;
HISLOT2 | &quot;HiSlot2&quot;
HISLOT3 | &quot;HiSlot3&quot;
HISLOT4 | &quot;HiSlot4&quot;
HISLOT5 | &quot;HiSlot5&quot;
HISLOT6 | &quot;HiSlot6&quot;
HISLOT7 | &quot;HiSlot7&quot;
ASSETSAFETY | &quot;AssetSafety&quot;
LOCKED | &quot;Locked&quot;
UNLOCKED | &quot;Unlocked&quot;
IMPLANT | &quot;Implant&quot;
QUAFEBAY | &quot;QuafeBay&quot;
RIGSLOT0 | &quot;RigSlot0&quot;
RIGSLOT1 | &quot;RigSlot1&quot;
RIGSLOT2 | &quot;RigSlot2&quot;
RIGSLOT3 | &quot;RigSlot3&quot;
RIGSLOT4 | &quot;RigSlot4&quot;
RIGSLOT5 | &quot;RigSlot5&quot;
RIGSLOT6 | &quot;RigSlot6&quot;
RIGSLOT7 | &quot;RigSlot7&quot;
SHIPHANGAR | &quot;ShipHangar&quot;
SPECIALIZEDFUELBAY | &quot;SpecializedFuelBay&quot;
SPECIALIZEDOREHOLD | &quot;SpecializedOreHold&quot;
SPECIALIZEDGASHOLD | &quot;SpecializedGasHold&quot;
SPECIALIZEDMINERALHOLD | &quot;SpecializedMineralHold&quot;
SPECIALIZEDSALVAGEHOLD | &quot;SpecializedSalvageHold&quot;
SPECIALIZEDSHIPHOLD | &quot;SpecializedShipHold&quot;
SPECIALIZEDSMALLSHIPHOLD | &quot;SpecializedSmallShipHold&quot;
SPECIALIZEDMEDIUMSHIPHOLD | &quot;SpecializedMediumShipHold&quot;
SPECIALIZEDLARGESHIPHOLD | &quot;SpecializedLargeShipHold&quot;
SPECIALIZEDINDUSTRIALSHIPHOLD | &quot;SpecializedIndustrialShipHold&quot;
SPECIALIZEDAMMOHOLD | &quot;SpecializedAmmoHold&quot;
SPECIALIZEDCOMMANDCENTERHOLD | &quot;SpecializedCommandCenterHold&quot;
SPECIALIZEDPLANETARYCOMMODITIESHOLD | &quot;SpecializedPlanetaryCommoditiesHold&quot;
SPECIALIZEDMATERIALBAY | &quot;SpecializedMaterialBay&quot;
SUBSYSTEMSLOT0 | &quot;SubSystemSlot0&quot;
SUBSYSTEMSLOT1 | &quot;SubSystemSlot1&quot;
SUBSYSTEMSLOT2 | &quot;SubSystemSlot2&quot;
SUBSYSTEMSLOT3 | &quot;SubSystemSlot3&quot;
SUBSYSTEMSLOT4 | &quot;SubSystemSlot4&quot;
SUBSYSTEMSLOT5 | &quot;SubSystemSlot5&quot;
SUBSYSTEMSLOT6 | &quot;SubSystemSlot6&quot;
SUBSYSTEMSLOT7 | &quot;SubSystemSlot7&quot;
FIGHTERBAY | &quot;FighterBay&quot;
FIGHTERTUBE0 | &quot;FighterTube0&quot;
FIGHTERTUBE1 | &quot;FighterTube1&quot;
FIGHTERTUBE2 | &quot;FighterTube2&quot;
FIGHTERTUBE3 | &quot;FighterTube3&quot;
FIGHTERTUBE4 | &quot;FighterTube4&quot;
MODULE | &quot;Module&quot;



