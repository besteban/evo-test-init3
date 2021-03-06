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
import java.util.ArrayList;
import java.util.List;


/**
 * BillMovement
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "flavour", visible = true )
@JsonSubTypes({
})

@Data
@Builder
public class BillMovement  implements Serializable {
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
  
  @JsonProperty("presentationDate")
  private String presentationDate;
  
  @JsonProperty("vatNumber")
  private String vatNumber;
  
  @JsonProperty("vatId")
  private String vatId;
  
  @JsonProperty("vatCountry")
  private String vatCountry;
  
  @JsonProperty("vatSuffixNumber")
  private String vatSuffixNumber;
  
  @JsonProperty("sourceReference")
  private String sourceReference;
  
  @JsonProperty("destinationId")
  private String destinationId;
  
  @JsonProperty("onlineBillPaymentId")
  private String onlineBillPaymentId;
  
  @JsonProperty("onlineBillPaymentDate")
  private String onlineBillPaymentDate;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
  @JsonProperty("billStatusId")
  private String billStatusId;
  
  @JsonProperty("billStatusIdDescription")
  private String billStatusIdDescription;
  
  @JsonProperty("companyName")
  private String companyName;
  
  @JsonProperty("docSequential")
  private String docSequential;
  
  @JsonProperty("operationBillDescription")
  private String operationBillDescription;
  
  @JsonProperty("date")
  private String date;
  
}

