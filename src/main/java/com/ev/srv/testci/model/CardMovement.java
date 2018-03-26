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
 * CardMovement
 */

@Data
@Builder
public class CardMovement extends BaseModel implements Serializable {
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
  
  @JsonProperty("operationCardType")
  private String operationCardType;
  
  @JsonProperty("operationCardTypeDescription")
  private String operationCardTypeDescription;
  
  @JsonProperty("operationCardStatusId")
  private String operationCardStatusId;
  
  @JsonProperty("operationCardStatusIdDescription")
  private String operationCardStatusIdDescription;
  
  @JsonProperty("cardSequential")
  private Long cardSequential;
  
  @JsonProperty("statementMovementNumber")
  private String statementMovementNumber;
  
  @JsonProperty("statementNumber")
  private String statementNumber;
  
  @JsonProperty("operationCardSign")
  private Boolean operationCardSign;
  
  @JsonProperty("cardId")
  private String cardId;
  
  @JsonProperty("associatedCardId")
  private String associatedCardId;
  
  @JsonProperty("associatedCardType")
  private String associatedCardType;
  
  @JsonProperty("associatedCardTypeDescription")
  private String associatedCardTypeDescription;
  
  @JsonProperty("commerceId")
  private String commerceId;
  
  @JsonProperty("terminalCode")
  private String terminalCode;
  
  @JsonProperty("entityCode")
  private String entityCode;
  
  @JsonProperty("entityName")
  private String entityName;
  
  @JsonProperty("merchantCode")
  private String merchantCode;
  
  @JsonProperty("operationCardDate")
  private String operationCardDate;
  
  @JsonProperty("operationAmount")
  private Double operationAmount;
  
  @JsonProperty("operationCurrencyId")
  private String operationCurrencyId;
  
  @JsonProperty("operationCurrencyIdSymbol")
  private String operationCurrencyIdSymbol;
  
  @JsonProperty("operationCurrencyIdDescription")
  private String operationCurrencyIdDescription;
  
  @JsonProperty("operationLocation")
  private String operationLocation;
  
  @JsonProperty("operationCountry")
  private String operationCountry;
  
  @JsonProperty("operationCountrySymbol")
  private String operationCountrySymbol;
  
  @JsonProperty("operationCountryDescription")
  private String operationCountryDescription;
  
  @JsonProperty("cancelledOperation")
  private Boolean cancelledOperation;
  
  @JsonProperty("isCreditOperation")
  private Boolean isCreditOperation;
  
  @JsonProperty("isInternationalOperation")
  private Boolean isInternationalOperation;
  
  @JsonProperty("getisInstallmentPurchase")
  private Boolean getisInstallmentPurchase;
  
  @JsonProperty("accountCrossingIndex")
  private Boolean accountCrossingIndex;
  
  @JsonProperty("accountChargeIndex")
  private Boolean accountChargeIndex;
  
  @JsonProperty("operationFee")
  private Double operationFee;
  
  @JsonProperty("operationExchangeRate")
  private Double operationExchangeRate;
  
  @JsonProperty("operationCardDescription")
  private String operationCardDescription;
  
  @JsonProperty("categoryBusinessDescription")
  private String categoryBusinessDescription;
  
  @JsonProperty("billingCategoryId")
  private String billingCategoryId;
  
  @JsonProperty("billingCategoryDescription")
  private String billingCategoryDescription;
  
  @JsonProperty("fee")
  private String fee;
  
  @JsonProperty("friendFee")
  private String friendFee;
  
  @JsonProperty("paymentMethodId")
  private String paymentMethodId;
  
  @JsonProperty("contactlessType")
  private String contactlessType;
  
  @JsonProperty("date")
  private String date;
  
  @JsonProperty("bic")
  private String bic;
  
}

