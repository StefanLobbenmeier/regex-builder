package sgreben.regex_builder.expression;

import sgreben.regex_builder.tokens.*;
import sgreben.regex_builder.Expression;

public class Repeat1Possessive extends Repeat1 {
	public Repeat1Possessive(Expression child) { super(child); }
	
	public void compile(sgreben.regex_builder.CaptureGroupIndex index, java.util.List<TOKEN> output) {
		super.compile(index, output);
		output.add(new PLUS());
	}
}