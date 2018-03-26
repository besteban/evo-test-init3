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
 * AccountMovement
 */

@Data
@Builder
public class AccountMovement extends BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sequential")
  private Long sequential;
  
  @JsonProperty("associatedAccountType")
  private String associatedAccountType;
  
  @JsonProperty("associatedAccountTypeDescription")
  private String associatedAccountTypeDescription;
  
  @JsonProperty("operationSign")
  private Boolean operationSign;
  
  @JsonProperty("loadedCurrencyId")
  private String loadedCurrencyId;
  
  @JsonProperty("loadedCurrencyIdDescription")
  private String loadedCurrencyIdDescription;
  
  @JsonProperty("loadedCurrencyIdSymbol")
  private String loadedCurrencyIdSymbol;
  
  @JsonProperty("movementTypeId")
  private String movementTypeId;
  
  @JsonProperty("movementTypeDescription")
  private String movementTypeDescription;
  
  @JsonProperty("inbox")

  @ApiModelProperty(value = "Tag/s of the movement inserted by the client")
  private List<String> inbox = null;
  
  @JsonProperty("editedTimestamp")
  private String editedTimestamp;
  
  @JsonProperty("textNote")
  private String textNote;
  
  @JsonProperty("urlImage")
  private String urlImage;
  
  @JsonProperty("urlVideo")
  private String urlVideo;
  
  @JsonProperty("urlVoiceNote")
  private String urlVoiceNote;
  
  @JsonProperty("recordSource")
  private String recordSource;
  
  @JsonProperty("operationAccountDate")
  private String operationAccountDate;
  
  @JsonProperty("accountingDate")
  private String accountingDate;
  
  @JsonProperty("realOperationDate")
  private String realOperationDate;
  
  @JsonProperty("dailyAccountBalance")
  private Double dailyAccountBalance;
  
  @JsonProperty("balanceAfterOperation")
  private Double balanceAfterOperation;
  
  @JsonProperty("operationAccountDescription")
  private String operationAccountDescription;
  
  @JsonProperty("operationAccountStatusId")
  private String operationAccountStatusId;
  
  @JsonProperty("operationAccountType")
  private String operationAccountType;
  
  @JsonProperty("operationAccountTypeCategory")
  private String operationAccountTypeCategory;
  
  @JsonProperty("operationAccountTypeDescription")
  private String operationAccountTypeDescription;
  
  @JsonProperty("date")
  private String date;
  
}

