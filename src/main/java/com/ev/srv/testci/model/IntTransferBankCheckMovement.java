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
 * IntTransferBankCheckMovement
 */

@Data
@Builder
public class IntTransferBankCheckMovement extends BaseModel implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sourceBicNumber")
  private String sourceBicNumber;
  
  @JsonProperty("sourceAccountNumber")
  private String sourceAccountNumber;
  
  @JsonProperty("sourceClientName")
  private String sourceClientName;
  
  @JsonProperty("sourceId")
  private String sourceId;
  
  @JsonProperty("sourceCountry")
  private String sourceCountry;
  
  @JsonProperty("destinationBicNumber")
  private String destinationBicNumber;
  
  @JsonProperty("destinationAccountNumber")
  private String destinationAccountNumber;
  
  @JsonProperty("destinationClientName")
  private String destinationClientName;
  
  @JsonProperty("destinationId")
  private String destinationId;
  
  @JsonProperty("destinationCountry")
  private String destinationCountry;
  
  @JsonProperty("operationDescription")
  private String operationDescription;
  
  @JsonProperty("moneyBicPath")
  private String moneyBicPath;
  
  @JsonProperty("expenseTypeId")
  private String expenseTypeId;
  
  @JsonProperty("operationAmount")
  private Double operationAmount;
  
  @JsonProperty("operationCurrencyId")
  private String operationCurrencyId;
  
  @JsonProperty("operationCurrencyIdDescription")
  private String operationCurrencyIdDescription;
  
  @JsonProperty("operationCurrencyIdSymbol")
  private String operationCurrencyIdSymbol;
  
  @JsonProperty("operationExchangeRate")
  private Double operationExchangeRate;
  
  @JsonProperty("operationTaxes")
  private Double operationTaxes;
  
}

