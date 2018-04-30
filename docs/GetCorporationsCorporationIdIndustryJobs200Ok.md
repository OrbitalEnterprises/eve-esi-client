
# GetCorporationsCorporationIdIndustryJobs200Ok

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activityId** | **Integer** | Job activity ID | 
**blueprintId** | **Long** | blueprint_id integer | 
**blueprintLocationId** | **Long** | Location ID of the location from which the blueprint was installed. Normally a station ID, but can also be an asset (e.g. container) or corporation facility | 
**blueprintTypeId** | **Integer** | blueprint_type_id integer | 
**completedCharacterId** | **Integer** | ID of the character which completed this job |  [optional]
**completedDate** | [**DateTime**](DateTime.md) | Date and time when this job was completed |  [optional]
**cost** | **Double** | The sume of job installation fee and industry facility tax |  [optional]
**duration** | **Integer** | Job duration in seconds | 
**endDate** | [**DateTime**](DateTime.md) | Date and time when this job finished | 
**facilityId** | **Long** | ID of the facility where this job is running | 
**installerId** | **Integer** | ID of the character which installed this job | 
**jobId** | **Integer** | Unique job ID | 
**licensedRuns** | **Integer** | Number of runs blueprint is licensed for |  [optional]
**locationId** | **Long** | ID of the location for the industry facility | 
**outputLocationId** | **Long** | Location ID of the location to which the output of the job will be delivered. Normally a station ID, but can also be a corporation facility | 
**pauseDate** | [**DateTime**](DateTime.md) | Date and time when this job was paused (i.e. time when the facility where this job was installed went offline) |  [optional]
**probability** | **Float** | Chance of success for invention |  [optional]
**productTypeId** | **Integer** | Type ID of product (manufactured, copied or invented) |  [optional]
**runs** | **Integer** | Number of runs for a manufacturing job, or number of copies to make for a blueprint copy | 
**startDate** | [**DateTime**](DateTime.md) | Date and time when this job started | 
**status** | [**StatusEnum**](#StatusEnum) | status string | 
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



