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


/**
 * Coordinates of the structure in Cartesian space relative to the Sun, in metres. 
 */
@ApiModel(description = "Coordinates of the structure in Cartesian space relative to the Sun, in metres. ")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetUniverseStructuresStructureIdOkPosition   {
  @SerializedName("x")
  private Float x = null;

  @SerializedName("y")
  private Float y = null;

  @SerializedName("z")
  private Float z = null;

  public GetUniverseStructuresStructureIdOkPosition x(Float x) {
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(example = "null", required = true, value = "x number")
  public Float getX() {
    return x;
  }

  public void setX(Float x) {
    this.x = x;
  }

  public GetUniverseStructuresStructureIdOkPosition y(Float y) {
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(example = "null", required = true, value = "y number")
  public Float getY() {
    return y;
  }

  public void setY(Float y) {
    this.y = y;
  }

  public GetUniverseStructuresStructureIdOkPosition z(Float z) {
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(example = "null", required = true, value = "z number")
  public Float getZ() {
    return z;
  }

  public void setZ(Float z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStructuresStructureIdOkPosition getUniverseStructuresStructureIdOkPosition = (GetUniverseStructuresStructureIdOkPosition) o;
    return Objects.equals(this.x, getUniverseStructuresStructureIdOkPosition.x) &&
        Objects.equals(this.y, getUniverseStructuresStructureIdOkPosition.y) &&
        Objects.equals(this.z, getUniverseStructuresStructureIdOkPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStructuresStructureIdOkPosition {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

