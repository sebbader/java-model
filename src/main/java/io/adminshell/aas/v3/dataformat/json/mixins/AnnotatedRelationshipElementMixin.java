package io.adminshell.aas.v3.dataformat.json.mixins;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;
import io.adminshell.aas.v3.model.impl.builder.*;

@JsonTypeName("AnnotatedRelationshipElement")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AnnotatedRelationshipElementMixin {
    @JsonProperty("annotation")
    public List<DataElement> getAnnotations();

    @JsonProperty("annotation")
    public void setAnnotations(List<DataElement> annotations);
}
