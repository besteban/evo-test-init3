package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.ContentCardMovement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * RequestWrapperCardMovement
 */

@Data
@Builder
public class RequestWrapperCardMovement  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content")
  private ContentCardMovement content;
  
}

