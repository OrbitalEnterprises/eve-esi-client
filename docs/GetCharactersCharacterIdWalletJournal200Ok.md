
# GetCharactersCharacterIdWalletJournal200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | **Double** | The amount of ISK given or taken from the wallet as a result of the given transaction. Positive when ISK is deposited into the wallet and negative when ISK is withdrawn |  [optional]
**balance** | **Double** | Wallet balance after transaction occurred |  [optional]
**contextId** | **Long** | An ID that gives extra context to the particular transaction. Because of legacy reasons the context is completely different per ref_type and means different things. It is also possible to not have a context_id |  [optional]
**contextIdType** | [**ContextIdTypeEnum**](#ContextIdTypeEnum) | The type of the given context_id if present |  [optional]
**date** | [**DateTime**](DateTime.md) | Date and time of transaction | 
**description** | **String** | The reason for the transaction, mirrors what is seen in the client | 
**firstPartyId** | **Integer** | The id of the first party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name |  [optional]
**id** | **Long** | Unique journal reference ID | 
**reason** | **String** | The user stated reason for the transaction. Only applies to some ref_types |  [optional]
**refType** | [**RefTypeEnum**](#RefTypeEnum) | \&quot;The transaction type for the given. transaction. Different transaction types will populate different attributes.\&quot; | 
**secondPartyId** | **Integer** | The id of the second party involved in the transaction. This attribute has no consistency and is different or non existant for particular ref_types. The description attribute will help make sense of what this attribute means. For more info about the given ID it can be dropped into the /universe/names/ ESI route to determine its type and name |  [optional]
**tax** | **Double** | Tax amount received. Only applies to tax related transactions |  [optional]
**taxReceiverId** | **Integer** | The corporation ID receiving any tax paid. Only applies to tax related transactions |  [optional]


<a name="ContextIdTypeEnum"></a>
## Enum: ContextIdTypeEnum
Name | Value
---- | -----
STRUCTURE_ID | &quot;structure_id&quot;
STATION_ID | &quot;station_id&quot;
MARKET_TRANSACTION_ID | &quot;market_transaction_id&quot;
CHARACTER_ID | &quot;character_id&quot;
CORPORATION_ID | &quot;corporation_id&quot;
ALLIANCE_ID | &quot;alliance_id&quot;
EVE_SYSTEM | &quot;eve_system&quot;
INDUSTRY_JOB_ID | &quot;industry_job_id&quot;
CONTRACT_ID | &quot;contract_id&quot;
PLANET_ID | &quot;planet_id&quot;
SYSTEM_ID | &quot;system_id&quot;
TYPE_ID | &quot;type_id&quot;


<a name="RefTypeEnum"></a>
## Enum: RefTypeEnum
Name | Value
---- | -----
ACCELERATION_GATE_FEE | &quot;acceleration_gate_fee&quot;
ADVERTISEMENT_LISTING_FEE | &quot;advertisement_listing_fee&quot;
AGENT_DONATION | &quot;agent_donation&quot;
AGENT_LOCATION_SERVICES | &quot;agent_location_services&quot;
AGENT_MISCELLANEOUS | &quot;agent_miscellaneous&quot;
AGENT_MISSION_COLLATERAL_PAID | &quot;agent_mission_collateral_paid&quot;
AGENT_MISSION_COLLATERAL_REFUNDED | &quot;agent_mission_collateral_refunded&quot;
AGENT_MISSION_REWARD | &quot;agent_mission_reward&quot;
AGENT_MISSION_REWARD_CORPORATION_TAX | &quot;agent_mission_reward_corporation_tax&quot;
AGENT_MISSION_TIME_BONUS_REWARD | &quot;agent_mission_time_bonus_reward&quot;
AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX | &quot;agent_mission_time_bonus_reward_corporation_tax&quot;
AGENT_SECURITY_SERVICES | &quot;agent_security_services&quot;
AGENT_SERVICES_RENDERED | &quot;agent_services_rendered&quot;
AGENTS_PREWARD | &quot;agents_preward&quot;
ALLIANCE_MAINTAINANCE_FEE | &quot;alliance_maintainance_fee&quot;
ALLIANCE_REGISTRATION_FEE | &quot;alliance_registration_fee&quot;
ASSET_SAFETY_RECOVERY_TAX | &quot;asset_safety_recovery_tax&quot;
BOUNTY | &quot;bounty&quot;
BOUNTY_PRIZE | &quot;bounty_prize&quot;
BOUNTY_PRIZE_CORPORATION_TAX | &quot;bounty_prize_corporation_tax&quot;
BOUNTY_PRIZES | &quot;bounty_prizes&quot;
BOUNTY_REIMBURSEMENT | &quot;bounty_reimbursement&quot;
BOUNTY_SURCHARGE | &quot;bounty_surcharge&quot;
BROKERS_FEE | &quot;brokers_fee&quot;
CLONE_ACTIVATION | &quot;clone_activation&quot;
CLONE_TRANSFER | &quot;clone_transfer&quot;
CONTRABAND_FINE | &quot;contraband_fine&quot;
CONTRACT_AUCTION_BID | &quot;contract_auction_bid&quot;
CONTRACT_AUCTION_BID_CORP | &quot;contract_auction_bid_corp&quot;
CONTRACT_AUCTION_BID_REFUND | &quot;contract_auction_bid_refund&quot;
CONTRACT_AUCTION_SOLD | &quot;contract_auction_sold&quot;
CONTRACT_BROKERS_FEE | &quot;contract_brokers_fee&quot;
CONTRACT_BROKERS_FEE_CORP | &quot;contract_brokers_fee_corp&quot;
CONTRACT_COLLATERAL | &quot;contract_collateral&quot;
CONTRACT_COLLATERAL_DEPOSITED_CORP | &quot;contract_collateral_deposited_corp&quot;
CONTRACT_COLLATERAL_PAYOUT | &quot;contract_collateral_payout&quot;
CONTRACT_COLLATERAL_REFUND | &quot;contract_collateral_refund&quot;
CONTRACT_DEPOSIT | &quot;contract_deposit&quot;
CONTRACT_DEPOSIT_CORP | &quot;contract_deposit_corp&quot;
CONTRACT_DEPOSIT_REFUND | &quot;contract_deposit_refund&quot;
CONTRACT_DEPOSIT_SALES_TAX | &quot;contract_deposit_sales_tax&quot;
CONTRACT_PRICE | &quot;contract_price&quot;
CONTRACT_PRICE_PAYMENT_CORP | &quot;contract_price_payment_corp&quot;
CONTRACT_REVERSAL | &quot;contract_reversal&quot;
CONTRACT_REWARD | &quot;contract_reward&quot;
CONTRACT_REWARD_DEPOSITED | &quot;contract_reward_deposited&quot;
CONTRACT_REWARD_DEPOSITED_CORP | &quot;contract_reward_deposited_corp&quot;
CONTRACT_REWARD_REFUND | &quot;contract_reward_refund&quot;
CONTRACT_SALES_TAX | &quot;contract_sales_tax&quot;
COPYING | &quot;copying&quot;
CORPORATE_REWARD_PAYOUT | &quot;corporate_reward_payout&quot;
CORPORATE_REWARD_TAX | &quot;corporate_reward_tax&quot;
CORPORATION_ACCOUNT_WITHDRAWAL | &quot;corporation_account_withdrawal&quot;
CORPORATION_BULK_PAYMENT | &quot;corporation_bulk_payment&quot;
CORPORATION_DIVIDEND_PAYMENT | &quot;corporation_dividend_payment&quot;
CORPORATION_LIQUIDATION | &quot;corporation_liquidation&quot;
CORPORATION_LOGO_CHANGE_COST | &quot;corporation_logo_change_cost&quot;
CORPORATION_PAYMENT | &quot;corporation_payment&quot;
CORPORATION_REGISTRATION_FEE | &quot;corporation_registration_fee&quot;
COURIER_MISSION_ESCROW | &quot;courier_mission_escrow&quot;
CSPA | &quot;cspa&quot;
CSPAOFFLINEREFUND | &quot;cspaofflinerefund&quot;
DATACORE_FEE | &quot;datacore_fee&quot;
DNA_MODIFICATION_FEE | &quot;dna_modification_fee&quot;
DOCKING_FEE | &quot;docking_fee&quot;
DUEL_WAGER_ESCROW | &quot;duel_wager_escrow&quot;
DUEL_WAGER_PAYMENT | &quot;duel_wager_payment&quot;
DUEL_WAGER_REFUND | &quot;duel_wager_refund&quot;
FACTORY_SLOT_RENTAL_FEE | &quot;factory_slot_rental_fee&quot;
GM_CASH_TRANSFER | &quot;gm_cash_transfer&quot;
INDUSTRY_JOB_TAX | &quot;industry_job_tax&quot;
INFRASTRUCTURE_HUB_MAINTENANCE | &quot;infrastructure_hub_maintenance&quot;
INHERITANCE | &quot;inheritance&quot;
INSURANCE | &quot;insurance&quot;
JUMP_CLONE_ACTIVATION_FEE | &quot;jump_clone_activation_fee&quot;
JUMP_CLONE_INSTALLATION_FEE | &quot;jump_clone_installation_fee&quot;
KILL_RIGHT_FEE | &quot;kill_right_fee&quot;
LP_STORE | &quot;lp_store&quot;
MANUFACTURING | &quot;manufacturing&quot;
MARKET_ESCROW | &quot;market_escrow&quot;
MARKET_FINE_PAID | &quot;market_fine_paid&quot;
MARKET_TRANSACTION | &quot;market_transaction&quot;
MEDAL_CREATION | &quot;medal_creation&quot;
MEDAL_ISSUED | &quot;medal_issued&quot;
MISSION_COMPLETION | &quot;mission_completion&quot;
MISSION_COST | &quot;mission_cost&quot;
MISSION_EXPIRATION | &quot;mission_expiration&quot;
MISSION_REWARD | &quot;mission_reward&quot;
OFFICE_RENTAL_FEE | &quot;office_rental_fee&quot;
OPERATION_BONUS | &quot;operation_bonus&quot;
OPPORTUNITY_REWARD | &quot;opportunity_reward&quot;
PLANETARY_CONSTRUCTION | &quot;planetary_construction&quot;
PLANETARY_EXPORT_TAX | &quot;planetary_export_tax&quot;
PLANETARY_IMPORT_TAX | &quot;planetary_import_tax&quot;
PLAYER_DONATION | &quot;player_donation&quot;
PLAYER_TRADING | &quot;player_trading&quot;
PROJECT_DISCOVERY_REWARD | &quot;project_discovery_reward&quot;
PROJECT_DISCOVERY_TAX | &quot;project_discovery_tax&quot;
REACTION | &quot;reaction&quot;
RELEASE_OF_IMPOUNDED_PROPERTY | &quot;release_of_impounded_property&quot;
REPAIR_BILL | &quot;repair_bill&quot;
REPROCESSING_TAX | &quot;reprocessing_tax&quot;
RESEARCHING_MATERIAL_PRODUCTIVITY | &quot;researching_material_productivity&quot;
RESEARCHING_TECHNOLOGY | &quot;researching_technology&quot;
RESEARCHING_TIME_PRODUCTIVITY | &quot;researching_time_productivity&quot;
RESOURCE_WARS_REWARD | &quot;resource_wars_reward&quot;
REVERSE_ENGINEERING | &quot;reverse_engineering&quot;
SECURITY_PROCESSING_FEE | &quot;security_processing_fee&quot;
SHARES | &quot;shares&quot;
SOVEREIGNITY_BILL | &quot;sovereignity_bill&quot;
STORE_PURCHASE | &quot;store_purchase&quot;
STORE_PURCHASE_REFUND | &quot;store_purchase_refund&quot;
STRUCTURE_GATE_JUMP | &quot;structure_gate_jump&quot;
TRANSACTION_TAX | &quot;transaction_tax&quot;
UPKEEP_ADJUSTMENT_FEE | &quot;upkeep_adjustment_fee&quot;
WAR_ALLY_CONTRACT | &quot;war_ally_contract&quot;
WAR_FEE | &quot;war_fee&quot;
WAR_FEE_SURRENDER | &quot;war_fee_surrender&quot;



