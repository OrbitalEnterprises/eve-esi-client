
# GetCorporationsCorporationIdStarbases200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**starbaseId** | **Long** | Unique ID for this starbase (POS) | 
**typeId** | **Integer** | Starbase (POS) type | 
**systemId** | **Integer** | The solar system this starbase (POS) is in, unanchored POSes have this information | 
**moonId** | **Integer** | The moon this starbase (POS) is anchored on, unanchored POSes do not have this information |  [optional]
**state** | [**StateEnum**](#StateEnum) | state string |  [optional]
**unanchorAt** | [**DateTime**](DateTime.md) | When the POS started unanchoring, for starbases (POSes) in unanchoring state |  [optional]
**reinforcedUntil** | [**DateTime**](DateTime.md) | When the POS will be out of reinforcement, for starbases (POSes) in reinforced state |  [optional]
**onlinedSince** | [**DateTime**](DateTime.md) | When the POS onlined, for starbases (POSes) in online state |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OFFLINE | &quot;offline&quot;
ONLINE | &quot;online&quot;
ONLINING | &quot;onlining&quot;
REINFORCED | &quot;reinforced&quot;
UNANCHORING | &quot;unanchoring&quot;



