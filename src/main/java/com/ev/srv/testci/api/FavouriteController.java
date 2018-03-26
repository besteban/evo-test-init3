package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.FavouriteTransfer;
import com.ev.srv.testci.model.RequestWrapperFavouriteTransfer;
import com.ev.srv.testci.service.FavouriteService;

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
public class FavouriteController {

	@Autowired
    private FavouriteService service;

	@ApiOperation(value = "Delete a favourite transfer of the user", nickname = "deleteFavourite", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/favourite/transfers/{uuid}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> deleteFavourite( @ApiParam(value = "Favourite transfer unique id.",required=true) @PathVariable("uuid") String uuid, @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<String>(service.deleteFavourite(uuid, codigoEntidad, usuarioBE, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Return the stored favourites for the given user.", nickname = "getFavourites", notes = "", response = FavouriteTransfer.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FavouriteTransfer.class, responseContainer = "List") })
    @RequestMapping(value = "/favourite/transfers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<FavouriteTransfer>> getFavourites( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE) throws ApiException{
        return new ResponseEntity<List<FavouriteTransfer>>(service.getFavourites(codigoEntidad, usuarioBE, acuerdoBE), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Add a new favourite transfer to the data base.", nickname = "newFavourite", notes = "", response = FavouriteTransfer.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FavouriteTransfer.class) })
    @RequestMapping(value = "/favourite/transfers",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<FavouriteTransfer> newFavourite(@ApiParam(value = "Json representing the favourite transfer object." ,required=true )  @RequestBody RequestWrapperFavouriteTransfer body) throws ApiException{
        return new ResponseEntity<FavouriteTransfer>(service.newFavourite(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Modify an already stored favourite transfer of the user", nickname = "updateFavourite", notes = "", response = FavouriteTransfer.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = FavouriteTransfer.class) })
    @RequestMapping(value = "/favourite/transfers/update",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<FavouriteTransfer> updateFavourite(@ApiParam(value = "Json representing the transfer object." ,required=true )  @RequestBody RequestWrapperFavouriteTransfer body) throws ApiException{
        return new ResponseEntity<FavouriteTransfer>(service.updateFavourite(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
