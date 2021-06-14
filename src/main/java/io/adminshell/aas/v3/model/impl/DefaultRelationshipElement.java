package io.adminshell.aas.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.builder.*;

/**
 * "Relationship Element" "Constraint AASd-055: The semanticId of a RelationshipElement or a
 * AnnotatedRelationshipElement shall only reference a ConceptDescription with the category
 * RELATIONSHIP."@en
 */

public class DefaultRelationshipElement implements RelationshipElement {

    // instance fields as derived from the Asset Administration Shell ontology

    /**
     * "has Data Specification" "Global reference to the data specification template used by the
     * element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    /**
     * "has kind" "ModelingKind of the element: either type or instance."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    protected ModelingKind kind;

    /**
     * "has semantic ID" "Points to the Expression Semantic of the Submodels"@en "The semantic id might
     * refer to an external information source, which explains the formulation of the submodel (for
     * example an PDF if a standard)."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    protected Reference semanticId;

    /**
     * "has qualifier" "Additional qualification of a qualifiable element."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    protected List<Constraint> qualifiers = new ArrayList<>();

    /**
     * "has referable category" "The category is a value that gives further meta information w.r.t. to
     * the class of the element. It affects the expected existence of attributes and the applicability
     * of constraints."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    protected String category;

    /**
     * "has description" "Description or comments on the element. The description can be provided in
     * several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    protected List<LangString> descriptions = new ArrayList<>();

    /**
     * "has display name" "Display name. Can be provided in several languages."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    protected List<LangString> displayNames = new ArrayList<>();

    /**
     * "has short id" "Identifying string of the element within its name space."@en "Constraint
     * AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small
     * letter. I.e. [a-z][a-zA-Z0-9_]+."@en "Constraint AASd-003: idShort shall be matched
     * case-insensitive."@en "Constraint AASd-022: idShort of non-identifiable referables shall be
     * unqiue in its namespace."@en "Note: In case the element is a property and the property has a
     * semantic definition (HasSemantics) the idShort is typically identical to the short name in
     * English. "@en "Note: In case of an identifiable element idShort is optional but recommended to be
     * defined. It can be used for unique reference in its name space and thus allows better usability
     * and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC
     * UA."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    protected String idShort;

    /**
     * "has first relationship" "First element in the relationship taking the role of the subject."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    protected Reference first;

    /**
     * "has second relationship" "Second element in the relationship taking the role of the object."@en
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    protected Reference second;

    public DefaultRelationshipElement() {}

    @Override
    public int hashCode() {
        return Objects.hash(new Object[] {this.first,
            this.second,
            this.category,
            this.descriptions,
            this.displayNames,
            this.idShort,
            this.qualifiers,
            this.dataSpecifications,
            this.kind,
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
            DefaultRelationshipElement other = (DefaultRelationshipElement) obj;
            return Objects.equals(this.first, other.first) &&
                Objects.equals(this.second, other.second) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.kind, other.kind) &&
                Objects.equals(this.semanticId, other.semanticId);
        }
    }

    // accessor method implementations as derived from the Asset Administration Shell ontology

    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
    final public Reference getFirst() {
        return first;
    }

    final public void setFirst(Reference first) {
        this.first = first;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
    final public Reference getSecond() {
        return second;
    }

    final public void setSecond(Reference second) {
        this.second = second;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
    final public String getCategory() {
        return category;
    }

    final public void setCategory(String category) {
        this.category = category;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
    final public List<LangString> getDescriptions() {
        return descriptions;
    }

    final public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
    final public List<LangString> getDisplayNames() {
        return displayNames;
    }

    final public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
    final public String getIdShort() {
        return idShort;
    }

    final public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
    final public List<Constraint> getQualifiers() {
        return qualifiers;
    }

    final public void setQualifiers(List<Constraint> qualifiers) {
        this.qualifiers = qualifiers;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
    final public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    final public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
    final public ModelingKind getKind() {
        return kind;
    }

    final public void setKind(ModelingKind kind) {
        this.kind = kind;
    }

    @IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
    final public Reference getSemanticId() {
        return semanticId;
    }

    final public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    public static class Builder extends RelationshipElementBuilder<DefaultRelationshipElement, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultRelationshipElement newBuildingInstance() {
            return new DefaultRelationshipElement();
        }
    }
}
