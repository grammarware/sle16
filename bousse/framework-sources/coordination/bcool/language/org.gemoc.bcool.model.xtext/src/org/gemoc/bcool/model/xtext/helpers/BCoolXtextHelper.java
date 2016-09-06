package org.gemoc.bcool.model.xtext.helpers;

import java.util.Arrays;
import java.util.List;

import org.eclipse.ocl.examples.xtext.completeocl.completeoclcs.ClassifierContextDeclCS;

public class BCoolXtextHelper {
	/**
	 * Parses some context from the CS of ECL to deduce the context EClass of an
	 * ECL Event.
	 * 
	 * @param string
	 * @return
	 */
	public static String parseContextName(ClassifierContextDeclCS string) {
		String stringRepresentation = string.toString();
		String stringWithoutTheComments = stringRepresentation.replaceAll(
				"(?m)^--.*", "");
		List<String> arrayOfWords = Arrays.asList(stringWithoutTheComments
				.split("\\s+"));
		return arrayOfWords.get(arrayOfWords.indexOf("context") + 1);
	}
}
