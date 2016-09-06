import 'http://www.eclipse.org/uml2/5.0.0/UML'
--import 'http://fr.inria.aoste.martelight/time/1.0'
--import 'http://fr.inria.aoste.martelight/hlam/1.0'

 
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/kernel.ccslLib"
ECLimport  "platform:/plugin/fr.inria.aoste.timesquare.ccslkernel.model/ccsllibrary/CCSL.ccslLib"
ECLimport "platform:/resource/org.gemoc.bcool.example.productfumlandtfsm/interfaces/lib4RT.ccslLib"
 
package UML 
	
	context InputPin 
		def : dataRead : Event = self 
	
	context OutputPin
		def : dataWrite : Event = self
	
	context ControlNode
		def : startIt : Event = self --StartEvent
		def : finishIt : Event= self --StopEvent
		def : temporalEvent : Event = self --GenericEvent
		
	context Activity  
		def: startActivity : Event = self --StartEvent
		def: finishActivity: Event = self --StopEvent
		
	context Action
		def : startAction : Event = self --StartEvent
		def : finishAction : Event = self --StopEvent
		
	-- This is from Arda Goknil
	context MessageEvent
	    def : call : Event =self -- GenericEvent	

	-- This is from Arda Goknil
	context AcceptEventAction
	     inv attachCallEventAfterStartBeforeFinish:
	       let triggers: OrderedSet(UML::Trigger) = self.trigger->select(e| (e).event.oclIsKindOf(MessageEvent))->asOrderedSet() in
	        ((triggers)->size()>0) implies
	           (Relation AfterBeforeHappens(self.oclAsType(Action).startAction, (triggers)->first().event.oclAsType(MessageEvent).call, self.oclAsType(Action).finishAction))
    -- This is from Arda goknil    
    context SendSignalAction
        inv attachSignalEventAfterStartBeforeFinish:
            let signalEvents: OrderedSet(UML::SignalEvent) = (SignalEvent).allInstances()->asOrderedSet() in
             ((signalEvents)->select(n| (n).signal = self.signal)->size()>0) implies
                (Relation AfterBeforeHappens(self.oclAsType(Action).startAction, (signalEvents)->select(n| (n).signal = self.signal)->asOrderedSet()->first().oclAsType(MessageEvent).call, self.oclAsType(Action).finishAction))      
	
	context ObjectFlow
		inv consumeonlyIfproduced:
			(self.target.oclIsKindOf(InputPin)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(InputPin).dataRead))	
		inv consumeMeansStart:
			(self.target.oclIsKindOf(Action)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(Action).startAction))	

		inv consumeMeansControl:
			(self.target.oclIsKindOf(ControlNode)) implies
			(Relation Precedes(self.source.oclAsType(OutputPin).dataWrite, self.target.oclAsType(ControlNode).startIt))	
			
	context Action	
		inv waitControlToExecutenotNotComingfromControlNode:
		((self.incoming->size() > 0) and (self.incoming->asSequence().source->select(n| (n).oclIsKindOf(ControlNode))->size()= 0))   implies
			let incomingFinished : Event = self.incoming->asSequence()->first().source.oclAsType(Action).finishAction in
			(Relation Causes(incomingFinished, self.startAction))
			
		inv waitControlToExecutenotComingfrom:
		((self.incoming->size() > 0) and (self.incoming->asSequence().source->select(n| (n).oclIsKindOf(ControlNode))->size() > 0))   implies
			(Relation Causes(self.incoming->asSequence().source->select(n| (n).oclIsKindOf(ControlNode))->first().oclAsType(ControlNode).finishIt, self.startAction))
		
		inv StartAlternatesWithFinish:
			Relation Alternates(self.startAction,self.finishAction)
	
		--inv startWhenDataReadable:
		--(self.input->size() > 0) implies
			--let allInputDataRead : Event = Expression Inf(self.input.dataRead) in
			--Relation Coincides(self.startIt,allInputDataRead)
		
		--inv lastDataWroteCauseStop:
		--(self.output->size() > 0) implies
			--let allDataWrote : Event = Expression Sup(self.output.dataWrite) in
			--Relation Alternates(allDataWrote,self.finishIt)

		--inv startBeforeWriting:
		--(self.output->size() > 0) implies
			--let firstDataWrote : Event = Expression Inf(self.output.dataWrite) in
			--Relation Alternates(self.startIt,firstDataWrote)

	context Activity  
		
		inv startCausesInit:
			(self.node->select(n| (n).oclIsKindOf(InitialNode))->size()>0) implies
			   (Relation Causes(self.startActivity, self.node->select(n|(n).oclIsKindOf(InitialNode))->asSequence()->first().oclAsType(InitialNode).startIt))
	
--		inv lastMultipleFinalNodesStopActivity:
--		    let finalNodes : OrderedSet(uml::FinalNode) = self.node->select(n|n.oclIsKindOf(FinalNode)).oclAsType(FinalNode)->asOrderedSet() in
--		    let lastFinalNode : Event = Expression Sup(finalNodes.finishIt) in 
--		    (finalNodes->size()>1) implies 
--		    	(Relation Causes(lastFinalNode,self.finishActivity))
		
		inv lastSingleFinalNodeStopActivity:
		    let finalNodes : OrderedSet(FinalNode) = self.node->select(n|(n).oclIsKindOf(FinalNode)).oclAsType(FinalNode)->asOrderedSet() in
			((finalNodes)->size()=1) implies
			     (Relation Causes((finalNodes)->first().finishIt,self.finishActivity))
		
			
		inv noReEntrance:
			(not (self.isReentrant)) implies
			   (Relation Alternates(self.startActivity, self.finishActivity))
	
	context DecisionNode 
		inv DecisionCausalitiesOutgoingActions: 
			(not (self.outgoing->asSequence().target->select(n| (n).oclIsKindOf(ControlNode))->size()>0)) implies
			   let startChoice1 : Event = self.outgoing->asSequence()->first().target.oclAsType(Action).startAction in
			   let startChoice2 : Event = self.outgoing->asSequence()->last().target.oclAsType(Action).startAction in
			   --let unionOfChoices : Event = Expression[Union](startChoice1, startChoice2) in
			   --(Relation Precedes(startIt, unionOfChoices)) and 
			   (Relation Exclusion(startChoice1, startChoice2)) 

		inv DecisionCausalitiesOutgoingControlNodesActions: 
			((self.outgoing->size()=2) and
			 (self.outgoing->asSequence().target->select(n| (n).oclIsKindOf(ControlNode))->size()>0) and 
			 (self.outgoing->asSequence().target->select(n| (n).oclIsKindOf(Action))->size()>0)
			) implies
			   let startChoice1 : Event = self.outgoing->asSequence().target->select(n|(n).oclIsKindOf(Action))->asSequence()->first().oclAsType(Action).startAction in
			   -- WARN: Just support Decision --> Merge
			   let startChoice2 : Event = self.outgoing->asSequence().target->select(n|(n).oclIsKindOf(ControlNode))->asSequence()->first().oclAsType(ControlNode).temporalEvent in
			   --let unionOfChoices : Event = Expression[Union](startChoice1, startChoice2) in
			   --(Relation Precedes(startIt, unionOfChoices)) and 
			   (Relation Exclusion(startChoice1, startChoice2)) 
			
	   inv DecisionCausalitiesOutgoingActionsAlternates: 
			(not ((self).outgoing->asSequence().target->select(n| (n).oclIsKindOf(ControlNode))->size()>0)) implies
			   let allStartChoices : Event = Expression Union(self.outgoing->asSequence().target.oclAsType(Action).startAction) in
		       Relation Alternates(self.startIt, allStartChoices)


	   inv DecisionCausalitiesOutgoingControlNodesActionsAlternates: 
			((self.outgoing->size()=2) and
			 (self.outgoing->asSequence().target->select(n| (n).oclIsKindOf(ControlNode))->size()>0) and 
			 (self.outgoing->asSequence().target->select(n| (n).oclIsKindOf(Action))->size()>0)
			) implies
			   --let startChoice1 : Event = self.outgoing->asSequence().target->select(n|n.oclIsKindOf(Action))->asSequence()->first().oclAsType(Action).startIt in
		       --let startChoice2 : Event = self.outgoing->asSequence().target->select(n|n.oclIsKindOf(ControlNode))->asSequence()->first().oclAsType(ControlNode).startIt in
			   let unionOfTwoChoices : Event = Expression Union(self.outgoing->asSequence().target->select(n|(n).oclIsKindOf(Action))->asSequence()->first().oclAsType(Action).startAction, 
			   	                                                self.outgoing->asSequence().target->select(n|(n).oclIsKindOf(ControlNode))->asSequence()->first().oclAsType(ControlNode).temporalEvent) in
		       Relation Alternates(self.startIt, unionOfTwoChoices)

	
	context MergeNode
	 		
	 	inv MergeCausalitiesforTwoActions: 
			 ((self.incoming->asSequence().source->select(n| (n).oclIsKindOf(Action))->size()=2)) implies	
			let unionOfIncomes : Event = Expression Union(self.incoming.source.oclAsType(Action).finishAction) in
	 		(Relation Precedes(unionOfIncomes, self.startIt))
	 		
	 	-- Action and Decision Node incoming to a Merge Node
	 	-- WARM:
		inv MergeCausalitiesforActionAndDecition: 
			((self.incoming->size()=2) and
			 (self.incoming->asSequence().source->select(n| (n).oclIsKindOf(DecisionNode))->size()>0) and 
			 (self.incoming->asSequence().source->select(n| (n).oclIsKindOf(Action))->size()>0)
			) implies	
			 let unionOfActionAndDecision: Event = Expression Union(self.incoming->asSequence().source->select(n|(n).oclIsKindOf(Action))->asSequence()->first().oclAsType(Action).finishAction, 
			   	                                              self.temporalEvent) in
		     (Relation Precedes(unionOfActionAndDecision, self.startIt))
	 
   	 context ControlNode
	 	inv instantaneousExecution:
			Relation Coincides(self.startIt,self.finishIt)
			
		inv waitInputToControlFromAction:
		((not ((self).oclIsKindOf(MergeNode))) and (self.incoming->size() > 0) and (self.incoming->select(n|(n).source.oclIsKindOf(Action))->size()>0)) implies
			let incomingFinished : Event = self.incoming->select(n|(n).source.oclIsKindOf(Action))->asSequence()->first().source.oclAsType(Action).finishAction in --prob
			(Relation Causes(incomingFinished, self.startIt))
			
		inv waitInputFromMergeNode:
		(self.oclIsKindOf(ActivityFinalNode) and (self.incoming->size() > 0) and self.incoming->asSequence()->first().source.oclIsKindOf(MergeNode)) implies
			let incomingFinished : Event = self.incoming->asSequence()->first().source.oclAsType(Action).finishAction in --prob
			(Relation Causes(incomingFinished, self.startIt))
			


     --context InstanceSpecification
    	--def if (not self.getAppliedStereotype('time::Clock')->isEmpty()):
    		--tick : Event(self) = GenericEvent 

--     context InstanceSpecification
--        def : tick : Event(self) = GenericEvent
--       
--        inv liveordie:
--           (self.getAppliedStereotypes()->select(s | s.name = 'Clock')->isEmpty()) implies
--             (Relation Precedes (self.tick, self.tick)) 



			
--	--just to see more easily the causalities		
--	context InitialNodend 
--		inv runOnlyOnce:
--			let firstStart : Event = Expression OneTickAndDie(self.startIt) in 
--			Relation Coincides(self.startIt, firstStart)
--	
endpackage