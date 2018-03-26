package com.ev.srv.testci.api;

import com.ev.srv.testci.model.AggregationPaymentModel;
import com.evo.api.springboot.exception.ApiException;
import com.ev.srv.testci.model.EvoMovement;
import com.ev.srv.testci.model.ExpensesDetail;
import java.time.OffsetDateTime;
import com.ev.srv.testci.model.PagedEvoMovement;
import com.ev.srv.testci.model.RequestWrapperBaseModel;
import com.ev.srv.testci.model.RequestWrapperPaymentModel;
import com.ev.srv.testci.service.PaymentmovementService;

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
public class PaymentmovementController {

	@Autowired
    private PaymentmovementService service;

	@ApiOperation(value = "This service allows to create a manual payment. Every single field is editable: categoryId, loadedAmount and frequency.", nickname = "createManualPaymentMovement", notes = "", response = EvoMovement.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EvoMovement.class, responseContainer = "List") })
    @RequestMapping(value = "/paymentmovement/new",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)

    public ResponseEntity<List<EvoMovement>> createManualPaymentMovement(@ApiParam(value = "Json representing the payment object" ,required=true )  @RequestBody RequestWrapperPaymentModel body) throws ApiException{
        return new ResponseEntity<List<EvoMovement>>(service.createManualPaymentMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List grouped payment movements by category associated with the subContract and filter conditions.", nickname = "getListOfAllPaymentMovementAggregatedByCategory", notes = "", response = ExpensesDetail.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = ExpensesDetail.class, responseContainer = "List") })
    @RequestMapping(value = "/paymentmovement/aggregated",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<List<ExpensesDetail>> getListOfAllPaymentMovementAggregatedByCategory( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo) throws ApiException{
        return new ResponseEntity<List<ExpensesDetail>>(service.getListOfAllPaymentMovementAggregatedByCategory(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "List all payment movements associated with the subContract and filter conditions.", nickname = "getListOfAllPaymentMovements", notes = "", response = PagedEvoMovement.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = PagedEvoMovement.class) })
    @RequestMapping(value = "/paymentmovement/list",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<PagedEvoMovement> getListOfAllPaymentMovements( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "From date in yyyyMMdd format", required = true)  @RequestParam(value = "desde", required = true) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format", required = true)  @RequestParam(value = "hasta", required = true) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Page number.")  @RequestParam(value = "page", required = false) Integer page, @ApiParam(value = "Page size.")  @RequestParam(value = "size", required = false) Integer size) throws ApiException{
        return new ResponseEntity<PagedEvoMovement>(service.getListOfAllPaymentMovements(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, desde, hasta, tipo, page, size), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "Filter the payment movements with wide range of options. Results are aggregated in its response.", nickname = "paymentFinder", notes = "", response = AggregationPaymentModel.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = AggregationPaymentModel.class) })
    @RequestMapping(value = "/paymentmovement/filter",
        produces = { "application/json" }, 
        method = RequestMethod.GET)

    public ResponseEntity<AggregationPaymentModel> paymentFinder( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "Number of items to retrieve.", required = true)  @RequestParam(value = "maxItems", required = true) Integer maxItems, @ApiParam(value = "From date in yyyyMMdd format")  @RequestParam(value = "desde", required = false) OffsetDateTime desde, @ApiParam(value = "To date in yyyyMMdd format")  @RequestParam(value = "hasta", required = false) OffsetDateTime hasta, @ApiParam(value = "I/E depending on whether want to filter ingress or egress movements")  @RequestParam(value = "tipo", required = false) String tipo, @ApiParam(value = "Category")  @RequestParam(value = "category", required = false) String category, @ApiParam(value = "Minimum amount.")  @RequestParam(value = "fromAmount", required = false) Double fromAmount, @ApiParam(value = "Maximum amount.")  @RequestParam(value = "toAmount", required = false) Double toAmount, @ApiParam(value = "Text to search in the description.")  @RequestParam(value = "text", required = false) String text) throws ApiException{
        return new ResponseEntity<AggregationPaymentModel>(service.paymentFinder(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, maxItems, desde, hasta, tipo, category, fromAmount, toAmount, text), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This services allows to delete a given payment (manual or forecasted). Deletions of real payments are not allowed.", nickname = "removePaymentMovement", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = String.class) })
    @RequestMapping(value = "/paymentmovement/delete",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)

    public ResponseEntity<String> removePaymentMovement( @ApiParam(value = "Entity code", required = true)  @RequestParam(value = "codigoEntidad", required = true) String codigoEntidad, @ApiParam(value = "User BE", required = true)  @RequestParam(value = "usuarioBE", required = true) String usuarioBE, @ApiParam(value = "Contract BE", required = true)  @RequestParam(value = "acuerdoBE", required = true) String acuerdoBE, @ApiParam(value = "Subcontract", required = true)  @RequestParam(value = "subacuerdo", required = true) String subacuerdo, @ApiParam(value = "Unique identifier", required = true)  @RequestParam(value = "uuid", required = true) String uuid, @ApiParam(value = "True for deleting the complete series.", required = true)  @RequestParam(value = "deleteAll", required = true) Boolean deleteAll) throws ApiException{
        return new ResponseEntity<String>(service.removePaymentMovement(codigoEntidad, usuarioBE, acuerdoBE, subacuerdo, uuid, deleteAll), HttpStatus.NOT_IMPLEMENTED);
    }

	@ApiOperation(value = "This service allows to edit a given payment. Depending on the payment type (paymentType) different fields can be edited.", nickname = "updatePaymentMovement", notes = "", response = EvoMovement.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = EvoMovement.class, responseContainer = "List") })
    @RequestMapping(value = "/paymentmovement/update",
        produces = { "application/json" }, 
        method = RequestMethod.POST)

    public ResponseEntity<List<EvoMovement>> updatePaymentMovement(@ApiParam(value = "Json representing the payment object" ,required=true )  @RequestBody RequestWrapperBaseModel body) throws ApiException{
        return new ResponseEntity<List<EvoMovement>>(service.updatePaymentMovement(body), HttpStatus.NOT_IMPLEMENTED);
    }

}
