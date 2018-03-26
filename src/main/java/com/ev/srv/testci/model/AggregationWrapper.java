package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * AggregationWrapper
 */

@Data
@Builder
public class AggregationWrapper  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("categorizedAmounts")

  @ApiModelProperty(required = true, value = "Measures of the categories")
  private Map<String, Double> categorizedAmounts = new HashMap<>();
  
  @JsonProperty("stats")

  @ApiModelProperty(required = true, value = "Description of the aggregation")
  private Map<String, Double> stats = new HashMap<>();
  
}

