package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.PhoneActionObject;
import com.ev.srv.testci.service.VoiceService;

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
public class VoiceController {

	@Autowired
    private VoiceService service;

	@ApiOperation(value = "This is the voice filter.", nickname = "interpreter", notes = "", response = PhoneActionObject.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PhoneActionObject.class) })
    @RequestMapping(value = "/voice",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PhoneActionObject> interpreter( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Text to analyze.", required = true)  @RequestParam(value = "text", required = true) String text, @ApiParam(value = "List of subcontract")  @RequestParam(value = "subacuerdo", required = false) List<String> subacuerdo, @ApiParam(value = "Subcontract of a credit card")  @RequestParam(value = "subacuerdotarjeta", required = false) String subacuerdotarjeta, @ApiParam(value = "Text language.")  @RequestParam(value = "language", required = false) String language, @ApiParam(value = "CategoryId to filter.")  @RequestParam(value = "categoryId", required = false) String categoryId, @ApiParam(value = "Show internal transfers or not.")  @RequestParam(value = "internaltransfer", required = false) String internaltransfer, @ApiParam(value = "Number of movements to retrieve if SHOW.")  @RequestParam(value = "maxItems", required = false) Integer maxItems) throws ApiException{
        return new ResponseEntity<PhoneActionObject>(service.interpreter(acuerdoBE, text, subacuerdo, subacuerdotarjeta, language, categoryId, internaltransfer, maxItems), HttpStatus.NOT_IMPLEMENTED);
    }

}
