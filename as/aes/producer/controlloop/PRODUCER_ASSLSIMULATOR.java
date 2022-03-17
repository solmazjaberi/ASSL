package generatedbyassl.as.aes.producer.controlloop;

import generatedbyassl.as.controlloop.ASSLSIMULATOR;
import generatedbyassl.as.ASSLSLO;
import generatedbyassl.as.ASSLMETRIC;
import generatedbyassl.as.ASSLACTION;

/**
 * Generated by ASSL Framework
 * 
 * This is the simulator class of the producer's control loop. An instance of this class participates in the monitor-analyzer-simulator-executor control loop of producer.
 */
public class PRODUCER_ASSLSIMULATOR
	extends ASSLSIMULATOR
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * The superclass ASSLSIMULATOR makes this class fully operational but not functional. Complete the methods below.
	 */

	/**
	 * Generated by ASSL Framework
	 * 
	 * Simulates solutions to find appropriate actions to fix the 'invalid metric' problem.
	 */
	public boolean simulate ( ASSLMETRIC poMetric )
	{
		//**** This method overrides the superclass's method.
		//**** Calling this method means that the analyzer did not find 'problem-solving' actions to solve this invalid metric problem.
		//**** Complete the method to simulate & generate solutions (in term of ASSL actions) that can be used as 'problem-solving' actions for this invalid metric.
		//**** Each found 'problem-solving' action must be added to the 'ACTIONS' vector declared in the superclass.
		//**** If the needed 'problem-solving' actions have been found then return 'true' else 'false'.
		return false;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Simulates solutions to find appropriate actions to fix the 'unsatisfied SLO' problem.
	 */
	public boolean simulate ( ASSLSLO poSLO )
	{
		//**** This method overrides the superclass's method.
		//**** Calling this method means that the analyzer did not find 'problem-solving' actions to solve this unsatisfied SLO problem.
		//**** Complete the method to simulate & generate solutions (in term of ASSL actions) that can be used as 'problem-solving' actions for this unsatisfied SLO.
		//**** Each found 'problem-solving' action must be added to the 'ACTIONS' vector declared in the superclass.
		//**** If the needed 'problem-solving' actions have been found then return 'true' else 'false'.
		return false;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Simulates solutions to find appropriate actions to fix the 'invalid metric' problem.
	 */
	protected ASSLACTION getDefaultAction ( ASSLMETRIC poMetric )
	{
		//**** This method overrides the superclass's method.
		//**** This method generates a 'problem-solving' action by default for invalid metrics.
		//**** Remove the superclass call and implement your own 'problem-solving' action by default.
		ASSLACTION oDummyAction = super.getDefaultAction( poMetric );
		return oDummyAction;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Simulates solutions to find appropriate actions to fix the 'unsatisfied SLO' problem.
	 */
	protected ASSLACTION getDefaultAction ( ASSLSLO poSLO )
	{
		//**** This method overrides the superclass's method.
		//**** This method generates a 'problem-solving' action by default for unsatisfied SLOs.
		//**** Remove the superclass call and implement your own 'problem-solving' action by default.
		ASSLACTION oDummyAction = super.getDefaultAction( poSLO );
		return oDummyAction;
	}

}