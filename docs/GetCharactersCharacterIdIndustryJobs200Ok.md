
# GetCharactersCharacterIdIndustryJobs200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**jobId** | **Integer** | Unique job ID | 
**installerId** | **Integer** | ID of the character which installed this job | 
**facilityId** | **Long** | ID of the facility where this job is running | 
**stationId** | **Long** | ID of the station where industry facility is located | 
**activityId** | **Integer** | Job activity ID | 
**blueprintId** | **Long** | blueprint_id integer | 
**blueprintTypeId** | **Integer** | blueprint_type_id integer | 
**blueprintLocationId** | **Long** | Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility | 
**outputLocationId** | **Long** | Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility | 
**runs** | **Integer** | Number of runs for a manufacturing job, or number of copies to make for a blueprint copy | 
**cost** | **Double** | The sume of job installation fee and industry facility tax |  [optional]
**licensedRuns** | **Integer** | Number of runs blueprint is licensed for |  [optional]
**probability** | **Float** | Chance of success for invention |  [optional]
**productTypeId** | **Integer** | Type ID of product (manufactured, copied or invented) |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status string | 
**duration** | **Integer** | Job duration in seconds | 
**startDate** | [**DateTime**](DateTime.md) | Date and time when this job started | 
**endDate** | [**DateTime**](DateTime.md) | Date and time when this job finished | 
**pauseDate** | [**DateTime**](DateTime.md) | Date and time when this job was paused (i.e. time when the facility where this job was installed went offline) |  [optional]
**completedDate** | [**DateTime**](DateTime.md) | Date and time when this job was completed |  [optional]
**completedCharacterId** | **Integer** | ID of the character which completed this job |  [optional]
**successfulRuns** | **Integer** | Number of successful runs for this job. Equal to runs unless this is an invention job |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
CANCELLED | &quot;cancelled&quot;
DELIVERED | &quot;delivered&quot;
PAUSED | &quot;paused&quot;
READY | &quot;ready&quot;
REVERTED | &quot;reverted&quot;



