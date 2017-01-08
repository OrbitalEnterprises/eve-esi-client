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
import enterprises.orbital.eve.esi.client.model.GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * extractor_details object
 */
@ApiModel(description = "extractor_details object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails   {
  @SerializedName("cycle_time")
  private Integer cycleTime = null;

  @SerializedName("head_radius")
  private Float headRadius = null;

  @SerializedName("heads")
  private List<GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads> heads = new ArrayList<GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads>();

  @SerializedName("product_type_id")
  private Integer productTypeId = null;

  @SerializedName("qty_per_cycle")
  private Integer qtyPerCycle = null;

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails cycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
    return this;
  }

   /**
   * in seconds
   * @return cycleTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "in seconds")
  public Integer getCycleTime() {
    return cycleTime;
  }

  public void setCycleTime(Integer cycleTime) {
    this.cycleTime = cycleTime;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails headRadius(Float headRadius) {
    this.headRadius = headRadius;
    return this;
  }

   /**
   * head_radius number
   * @return headRadius
  **/
  @ApiModelProperty(example = "null", required = true, value = "head_radius number")
  public Float getHeadRadius() {
    return headRadius;
  }

  public void setHeadRadius(Float headRadius) {
    this.headRadius = headRadius;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails heads(List<GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads> heads) {
    this.heads = heads;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails addHeadsItem(GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads headsItem) {
    this.heads.add(headsItem);
    return this;
  }

   /**
   * heads array
   * @return heads
  **/
  @ApiModelProperty(example = "null", required = true, value = "heads array")
  public List<GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads> getHeads() {
    return heads;
  }

  public void setHeads(List<GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetailsHeads> heads) {
    this.heads = heads;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails productTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
    return this;
  }

   /**
   * product_type_id integer
   * @return productTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "product_type_id integer")
  public Integer getProductTypeId() {
    return productTypeId;
  }

  public void setProductTypeId(Integer productTypeId) {
    this.productTypeId = productTypeId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails qtyPerCycle(Integer qtyPerCycle) {
    this.qtyPerCycle = qtyPerCycle;
    return this;
  }

   /**
   * qty_per_cycle integer
   * @return qtyPerCycle
  **/
  @ApiModelProperty(example = "null", required = true, value = "qty_per_cycle integer")
  public Integer getQtyPerCycle() {
    return qtyPerCycle;
  }

  public void setQtyPerCycle(Integer qtyPerCycle) {
    this.qtyPerCycle = qtyPerCycle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails = (GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails) o;
    return Objects.equals(this.cycleTime, getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails.cycleTime) &&
        Objects.equals(this.headRadius, getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails.headRadius) &&
        Objects.equals(this.heads, getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails.heads) &&
        Objects.equals(this.productTypeId, getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails.productTypeId) &&
        Objects.equals(this.qtyPerCycle, getCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails.qtyPerCycle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleTime, headRadius, heads, productTypeId, qtyPerCycle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdOkExtractorDetails {\n");
    
    sb.append("    cycleTime: ").append(toIndentedString(cycleTime)).append("\n");
    sb.append("    headRadius: ").append(toIndentedString(headRadius)).append("\n");
    sb.append("    heads: ").append(toIndentedString(heads)).append("\n");
    sb.append("    productTypeId: ").append(toIndentedString(productTypeId)).append("\n");
    sb.append("    qtyPerCycle: ").append(toIndentedString(qtyPerCycle)).append("\n");
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

