package generatedbyassl.as.aes.buffer.aeself_management.self_healing;

import java.io.Serializable;
import generatedbyassl.as.*;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'inPutElementRequested' (specified as FLUENT ASSL tier).
 */
public class INPUTELEMENTREQUESTED
	extends ASSLFLUENT
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'INPUTELEMENTREQUESTED' class.
	 */
	static private INPUTELEMENTREQUESTED oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  INPUTELEMENTREQUESTED (  )
	{
		vInitiatedByEvents.add( generatedbyassl.as.aes.buffer.events.ISPUTELEMENTREQUESTED.getInstance() );
		generatedbyassl.as.aes.buffer.events.ISPUTELEMENTREQUESTED.getInstance().addEventCatcher(this); //**** fluent registers for that event
		vTerminatedByEvents.add( generatedbyassl.as.aes.buffer.events.BUFFERNOTEMPTY.getInstance() );
		generatedbyassl.as.aes.buffer.events.BUFFERNOTEMPTY.getInstance().addEventCatcher(this); //**** fluent registers for that event
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'INPUTELEMENTREQUESTED' class.
	 */
	static public INPUTELEMENTREQUESTED getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new INPUTELEMENTREQUESTED();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method calls all the fluent-mapped actions in sequence.
	 */
	protected synchronized void callFluentActions (  )
	{
	}

}