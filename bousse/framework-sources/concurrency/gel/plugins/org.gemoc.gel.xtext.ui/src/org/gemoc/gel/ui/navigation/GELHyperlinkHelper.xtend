package org.gemoc.gel.ui.navigation

import com.google.common.collect.Lists
import com.google.inject.Inject
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.URIConverter
import org.eclipse.jface.text.Region
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider
import org.eclipse.xtext.ui.editor.hyperlinking.HyperlinkHelper
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor
import org.eclipse.xtext.ui.editor.hyperlinking.XtextHyperlink
import org.gemoc.gel.ImportStatement
import org.gemoc.gel.services.GELGrammarAccess

class GELHyperlinkHelper extends HyperlinkHelper {

	@Inject extension GELGrammarAccess ga
	@Inject extension ImportUriGlobalScopeProvider gsp

	override createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {

		val INode node = NodeModelUtils.findLeafNodeAtOffset(resource.getParseResult().getRootNode(), offset);
		if (node != null && node.getGrammarElement() instanceof RuleCall &&
			node.getSemanticElement() instanceof ImportStatement) {
			if (ga.STRINGRule.equals((node.getGrammarElement() as RuleCall).getRule())) {
				val ImportStatement i = node.getSemanticElement() as ImportStatement;
				val String uriString = i.getImportURI();

				val URI uri = URI.createURI(uriString);
				val URIConverter uriConverter = resource.getResourceSet().getURIConverter();
				val URI normalized = if (uri.isPlatformResource()) {
						uri
					} else {
						uriConverter.normalize(uri)
					}

				val URI targetURI = gsp.getResourceDescriptions(resource, Lists.newArrayList(normalized)).
					getResourceDescription(normalized).getURI();
				val XtextHyperlink result = hyperlinkProvider.get();
				result.setURI(targetURI);
				val Region region = new Region(node.getOffset(), node.getLength());
				result.setHyperlinkRegion(region);
				result.setHyperlinkText(uriString);
				result.open();
				acceptor.accept(result);
			}
		}
		super.createHyperlinksByOffset(resource, offset, acceptor);
	}

}
