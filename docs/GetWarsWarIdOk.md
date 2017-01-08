
# GetWarsWarIdOk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggressor** | [**GetWarsWarIdOkAggressor**](GetWarsWarIdOkAggressor.md) |  |  [optional]
**allies** | [**List&lt;GetWarsWarIdOkAllies&gt;**](GetWarsWarIdOkAllies.md) | allied corporations or alliances, each object contains either corporation_id or alliance_id |  [optional]
**declared** | [**DateTime**](DateTime.md) | Time that the war was declared | 
**defender** | [**GetWarsWarIdOkDefender**](GetWarsWarIdOkDefender.md) |  |  [optional]
**finished** | [**DateTime**](DateTime.md) | Time the war ended and shooting was no longer allowed |  [optional]
**id** | **Integer** | ID of the specified war | 
**mutual** | **Boolean** | Was the war declared mutual by both parties | 
**openForAllies** | **Boolean** | Is the war currently open for allies or not | 
**retracted** | [**DateTime**](DateTime.md) | Time the war was retracted but both sides could still shoot each other |  [optional]
**started** | [**DateTime**](DateTime.md) | Time when the war started and both sides could shoot each other |  [optional]



