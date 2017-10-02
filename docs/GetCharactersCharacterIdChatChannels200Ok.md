
# GetCharactersCharacterIdChatChannels200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | [**List&lt;GetCharactersCharacterIdChatChannelsAllowed&gt;**](GetCharactersCharacterIdChatChannelsAllowed.md) | allowed array | 
**blocked** | [**List&lt;GetCharactersCharacterIdChatChannelsBlocked&gt;**](GetCharactersCharacterIdChatChannelsBlocked.md) | blocked array | 
**channelId** | **Integer** | Unique channel ID. Always negative for player-created channels. Permanent (CCP created) channels have a positive ID, but don&#39;t appear in the API | 
**comparisonKey** | **String** | Normalized, unique string used to compare channel names | 
**hasPassword** | **Boolean** | If this is a password protected channel | 
**motd** | **String** | Message of the day for this channel | 
**muted** | [**List&lt;GetCharactersCharacterIdChatChannelsMuted&gt;**](GetCharactersCharacterIdChatChannelsMuted.md) | muted array | 
**name** | **String** | Displayed name of channel | 
**operators** | [**List&lt;GetCharactersCharacterIdChatChannelsOperator&gt;**](GetCharactersCharacterIdChatChannelsOperator.md) | operators array | 
**ownerId** | **Integer** | owner_id integer | 



