package com.stub.rs.policy.models.quotes;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quotes {
	
	private String planCode;
	private String channel;
	private InsuredPersons insuredPersons;	
	private LocalDate policyStart;
	private LocalDate policyEnd;
	private String languageCode;
	private QuestionnaireGroupResult questionnaireGroupResult;
	private List<String> subPlans;	
	private String currencyCode;
	private String promoCode;
	private String affinityCode;
	
}
