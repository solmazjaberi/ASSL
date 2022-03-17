package generatedbyassl.as.aes.producer;

import java.io.Serializable;
import java.util.Hashtable;
import generatedbyassl.as.ASSLMESSAGE;
import generatedbyassl.as.ASSLCHANNEL;
import generatedbyassl.as.ASSLFUNCTION;
import generatedbyassl.as.ASSLMANAGED_ELEMENT;

/**
 * Generated by ASSL Framework
 * 
 * This is the Java class generated for 'AEIP' (specified as AEIP ASSL tier).
 */
public class AEIP
	implements  Serializable
{

	/**
	 * Generated by ASSL Framework
	 * 
	 * This is a reference to the unique instance of 'AEIP' class.
	 */
	static private AEIP oInstance = null;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Needed by the class because it implements the Serializable interface.
	 */
	static final long serialVersionUID = 0001L;
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'message name'-'message reference' of all the messages specified by AEIP.
	 */
	public Hashtable<String, ASSLMESSAGE> MESSAGES = new Hashtable<String, ASSLMESSAGE>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'channel name'-'channel reference' of all the channels specified by AEIP.
	 */
	public Hashtable<String, ASSLCHANNEL> CHANNELS = new Hashtable<String, ASSLCHANNEL>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'function name'-'function reference' of all the functions specified by AEIP.
	 */
	public Hashtable<String, ASSLFUNCTION> FUNCTIONS = new Hashtable<String, ASSLFUNCTION>();
	/**
	 * Generated by ASSL Framework
	 * 
	 * Holds pairs 'managed element name'-'managed element reference' of all the managed elements specified by AEIP.
	 */
	private Hashtable<String, ASSLMANAGED_ELEMENT> MANAGED_ELEMENTS = new Hashtable<String, ASSLMANAGED_ELEMENT>();

	/**
	 * Generated by ASSL Framework
	 * 
	 * Because this is a singleton class its constructor is private.
	 */
	private  AEIP (  )
	{
		MESSAGES.put( "PUTREQUEST", generatedbyassl.as.aes.producer.aeip.messages.PUTREQUEST.getInstance() );
		CHANNELS.put( "PRODUCERTOBUFFER", generatedbyassl.as.aes.producer.aeip.channels.PRODUCERTOBUFFER.getInstance() );
		FUNCTIONS.put( "SENDPUTREQUEST", generatedbyassl.as.aes.producer.aeip.functions.SENDPUTREQUEST.getInstance() );
		MANAGED_ELEMENTS.put( "CONSUMER", generatedbyassl.as.aes.producer.aeip.managed_elements.CONSUMER.getInstance() );
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * This method returns the unique instance of 'AEIP' class.
	 */
	static public AEIP getInstance (  )
	{
		if ( null == oInstance ) 
		{
			oInstance = new AEIP();
		}
		return oInstance;
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a message specified by name.
	 */
	public ASSLMESSAGE getMessage ( String psMessageName )
	{
		return MESSAGES.get(psMessageName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a channel specified by name.
	 */
	public ASSLCHANNEL getChannel ( String psChannelName )
	{
		return CHANNELS.get(psChannelName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a function specified by name.
	 */
	public ASSLFUNCTION getFunction ( String psFunctionName )
	{
		return FUNCTIONS.get(psFunctionName);
	}

	/**
	 * Generated by ASSL Framework
	 * 
	 * Returns a reference to a managed element specified by name.
	 */
	public ASSLMANAGED_ELEMENT getManagedElement ( String psManagedElementName )
	{
		return MANAGED_ELEMENTS.get(psManagedElementName);
	}

}