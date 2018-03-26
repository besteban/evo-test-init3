package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.Categories;
import com.ev.srv.testci.service.CategoriesService;

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
public class CategoriesController {

	@Autowired
    private CategoriesService service;

	@ApiOperation(value = "List all the categories.", nickname = "getListOfAllCategories", notes = "", response = Categories.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Categories.class, responseContainer = "List") })
    @RequestMapping(value = "/categories/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<Categories>> getListOfAllCategories( @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<Categories>>(service.getListOfAllCategories(tipo), HttpStatus.NOT_IMPLEMENTED);
    }

}
