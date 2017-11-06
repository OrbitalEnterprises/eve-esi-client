
# GetCorporationsCorporationIdContractsContractIdItems200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**recordId** | **Long** | Unique ID for the item | 
**typeId** | **Integer** | Type ID for item | 
**quantity** | **Integer** | Number of items in the stack | 
**rawQuantity** | **Integer** | -1 indicates that the item is a singleton (non-stackable). If the item happens to be a Blueprint, -1 is an Original and -2 is a Blueprint Copy |  [optional]
**isSingleton** | **Boolean** | is_singleton boolean | 
**isIncluded** | **Boolean** | true if the contract issuer has submitted this item with the contract, false if the isser is asking for this item in the contract. | 



