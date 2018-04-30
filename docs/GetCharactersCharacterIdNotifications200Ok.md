
# GetCharactersCharacterIdNotifications200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isRead** | **Boolean** | is_read boolean |  [optional]
**notificationId** | **Long** | notification_id integer | 
**senderId** | **Integer** | sender_id integer | 
**senderType** | [**SenderTypeEnum**](#SenderTypeEnum) | sender_type string | 
**text** | **String** | text string |  [optional]
**timestamp** | [**DateTime**](DateTime.md) | timestamp string | 
**type** | [**TypeEnum**](#TypeEnum) | type string | 


<a name="SenderTypeEnum"></a>
## Enum: SenderTypeEnum
Name | Value
---- | -----
CHARACTER | &quot;character&quot;
CORPORATION | &quot;corporation&quot;
ALLIANCE | &quot;alliance&quot;
FACTION | &quot;faction&quot;
OTHER | &quot;other&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ACCEPTEDALLY | &quot;AcceptedAlly&quot;
ACCEPTEDSURRENDER | &quot;AcceptedSurrender&quot;
ALLANCHORINGMSG | &quot;AllAnchoringMsg&quot;
ALLMAINTENANCEBILLMSG | &quot;AllMaintenanceBillMsg&quot;
ALLSTRUCINVULNERABLEMSG | &quot;AllStrucInvulnerableMsg&quot;
ALLSTRUCTVULNERABLEMSG | &quot;AllStructVulnerableMsg&quot;
ALLWARCORPJOINEDALLIANCEMSG | &quot;AllWarCorpJoinedAllianceMsg&quot;
ALLWARDECLAREDMSG | &quot;AllWarDeclaredMsg&quot;
ALLWARINVALIDATEDMSG | &quot;AllWarInvalidatedMsg&quot;
ALLWARRETRACTEDMSG | &quot;AllWarRetractedMsg&quot;
ALLWARSURRENDERMSG | &quot;AllWarSurrenderMsg&quot;
ALLIANCECAPITALCHANGED | &quot;AllianceCapitalChanged&quot;
ALLYCONTRACTCANCELLED | &quot;AllyContractCancelled&quot;
ALLYJOINEDWARAGGRESSORMSG | &quot;AllyJoinedWarAggressorMsg&quot;
ALLYJOINEDWARALLYMSG | &quot;AllyJoinedWarAllyMsg&quot;
ALLYJOINEDWARDEFENDERMSG | &quot;AllyJoinedWarDefenderMsg&quot;
BATTLEPUNISHFRIENDLYFIRE | &quot;BattlePunishFriendlyFire&quot;
BILLOUTOFMONEYMSG | &quot;BillOutOfMoneyMsg&quot;
BILLPAIDCORPALLMSG | &quot;BillPaidCorpAllMsg&quot;
BOUNTYCLAIMMSG | &quot;BountyClaimMsg&quot;
BOUNTYESSSHARED | &quot;BountyESSShared&quot;
BOUNTYESSTAKEN | &quot;BountyESSTaken&quot;
BOUNTYPLACEDALLIANCE | &quot;BountyPlacedAlliance&quot;
BOUNTYPLACEDCHAR | &quot;BountyPlacedChar&quot;
BOUNTYPLACEDCORP | &quot;BountyPlacedCorp&quot;
BOUNTYYOURBOUNTYCLAIMED | &quot;BountyYourBountyClaimed&quot;
BUDDYCONNECTCONTACTADD | &quot;BuddyConnectContactAdd&quot;
CHARAPPACCEPTMSG | &quot;CharAppAcceptMsg&quot;
CHARAPPREJECTMSG | &quot;CharAppRejectMsg&quot;
CHARAPPWITHDRAWMSG | &quot;CharAppWithdrawMsg&quot;
CHARLEFTCORPMSG | &quot;CharLeftCorpMsg&quot;
CHARMEDALMSG | &quot;CharMedalMsg&quot;
CHARTERMINATIONMSG | &quot;CharTerminationMsg&quot;
CLONEACTIVATIONMSG | &quot;CloneActivationMsg&quot;
CLONEACTIVATIONMSG2 | &quot;CloneActivationMsg2&quot;
CLONEMOVEDMSG | &quot;CloneMovedMsg&quot;
CLONEREVOKEDMSG1 | &quot;CloneRevokedMsg1&quot;
CLONEREVOKEDMSG2 | &quot;CloneRevokedMsg2&quot;
CONTACTADD | &quot;ContactAdd&quot;
CONTACTEDIT | &quot;ContactEdit&quot;
CONTAINERPASSWORDMSG | &quot;ContainerPasswordMsg&quot;
CORPALLBILLMSG | &quot;CorpAllBillMsg&quot;
CORPAPPACCEPTMSG | &quot;CorpAppAcceptMsg&quot;
CORPAPPINVITEDMSG | &quot;CorpAppInvitedMsg&quot;
CORPAPPNEWMSG | &quot;CorpAppNewMsg&quot;
CORPAPPREJECTCUSTOMMSG | &quot;CorpAppRejectCustomMsg&quot;
CORPAPPREJECTMSG | &quot;CorpAppRejectMsg&quot;
CORPDIVIDENDMSG | &quot;CorpDividendMsg&quot;
CORPFRIENDLYFIREDISABLETIMERCOMPLETED | &quot;CorpFriendlyFireDisableTimerCompleted&quot;
CORPFRIENDLYFIREDISABLETIMERSTARTED | &quot;CorpFriendlyFireDisableTimerStarted&quot;
CORPFRIENDLYFIREENABLETIMERCOMPLETED | &quot;CorpFriendlyFireEnableTimerCompleted&quot;
CORPFRIENDLYFIREENABLETIMERSTARTED | &quot;CorpFriendlyFireEnableTimerStarted&quot;
CORPKICKED | &quot;CorpKicked&quot;
CORPLIQUIDATIONMSG | &quot;CorpLiquidationMsg&quot;
CORPNEWCEOMSG | &quot;CorpNewCEOMsg&quot;
CORPNEWSMSG | &quot;CorpNewsMsg&quot;
CORPOFFICEEXPIRATIONMSG | &quot;CorpOfficeExpirationMsg&quot;
CORPSTRUCTLOSTMSG | &quot;CorpStructLostMsg&quot;
CORPTAXCHANGEMSG | &quot;CorpTaxChangeMsg&quot;
CORPVOTECEOREVOKEDMSG | &quot;CorpVoteCEORevokedMsg&quot;
CORPVOTEMSG | &quot;CorpVoteMsg&quot;
CORPWARDECLAREDMSG | &quot;CorpWarDeclaredMsg&quot;
CORPWARFIGHTINGLEGALMSG | &quot;CorpWarFightingLegalMsg&quot;
CORPWARINVALIDATEDMSG | &quot;CorpWarInvalidatedMsg&quot;
CORPWARRETRACTEDMSG | &quot;CorpWarRetractedMsg&quot;
CORPWARSURRENDERMSG | &quot;CorpWarSurrenderMsg&quot;
CUSTOMSMSG | &quot;CustomsMsg&quot;
DECLAREWAR | &quot;DeclareWar&quot;
DISTRICTATTACKED | &quot;DistrictAttacked&quot;
DUSTAPPACCEPTEDMSG | &quot;DustAppAcceptedMsg&quot;
ENTOSISCAPTURESTARTED | &quot;EntosisCaptureStarted&quot;
FWALLIANCEKICKMSG | &quot;FWAllianceKickMsg&quot;
FWALLIANCEWARNINGMSG | &quot;FWAllianceWarningMsg&quot;
FWCHARKICKMSG | &quot;FWCharKickMsg&quot;
FWCHARRANKGAINMSG | &quot;FWCharRankGainMsg&quot;
FWCHARRANKLOSSMSG | &quot;FWCharRankLossMsg&quot;
FWCHARWARNINGMSG | &quot;FWCharWarningMsg&quot;
FWCORPJOINMSG | &quot;FWCorpJoinMsg&quot;
FWCORPKICKMSG | &quot;FWCorpKickMsg&quot;
FWCORPLEAVEMSG | &quot;FWCorpLeaveMsg&quot;
FWCORPWARNINGMSG | &quot;FWCorpWarningMsg&quot;
FACWARCORPJOINREQUESTMSG | &quot;FacWarCorpJoinRequestMsg&quot;
FACWARCORPJOINWITHDRAWMSG | &quot;FacWarCorpJoinWithdrawMsg&quot;
FACWARCORPLEAVEREQUESTMSG | &quot;FacWarCorpLeaveRequestMsg&quot;
FACWARCORPLEAVEWITHDRAWMSG | &quot;FacWarCorpLeaveWithdrawMsg&quot;
FACWARLPDISQUALIFIEDEVENT | &quot;FacWarLPDisqualifiedEvent&quot;
FACWARLPDISQUALIFIEDKILL | &quot;FacWarLPDisqualifiedKill&quot;
FACWARLPPAYOUTEVENT | &quot;FacWarLPPayoutEvent&quot;
FACWARLPPAYOUTKILL | &quot;FacWarLPPayoutKill&quot;
GAMETIMEADDED | &quot;GameTimeAdded&quot;
GAMETIMERECEIVED | &quot;GameTimeReceived&quot;
GAMETIMESENT | &quot;GameTimeSent&quot;
GIFTRECEIVED | &quot;GiftReceived&quot;
IHUBDESTROYEDBYBILLFAILURE | &quot;IHubDestroyedByBillFailure&quot;
INCURSIONCOMPLETEDMSG | &quot;IncursionCompletedMsg&quot;
INDUSTRYTEAMAUCTIONLOST | &quot;IndustryTeamAuctionLost&quot;
INDUSTRYTEAMAUCTIONWON | &quot;IndustryTeamAuctionWon&quot;
INFRASTRUCTUREHUBBILLABOUTTOEXPIRE | &quot;InfrastructureHubBillAboutToExpire&quot;
INSURANCEEXPIRATIONMSG | &quot;InsuranceExpirationMsg&quot;
INSURANCEFIRSTSHIPMSG | &quot;InsuranceFirstShipMsg&quot;
INSURANCEINVALIDATEDMSG | &quot;InsuranceInvalidatedMsg&quot;
INSURANCEISSUEDMSG | &quot;InsuranceIssuedMsg&quot;
INSURANCEPAYOUTMSG | &quot;InsurancePayoutMsg&quot;
JUMPCLONEDELETEDMSG1 | &quot;JumpCloneDeletedMsg1&quot;
JUMPCLONEDELETEDMSG2 | &quot;JumpCloneDeletedMsg2&quot;
KILLREPORTFINALBLOW | &quot;KillReportFinalBlow&quot;
KILLREPORTVICTIM | &quot;KillReportVictim&quot;
KILLRIGHTAVAILABLE | &quot;KillRightAvailable&quot;
KILLRIGHTAVAILABLEOPEN | &quot;KillRightAvailableOpen&quot;
KILLRIGHTEARNED | &quot;KillRightEarned&quot;
KILLRIGHTUNAVAILABLE | &quot;KillRightUnavailable&quot;
KILLRIGHTUNAVAILABLEOPEN | &quot;KillRightUnavailableOpen&quot;
KILLRIGHTUSED | &quot;KillRightUsed&quot;
LOCATECHARMSG | &quot;LocateCharMsg&quot;
MADEWARMUTUAL | &quot;MadeWarMutual&quot;
MERCOFFEREDNEGOTIATIONMSG | &quot;MercOfferedNegotiationMsg&quot;
MISSIONOFFEREXPIRATIONMSG | &quot;MissionOfferExpirationMsg&quot;
MISSIONTIMEOUTMSG | &quot;MissionTimeoutMsg&quot;
MOONMININGAUTOMATICFRACTURE | &quot;MoonminingAutomaticFracture&quot;
MOONMININGEXTRACTIONCANCELLED | &quot;MoonminingExtractionCancelled&quot;
MOONMININGEXTRACTIONFINISHED | &quot;MoonminingExtractionFinished&quot;
MOONMININGEXTRACTIONSTARTED | &quot;MoonminingExtractionStarted&quot;
MOONMININGLASERFIRED | &quot;MoonminingLaserFired&quot;
NPCSTANDINGSGAINED | &quot;NPCStandingsGained&quot;
NPCSTANDINGSLOST | &quot;NPCStandingsLost&quot;
OFFEREDSURRENDER | &quot;OfferedSurrender&quot;
OFFEREDTOALLY | &quot;OfferedToAlly&quot;
OLDLSCMESSAGES | &quot;OldLscMessages&quot;
OPERATIONFINISHED | &quot;OperationFinished&quot;
ORBITALATTACKED | &quot;OrbitalAttacked&quot;
ORBITALREINFORCED | &quot;OrbitalReinforced&quot;
OWNERSHIPTRANSFERRED | &quot;OwnershipTransferred&quot;
REIMBURSEMENTMSG | &quot;ReimbursementMsg&quot;
RESEARCHMISSIONAVAILABLEMSG | &quot;ResearchMissionAvailableMsg&quot;
RETRACTSWAR | &quot;RetractsWar&quot;
SEASONALCHALLENGECOMPLETED | &quot;SeasonalChallengeCompleted&quot;
SOVALLCLAIMAQUIREDMSG | &quot;SovAllClaimAquiredMsg&quot;
SOVALLCLAIMLOSTMSG | &quot;SovAllClaimLostMsg&quot;
SOVCOMMANDNODEEVENTSTARTED | &quot;SovCommandNodeEventStarted&quot;
SOVCORPBILLLATEMSG | &quot;SovCorpBillLateMsg&quot;
SOVCORPCLAIMFAILMSG | &quot;SovCorpClaimFailMsg&quot;
SOVDISRUPTORMSG | &quot;SovDisruptorMsg&quot;
SOVSTATIONENTEREDFREEPORT | &quot;SovStationEnteredFreeport&quot;
SOVSTRUCTUREDESTROYED | &quot;SovStructureDestroyed&quot;
SOVSTRUCTUREREINFORCED | &quot;SovStructureReinforced&quot;
SOVSTRUCTURESELFDESTRUCTCANCEL | &quot;SovStructureSelfDestructCancel&quot;
SOVSTRUCTURESELFDESTRUCTFINISHED | &quot;SovStructureSelfDestructFinished&quot;
SOVSTRUCTURESELFDESTRUCTREQUESTED | &quot;SovStructureSelfDestructRequested&quot;
SOVEREIGNTYIHDAMAGEMSG | &quot;SovereigntyIHDamageMsg&quot;
SOVEREIGNTYSBUDAMAGEMSG | &quot;SovereigntySBUDamageMsg&quot;
SOVEREIGNTYTCUDAMAGEMSG | &quot;SovereigntyTCUDamageMsg&quot;
STATIONAGGRESSIONMSG1 | &quot;StationAggressionMsg1&quot;
STATIONAGGRESSIONMSG2 | &quot;StationAggressionMsg2&quot;
STATIONCONQUERMSG | &quot;StationConquerMsg&quot;
STATIONSERVICEDISABLED | &quot;StationServiceDisabled&quot;
STATIONSERVICEENABLED | &quot;StationServiceEnabled&quot;
STATIONSTATECHANGEMSG | &quot;StationStateChangeMsg&quot;
STORYLINEMISSIONAVAILABLEMSG | &quot;StoryLineMissionAvailableMsg&quot;
STRUCTUREANCHORING | &quot;StructureAnchoring&quot;
STRUCTURECOURIERCONTRACTCHANGED | &quot;StructureCourierContractChanged&quot;
STRUCTUREDESTROYED | &quot;StructureDestroyed&quot;
STRUCTUREFUELALERT | &quot;StructureFuelAlert&quot;
STRUCTUREITEMSDELIVERED | &quot;StructureItemsDelivered&quot;
STRUCTURELOSTARMOR | &quot;StructureLostArmor&quot;
STRUCTURELOSTSHIELDS | &quot;StructureLostShields&quot;
STRUCTUREONLINE | &quot;StructureOnline&quot;
STRUCTURESERVICESOFFLINE | &quot;StructureServicesOffline&quot;
STRUCTUREUNANCHORING | &quot;StructureUnanchoring&quot;
STRUCTUREUNDERATTACK | &quot;StructureUnderAttack&quot;
STRUCTUREWENTHIGHPOWER | &quot;StructureWentHighPower&quot;
STRUCTUREWENTLOWPOWER | &quot;StructureWentLowPower&quot;
STRUCTURESREINFORCEMENTCHANGED | &quot;StructuresReinforcementChanged&quot;
TOWERALERTMSG | &quot;TowerAlertMsg&quot;
TOWERRESOURCEALERTMSG | &quot;TowerResourceAlertMsg&quot;
TRANSACTIONREVERSALMSG | &quot;TransactionReversalMsg&quot;
TUTORIALMSG | &quot;TutorialMsg&quot;
WARALLYOFFERDECLINEDMSG | &quot;WarAllyOfferDeclinedMsg&quot;
WARSURRENDERDECLINEDMSG | &quot;WarSurrenderDeclinedMsg&quot;
WARSURRENDEROFFERMSG | &quot;WarSurrenderOfferMsg&quot;



