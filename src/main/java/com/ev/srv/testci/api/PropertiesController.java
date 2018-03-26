package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.GeneralProperties;
import java.util.Map;
import com.ev.srv.testci.model.RequestWrapperGeneralProperties;
import com.ev.srv.testci.model.RequestWrapperInbox;
import com.ev.srv.testci.model.RequestWrapperMapStringString;
import com.ev.srv.testci.service.PropertiesService;

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
public class PropertiesController {

	@Autowired
    private PropertiesService service;

	@ApiOperation(value = "Delete an inbox of the user.", nickname = "deleteInbox", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/properties/inbox/{inbox}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteInbox( @ApiParam(value = "Inbox identifier.",required=true) @PathVariable("inbox") String inbox, @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<String>(service.deleteInbox(inbox, codigoEntidad, usuarioBE, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Delete a property of the user.", nickname = "deleteProperty", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/properties/{property}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteProperty( @ApiParam(value = "",required=true) @PathVariable("property") String property, @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<String>(service.deleteProperty(property, codigoEntidad, usuarioBE, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return the requested property.", nickname = "getProfile", notes = "", response = Map.class, responseContainer = "Map", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Map.class, responseContainer = "Map") })
    @RequestMapping(value = "/properties/profile",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<Map<String, Map<String>> getProfile( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "othersAssociatedEB", required = true) String othersAssociatedEB) throws ApiException{
        return new ResponseEntity<Map<String, Map<String>>(service.getProfile(codigoEntidad, usuarioBE, othersAssociatedEB), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return the user properties.", nickname = "getProperties", notes = "", response = GeneralProperties.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeneralProperties.class) })
    @RequestMapping(value = "/properties",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<GeneralProperties> getProperties( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<GeneralProperties>(service.getProperties(codigoEntidad, usuarioBE, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Create a new inbox.", nickname = "newInbox", notes = "", response = GeneralProperties.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeneralProperties.class) })
    @RequestMapping(value = "/properties/inbox",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<GeneralProperties> newInbox(@ApiParam(value = "Json representing the inbox object." ,required=true )  @RequestBody RequestWrapperInbox body) throws ApiException{
        return new ResponseEntity<GeneralProperties>(service.newInbox(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Create a property of the user if it doesn?t exists or modify it if it does.", nickname = "newProperty", notes = "", response = GeneralProperties.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeneralProperties.class) })
    @RequestMapping(value = "/properties",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<GeneralProperties> newProperty(@ApiParam(value = "Json representing the object with the property value." ,required=true )  @RequestBody RequestWrapperMapStringString body) throws ApiException{
        return new ResponseEntity<GeneralProperties>(service.newProperty(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Modify properties of the user.", nickname = "updateProperties", notes = "", response = GeneralProperties.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = GeneralProperties.class) })
    @RequestMapping(value = "/properties/update",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<GeneralProperties> updateProperties(@ApiParam(value = "Json representing the properties object." ,required=true )  @RequestBody RequestWrapperGeneralProperties body) throws ApiException{
        return new ResponseEntity<GeneralProperties>(service.updateProperties(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
