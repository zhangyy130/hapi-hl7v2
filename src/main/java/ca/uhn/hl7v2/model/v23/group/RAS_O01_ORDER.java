package ca.uhn.hl7v2.model.v23.group;

import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.log.HapiLogFactory;
import ca.uhn.hl7v2.model.v23.segment.*;

import ca.uhn.hl7v2.model.*;
/**
 * <p>Represents the RAS_O01_ORDER Group.  A Group is an ordered collection of message 
 * segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements: </p>
 * 0: ORC (Common order segment) <b></b><br>
 * 1: RAS_O01_ORDER_DETAIL (a Group object) <b>optional </b><br>
 * 2: RAS_O01_ENCODING (a Group object) <b>optional </b><br>
 * 3: RXA (Pharmacy administration segment) <b>repeating</b><br>
 * 4: RXR (Pharmacy route segment) <b></b><br>
 * 5: RAS_O01_OBSERVATION (a Group object) <b>optional repeating</b><br>
 * 6: CTI (Clinical Trial Identification) <b>optional repeating</b><br>
 */
public class RAS_O01_ORDER extends AbstractGroup {

	/** 
	 * Creates a new RAS_O01_ORDER Group.
	 */
	public RAS_O01_ORDER(Group parent, ModelClassFactory factory) {
	   super(parent, factory);
	   try {
	      this.add(ORC.class, true, false);
	      this.add(RAS_O01_ORDER_DETAIL.class, false, false);
	      this.add(RAS_O01_ENCODING.class, false, false);
	      this.add(RXA.class, true, true);
	      this.add(RXR.class, true, false);
	      this.add(RAS_O01_OBSERVATION.class, false, true);
	      this.add(CTI.class, false, true);
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error creating RAS_O01_ORDER - this is probably a bug in the source code generator.", e);
	   }
	}

	/**
	 * Returns ORC (Common order segment) - creates it if necessary
	 */
	public ORC getORC() { 
	   ORC ret = null;
	   try {
	      ret = (ORC)this.get("ORC");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns RAS_O01_ORDER_DETAIL (a Group object) - creates it if necessary
	 */
	public RAS_O01_ORDER_DETAIL getORDER_DETAIL() { 
	   RAS_O01_ORDER_DETAIL ret = null;
	   try {
	      ret = (RAS_O01_ORDER_DETAIL)this.get("ORDER_DETAIL");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns RAS_O01_ENCODING (a Group object) - creates it if necessary
	 */
	public RAS_O01_ENCODING getENCODING() { 
	   RAS_O01_ENCODING ret = null;
	   try {
	      ret = (RAS_O01_ENCODING)this.get("ENCODING");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RXA (Pharmacy administration segment) - creates it if necessary
	 */
	public RXA getRXA() { 
	   RXA ret = null;
	   try {
	      ret = (RXA)this.get("RXA");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RXA
	 * (Pharmacy administration segment) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RXA getRXA(int rep) throws HL7Exception { 
	   return (RXA)this.get("RXA", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RXA 
	 */ 
	public int getRXAReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("RXA").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns RXR (Pharmacy route segment) - creates it if necessary
	 */
	public RXR getRXR() { 
	   RXR ret = null;
	   try {
	      ret = (RXR)this.get("RXR");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns  first repetition of RAS_O01_OBSERVATION (a Group object) - creates it if necessary
	 */
	public RAS_O01_OBSERVATION getOBSERVATION() { 
	   RAS_O01_OBSERVATION ret = null;
	   try {
	      ret = (RAS_O01_OBSERVATION)this.get("OBSERVATION");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of RAS_O01_OBSERVATION
	 * (a Group object) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public RAS_O01_OBSERVATION getOBSERVATION(int rep) throws HL7Exception { 
	   return (RAS_O01_OBSERVATION)this.get("OBSERVATION", rep);
	}

	/** 
	 * Returns the number of existing repetitions of RAS_O01_OBSERVATION 
	 */ 
	public int getOBSERVATIONReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("OBSERVATION").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

	/**
	 * Returns  first repetition of CTI (Clinical Trial Identification) - creates it if necessary
	 */
	public CTI getCTI() { 
	   CTI ret = null;
	   try {
	      ret = (CTI)this.get("CTI");
	   } catch(HL7Exception e) {
	      HapiLogFactory.getHapiLog(this.getClass()).error("Unexpected error accessing data - this is probably a bug in the source code generator.", e);
	      throw new RuntimeException(e);
	   }
	   return ret;
	}

	/**
	 * Returns a specific repetition of CTI
	 * (Clinical Trial Identification) - creates it if necessary
	 * throws HL7Exception if the repetition requested is more than one 
	 *     greater than the number of existing repetitions.
	 */
	public CTI getCTI(int rep) throws HL7Exception { 
	   return (CTI)this.get("CTI", rep);
	}

	/** 
	 * Returns the number of existing repetitions of CTI 
	 */ 
	public int getCTIReps() { 
	    int reps = -1; 
	    try { 
	        reps = this.getAll("CTI").length; 
	    } catch (HL7Exception e) { 
	        String message = "Unexpected error accessing data - this is probably a bug in the source code generator."; 
	        HapiLogFactory.getHapiLog(this.getClass()).error(message, e); 
	        throw new RuntimeException(message);
	    } 
	    return reps; 
	} 

}