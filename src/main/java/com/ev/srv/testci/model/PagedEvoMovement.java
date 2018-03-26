package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.EvoMovement;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * PagedEvoMovement
 */

@Data
@Builder
public class PagedEvoMovement  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("totalElements")
  private Integer totalElements;
  
  @JsonProperty("totalPages")
  private Integer totalPages;
  
  @JsonProperty("page")
  private Integer page;
  
  @JsonProperty("size")
  private Integer size;
  
  @JsonProperty("first")
  private Boolean first;
  
  @JsonProperty("last")
  private Boolean last;
  
  @JsonProperty("next")
  private Boolean next;
  
  @JsonProperty("previous")
  private Boolean previous;
  
  @JsonProperty("evoMovementList")

  @ApiModelProperty(value = "")
  private List<EvoMovement> evoMovementList = null;
  
}

