
# GetContractsPublicRegionId200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buyout** | **Double** | Buyout price (for Auctions only) |  [optional]
**collateral** | **Double** | Collateral price (for Couriers only) |  [optional]
**contractId** | **Integer** | contract_id integer | 
**dateExpired** | [**DateTime**](DateTime.md) | Expiration date of the contract | 
**dateIssued** | [**DateTime**](DateTime.md) | Сreation date of the contract | 
**daysToComplete** | **Integer** | Number of days to perform the contract |  [optional]
**endLocationId** | **Long** | End location ID (for Couriers contract) |  [optional]
**forCorporation** | **Boolean** | true if the contract was issued on behalf of the issuer&#39;s corporation |  [optional]
**issuerCorporationId** | **Integer** | Character&#39;s corporation ID for the issuer | 
**issuerId** | **Integer** | Character ID for the issuer | 
**price** | **Double** | Price of contract (for ItemsExchange and Auctions) |  [optional]
**reward** | **Double** | Remuneration for contract (for Couriers only) |  [optional]
**startLocationId** | **Long** | Start location ID (for Couriers contract) |  [optional]
**title** | **String** | Title of the contract |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the contract | 
**volume** | **Double** | Volume of items in the contract |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ITEM_EXCHANGE | &quot;item_exchange&quot;
AUCTION | &quot;auction&quot;
COURIER | &quot;courier&quot;
LOAN | &quot;loan&quot;



