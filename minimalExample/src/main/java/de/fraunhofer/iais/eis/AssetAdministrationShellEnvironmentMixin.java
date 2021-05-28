package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AssetAdministrationShellEnvironment")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AssetAdministrationShellEnvironmentMixin {
    @JsonProperty("assetAdministrationShells")
    public List<AssetAdministrationShell> getAssetAdministrationShells();

    @JsonProperty("assetAdministrationShells")
    public void setAssetAdministrationShells(List<AssetAdministrationShell> assetAdministrationShells);

    @JsonProperty("assets")
    public List<Asset> getAssets();

    @JsonProperty("assets")
    public void setAssets(List<Asset> assets);

    @JsonProperty("conceptDescriptions")
    public List<ConceptDescription> getConceptDescriptions();

    @JsonProperty("conceptDescriptions")
    public void setConceptDescriptions(List<ConceptDescription> conceptDescriptions);

    @JsonProperty("submodels")
    public List<Submodel> getSubmodels();

    @JsonProperty("submodels")
    public void setSubmodels(List<Submodel> submodels);
}
