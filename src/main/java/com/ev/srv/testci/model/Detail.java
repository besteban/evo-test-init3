package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * Detail
 */

@Data
@Builder
public class Detail  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("description")
  private String description;
  
  @JsonProperty("value")
  private String value;
  
  @JsonProperty("criteria")
  private Integer criteria;
  
}

