/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.adminshell.aas.v3.model.impl;

import java.util.Objects;



import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.annotations.IRI;
import io.adminshell.aas.v3.model.builder.*;

/**
 * Default implementation of package io.adminshell.aas.v3.model.Identifier
 * 
 * Used to uniquely identify an entity by using an identifier.
 */

@IRI("aas:Identifier")
public class DefaultIdentifier implements Identifier {

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
    protected IdentifierType idType;

    @IRI("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
    protected String identifier;

    public DefaultIdentifier() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.identifier,
            this.idType);
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
            DefaultIdentifier other = (DefaultIdentifier) obj;
            return Objects.equals(this.identifier, other.identifier) &&
                Objects.equals(this.idType, other.idType);
        }
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public IdentifierType getIdType() {
        return idType;
    }

    @Override
    public void setIdType(IdentifierType idType) {
        this.idType = idType;
    }

    /**
     * This builder class can be used to construct a DefaultIdentifier bean.
     */
    public static class Builder extends IdentifierBuilder<DefaultIdentifier, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultIdentifier newBuildingInstance() {
            return new DefaultIdentifier();
        }
    }
}
