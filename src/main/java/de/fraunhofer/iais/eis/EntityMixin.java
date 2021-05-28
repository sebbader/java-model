package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Entity")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface EntityMixin {

    @JsonProperty("statement")
    public List<SubmodelElement> getStatements();

    @JsonProperty("statement")
    public void setStatements(List<SubmodelElement> statements);
}
