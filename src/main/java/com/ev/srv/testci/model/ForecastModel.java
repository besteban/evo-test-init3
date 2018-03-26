package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * ForecastModel
 */

@Data
@Builder
public class ForecastModel  implements Serializable {
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
  
  @JsonProperty("forecastDate")
  private String forecastDate;
  
  @JsonProperty("forecastType")
  private Boolean forecastType;
  
  @JsonProperty("manualForecast")
  private Double manualForecast;
  
  @JsonProperty("realAmount")
  private Double realAmount;
  
  @JsonProperty("date")
  private String date;
  
}

