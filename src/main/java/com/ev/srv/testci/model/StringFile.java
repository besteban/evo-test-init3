package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * StringFile
 */

@Data
@Builder
public class StringFile  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  private String name;
  
  @JsonProperty("file")
  private String file;
  
  @JsonProperty("checksum")
  private Long checksum;
  
}

