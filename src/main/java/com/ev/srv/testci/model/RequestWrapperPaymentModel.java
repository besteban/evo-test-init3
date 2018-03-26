package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.ContentPaymentModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * RequestWrapperPaymentModel
 */

@Data
@Builder
public class RequestWrapperPaymentModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ContentPaymentModel content;
  
}

