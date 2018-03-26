package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * BaseModel
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "flavour", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = PaymentMovement.class, name = "PaymentMovement"),
  @JsonSubTypes.Type(value = AccountMovement.class, name = "AccountMovement"),
  @JsonSubTypes.Type(value = WireTransferMovement.class, name = "WireTransferMovement"),
  @JsonSubTypes.Type(value = CardMovement.class, name = "CardMovement"),
  @JsonSubTypes.Type(value = IntTransferBankCheckMovement.class, name = "IntTransferBankCheckMovement"),
  @JsonSubTypes.Type(value = PaymentModel.class, name = "Payment model"),
  @JsonSubTypes.Type(value = InternalTransferMovement.class, name = "InternalTransferMovement"),
})

@Data
@Builder
public class BaseModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("flavour")
  private String flavour;
  
  @JsonProperty("associatedAccountId")
  private String associatedAccountId;
  
  @JsonProperty("loadedAmount")
  private Double loadedAmount;
  
  @JsonProperty("categoryId")
  private String categoryId;
  
  @JsonProperty("categoryDescription")
  private String categoryDescription;
  
  @JsonProperty("timestamp")
  private String timestamp;
  
}

