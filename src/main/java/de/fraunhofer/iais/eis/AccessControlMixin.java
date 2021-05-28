package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("AccessControl")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface AccessControlMixin {
    @JsonProperty("accessPermissionRule")
    public List<AccessPermissionRule> getAccessPermissionRules();

    @JsonProperty("accessPermissionRule")
    public void setAccessPermissionRules(List<AccessPermissionRule> accessPermissionRules);

}
