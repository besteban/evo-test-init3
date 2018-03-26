package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.service.ProfileService;

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
public class ProfileController {

	@Autowired
    private ProfileService service;

	@ApiOperation(value = "Return the stored favourites for the given user.", nickname = "deletePushes", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/profile/pushes",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deletePushes( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "",required=true) @PathVariable("uuid") String uuid) throws ApiException{
        return new ResponseEntity<String>(service.deletePushes(acuerdoBE, uuid), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return the stored favourites for the given user.", nickname = "getPushes", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/profile/pushes",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<String> getPushes( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<String>(service.getPushes(acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

}
