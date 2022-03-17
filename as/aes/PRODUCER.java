package generatedbyassl.as.aes;

import java.io.Serializable;
import generatedbyassl.as.ASSLAE;
import generatedbyassl.as.aes.producer.controlloop.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'Producer' (specified as AE ASSL tier).
 */
public class PRODUCER
	extends ASSLAE
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'PRODUCER' class.
	 */
	static private PRODUCER oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's monitor.
	 */
	private PRODUCER_ASSLMONITOR oMonitor = new PRODUCER_ASSLMONITOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's analyzer.
	 */
	private PRODUCER_ASSLANALYZER oAnalyzer = new PRODUCER_ASSLANALYZER();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's simulator.
	 */
	private PRODUCER_ASSLSIMULATOR oSimulator = new PRODUCER_ASSLSIMULATOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AE control loop's executor.
	 */
	private PRODUCER_ASSLEXECUTOR oExecutor = new PRODUCER_ASSLEXECUTOR();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the FRIENDS class.
	 */
	public generatedbyassl.as.aes.producer.FRIENDS FRIENDS = generatedbyassl.as.aes.producer.FRIENDS.getInstance();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds a reference to the AEIP class.
	 */
	public generatedbyassl.as.aes.producer.AEIP AEIP = generatedbyassl.as.aes.producer.AEIP.getInstance();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  PRODUCER (  )
	{
		vPolicies.put( "SELF_HEALING", generatedbyassl.as.aes.producer.aeself_management.SELF_HEALING.getInstance() );
		ACTIONS.put( "SEND", generatedbyassl.as.aes.producer.actions.SEND.getInstance() );
		EVENTS.put( "TIMETOSEND", generatedbyassl.as.aes.producer.events.TIMETOSEND.getInstance() );
		EVENTS.put( "CONFIRMATION", generatedbyassl.as.aes.producer.events.CONFIRMATION.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'PRODUCER' class.
	 */
	static public PRODUCER getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new PRODUCER();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Sets the control loop components.
	 */
	protected void setControlLoop (  )
	{
		//**** This method overrides the super class's method.
		//****************************************************
		oMonitor.setMonitoredSLO(AESLO);
		oMonitor.setMonitoredMetrics(METRICS);
		oMonitor.setAnalyzer(oAnalyzer);
		oAnalyzer.setSimulator(oSimulator);
		oAnalyzer.setExecutor(oExecutor);
		oSimulator.setExecutor(oExecutor);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Performs the AE control loop.
	 */
	protected void controlLoop (  )
	{
		//**** This method overrides the super class's method.
		//****************************************************
		try
		{
			//**** control loops should not be very resource-consuming, thus it releases CPU for a while
			Thread.sleep(1000);
		}
		catch ( InterruptedException ex ) 
		{
			System.err.println( ex.getMessage() );
		}
		//**** performs AE control loop monitor-analyzer-simulator-executor
		oMonitor.perform();
		oAnalyzer.perform();
		oSimulator.perform();
		oExecutor.perform();
		//**** applies all the "switched-on" self-management policies for the AS
		applayPolicies();
	}

}