package com.stub.rs.policy.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stub.rs.policy.models.quotes.Quotes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/api/v2/quotes")
@Tag(name = "Quote Service Endpoints", description = "The list of endpoints defines in the Quote Service Controller") 
public class QuoteServiceController {

	@GetMapping(path = "/status")
	public String getStatus() {
		return "success";
	}

	@PostMapping(path = "/")
	public String createQuote(@RequestBody Quotes quoteRequest) {
		return "success";
	}	
	
	
	@Operation(summary = "Get a quote by its id")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "200", description = "Found the book", 
	    content = { @Content(mediaType = "application/json",
	      schema = @Schema(implementation = Quotes.class)) }),
	  @ApiResponse(responseCode = "400", description = "Invalid quote id supplied", 
	    content = @Content), 
	  @ApiResponse(responseCode = "404", description = "Quote not found", 
	    content = @Content) })	
	@GetMapping(path = "/{id}")
	public Quotes getById(@Parameter(description = "id of the quote to be searched") @PathVariable long id) {
		//return repository.findById(id).orElseThrow(() -> new BookNotFoundException());
		return Quotes.builder()
				.planCode("10900")
				.channel("PARTNER")
				.currencyCode("USD")
				.planCode("PLAN_78290")
				.policyStart(LocalDate.now())
				.policyEnd(LocalDate.now())
				.build();		
	}
	

}
