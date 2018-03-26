package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * Position
 */

@Data
@Builder
public class Position  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("timestamp")
  private String timestamp;
  
  @JsonProperty("type")
  private String type;
  
  @JsonProperty("latitude")
  private Float latitude;
  
  @JsonProperty("longitude")
  private Float longitude;
  
  @JsonProperty("mobileOS")
  private String mobileOS;
  
  @JsonProperty("mobileType")
  private String mobileType;
  
  @JsonProperty("appName")
  private String appName;
  
  @JsonProperty("appVersion")
  private String appVersion;
  
}

