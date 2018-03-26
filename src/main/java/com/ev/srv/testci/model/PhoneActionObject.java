package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * PhoneActionObject
 */

@Data
@Builder
public class PhoneActionObject  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private Object data;
  
  /**
   * Gets or Sets actionType
   */
  public enum ActionTypeEnum {
    SHOW("SHOW"),
    
    DO_TRANSFER("DO_TRANSFER"),
    
    DO_HALCASH("DO_HALCASH"),
    
    DO_INTERNALTRANSFER("DO_INTERNALTRANSFER"),
    
    DO_DOWNLOAD("DO_DOWNLOAD"),
    
    GO_SUMMARY("GO_SUMMARY"),
    
    GO_FORECAST("GO_FORECAST"),
    
    GO_CALENDAR("GO_CALENDAR"),
    
    GO_INVESTMENT("GO_INVESTMENT"),
    
    GO_ACCFAVOURITES("GO_ACCFAVOURITES"),
    
    GO_CARDFAVOURITES("GO_CARDFAVOURITES"),
    
    GO_BILLS("GO_BILLS"),
    
    RUDEWORD("RUDEWORD"),
    
    BONUS("BONUS"),
    
    NOT_FOUND("NOT_FOUND");

    private String value;

    ActionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionTypeEnum fromValue(String text) {
      for (ActionTypeEnum b : ActionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("actionType")
  private ActionTypeEnum actionType;
  
}

