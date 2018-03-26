package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * WireTransferMovement
 */

@Data
@Builder
public class WireTransferMovement extends BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sourceBicNumber")
  private String sourceBicNumber;
  
  @JsonProperty("sourceIbanNumber")
  private String sourceIbanNumber;
  
  @JsonProperty("sourceClientName")
  private String sourceClientName;
  
  @JsonProperty("sourceId")
  private String sourceId;
  
  @JsonProperty("sourceCountry")
  private String sourceCountry;
  
  @JsonProperty("destinationBicNumber")
  private String destinationBicNumber;
  
  @JsonProperty("destinationIbanNumber")
  private String destinationIbanNumber;
  
  @JsonProperty("destinationClientName")
  private String destinationClientName;
  
  @JsonProperty("destinationId")
  private String destinationId;
  
  @JsonProperty("destinationCountry")
  private String destinationCountry;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
  @JsonProperty("taxHaven")
  private Boolean taxHaven;
  
  @JsonProperty("automatic")
  private Boolean automatic;
  
}

