package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * FavouriteTransfer
 */

@Data
@Builder
public class FavouriteTransfer  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("alias")
  private String alias;
  
  @JsonProperty("loadedAmount")
  private Double loadedAmount;
  
  @JsonProperty("sourceBicNumber")
  private String sourceBicNumber;
  
  @JsonProperty("sourceIbanNumber")
  private String sourceIbanNumber;
  
  @JsonProperty("sourceClientName")
  private String sourceClientName;
  
  @JsonProperty("destinationBicNumber")
  private String destinationBicNumber;
  
  @JsonProperty("destinationIbanNumber")
  private String destinationIbanNumber;
  
  @JsonProperty("destinationClientName")
  private String destinationClientName;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
}

