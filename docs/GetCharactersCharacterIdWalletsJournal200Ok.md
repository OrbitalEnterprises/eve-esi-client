
# GetCharactersCharacterIdWalletsJournal200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Float** | Transaction amount. Positive when value transferred to the first party. Negative otherwise |  [optional]
**argumentName** | **String** | argument_name string |  [optional]
**argumentValue** | **Integer** | argument_value integer |  [optional]
**balance** | **Float** | Wallet balance after transaction occurred |  [optional]
**date** | [**DateTime**](DateTime.md) | Date and time of transaction | 
**firstPartyId** | **Integer** | first_party_id integer |  [optional]
**firstPartyType** | [**FirstPartyTypeEnum**](#FirstPartyTypeEnum) | first_party_type string |  [optional]
**reason** | **String** | reason string |  [optional]
**refId** | **Long** | Unique journal reference ID | 
**refTypeId** | **Integer** | Transaction type | 
**secondPartyId** | **Integer** | second_party_id integer |  [optional]
**secondPartyType** | [**SecondPartyTypeEnum**](#SecondPartyTypeEnum) | second_party_type string |  [optional]
**taxAmount** | **Float** | Tax amount received for tax related transactions |  [optional]
**taxRecieverId** | **Integer** | For tax related transactions, gives the corporation ID of the entity receiving the tax |  [optional]


<a name="FirstPartyTypeEnum"></a>
## Enum: FirstPartyTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;


<a name="SecondPartyTypeEnum"></a>
## Enum: SecondPartyTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;



