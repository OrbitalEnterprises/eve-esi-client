/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.3.6.dev12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package enterprises.orbital.eve.esi.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * Full details of a specific event
 */
@ApiModel(description = "Full details of a specific event")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetCharactersCharacterIdCalendarEventIdOk   {
  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("duration")
  private Long duration = null;

  @SerializedName("event_id")
  private Integer eventId = null;

  @SerializedName("importance")
  private Integer importance = null;

  @SerializedName("owner_id")
  private Long ownerId = null;

  @SerializedName("owner_name")
  private String ownerName = null;

  /**
   * owner_type string
   */
  public enum OwnerTypeEnum {
    @SerializedName("eve_server")
    EVE_SERVER("eve_server"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("faction")
    FACTION("faction"),
    
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance");

    private String value;

    OwnerTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("owner_type")
  private OwnerTypeEnum ownerType = null;

  @SerializedName("response")
  private String response = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("title")
  private String title = null;

  public GetCharactersCharacterIdCalendarEventIdOk date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * date string
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "date string")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public GetCharactersCharacterIdCalendarEventIdOk duration(Long duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Length in minutes
   * @return duration
  **/
  @ApiModelProperty(example = "null", required = true, value = "Length in minutes")
  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public GetCharactersCharacterIdCalendarEventIdOk eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * event_id integer
   * @return eventId
  **/
  @ApiModelProperty(example = "null", required = true, value = "event_id integer")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * importance integer
   * @return importance
  **/
  @ApiModelProperty(example = "null", required = true, value = "importance integer")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "owner_id integer")
  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerName(String ownerName) {
    this.ownerName = ownerName;
    return this;
  }

   /**
   * owner_name string
   * @return ownerName
  **/
  @ApiModelProperty(example = "null", required = true, value = "owner_name string")
  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public GetCharactersCharacterIdCalendarEventIdOk ownerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
    return this;
  }

   /**
   * owner_type string
   * @return ownerType
  **/
  @ApiModelProperty(example = "null", required = true, value = "owner_type string")
  public OwnerTypeEnum getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnerTypeEnum ownerType) {
    this.ownerType = ownerType;
  }

  public GetCharactersCharacterIdCalendarEventIdOk response(String response) {
    this.response = response;
    return this;
  }

   /**
   * response string
   * @return response
  **/
  @ApiModelProperty(example = "null", required = true, value = "response string")
  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public GetCharactersCharacterIdCalendarEventIdOk text(String text) {
    this.text = text;
    return this;
  }

   /**
   * text string
   * @return text
  **/
  @ApiModelProperty(example = "null", required = true, value = "text string")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public GetCharactersCharacterIdCalendarEventIdOk title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventIdOk = (GetCharactersCharacterIdCalendarEventIdOk) o;
    return Objects.equals(this.date, getCharactersCharacterIdCalendarEventIdOk.date) &&
        Objects.equals(this.duration, getCharactersCharacterIdCalendarEventIdOk.duration) &&
        Objects.equals(this.eventId, getCharactersCharacterIdCalendarEventIdOk.eventId) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendarEventIdOk.importance) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdCalendarEventIdOk.ownerId) &&
        Objects.equals(this.ownerName, getCharactersCharacterIdCalendarEventIdOk.ownerName) &&
        Objects.equals(this.ownerType, getCharactersCharacterIdCalendarEventIdOk.ownerType) &&
        Objects.equals(this.response, getCharactersCharacterIdCalendarEventIdOk.response) &&
        Objects.equals(this.text, getCharactersCharacterIdCalendarEventIdOk.text) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendarEventIdOk.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, duration, eventId, importance, ownerId, ownerName, ownerType, response, text, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendarEventIdOk {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerName: ").append(toIndentedString(ownerName)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

