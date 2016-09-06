import 'http://www.eclipse.org/uml2/4.0.0/UML'
 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
 
package uml 
	 
	context ActivityEdge
		def : tokenWrite : Event(self) = produceEvent
		def : tokenRead : Event(self) = ConsumeEvent 
	
	context ActivityNode
		def : startIt : Event(self) = StartEvent
		def : finishIt : Event(self) = StopEvent 
	
		inv waitControlToExecute:
		(not self.oclIsKindOf(MergeNode) and (self.incoming->size() > 0)) implies
			let readTokens : Event = Expression Intersection(self.incoming.tokenRead) in
			(Relation Coincides(readTokens, self.startIt))
			
		inv produceControlWhenFinish:
		(self.outgoing->size() > 0 ) implies
			let writeTokens : Event = Expression Union(self.outgoing.tokenWrite) in
			(Relation Coincides(writeTokens, self.finishIt))
		
		inv produceControlSynchronously:
		((self.outgoing->size() > 1) and (not self.oclIsTypeOf(DecisionNode))) implies
			(Relation Coincides(self.outgoing.tokenWrite))
	
	context ExecutableNode
		inv startBeforeFinish4ExecutableNode:
			Relation Precedes(startIt,finishIt) 
	  
	context ControlNode	 
		inv startBeforeFinish4nonExecutableNode:
			Relation Precedes(startIt,finishIt)

	context ActivityEdge
		inv WriteBeforeRead:
			Relation Precedes(self.tokenWrite, self.tokenRead)
--	context Activity  
--		--def : referenceClock : Event = undefined  
--		inv testForEach:  
--			self.ownedNode->forAll(n1,  n2 | if n1 <> n2 then ( Relation Exclusion(n1.startIt, n2.startIt) ) else true endif)
--	   
	context DecisionNode 
		inv DecisionCausalities: 
			let controlToChoice1 : Event = self.outgoing->asSequence()->first().tokenWrite in
			let controlToChoice2 : Event = self.outgoing->asSequence()->last().tokenWrite in
			--let unionOfChoices : Event = Expression[Union](startChoice1, startChoice2) in
			--(Relation Precedes(startIt, unionOfChoices)) and 
			(Relation Exclusion(controlToChoice1, controlToChoice2)) 
	
	
	context MergeNode
		inv MergeCausalities: 
			let unionOfIncomes : Event = Expression Union(self.incoming.tokenRead) in
	 		(Relation Causes(unionOfIncomes, self.startIt))
	 	
	 
	--just to see more easily the causalities		
	context InitialNode
		inv runOnlyOnce:
			let firstStart : Event = Expression OneTickAndDie(self.startIt) in 
			Relation Coincides(self.startIt, firstStart)
--	
endpackage