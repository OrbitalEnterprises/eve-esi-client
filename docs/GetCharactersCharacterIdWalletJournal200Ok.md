
# GetCharactersCharacterIdWalletJournal200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**DateTime**](DateTime.md) | Date and time of transaction | 
**refId** | **Long** | Unique journal reference ID | 
**refType** | [**RefTypeEnum**](#RefTypeEnum) | Transaction type, different type of transaction will populate different fields in &#x60;extra_info&#x60; | 
**firstPartyId** | **Integer** | first_party_id integer |  [optional]
**firstPartyType** | [**FirstPartyTypeEnum**](#FirstPartyTypeEnum) | first_party_type string |  [optional]
**secondPartyId** | **Integer** | second_party_id integer |  [optional]
**secondPartyType** | [**SecondPartyTypeEnum**](#SecondPartyTypeEnum) | second_party_type string |  [optional]
**amount** | **Float** | Transaction amount. Positive when value transferred to the first party. Negative otherwise |  [optional]
**balance** | **Float** | Wallet balance after transaction occurred |  [optional]
**reason** | **String** | reason string |  [optional]
**taxRecieverId** | **Integer** | the corporation ID receiving any tax paid |  [optional]
**tax** | **Float** | Tax amount received for tax related transactions |  [optional]
**extraInfo** | [**GetCharactersCharacterIdWalletJournalExtraInfo**](GetCharactersCharacterIdWalletJournalExtraInfo.md) |  |  [optional]


<a name="RefTypeEnum"></a>
## Enum: RefTypeEnum
Name | Value
---- | -----
PLAYER_TRADING | &quot;player_trading&quot;
MARKET_TRANSACTION | &quot;market_transaction&quot;
GM_CASH_TRANSFER | &quot;gm_cash_transfer&quot;
MISSION_REWARD | &quot;mission_reward&quot;
CLONE_ACTIVATION | &quot;clone_activation&quot;
INHERITANCE | &quot;inheritance&quot;
PLAYER_DONATION | &quot;player_donation&quot;
CORPORATION_PAYMENT | &quot;corporation_payment&quot;
DOCKING_FEE | &quot;docking_fee&quot;
OFFICE_RENTAL_FEE | &quot;office_rental_fee&quot;
FACTORY_SLOT_RENTAL_FEE | &quot;factory_slot_rental_fee&quot;
REPAIR_BILL | &quot;repair_bill&quot;
BOUNTY | &quot;bounty&quot;
BOUNTY_PRIZE | &quot;bounty_prize&quot;
INSURANCE | &quot;insurance&quot;
MISSION_EXPIRATION | &quot;mission_expiration&quot;
MISSION_COMPLETION | &quot;mission_completion&quot;
SHARES | &quot;shares&quot;
COURIER_MISSION_ESCROW | &quot;courier_mission_escrow&quot;
MISSION_COST | &quot;mission_cost&quot;
AGENT_MISCELLANEOUS | &quot;agent_miscellaneous&quot;
LP_STORE | &quot;lp_store&quot;
AGENT_LOCATION_SERVICES | &quot;agent_location_services&quot;
AGENT_DONATION | &quot;agent_donation&quot;
AGENT_SECURITY_SERVICES | &quot;agent_security_services&quot;
AGENT_MISSION_COLLATERAL_PAID | &quot;agent_mission_collateral_paid&quot;
AGENT_MISSION_COLLATERAL_REFUNDED | &quot;agent_mission_collateral_refunded&quot;
AGENTS_PREWARD | &quot;agents_preward&quot;
AGENT_MISSION_REWARD | &quot;agent_mission_reward&quot;
AGENT_MISSION_TIME_BONUS_REWARD | &quot;agent_mission_time_bonus_reward&quot;
CSPA | &quot;cspa&quot;
CSPAOFFLINEREFUND | &quot;cspaofflinerefund&quot;
CORPORATION_ACCOUNT_WITHDRAWAL | &quot;corporation_account_withdrawal&quot;
CORPORATION_DIVIDEND_PAYMENT | &quot;corporation_dividend_payment&quot;
CORPORATION_REGISTRATION_FEE | &quot;corporation_registration_fee&quot;
CORPORATION_LOGO_CHANGE_COST | &quot;corporation_logo_change_cost&quot;
RELEASE_OF_IMPOUNDED_PROPERTY | &quot;release_of_impounded_property&quot;
MARKET_ESCROW | &quot;market_escrow&quot;
AGENT_SERVICES_RENDERED | &quot;agent_services_rendered&quot;
MARKET_FINE_PAID | &quot;market_fine_paid&quot;
CORPORATION_LIQUIDATION | &quot;corporation_liquidation&quot;
BROKERS_FEE | &quot;brokers_fee&quot;
CORPORATION_BULK_PAYMENT | &quot;corporation_bulk_payment&quot;
ALLIANCE_REGISTRATION_FEE | &quot;alliance_registration_fee&quot;
WAR_FEE | &quot;war_fee&quot;
ALLIANCE_MAINTAINANCE_FEE | &quot;alliance_maintainance_fee&quot;
CONTRABAND_FINE | &quot;contraband_fine&quot;
CLONE_TRANSFER | &quot;clone_transfer&quot;
ACCELERATION_GATE_FEE | &quot;acceleration_gate_fee&quot;
TRANSACTION_TAX | &quot;transaction_tax&quot;
JUMP_CLONE_INSTALLATION_FEE | &quot;jump_clone_installation_fee&quot;
MANUFACTURING | &quot;manufacturing&quot;
RESEARCHING_TECHNOLOGY | &quot;researching_technology&quot;
RESEARCHING_TIME_PRODUCTIVITY | &quot;researching_time_productivity&quot;
RESEARCHING_MATERIAL_PRODUCTIVITY | &quot;researching_material_productivity&quot;
COPYING | &quot;copying&quot;
REVERSE_ENGINEERING | &quot;reverse_engineering&quot;
CONTRACT_AUCTION_BID | &quot;contract_auction_bid&quot;
CONTRACT_AUCTION_BID_REFUND | &quot;contract_auction_bid_refund&quot;
CONTRACT_COLLATERAL | &quot;contract_collateral&quot;
CONTRACT_REWARD_REFUND | &quot;contract_reward_refund&quot;
CONTRACT_AUCTION_SOLD | &quot;contract_auction_sold&quot;
CONTRACT_REWARD | &quot;contract_reward&quot;
CONTRACT_COLLATERAL_REFUND | &quot;contract_collateral_refund&quot;
CONTRACT_COLLATERAL_PAYOUT | &quot;contract_collateral_payout&quot;
CONTRACT_PRICE | &quot;contract_price&quot;
CONTRACT_BROKERS_FEE | &quot;contract_brokers_fee&quot;
CONTRACT_SALES_TAX | &quot;contract_sales_tax&quot;
CONTRACT_DEPOSIT | &quot;contract_deposit&quot;
CONTRACT_DEPOSIT_SALES_TAX | &quot;contract_deposit_sales_tax&quot;
CONTRACT_AUCTION_BID_CORP | &quot;contract_auction_bid_corp&quot;
CONTRACT_COLLATERAL_DEPOSITED_CORP | &quot;contract_collateral_deposited_corp&quot;
CONTRACT_PRICE_PAYMENT_CORP | &quot;contract_price_payment_corp&quot;
CONTRACT_BROKERS_FEE_CORP | &quot;contract_brokers_fee_corp&quot;
CONTRACT_DEPOSIT_CORP | &quot;contract_deposit_corp&quot;
CONTRACT_DEPOSIT_REFUND | &quot;contract_deposit_refund&quot;
CONTRACT_REWARD_DEPOSITED | &quot;contract_reward_deposited&quot;
CONTRACT_REWARD_DEPOSITED_CORP | &quot;contract_reward_deposited_corp&quot;
BOUNTY_PRIZES | &quot;bounty_prizes&quot;
ADVERTISEMENT_LISTING_FEE | &quot;advertisement_listing_fee&quot;
MEDAL_CREATION | &quot;medal_creation&quot;
MEDAL_ISSUED | &quot;medal_issued&quot;
DNA_MODIFICATION_FEE | &quot;dna_modification_fee&quot;
SOVEREIGNITY_BILL | &quot;sovereignity_bill&quot;
BOUNTY_PRIZE_CORPORATION_TAX | &quot;bounty_prize_corporation_tax&quot;
AGENT_MISSION_REWARD_CORPORATION_TAX | &quot;agent_mission_reward_corporation_tax&quot;
AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX | &quot;agent_mission_time_bonus_reward_corporation_tax&quot;
UPKEEP_ADJUSTMENT_FEE | &quot;upkeep_adjustment_fee&quot;
PLANETARY_IMPORT_TAX | &quot;planetary_import_tax&quot;
PLANETARY_EXPORT_TAX | &quot;planetary_export_tax&quot;
PLANETARY_CONSTRUCTION | &quot;planetary_construction&quot;
CORPORATE_REWARD_PAYOUT | &quot;corporate_reward_payout&quot;
BOUNTY_SURCHARGE | &quot;bounty_surcharge&quot;
CONTRACT_REVERSAL | &quot;contract_reversal&quot;
CORPORATE_REWARD_TAX | &quot;corporate_reward_tax&quot;
STORE_PURCHASE | &quot;store_purchase&quot;
STORE_PURCHASE_REFUND | &quot;store_purchase_refund&quot;
DATACORE_FEE | &quot;datacore_fee&quot;
WAR_FEE_SURRENDER | &quot;war_fee_surrender&quot;
WAR_ALLY_CONTRACT | &quot;war_ally_contract&quot;
BOUNTY_REIMBURSEMENT | &quot;bounty_reimbursement&quot;
KILL_RIGHT_FEE | &quot;kill_right_fee&quot;
SECURITY_PROCESSING_FEE | &quot;security_processing_fee&quot;
INDUSTRY_JOB_TAX | &quot;industry_job_tax&quot;
INFRASTRUCTURE_HUB_MAINTENANCE | &quot;infrastructure_hub_maintenance&quot;
ASSET_SAFETY_RECOVERY_TAX | &quot;asset_safety_recovery_tax&quot;
OPPORTUNITY_REWARD | &quot;opportunity_reward&quot;
PROJECT_DISCOVERY_REWARD | &quot;project_discovery_reward&quot;
PROJECT_DISCOVERY_TAX | &quot;project_discovery_tax&quot;
REPROCESSING_TAX | &quot;reprocessing_tax&quot;
JUMP_CLONE_ACTIVATION_FEE | &quot;jump_clone_activation_fee&quot;
OPERATION_BONUS | &quot;operation_bonus&quot;


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



