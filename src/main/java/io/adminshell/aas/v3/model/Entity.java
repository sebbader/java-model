package io.adminshell.aas.v3.model;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.builder.*;
import io.adminshell.aas.v3.model.impl.*;

/**
 * "Entity" "An entity is a submodel element that is used to model entities."@en "Constraint
 * AASd-056: The semanticId of a Entity submodel element shall only reference a ConceptDescription
 * with the category ENTITY. The ConceptDescription describes the elements assigned to the entity
 * via Entity/statement."@en
 */
@KnownSubtypes({
    @KnownSubtypes.Type(value = DefaultEntity.class)
})
public interface Entity extends SubmodelElement {

    // standard methods

    // accessor methods as derived from the Asset Administration Shell ontology

    /**
     * "Reference to the asset the entity is representing."@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @return Returns the Reference for the property globalAssetId. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId")
    public Reference getGlobalAssetId();

    /**
     * "Reference to the asset the entity is representing."@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @param globalAssetId desired value for the property globalAssetId. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/globalAssetId
     */
    public void setGlobalAssetId(Reference globalAssetId);

    /**
     * "Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell. "@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @return Returns the IdentifierKeyValuePair for the property externalAssetId. More information
     *         under https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId")
    public IdentifierKeyValuePair getExternalAssetId();

    /**
     * "Reference to an identifier key value pair representing an external identifier of the asset
     * represented by the asset administration shell. "@en "The asset attribute must be set if
     * entityType is set to \'SelfManagedEntity\'. It is empty otherwise."@en "Constraint AASd-014:
     * Either the attribute globalAssetId or externalAssetId of an Entity must be set if
     * Entity/entityType is set to \'SelfManagedEntity\'. They are not existing otherwise."@en
     * 
     * @param externalAssetId desired value for the property externalAssetId. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/externalAssetId
     */
    public void setExternalAssetId(IdentifierKeyValuePair externalAssetId);

    /**
     * "Describes whether the entity is a co-managed entity or a self-managed entity."@en
     * 
     * @return Returns the EntityType for the property entityType. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/entityType")
    public EntityType getEntityType();

    /**
     * "Describes whether the entity is a co-managed entity or a self-managed entity."@en
     * 
     * @param entityType desired value for the property entityType. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/entityType
     */
    public void setEntityType(EntityType entityType);

    /**
     * "Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value."@en
     * 
     * @return Returns the List of SubmodelElements for the property statements. More information under
     *         https://admin-shell.io/aas/3/0/RC01/Entity/statement
     */
    @IRI("https://admin-shell.io/aas/3/0/RC01/Entity/statement")
    public List<SubmodelElement> getStatements();

    /**
     * "Describes statements applicable to the entity by a set of submodel elements, typically with a
     * qualified value."@en
     * 
     * @param statements desired value for the property statements. More information under
     *        https://admin-shell.io/aas/3/0/RC01/Entity/statement
     */
    public void setStatements(List<SubmodelElement> statements);

}
