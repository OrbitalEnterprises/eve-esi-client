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
 * label object
 */
@ApiModel(description = "label object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-08T14:33:13.072-05:00")
public class GetCharactersCharacterIdMailLabelsOkLabels   {
  /**
   * color string
   */
  public enum ColorEnum {
    @SerializedName("#ffffff")
    FFFFFF("#ffffff"),
    
    @SerializedName("#ffff01")
    FFFF01("#ffff01"),
    
    @SerializedName("#ff6600")
    FF6600("#ff6600"),
    
    @SerializedName("#fe0000")
    FE0000("#fe0000"),
    
    @SerializedName("#9a0000")
    _9A0000("#9a0000"),
    
    @SerializedName("#660066")
    _660066("#660066"),
    
    @SerializedName("#0000fe")
    _0000FE("#0000fe"),
    
    @SerializedName("#0099ff")
    _0099FF("#0099ff"),
    
    @SerializedName("#01ffff")
    _01FFFF("#01ffff"),
    
    @SerializedName("#00ff33")
    _00FF33("#00ff33"),
    
    @SerializedName("#349800")
    _349800("#349800"),
    
    @SerializedName("#006634")
    _006634("#006634"),
    
    @SerializedName("#666666")
    _666666("#666666"),
    
    @SerializedName("#999999")
    _999999("#999999"),
    
    @SerializedName("#e6e6e6")
    E6E6E6("#e6e6e6"),
    
    @SerializedName("#ffffcd")
    FFFFCD("#ffffcd"),
    
    @SerializedName("#99ffff")
    _99FFFF("#99ffff"),
    
    @SerializedName("#ccff9a")
    CCFF9A("#ccff9a");

    private String value;

    ColorEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("color")
  private ColorEnum color = ColorEnum.FFFFFF;

  @SerializedName("label_id")
  private Integer labelId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("unread_count")
  private Integer unreadCount = null;

  public GetCharactersCharacterIdMailLabelsOkLabels color(ColorEnum color) {
    this.color = color;
    return this;
  }

   /**
   * color string
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "color string")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public GetCharactersCharacterIdMailLabelsOkLabels labelId(Integer labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * label_id integer
   * minimum: 0.0
   * @return labelId
  **/
  @ApiModelProperty(example = "null", value = "label_id integer")
  public Integer getLabelId() {
    return labelId;
  }

  public void setLabelId(Integer labelId) {
    this.labelId = labelId;
  }

  public GetCharactersCharacterIdMailLabelsOkLabels name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdMailLabelsOkLabels unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }

   /**
   * unread_count integer
   * minimum: 0.0
   * @return unreadCount
  **/
  @ApiModelProperty(example = "null", value = "unread_count integer")
  public Integer getUnreadCount() {
    return unreadCount;
  }

  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailLabelsOkLabels getCharactersCharacterIdMailLabelsOkLabels = (GetCharactersCharacterIdMailLabelsOkLabels) o;
    return Objects.equals(this.color, getCharactersCharacterIdMailLabelsOkLabels.color) &&
        Objects.equals(this.labelId, getCharactersCharacterIdMailLabelsOkLabels.labelId) &&
        Objects.equals(this.name, getCharactersCharacterIdMailLabelsOkLabels.name) &&
        Objects.equals(this.unreadCount, getCharactersCharacterIdMailLabelsOkLabels.unreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, labelId, name, unreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailLabelsOkLabels {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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

