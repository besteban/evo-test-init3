package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.ContentBaseModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * RequestWrapperBaseModel
 */

@Data
@Builder
public class RequestWrapperBaseModel  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ContentBaseModel content;
  
}

