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
import enterprises.orbital.eve.esi.client.model.GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails;
import enterprises.orbital.eve.esi.client.model.GetCharactersCharacterIdPlanetsPlanetIdOkFactoryDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;


/**
 * pin object
 */
@ApiModel(description = "pin object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetCharactersCharacterIdPlanetsPlanetIdOkPins   {
  @SerializedName("expiry_time")
  private DateTime expiryTime = null;

  @SerializedName("extractor_details")
  private GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails extractorDetails = null;

  @SerializedName("factory_details")
  private GetCharactersCharacterIdPlanetsPlanetIdOkFactoryDetails factoryDetails = null;

  @SerializedName("install_time")
  private DateTime installTime = null;

  @SerializedName("last_cycle_start")
  private DateTime lastCycleStart = null;

  @SerializedName("latitude")
  private Float latitude = null;

  @SerializedName("longitude")
  private Float longitude = null;

  @SerializedName("pin_id")
  private Long pinId = null;

  @SerializedName("schematic_id")
  private Integer schematicId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins expiryTime(DateTime expiryTime) {
    this.expiryTime = expiryTime;
    return this;
  }

   /**
   * expiry_time string
   * @return expiryTime
  **/
  @ApiModelProperty(example = "null", value = "expiry_time string")
  public DateTime getExpiryTime() {
    return expiryTime;
  }

  public void setExpiryTime(DateTime expiryTime) {
    this.expiryTime = expiryTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins extractorDetails(GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
    return this;
  }

   /**
   * Get extractorDetails
   * @return extractorDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails getExtractorDetails() {
    return extractorDetails;
  }

  public void setExtractorDetails(GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails extractorDetails) {
    this.extractorDetails = extractorDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins factoryDetails(GetCharactersCharacterIdPlanetsPlanetIdOkFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
    return this;
  }

   /**
   * Get factoryDetails
   * @return factoryDetails
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCharactersCharacterIdPlanetsPlanetIdOkFactoryDetails getFactoryDetails() {
    return factoryDetails;
  }

  public void setFactoryDetails(GetCharactersCharacterIdPlanetsPlanetIdOkFactoryDetails factoryDetails) {
    this.factoryDetails = factoryDetails;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins installTime(DateTime installTime) {
    this.installTime = installTime;
    return this;
  }

   /**
   * install_time string
   * @return installTime
  **/
  @ApiModelProperty(example = "null", value = "install_time string")
  public DateTime getInstallTime() {
    return installTime;
  }

  public void setInstallTime(DateTime installTime) {
    this.installTime = installTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins lastCycleStart(DateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
    return this;
  }

   /**
   * last_cycle_start string
   * @return lastCycleStart
  **/
  @ApiModelProperty(example = "null", value = "last_cycle_start string")
  public DateTime getLastCycleStart() {
    return lastCycleStart;
  }

  public void setLastCycleStart(DateTime lastCycleStart) {
    this.lastCycleStart = lastCycleStart;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins latitude(Float latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * latitude number
   * @return latitude
  **/
  @ApiModelProperty(example = "null", required = true, value = "latitude number")
  public Float getLatitude() {
    return latitude;
  }

  public void setLatitude(Float latitude) {
    this.latitude = latitude;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins longitude(Float longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * longitude number
   * @return longitude
  **/
  @ApiModelProperty(example = "null", required = true, value = "longitude number")
  public Float getLongitude() {
    return longitude;
  }

  public void setLongitude(Float longitude) {
    this.longitude = longitude;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins pinId(Long pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * pin_id integer
   * @return pinId
  **/
  @ApiModelProperty(example = "null", required = true, value = "pin_id integer")
  public Long getPinId() {
    return pinId;
  }

  public void setPinId(Long pinId) {
    this.pinId = pinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins schematicId(Integer schematicId) {
    this.schematicId = schematicId;
    return this;
  }

   /**
   * schematic_id integer
   * @return schematicId
  **/
  @ApiModelProperty(example = "null", value = "schematic_id integer")
  public Integer getSchematicId() {
    return schematicId;
  }

  public void setSchematicId(Integer schematicId) {
    this.schematicId = schematicId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkPins typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdOkPins getCharactersCharacterIdPlanetsPlanetIdOkPins = (GetCharactersCharacterIdPlanetsPlanetIdOkPins) o;
    return Objects.equals(this.expiryTime, getCharactersCharacterIdPlanetsPlanetIdOkPins.expiryTime) &&
        Objects.equals(this.extractorDetails, getCharactersCharacterIdPlanetsPlanetIdOkPins.extractorDetails) &&
        Objects.equals(this.factoryDetails, getCharactersCharacterIdPlanetsPlanetIdOkPins.factoryDetails) &&
        Objects.equals(this.installTime, getCharactersCharacterIdPlanetsPlanetIdOkPins.installTime) &&
        Objects.equals(this.lastCycleStart, getCharactersCharacterIdPlanetsPlanetIdOkPins.lastCycleStart) &&
        Objects.equals(this.latitude, getCharactersCharacterIdPlanetsPlanetIdOkPins.latitude) &&
        Objects.equals(this.longitude, getCharactersCharacterIdPlanetsPlanetIdOkPins.longitude) &&
        Objects.equals(this.pinId, getCharactersCharacterIdPlanetsPlanetIdOkPins.pinId) &&
        Objects.equals(this.schematicId, getCharactersCharacterIdPlanetsPlanetIdOkPins.schematicId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdPlanetsPlanetIdOkPins.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryTime, extractorDetails, factoryDetails, installTime, lastCycleStart, latitude, longitude, pinId, schematicId, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdOkPins {\n");
    
    sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
    sb.append("    extractorDetails: ").append(toIndentedString(extractorDetails)).append("\n");
    sb.append("    factoryDetails: ").append(toIndentedString(factoryDetails)).append("\n");
    sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
    sb.append("    lastCycleStart: ").append(toIndentedString(lastCycleStart)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
    sb.append("    schematicId: ").append(toIndentedString(schematicId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

