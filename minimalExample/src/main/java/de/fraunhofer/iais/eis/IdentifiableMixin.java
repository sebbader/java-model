package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Identifiable")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface IdentifiableMixin {
    @JsonProperty("administration")
    public List<AdministrativeInformation> getAdministrations();

    @JsonProperty("administration")
    public void setAdministrations(List<AdministrativeInformation> administrations);

    @JsonProperty("identification")
    public List<Identifier> getIdentifications();

    @JsonProperty("identification")
    public void setIdentifications(List<Identifier> identifications);
}
