package ca.uhn.hl7v2.model.v231.message;

import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v231.group.*;

import ca.uhn.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;

import ca.uhn.hl7v2.parser.ModelClassFactory;

import ca.uhn.hl7v2.parser.DefaultModelClassFactory;

import ca.uhn.hl7v2.model.AbstractMessage;

/**
 * <p>Represents a RRO_O02 message structure (see chapter 4.8.1). This structure contains the 
 * following elements: </p>
 * 0: MSH (MSH - message header segment) <b></b><br>
 * 1: MSA (MSA - message acknowledgment segment) <b></b><br>
 * 2: ERR (ERR - error segment) <b>optional </b><br>
 * 3: NTE (NTE - notes and comments segment) <b>optional repeating</b><br>
 * 4: RRO_O02_PIDNTEORCRXONTERXRRXCNTE (a Group object) <b>optional </b><br>
 */
public class RRO_O02 extends AbstractMessage  {

	/** 
	 * Creates a new RRO_O02 Group with custom ModelClassFactory.
	 */
	public RRO_O02(ModelClassFactory factory) {
	   super(factory);
	   init(factory);
	}

	/**
	 * Creates a new RRO_O02 Group with DefaultModelClassFactory. 
	 */ 
	public RRO_O02() { 
	   super(new DefaultModelClassFactory());
	   init(new DefaultModelClassFactory());
	}

	private void init(ModelClassFactory factory) {
	   try {
	      this.add(MSH.class, true, false);
	      this.add(MSA.class, true, false);
	      this.add(ERR.class, false, false);
	      this.add(NTE.class, false, true);
	      this.add(RRO_O02_PIDNTEORCRXONTERXRRXCNTE.class, false, false);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RRO_O02 - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns MSH (MSH - message header segment) - creates it if necessary
	 */
	public MSH getMSH() { 
	   MSH ret = null;
	   try {
	      ret = (MSH)this.get("MSH");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns MSA (MSA - message acknowledgment segment) - creates it if necessary
	 */
	public MSA getMSA() { 
	   MSA ret = null;
	   try {
	      ret = (MSA)this.get("MSA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns ERR (ERR - error segment) - creates it if necessary
	 */
	public ERR getERR() { 
	   ERR ret = null;
	   try {
	      ret = (ERR)this.get("ERR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of NTE (NTE - notes and comments segment) - creates it if necessary
	 */
	public NTE getNTE() { 
	   NTE ret = null;
	   try {
	      ret = (NTE)this.get("NTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of NTE
	 * (NTE - notes and comments segment) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public NTE getNTE(int rep) throws HL7Exception { 
	   return (NTE)this.get("NTE", rep);
	}

	/** 
	 * Returns the number of existing repetitions of NTE 
	 */ 
	public int getNTEReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("NTE").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns RRO_O02_PIDNTEORCRXONTERXRRXCNTE (a Group object) - creates it if necessary
	 */
	public RRO_O02_PIDNTEORCRXONTERXRRXCNTE getPIDNTEORCRXONTERXRRXCNTE() { 
	   RRO_O02_PIDNTEORCRXONTERXRRXCNTE ret = null;
	   try {
	      ret = (RRO_O02_PIDNTEORCRXONTERXRRXCNTE)this.get("PIDNTEORCRXONTERXRRXCNTE");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

}