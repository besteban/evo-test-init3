package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * PaymentModel
 */

@Data
@Builder
public class PaymentModel extends BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("paymentType")
  private String paymentType;
  
  @JsonProperty("origin")
  private String origin;
  
  @JsonProperty("groupId")
  private String groupId;
  
  @JsonProperty("operationDate")
  private String operationDate;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
  @JsonProperty("associatedMovementUuid")
  private String associatedMovementUuid;
  
  @JsonProperty("frequency")
  private String frequency;
  
  @JsonProperty("hidden")
  private Boolean hidden;
  
  @JsonProperty("inbox")

  @ApiModelProperty(value = "Tag/s of the movement inserted by the client")
  private List<String> inbox = null;
  
  @JsonProperty("date")
  private String date;
  
}

