package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Contact;
import com.ev.srv.testci.model.RequestWrapperContact;
import com.ev.srv.testci.service.AgendaService;

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
public class AgendaController {

	@Autowired
    private AgendaService service;

	@ApiOperation(value = "Delete a contact from the agenda.", nickname = "deleteContact", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/agenda/{uuid}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteContact( @ApiParam(value = "Contact unique identifier",required=true) @PathVariable("uuid") String uuid, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<String>(service.deleteContact(uuid, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return a contact from the agenda of the user.", nickname = "getContactByText", notes = "", response = Contact.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Contact.class, responseContainer = "List") })
    @RequestMapping(value = "/agenda",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<Contact>> getContactByText( @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Name of the user", required = true)  @RequestParam(value = "userName", required = true) String userName) throws ApiException{
        return new ResponseEntity<List<Contact>>(service.getContactByText(acuerdoBE, userName), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Add a new contact to the user agenda.", nickname = "newContact", notes = "", response = Contact.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Contact.class) })
    @RequestMapping(value = "/agenda",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<Contact> newContact(@ApiParam(value = "Json representing the contact object." ,required=true )  @RequestBody RequestWrapperContact body) throws ApiException{
        return new ResponseEntity<Contact>(service.newContact(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Modify contact from the agenda.", nickname = "updateContact", notes = "", response = Contact.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Contact.class) })
    @RequestMapping(value = "/agenda/update",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<Contact> updateContact(@ApiParam(value = "Json representing the transfer object." ,required=true )  @RequestBody RequestWrapperContact body) throws ApiException{
        return new ResponseEntity<Contact>(service.updateContact(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
