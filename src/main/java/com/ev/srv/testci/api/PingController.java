package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.service.PingService;

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
public class PingController {

	@Autowired
    private PingService service;

	@ApiOperation(value = "Returns pong if the server is running.", nickname = "ping", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = String.class) })
    @RequestMapping(value = "/ping",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<String> ping() throws ApiException{
        return new ResponseEntity<String>(service.ping(), HttpStatus.NOT_IMPLEMENTED);
    }

}
