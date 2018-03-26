package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * FinancialHealth
 */

@Data
@Builder
public class FinancialHealth  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("financialHealth")
  private Integer financialHealth;
  
  @JsonProperty("incomeAmount")
  private Double incomeAmount;
  
  @JsonProperty("expenseAmount")
  private Double expenseAmount;
  
  @JsonProperty("debtAmount")
  private Double debtAmount;
  
  @JsonProperty("homeAmount")
  private Double homeAmount;
  
  @JsonProperty("financialFreedom")
  private Double financialFreedom;
  
  @JsonProperty("missingDaysOfFreedomForBalance")
  private Double missingDaysOfFreedomForBalance;
  
  @JsonProperty("financialFreedomHours")
  private Double financialFreedomHours;
  
  @JsonProperty("kmToWalk")
  private Double kmToWalk;
  
  @JsonProperty("numberOfFilms")
  private Double numberOfFilms;
  
  @JsonProperty("musicSongs")
  private Double musicSongs;
  
  @JsonProperty("recommendedDaysOfFreedom")
  private Double recommendedDaysOfFreedom;
  
}

