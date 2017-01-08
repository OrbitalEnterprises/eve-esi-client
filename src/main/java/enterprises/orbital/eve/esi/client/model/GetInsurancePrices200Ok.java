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
import enterprises.orbital.eve.esi.client.model.InsurancepricesLevels;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetInsurancePrices200Ok   {
  @SerializedName("levels")
  private List<InsurancepricesLevels> levels = new ArrayList<InsurancepricesLevels>();

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetInsurancePrices200Ok levels(List<InsurancepricesLevels> levels) {
    this.levels = levels;
    return this;
  }

  public GetInsurancePrices200Ok addLevelsItem(InsurancepricesLevels levelsItem) {
    this.levels.add(levelsItem);
    return this;
  }

   /**
   * A list of a available insurance levels for this ship type
   * @return levels
  **/
  @ApiModelProperty(example = "null", required = true, value = "A list of a available insurance levels for this ship type")
  public List<InsurancepricesLevels> getLevels() {
    return levels;
  }

  public void setLevels(List<InsurancepricesLevels> levels) {
    this.levels = levels;
  }

  public GetInsurancePrices200Ok typeId(Integer typeId) {
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
    GetInsurancePrices200Ok getInsurancePrices200Ok = (GetInsurancePrices200Ok) o;
    return Objects.equals(this.levels, getInsurancePrices200Ok.levels) &&
        Objects.equals(this.typeId, getInsurancePrices200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(levels, typeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInsurancePrices200Ok {\n");
    
    sb.append("    levels: ").append(toIndentedString(levels)).append("\n");
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

