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

public class AnnotatedRelationshipElementBuilder {

	private DefaultAnnotatedRelationshipElement defaultAnnotatedRelationshipElement;

	public AnnotatedRelationshipElementBuilder() {
		defaultAnnotatedRelationshipElement = new DefaultAnnotatedRelationshipElement();
	}

	public AnnotatedRelationshipElementBuilder(URI id) {
		this();
		defaultAnnotatedRelationshipElement.id = id;
	}

	/**
	* This function allows setting a value for annotatedRelationshipElementAnnotations
	* @param annotatedRelationshipElementAnnotations desired value to be set
	* @return Builder object with new value for annotatedRelationshipElementAnnotations
	*/
	final public AnnotatedRelationshipElementBuilder annotatedRelationshipElementAnnotations(List<DataElement> annotatedRelationshipElementAnnotations) {
		this.defaultAnnotatedRelationshipElement.annotatedRelationshipElementAnnotations = annotatedRelationshipElementAnnotations;
		return this;
	}


	/**
	* This function allows setting a value for relationshipElementFirst
	* @param relationshipElementFirst desired value to be set
	* @return Builder object with new value for relationshipElementFirst
	*/
	final public AnnotatedRelationshipElementBuilder relationshipElementFirst(Referable relationshipElementFirst) {
		this.defaultAnnotatedRelationshipElement.relationshipElementFirst = relationshipElementFirst;
		return this;
	}


	/**
	* This function allows setting a value for relationshipElementSecond
	* @param relationshipElementSecond desired value to be set
	* @return Builder object with new value for relationshipElementSecond
	*/
	final public AnnotatedRelationshipElementBuilder relationshipElementSecond(Referable relationshipElementSecond) {
		this.defaultAnnotatedRelationshipElement.relationshipElementSecond = relationshipElementSecond;
		return this;
	}



	/**
	* This function allows setting a value for referableReferableCategories
	* @param referableReferableCategories desired value to be set
	* @return Builder object with new value for referableReferableCategories
	*/
	final public AnnotatedRelationshipElementBuilder referableReferableCategories(List<String> referableReferableCategories) {
		this.defaultAnnotatedRelationshipElement.referableReferableCategories = referableReferableCategories;
		return this;
	}


	/**
	* This function allows setting a value for referableDescriptions
	* @param referableDescriptions desired value to be set
	* @return Builder object with new value for referableDescriptions
	*/
	final public AnnotatedRelationshipElementBuilder referableDescriptions(List<TypedLiteral> referableDescriptions) {
		this.defaultAnnotatedRelationshipElement.referableDescriptions = referableDescriptions;
		return this;
	}


	/**
	* This function allows setting a value for referableDisplayName
	* @param referableDisplayName desired value to be set
	* @return Builder object with new value for referableDisplayName
	*/
	final public AnnotatedRelationshipElementBuilder referableDisplayName(TypedLiteral referableDisplayName) {
		this.defaultAnnotatedRelationshipElement.referableDisplayName = referableDisplayName;
		return this;
	}


	/**
	* This function allows setting a value for referableIdShort
	* @param referableIdShort desired value to be set
	* @return Builder object with new value for referableIdShort
	*/
	final public AnnotatedRelationshipElementBuilder referableIdShort(String referableIdShort) {
		this.defaultAnnotatedRelationshipElement.referableIdShort = referableIdShort;
		return this;
	}


	/**
	* This function allows setting a value for referableParent
	* @param referableParent desired value to be set
	* @return Builder object with new value for referableParent
	*/
	final public AnnotatedRelationshipElementBuilder referableParent(URI referableParent) {
		this.defaultAnnotatedRelationshipElement.referableParent = referableParent;
		return this;
	}


	/**
	* This function allows setting a value for qualifiableQualifiers
	* @param qualifiableQualifiers desired value to be set
	* @return Builder object with new value for qualifiableQualifiers
	*/
	final public AnnotatedRelationshipElementBuilder qualifiableQualifiers(List<Constraint> qualifiableQualifiers) {
		this.defaultAnnotatedRelationshipElement.qualifiableQualifiers = qualifiableQualifiers;
		return this;
	}


	/**
	* This function allows setting a value for hasDataSpecificationDataSpecifications
	* @param hasDataSpecificationDataSpecifications desired value to be set
	* @return Builder object with new value for hasDataSpecificationDataSpecifications
	*/
	final public AnnotatedRelationshipElementBuilder hasDataSpecificationDataSpecifications(List<Reference> hasDataSpecificationDataSpecifications) {
		this.defaultAnnotatedRelationshipElement.hasDataSpecificationDataSpecifications = hasDataSpecificationDataSpecifications;
		return this;
	}


	/**
	* This function allows setting a value for hasKindKind
	* @param hasKindKind desired value to be set
	* @return Builder object with new value for hasKindKind
	*/
	final public AnnotatedRelationshipElementBuilder hasKindKind(ModelingKind hasKindKind) {
		this.defaultAnnotatedRelationshipElement.hasKindKind = hasKindKind;
		return this;
	}


	/**
	* This function allows setting a value for hasSemanticsSemanticId
	* @param hasSemanticsSemanticId desired value to be set
	* @return Builder object with new value for hasSemanticsSemanticId
	*/
	final public AnnotatedRelationshipElementBuilder hasSemanticsSemanticId(Reference hasSemanticsSemanticId) {
		this.defaultAnnotatedRelationshipElement.hasSemanticsSemanticId = hasSemanticsSemanticId;
		return this;
	}
	/**
	* This function takes the values that were set previously via the other functions of this class and turns them into a Java bean.
	* @return Bean with specified values
	* @throws ConstraintViolationException This exception is thrown, if a validator is used and a violation is found.
	*/

	final public AnnotatedRelationshipElement build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(defaultAnnotatedRelationshipElement);
		return defaultAnnotatedRelationshipElement;
	}
}
