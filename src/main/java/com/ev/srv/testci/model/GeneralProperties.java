package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.ev.srv.testci.model.Inbox;
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
 * GeneralProperties
 */

@Data
@Builder
public class GeneralProperties  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("acuerdoBE")
  private String acuerdoBE;
  
  @JsonProperty("inboxes")

  @ApiModelProperty(value = "")
  private List<Inbox> inboxes = null;
  
  @JsonProperty("properties")

  @ApiModelProperty(value = "")
  private Map<String, String> properties = null;
  
}

