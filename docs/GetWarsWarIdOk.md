
# GetWarsWarIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the specified war | 
**declared** | [**DateTime**](DateTime.md) | Time that the war was declared | 
**started** | [**DateTime**](DateTime.md) | Time when the war started and both sides could shoot each other |  [optional]
**retracted** | [**DateTime**](DateTime.md) | Time the war was retracted but both sides could still shoot each other |  [optional]
**finished** | [**DateTime**](DateTime.md) | Time the war ended and shooting was no longer allowed |  [optional]
**mutual** | **Boolean** | Was the war declared mutual by both parties | 
**openForAllies** | **Boolean** | Is the war currently open for allies or not | 
**aggressor** | [**GetWarsWarIdAggressor**](GetWarsWarIdAggressor.md) |  |  [optional]
**defender** | [**GetWarsWarIdDefender**](GetWarsWarIdDefender.md) |  |  [optional]
**allies** | [**List&lt;GetWarsWarIdAlly&gt;**](GetWarsWarIdAlly.md) | allied corporations or alliances, each object contains either corporation_id or alliance_id |  [optional]



