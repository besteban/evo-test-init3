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
 * InternalTransferMovement
 */

@Data
@Builder
public class InternalTransferMovement extends BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sourceIbanNumber")
  private String sourceIbanNumber;
  
  @JsonProperty("sourceClientName")
  private String sourceClientName;
  
  @JsonProperty("destinationIbanNumber")
  private String destinationIbanNumber;
  
  @JsonProperty("destinationClientName")
  private String destinationClientName;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
  @JsonProperty("isAutomatic")
  private Boolean isAutomatic;
  
}

