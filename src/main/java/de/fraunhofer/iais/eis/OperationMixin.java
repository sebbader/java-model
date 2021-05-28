package de.fraunhofer.iais.eis;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import de.fraunhofer.iais.eis.util.*;

@JsonTypeName("Operation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "modelType")
public interface OperationMixin {
    @JsonProperty("inputVariable")
    public List<OperationVariable> getInputVariables();

    @JsonProperty("inputVariable")
    public void setInputVariables(List<OperationVariable> inputVariables);

    @JsonProperty("inoutputVariable")
    public List<OperationVariable> getInoutputVariables();

    @JsonProperty("inoutputVariable")
    public void setInoutputVariables(List<OperationVariable> inoutputVariables);

    @JsonProperty("outputVariable")
    public List<OperationVariable> getOutputVariables();

    @JsonProperty("outputVariable")
    public void setOutputVariables(List<OperationVariable> outputVariables);
}
