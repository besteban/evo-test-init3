package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * World
 */

@Data
@Builder
public class World  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("timestamp")
  private String timestamp;
  
  @JsonProperty("type")
  private String type;
  
  @JsonProperty("ageInterval")
  private Integer ageInterval;
  
  @JsonProperty("incomeInterval")
  private Integer incomeInterval;
  
  @JsonProperty("postalCode")
  private String postalCode;
  
  @JsonProperty("gender")
  private String gender;
  
}

