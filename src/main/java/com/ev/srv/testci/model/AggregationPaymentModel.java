package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.AggregationWrapper;
import com.ev.srv.testci.model.PaymentModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * AggregationPaymentModel
 */

@Data
@Builder
public class AggregationPaymentModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("aggregation")

  @ApiModelProperty(value = "Map of aggregations: max, min, count, mean")
  private Map<String, Double> aggregation = null;
  
  @JsonProperty("items")

  @ApiModelProperty(value = "List of movements for a model object")
  private List<PaymentModel> items = null;
  
  @JsonProperty("pending")

  @ApiModelProperty(value = "List of pending movements for a model object")
  private List<PaymentModel> pending = null;
  
  @JsonProperty("statsBundle")
  private AggregationWrapper statsBundle;
  
}

