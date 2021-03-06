/**
 * IdCheck.IO API
 * Check identity documents
 *
 * OpenAPI spec version: 0.0
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


package com.ariadnext.idcheckio.model;

import java.util.Objects;
import com.ariadnext.idcheckio.model.Control;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ControlGroup
 */

public class ControlGroup   {
  @SerializedName("identifier")
  private String identifier = null;

  @SerializedName("titleMsg")
  private String titleMsg = null;

  @SerializedName("resultMsg")
  private String resultMsg = null;

  /**
   * result
   */
  public enum ResultEnum {
    @SerializedName("NONE")
    NONE("NONE"),
    
    @SerializedName("OK")
    OK("OK"),
    
    @SerializedName("WARNING")
    WARNING("WARNING"),
    
    @SerializedName("ERROR")
    ERROR("ERROR");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("result")
  private ResultEnum result = null;

  @SerializedName("control")
  private List<Control> control = new ArrayList<Control>();

  public ControlGroup identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * control group identifier
   * @return identifier
  **/
  @ApiModelProperty(example = "null", value = "control group identifier")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public ControlGroup titleMsg(String titleMsg) {
    this.titleMsg = titleMsg;
    return this;
  }

   /**
   * title message
   * @return titleMsg
  **/
  @ApiModelProperty(example = "null", value = "title message")
  public String getTitleMsg() {
    return titleMsg;
  }

  public void setTitleMsg(String titleMsg) {
    this.titleMsg = titleMsg;
  }

  public ControlGroup resultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
    return this;
  }

   /**
   * result message
   * @return resultMsg
  **/
  @ApiModelProperty(example = "null", value = "result message")
  public String getResultMsg() {
    return resultMsg;
  }

  public void setResultMsg(String resultMsg) {
    this.resultMsg = resultMsg;
  }

  public ControlGroup result(ResultEnum result) {
    this.result = result;
    return this;
  }

   /**
   * result
   * @return result
  **/
  @ApiModelProperty(example = "null", value = "result")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public ControlGroup control(List<Control> control) {
    this.control = control;
    return this;
  }

  public ControlGroup addControlItem(Control controlItem) {
    this.control.add(controlItem);
    return this;
  }

   /**
   * control list
   * @return control
  **/
  @ApiModelProperty(example = "null", value = "control list")
  public List<Control> getControl() {
    return control;
  }

  public void setControl(List<Control> control) {
    this.control = control;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ControlGroup controlGroup = (ControlGroup) o;
    return Objects.equals(this.identifier, controlGroup.identifier) &&
        Objects.equals(this.titleMsg, controlGroup.titleMsg) &&
        Objects.equals(this.resultMsg, controlGroup.resultMsg) &&
        Objects.equals(this.result, controlGroup.result) &&
        Objects.equals(this.control, controlGroup.control);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, titleMsg, resultMsg, result, control);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControlGroup {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    titleMsg: ").append(toIndentedString(titleMsg)).append("\n");
    sb.append("    resultMsg: ").append(toIndentedString(resultMsg)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    control: ").append(toIndentedString(control)).append("\n");
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

