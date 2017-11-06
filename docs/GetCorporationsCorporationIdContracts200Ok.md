
# GetCorporationsCorporationIdContracts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contractId** | **Integer** | contract_id integer | 
**issuerId** | **Integer** | Character ID for the issuer | 
**issuerCorporationId** | **Integer** | Character&#39;s corporation ID for the issuer | 
**assigneeId** | **Integer** | ID to whom the contract is assigned, can be corporation or character ID | 
**acceptorId** | **Integer** | Who will accept the contract | 
**startLocationId** | **Long** | Start location ID (for Couriers contract) |  [optional]
**endLocationId** | **Long** | End location ID (for Couriers contract) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the contract | 
**status** | [**StatusEnum**](#StatusEnum) | Status of the the contract | 
**title** | **String** | Title of the contract |  [optional]
**forCorporation** | **Boolean** | true if the contract was issued on behalf of the issuer&#39;s corporation | 
**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | To whom the contract is available | 
**dateIssued** | [**DateTime**](DateTime.md) | Сreation date of the contract | 
**dateExpired** | [**DateTime**](DateTime.md) | Expiration date of the contract | 
**dateAccepted** | [**DateTime**](DateTime.md) | Date of confirmation of contract |  [optional]
**daysToComplete** | **Integer** | Number of days to perform the contract |  [optional]
**dateCompleted** | [**DateTime**](DateTime.md) | Date of completed of contract |  [optional]
**price** | **Float** | Price of contract (for ItemsExchange and Auctions) |  [optional]
**reward** | **Float** | Remuneration for contract (for Couriers only) |  [optional]
**collateral** | **Float** | Collateral price (for Couriers only) |  [optional]
**buyout** | **Float** | Buyout price (for Auctions only) |  [optional]
**volume** | **Float** | Volume of items in the contract |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ITEM_EXCHANGE | &quot;item_exchange&quot;
AUCTION | &quot;auction&quot;
COURIER | &quot;courier&quot;
LOAN | &quot;loan&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OUTSTANDING | &quot;outstanding&quot;
IN_PROGRESS | &quot;in_progress&quot;
FINISHED_ISSUER | &quot;finished_issuer&quot;
FINISHED_CONTRACTOR | &quot;finished_contractor&quot;
FINISHED | &quot;finished&quot;
CANCELLED | &quot;cancelled&quot;
REJECTED | &quot;rejected&quot;
FAILED | &quot;failed&quot;
DELETED | &quot;deleted&quot;
REVERSED | &quot;reversed&quot;


<a name="AvailabilityEnum"></a>
## Enum: AvailabilityEnum
Name | Value
---- | -----
PUBLIC | &quot;public&quot;
PERSONAL | &quot;personal&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;



