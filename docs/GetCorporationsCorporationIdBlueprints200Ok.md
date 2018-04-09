
# GetCorporationsCorporationIdBlueprints200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **Long** | Unique ID for this item. | 
**typeId** | **Integer** | type_id integer | 
**locationId** | **Long** | References a solar system, station or item_id if this blueprint is located within a container. | 
**quantity** | **Integer** | A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet). | 
**timeEfficiency** | **Integer** | Time Efficiency Level of the blueprint. | 
**materialEfficiency** | **Integer** | Material Efficiency Level of the blueprint. | 
**runs** | **Integer** | Number of runs remaining if the blueprint is a copy, -1 if it is an original. | 
**locationFlag** | [**LocationFlagEnum**](#LocationFlagEnum) | Type of the location_id | 


<a name="LocationFlagEnum"></a>
## Enum: LocationFlagEnum
Name | Value
---- | -----
ASSETSAFETY | &quot;AssetSafety&quot;
AUTOFIT | &quot;AutoFit&quot;
BONUS | &quot;Bonus&quot;
BOOSTER | &quot;Booster&quot;
BOOSTERBAY | &quot;BoosterBay&quot;
CAPSULE | &quot;Capsule&quot;
CARGO | &quot;Cargo&quot;
CORPDELIVERIES | &quot;CorpDeliveries&quot;
CORPSAG1 | &quot;CorpSAG1&quot;
CORPSAG2 | &quot;CorpSAG2&quot;
CORPSAG3 | &quot;CorpSAG3&quot;
CORPSAG4 | &quot;CorpSAG4&quot;
CORPSAG5 | &quot;CorpSAG5&quot;
CORPSAG6 | &quot;CorpSAG6&quot;
CORPSAG7 | &quot;CorpSAG7&quot;
CRATELOOT | &quot;CrateLoot&quot;
DELIVERIES | &quot;Deliveries&quot;
DRONEBAY | &quot;DroneBay&quot;
DUSTBATTLE | &quot;DustBattle&quot;
DUSTDATABANK | &quot;DustDatabank&quot;
FIGHTERBAY | &quot;FighterBay&quot;
FIGHTERTUBE0 | &quot;FighterTube0&quot;
FIGHTERTUBE1 | &quot;FighterTube1&quot;
FIGHTERTUBE2 | &quot;FighterTube2&quot;
FIGHTERTUBE3 | &quot;FighterTube3&quot;
FIGHTERTUBE4 | &quot;FighterTube4&quot;
FLEETHANGAR | &quot;FleetHangar&quot;
HANGAR | &quot;Hangar&quot;
HANGARALL | &quot;HangarAll&quot;
HISLOT0 | &quot;HiSlot0&quot;
HISLOT1 | &quot;HiSlot1&quot;
HISLOT2 | &quot;HiSlot2&quot;
HISLOT3 | &quot;HiSlot3&quot;
HISLOT4 | &quot;HiSlot4&quot;
HISLOT5 | &quot;HiSlot5&quot;
HISLOT6 | &quot;HiSlot6&quot;
HISLOT7 | &quot;HiSlot7&quot;
HIDDENMODIFIERS | &quot;HiddenModifiers&quot;
IMPLANT | &quot;Implant&quot;
IMPOUNDED | &quot;Impounded&quot;
JUNKYARDREPROCESSED | &quot;JunkyardReprocessed&quot;
JUNKYARDTRASHED | &quot;JunkyardTrashed&quot;
LOSLOT0 | &quot;LoSlot0&quot;
LOSLOT1 | &quot;LoSlot1&quot;
LOSLOT2 | &quot;LoSlot2&quot;
LOSLOT3 | &quot;LoSlot3&quot;
LOSLOT4 | &quot;LoSlot4&quot;
LOSLOT5 | &quot;LoSlot5&quot;
LOSLOT6 | &quot;LoSlot6&quot;
LOSLOT7 | &quot;LoSlot7&quot;
LOCKED | &quot;Locked&quot;
MEDSLOT0 | &quot;MedSlot0&quot;
MEDSLOT1 | &quot;MedSlot1&quot;
MEDSLOT2 | &quot;MedSlot2&quot;
MEDSLOT3 | &quot;MedSlot3&quot;
MEDSLOT4 | &quot;MedSlot4&quot;
MEDSLOT5 | &quot;MedSlot5&quot;
MEDSLOT6 | &quot;MedSlot6&quot;
MEDSLOT7 | &quot;MedSlot7&quot;
OFFICEFOLDER | &quot;OfficeFolder&quot;
PILOT | &quot;Pilot&quot;
PLANETSURFACE | &quot;PlanetSurface&quot;
QUAFEBAY | &quot;QuafeBay&quot;
REWARD | &quot;Reward&quot;
RIGSLOT0 | &quot;RigSlot0&quot;
RIGSLOT1 | &quot;RigSlot1&quot;
RIGSLOT2 | &quot;RigSlot2&quot;
RIGSLOT3 | &quot;RigSlot3&quot;
RIGSLOT4 | &quot;RigSlot4&quot;
RIGSLOT5 | &quot;RigSlot5&quot;
RIGSLOT6 | &quot;RigSlot6&quot;
RIGSLOT7 | &quot;RigSlot7&quot;
SECONDARYSTORAGE | &quot;SecondaryStorage&quot;
SERVICESLOT0 | &quot;ServiceSlot0&quot;
SERVICESLOT1 | &quot;ServiceSlot1&quot;
SERVICESLOT2 | &quot;ServiceSlot2&quot;
SERVICESLOT3 | &quot;ServiceSlot3&quot;
SERVICESLOT4 | &quot;ServiceSlot4&quot;
SERVICESLOT5 | &quot;ServiceSlot5&quot;
SERVICESLOT6 | &quot;ServiceSlot6&quot;
SERVICESLOT7 | &quot;ServiceSlot7&quot;
SHIPHANGAR | &quot;ShipHangar&quot;
SHIPOFFLINE | &quot;ShipOffline&quot;
SKILL | &quot;Skill&quot;
SKILLINTRAINING | &quot;SkillInTraining&quot;
SPECIALIZEDAMMOHOLD | &quot;SpecializedAmmoHold&quot;
SPECIALIZEDCOMMANDCENTERHOLD | &quot;SpecializedCommandCenterHold&quot;
SPECIALIZEDFUELBAY | &quot;SpecializedFuelBay&quot;
SPECIALIZEDGASHOLD | &quot;SpecializedGasHold&quot;
SPECIALIZEDINDUSTRIALSHIPHOLD | &quot;SpecializedIndustrialShipHold&quot;
SPECIALIZEDLARGESHIPHOLD | &quot;SpecializedLargeShipHold&quot;
SPECIALIZEDMATERIALBAY | &quot;SpecializedMaterialBay&quot;
SPECIALIZEDMEDIUMSHIPHOLD | &quot;SpecializedMediumShipHold&quot;
SPECIALIZEDMINERALHOLD | &quot;SpecializedMineralHold&quot;
SPECIALIZEDOREHOLD | &quot;SpecializedOreHold&quot;
SPECIALIZEDPLANETARYCOMMODITIESHOLD | &quot;SpecializedPlanetaryCommoditiesHold&quot;
SPECIALIZEDSALVAGEHOLD | &quot;SpecializedSalvageHold&quot;
SPECIALIZEDSHIPHOLD | &quot;SpecializedShipHold&quot;
SPECIALIZEDSMALLSHIPHOLD | &quot;SpecializedSmallShipHold&quot;
STRUCTUREACTIVE | &quot;StructureActive&quot;
STRUCTUREFUEL | &quot;StructureFuel&quot;
STRUCTUREINACTIVE | &quot;StructureInactive&quot;
STRUCTUREOFFLINE | &quot;StructureOffline&quot;
SUBSYSTEMBAY | &quot;SubSystemBay&quot;
SUBSYSTEMSLOT0 | &quot;SubSystemSlot0&quot;
SUBSYSTEMSLOT1 | &quot;SubSystemSlot1&quot;
SUBSYSTEMSLOT2 | &quot;SubSystemSlot2&quot;
SUBSYSTEMSLOT3 | &quot;SubSystemSlot3&quot;
SUBSYSTEMSLOT4 | &quot;SubSystemSlot4&quot;
SUBSYSTEMSLOT5 | &quot;SubSystemSlot5&quot;
SUBSYSTEMSLOT6 | &quot;SubSystemSlot6&quot;
SUBSYSTEMSLOT7 | &quot;SubSystemSlot7&quot;
UNLOCKED | &quot;Unlocked&quot;
WALLET | &quot;Wallet&quot;
WARDROBE | &quot;Wardrobe&quot;



