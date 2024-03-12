package com.stub.rs.policy.models.quotes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Answers {
    @NotBlank
    @Size(min = 2, max = 100)
	private String question;
    
    @NotBlank
    @Size(min = 5, max = 1000)   
	private String answer;	
}
