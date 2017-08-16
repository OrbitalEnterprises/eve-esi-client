
# GetCharactersCharacterIdWalletJournal200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Float** | Transaction amount. Positive when value transferred to the first party. Negative otherwise |  [optional]
**balance** | **Float** | Wallet balance after transaction occurred |  [optional]
**date** | [**DateTime**](DateTime.md) | Date and time of transaction | 
**extraInfo** | [**GetCharactersCharacterIdWalletJournalExtraInfo**](GetCharactersCharacterIdWalletJournalExtraInfo.md) |  |  [optional]
**firstPartyId** | **Integer** | first_party_id integer |  [optional]
**firstPartyType** | [**FirstPartyTypeEnum**](#FirstPartyTypeEnum) | first_party_type string |  [optional]
**reason** | **String** | reason string |  [optional]
**refId** | **Long** | Unique journal reference ID | 
**refType** | [**RefTypeEnum**](#RefTypeEnum) | Transaction type, different type of transaction will populate different fields in &#x60;extra_info&#x60; | 
**secondPartyId** | **Integer** | second_party_id integer |  [optional]
**secondPartyType** | [**SecondPartyTypeEnum**](#SecondPartyTypeEnum) | second_party_type string |  [optional]
**tax** | **Float** | Tax amount received for tax related transactions |  [optional]
**taxRecieverId** | **Integer** | the corporation ID receiving any tax paid |  [optional]


<a name="FirstPartyTypeEnum"></a>
## Enum: FirstPartyTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;


<a name="RefTypeEnum"></a>
## Enum: RefTypeEnum
Name | Value
---- | -----
PLAYER_TRADING | &quot;player_trading&quot;
MARKET_TRANSACTION | &quot;market_transaction&quot;
PLAYER_DONATION | &quot;player_donation&quot;
OFFICE_RENTAL_FEE | &quot;office_rental_fee&quot;
BOUNTY_PRIZE_HISTORICAL | &quot;bounty_prize_historical&quot;
INSURANCE | &quot;insurance&quot;
MISSION_REWARD | &quot;mission_reward&quot;
MISSION_REWARD_BONUS | &quot;mission_reward_bonus&quot;
CSPA | &quot;cspa&quot;
CORP_ACCOUNT_WITHDRAWAL | &quot;corp_account_withdrawal&quot;
LOGO_CHANGE_FEE | &quot;logo_change_fee&quot;
MARKET_ESCROW | &quot;market_escrow&quot;
BROKER_FEE | &quot;broker_fee&quot;
ALLIANCE_MAINTENANCE_FEE | &quot;alliance_maintenance_fee&quot;
SALES_TAX | &quot;sales_tax&quot;
JUMP_CLONE_INSTALLATION_FEE | &quot;jump_clone_installation_fee&quot;
MANUFACTURING | &quot;manufacturing&quot;
CONTRACT | &quot;contract&quot;
BOUNTY_PRIZES | &quot;bounty_prizes&quot;
MEDAL_CREATION_FEE | &quot;medal_creation_fee&quot;
MEDAL_ISSUING_FEE | &quot;medal_issuing_fee&quot;
CUSTOMS_OFFICE_IMPORT_DUTY | &quot;customs_office_import_duty&quot;
CUSTOMS_OFFICE_EXPORT_DUTY | &quot;customs_office_export_duty&quot;
CORPORATE_REWARD_PAYOUT | &quot;corporate_reward_payout&quot;
INDUSTRY_FACILITY_TAX | &quot;industry_facility_tax&quot;
PROJECT_DISCOVERY_REWARD | &quot;project_discovery_reward&quot;
REPROCESSING_FEE | &quot;reprocessing_fee&quot;
JUMP_CLONE_ACTIVATION_FEE | &quot;jump_clone_activation_fee&quot;
UNKNOWN | &quot;unknown&quot;


<a name="SecondPartyTypeEnum"></a>
## Enum: SecondPartyTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;



