package com.ev.srv.testci.model;

import lombok.Builder;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;


/**
 * Contact
 */

@Data
@Builder
public class Contact  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("uuid")
  private String uuid;
  
  @JsonProperty("nickname")
  private String nickname;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("surname")
  private String surname;
  
  @JsonProperty("phoneNumber")
  private String phoneNumber;
  
  @JsonProperty("email")
  private String email;
  
  @JsonProperty("bicNumber")
  private String bicNumber;
  
  @JsonProperty("ibanNumber")
  private String ibanNumber;
  
  @JsonProperty("notificationChannel")
  private String notificationChannel;
  
}

