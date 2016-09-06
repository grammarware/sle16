import 'http://activitydiagram/1.0'

ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib" 

package activitydiagram
 
	context ActivityNode
		def : executeIt : Event = self.execute() 
	
	context Signal
		def : signalOccurs : Event = self 
	
	context Activity
		def : startActivity : Event = self.initialize() 
		def : finishActivity : Event = self.finish() 
	 
	context ControlFlow 
		def if (self.guard <> null): evalFalse : Event = self.clearOffer()
		def if (self.guard <> null): evalTrue : Event = self
		def if (self.guard <> null): evaluate : Event = self.evaluateGuard()[res] switch
														case false force evalFalse;
														case true force evalTrue;
	
	context SendSignalAction
		inv sendWhenStart:
			Relation Coincides(self.executeIt, self.signal.signalOccurs)
			
	context AcceptEventAction
		inv receiveAndExecuteAfterSending:
			Relation Precedes(self.trigger.signalOccurs, self.executeIt) 
	
	context ControlFlow
		inv trueOrFalse:
			(self.guard <> null) implies
			(Relation Exclusion(self.evalTrue, self.evalFalse))
		inv evalImpliesTrueOrFalse:
			(self.guard <> null) implies
			let TrueAndFalse : Event = Expression Union (self.evalTrue, self.evalFalse) in
			(Relation Precedes(self.evaluate, TrueAndFalse))														
		inv evalwhenSourceExec:
			(self.guard <> null) implies
			(Relation Coincides(self.source.executeIt, self.evaluate))

	context ActivityNode
		
		inv waitControlToExecute:
		((not ((self).oclIsKindOf(MergeNode)))
		and
			(not ((self).incoming->first().source.oclIsKindOf(DecisionNode)))  --TODO: what if severalNode whose a decision ?
		and
		   (self.incoming->size() > 1)
		and 
		   (self.incoming.oclAsType(ControlFlow).guard->first() = null)
		)implies
			let incomingFinished : Event = Expression Sup(self.incoming.source.executeIt) in
			(Relation Precedes(incomingFinished, self.executeIt)) 
		
		inv waitControlToExecute2:
		((not ((self).oclIsKindOf(MergeNode)))
		and
			(not ((self).incoming->first().source.oclIsKindOf(DecisionNode)))
		and
		   (self.incoming->size() = 1)
		and 
		   (self.incoming->first().oclAsType(ControlFlow).guard = null)
		)implies
			(Relation Precedes(self.incoming->first().source.executeIt, self.executeIt)) 
		
	context Activity
		inv NonReentrant:
			Relation Alternates(self.startActivity, self.finishActivity)
	
	context DecisionNode

		inv DecisionCausalities:
			let unionOfChoices : Event = Expression Union(self.outgoing->asSequence().target.executeIt) in
			(Relation Precedes(executeIt , unionOfChoices))
		inv DecisionExclusion:
			Relation Exclusion(self.outgoing->asSequence().target.executeIt) 

	context MergeNode
		inv MergeCausalities:
			let unionOfIncomes : Event = Expression Union(self.incoming.source.executeIt) in
			(Relation Precedes(unionOfIncomes, executeIt ))
	
	context InitialNode
		inv startedWhenActivityStart:
			Relation Precedes(self.activity.startActivity, self.executeIt  )
			
	context ActivityFinalNode
		inv finishWhenActivityFinished:
			Relation Coincides(self.executeIt , self.activity.finishActivity)
			
	context Activity
		inv onlyOneEnterIfNoFinal:
			(self.nodes->select(n |(n).oclIsKindOf(ActivityFinalNode))->size() = 0) implies
			let noFinishActivity : Event = Expression Minus(self.finishActivity,self.finishActivity) in
			Relation Coincides(self.finishActivity, noFinishActivity)

endpackage