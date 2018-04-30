
# GetCharactersCharacterIdContracts200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptorId** | **Integer** | Who will accept the contract | 
**assigneeId** | **Integer** | ID to whom the contract is assigned, can be corporation or character ID | 
**availability** | [**AvailabilityEnum**](#AvailabilityEnum) | To whom the contract is available | 
**buyout** | **Double** | Buyout price (for Auctions only) |  [optional]
**collateral** | **Double** | Collateral price (for Couriers only) |  [optional]
**contractId** | **Integer** | contract_id integer | 
**dateAccepted** | [**DateTime**](DateTime.md) | Date of confirmation of contract |  [optional]
**dateCompleted** | [**DateTime**](DateTime.md) | Date of completed of contract |  [optional]
**dateExpired** | [**DateTime**](DateTime.md) | Expiration date of the contract | 
**dateIssued** | [**DateTime**](DateTime.md) | Сreation date of the contract | 
**daysToComplete** | **Integer** | Number of days to perform the contract |  [optional]
**endLocationId** | **Long** | End location ID (for Couriers contract) |  [optional]
**forCorporation** | **Boolean** | true if the contract was issued on behalf of the issuer&#39;s corporation | 
**issuerCorporationId** | **Integer** | Character&#39;s corporation ID for the issuer | 
**issuerId** | **Integer** | Character ID for the issuer | 
**price** | **Double** | Price of contract (for ItemsExchange and Auctions) |  [optional]
**reward** | **Double** | Remuneration for contract (for Couriers only) |  [optional]
**startLocationId** | **Long** | Start location ID (for Couriers contract) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Status of the the contract | 
**title** | **String** | Title of the contract |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of the contract | 
**volume** | **Double** | Volume of items in the contract |  [optional]


<a name="AvailabilityEnum"></a>
## Enum: AvailabilityEnum
Name | Value
---- | -----
PUBLIC | &quot;public&quot;
PERSONAL | &quot;personal&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;


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


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
ITEM_EXCHANGE | &quot;item_exchange&quot;
AUCTION | &quot;auction&quot;
COURIER | &quot;courier&quot;
LOAN | &quot;loan&quot;



