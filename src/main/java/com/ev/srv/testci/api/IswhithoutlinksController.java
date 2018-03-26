package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import java.util.Map;
import com.ev.srv.testci.service.IswhithoutlinksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import lombok.extern.slf4j.Slf4j;
import com.evo.api.springboot.exception.ApiException;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class IswhithoutlinksController {

	@Autowired
    private IswhithoutlinksService service;

	@ApiOperation(value = "Return if a account is without links type.", nickname = "isWithoutLinksAccount", notes = "", response = Boolean.class, responseContainer = "Map", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    @RequestMapping(value = "/iswhithoutlinks",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<Map<String, Boolean>> isWithoutLinksAccount( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "subacuerdo, there should be a ; between each subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo) throws ApiException{
        return new ResponseEntity<Map<String, Boolean>>(service.isWithoutLinksAccount(acuerdoBE, subacuerdo), HttpStatus.NOT_IMPLEMENTED);
    }

}
