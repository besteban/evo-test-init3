package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.Detail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Segmentation
 */

@Data
@Builder
public class Segmentation  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("mappings")

  @ApiModelProperty(value = "")
  private Map<String, Integer> mappings = null;
  
  @JsonProperty("date")
  private String date;
  
  @JsonProperty("associatedAccountId")
  private String associatedAccountId;
  
  @JsonProperty("total")
  private Float total;
  
  @JsonProperty("score")

  @ApiModelProperty(value = "")
  private Map<String, Double> score = null;
  
  @JsonProperty("details")

  @ApiModelProperty(value = "")
  private List<Detail> details = null;
  
  @JsonProperty("months")
  private String months;
  
}

