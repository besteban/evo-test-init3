package com.ev.srv.testci.api;

import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.CardMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedAggregationCardMovement;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperCardMovement;
import com.ev.srv.testci.service.CardmovementService;

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
public class CardmovementController {

	@Autowired
    private CardmovementService service;

	@ApiOperation(value = "Filtering out the card movements. Results are aggregated in its response.", nickname = "cardFinder", notes = "", response = PagedAggregationCardMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedAggregationCardMovement.class) })
    @RequestMapping(value = "/cardmovement/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedAggregationCardMovement> cardFinder( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Card contract", required = true)  @RequestParam(value = "cardContract", required = true) String cardContract, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Category")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount.")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount.")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of items to retrieve (maximum 50)")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to search in card movements description")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<PagedAggregationCardMovement>(service.cardFinder(codigoEntidad, usuarioBE, acuerdoBE, cardContract, desde, hasta, tipo, category, fromAmount, toAmount, maxItems, text), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List aggregated card movements by category associated with the subContract and filter conditions.", nickname = "getListOfAllCardMovementAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List") })
    @RequestMapping(value = "/cardmovement/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllCardMovementAggregatedByCategory( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Card contract", required = true)  @RequestParam(value = "cardContract", required = true) String cardContract, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllCardMovementAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, cardContract, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List all card movements associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllCardMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class) })
    @RequestMapping(value = "/cardmovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllCardMovements( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Card contract", required = true)  @RequestParam(value = "cardContract", required = true) String cardContract, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllCardMovements(codigoEntidad, usuarioBE, acuerdoBE, cardContract, desde, hasta, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to change multiple fields for a given card movement.", nickname = "updateCardMovement", notes = "", response = CardMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = CardMovement.class) })
    @RequestMapping(value = "/cardmovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<CardMovement> updateCardMovement(@ApiParam(value = "Json representing the card movement object" ,required=true )  @RequestBody RequestWrapperCardMovement body) throws ApiException{
        return new ResponseEntity<CardMovement>(service.updateCardMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
