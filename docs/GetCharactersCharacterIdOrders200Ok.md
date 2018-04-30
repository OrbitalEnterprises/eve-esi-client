
# GetCharactersCharacterIdOrders200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **Integer** | Number of days for which order is valid (starting from the issued date). An order expires at time issued + duration | 
**escrow** | **Double** | For buy orders, the amount of ISK in escrow |  [optional]
**isBuyOrder** | **Boolean** | True if the order is a bid (buy) order |  [optional]
**isCorporation** | **Boolean** | Signifies whether the buy/sell order was placed on behalf of a corporation. | 
**issued** | [**DateTime**](DateTime.md) | Date and time when this order was issued | 
**locationId** | **Long** | ID of the location where order was placed | 
**minVolume** | **Integer** | For buy orders, the minimum quantity that will be accepted in a matching sell order |  [optional]
**orderId** | **Long** | Unique order ID | 
**price** | **Double** | Cost per unit for this order | 
**range** | [**RangeEnum**](#RangeEnum) | Valid order range, numbers are ranges in jumps | 
**regionId** | **Integer** | ID of the region where order was placed | 
**typeId** | **Integer** | The type ID of the item transacted in this order | 
**volumeRemain** | **Integer** | Quantity of items still required or offered | 
**volumeTotal** | **Integer** | Quantity of items required or offered at time order was placed | 


<a name="RangeEnum"></a>
## Enum: RangeEnum
Name | Value
---- | -----
_1 | &quot;1&quot;
_10 | &quot;10&quot;
_2 | &quot;2&quot;
_20 | &quot;20&quot;
_3 | &quot;3&quot;
_30 | &quot;30&quot;
_4 | &quot;4&quot;
_40 | &quot;40&quot;
_5 | &quot;5&quot;
REGION | &quot;region&quot;
SOLARSYSTEM | &quot;solarsystem&quot;
STATION | &quot;station&quot;



