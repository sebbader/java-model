package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
* "View"
* "A view is a collection of referable elements w.r.t. to a specific viewpoint of one or more stakeholders."@en
* "Constraint AASd-064: If the semanticId of a View references a ConceptDescription then the category of the ConceptDescription shall be VIEW."@en 
*/

public class DefaultView implements View {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	protected List<Reference> dataSpecifications;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	protected Reference semanticId;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	protected LangStringSet description;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	protected LangStringSet displayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	protected String idShort;


	/**
	* "has referable category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	protected String referableCategory;


	/**
	* "contains element"
	* "Referable elements that are contained in the view."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
	protected List<Reference> containedElements;


	// no manual construction
	protected DefaultView() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.containedElements,
			this.referableCategory,
			this.description,
			this.displayName,
			this.idShort,
			this.dataSpecifications,
			this.semanticId});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultView other = (DefaultView) obj;
			return Objects.equals(this.containedElements, other.containedElements) &&
				Objects.equals(this.referableCategory, other.referableCategory) &&
				Objects.equals(this.description, other.description) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultView other = new DefaultView();
		other.containedElements = (List<Reference>) Util.clone(this.containedElements);
		other.referableCategory = (String) Util.clone(this.referableCategory);
		other.description = (LangStringSet) Util.clone(this.description);
		other.displayName = (LangStringSet) Util.clone(this.displayName);
		other.idShort = (String) Util.clone(this.idShort);
		other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
		other.semanticId = (Reference) Util.clone(this.semanticId);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/View/containedElement")
	final public List<Reference> getContainedElements() {
		return containedElements;
	}
	
	final public void setContainedElements (List<Reference> containedElements) {
		this.containedElements = containedElements;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/referableCategory")
	final public String getReferableCategory() {
		return referableCategory;
	}
	
	final public void setReferableCategory (String referableCategory) {
		this.referableCategory = referableCategory;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public LangStringSet getDescription() {
		return description;
	}
	
	final public void setDescription (LangStringSet description) {
		this.description = description;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public LangStringSet getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (LangStringSet displayName) {
		this.displayName = displayName;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
