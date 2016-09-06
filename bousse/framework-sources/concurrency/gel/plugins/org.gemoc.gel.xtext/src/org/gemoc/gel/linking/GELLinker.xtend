package org.gemoc.gel.linking

import org.gemoc.gexpressions.xtext.linking.GExpressionsLinker

class GELLinker extends GExpressionsLinker {

//	override protected installProxies(EObject obj, IDiagnosticProducer producer, Multimap<Setting, INode> settingsToLink) {
//		super.installProxies(obj, producer, settingsToLink)
//
//		// TODO : I'm not yet sure how to reference in a nicer manner to the EClasses so it's a bit hard-coded for now.
//		if (obj.eClass.name.equals("ExecutionFunctionResult")) {
//			val result = obj as ExecutionFunctionResult
//			if (result.type == null) {
//				val executionFunction = result.eContainer
//				if (executionFunction instanceof Kermeta3ExecutionFunction) {
//					val operation = (executionFunction as Kermeta3ExecutionFunction).getEOperation()
//					result.type = operation.EType
//				}
//			}
//		}
//	}

}
