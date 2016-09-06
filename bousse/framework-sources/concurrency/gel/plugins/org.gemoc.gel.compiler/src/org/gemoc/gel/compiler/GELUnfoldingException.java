package org.gemoc.gel.compiler;

import org.eclipse.emf.ecore.EObject;

public class GELUnfoldingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -543377965373854487L;

	private EObject context;
	private Object unfoldedObject;

	public GELUnfoldingException(EObject context, Object unfoldedObject) {
		super("Could not successfully unfold " + unfoldedObject
				+ " for context " + context);
		this.context = context;
		this.unfoldedObject = unfoldedObject;
	}
}
