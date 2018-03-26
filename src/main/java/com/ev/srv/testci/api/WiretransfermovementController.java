package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationWireTransferMovement;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperWireTransferMovement;
import com.ev.srv.testci.model.StringFile;
import com.ev.srv.testci.model.WireTransferMovement;
import com.ev.srv.testci.service.WiretransfermovementService;

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
public class WiretransfermovementController {

	@Autowired
    private WiretransfermovementService service;

	@ApiOperation(value = "List all wire transfers associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllWireTransferMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class) })
    @RequestMapping(value = "/wiretransfermovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllWireTransferMovements( @ApiParam(value = "codigoEntidad", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "usuarioBE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "acuerdoBE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "subacuerdo", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "from date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "to date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllWireTransferMovements(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List wire transfers grouped by category associated with the account id and filter conditions. You can get ingress, egress or both", nickname = "getListOfAllWireTransfersMovementAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List") })
    @RequestMapping(value = "/wiretransfermovement/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllWireTransfersMovementAggregatedByCategory( @ApiParam(value = "codigoEntidad", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "usuarioBE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "acuerdoBE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "subacuerdo", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "from date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "to date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllWireTransfersMovementAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Get pdf for a wire transfer", nickname = "getWireTransferMovementPDF", notes = "", response = StringFile.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = StringFile.class) })
    @RequestMapping(value = "/wiretransfermovement/getWorld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<StringFile> getWireTransferMovementPDF( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "Uuid of the movement", required = true)  @RequestParam(value = "uuid", required = true) String uuid) throws ApiException{
        return new ResponseEntity<StringFile>(service.getWireTransferMovementPDF(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, uuid), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to change the multiple fields for a given account movement.", nickname = "updateWireTransferMovement", notes = "", response = WireTransferMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = WireTransferMovement.class) })
    @RequestMapping(value = "/wiretransfermovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<WireTransferMovement> updateWireTransferMovement(@ApiParam(value = "Json representing the wire transfer object" ,required=true )  @RequestBody RequestWrapperWireTransferMovement body) throws ApiException{
        return new ResponseEntity<WireTransferMovement>(service.updateWireTransferMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This is the filter accountValidationServiceI. Results are aggregated in its response.", nickname = "wireTransferFinder", notes = "", response = AggregationWireTransferMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationWireTransferMovement.class) })
    @RequestMapping(value = "/wiretransfermovement/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationWireTransferMovement> wireTransferFinder( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Category")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount.")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Number of movements to retrieve.")  @RequestParam(value = "maxItems", required = false) Integer maxItems, @ApiParam(value = "Text to search in the movement?s description.")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<AggregationWireTransferMovement>(service.wireTransferFinder(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, category, fromAmount, toAmount, maxItems, text), HttpStatus.NOT_IMPLEMENTED);
    }

}
