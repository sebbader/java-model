package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
* "Policy Administration Point"
* "Definition of a security administration point (PDP)."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = DefaultPolicyAdministrationPoint.class)
})
public interface PolicyAdministrationPoint {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable labels about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable labels
	*/
	public List<TypedLiteral> getLabels();

	/**
	* This function retrieves a human readable explanatory comments about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comments
	*/
	public List<TypedLiteral> getComments();

	/**
	* This function returns a hash code value for the PolicyAdministrationPoint for the benefit of e.g. hash tables.
	* @return a hash code value for the PolicyAdministrationPoint
	*/
	public int hashCode();

	/**
	* This function indicates whether some other object is equal to this one.
	* @param obj the reference object with which to compare.
	* @return true if this PolicyAdministrationPoint is the same as the obj argument; false otherwise.
	*/
	public boolean equals(Object obj);

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "The policy administration point of access control as realized by the AAS itself."@en
	* "Constraint AASd-009: Either there is an external policy administration point endpoint defined or the AAS has its own access control."@en
	* @return Returns the AccessControl for the property policyAdministrationPointLocalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/localAccessControl")
	public AccessControl getPolicyAdministrationPointLocalAccessControl();

	/**
	* "Endpoint to an external access control defining a policy administration point to be used by the AAS."@en
	* @return Returns the boolean for the property policyAdministrationPointExternalAccessControl.
	* More information under https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/PolicyAdministrationPoint/externalAccessControl")
	public boolean getPolicyAdministrationPointExternalAccessControl();

}
