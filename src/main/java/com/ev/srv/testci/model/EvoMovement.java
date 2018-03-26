package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * EvoMovement
 */

@Data
@Builder
public class EvoMovement  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("date")
  private String date;
  
  @JsonProperty("timestamp")
  private String timestamp;
  
  @JsonProperty("associatedAccountId")
  private String associatedAccountId;
  
  @JsonProperty("flavour")
  private String flavour;
  
  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("inbox")

  @ApiModelProperty(value = "")
  private List<String> inbox = null;
  
  @JsonProperty("loadedAmount")
  private Double loadedAmount;
  
  @JsonProperty("categoryDescription")
  private String categoryDescription;
  
  @JsonProperty("categoryId")
  private String categoryId;
  
  @JsonProperty("creditOperation")
  private Boolean creditOperation;
  
}

