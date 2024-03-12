package com.stub.rs.policy.models.quotes;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class QuestionnaireGroupResult {
	private String id;
	private List<Answers> answers;
}
