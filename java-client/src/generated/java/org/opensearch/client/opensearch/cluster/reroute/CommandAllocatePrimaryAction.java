/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.client.opensearch.cluster.reroute;

import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.JsonpMapper;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.json.PlainJsonSerializable;
import org.opensearch.client.util.ApiTypeHelper;
import org.opensearch.client.util.CopyableBuilder;
import org.opensearch.client.util.ObjectBuilder;
import org.opensearch.client.util.ObjectBuilderBase;
import org.opensearch.client.util.ToCopyableBuilder;

// typedef: cluster.reroute.CommandAllocatePrimaryAction

@JsonpDeserializable
@Generated("org.opensearch.client.codegen.CodeGenerator")
public class CommandAllocatePrimaryAction
    implements
        PlainJsonSerializable,
        ToCopyableBuilder<CommandAllocatePrimaryAction.Builder, CommandAllocatePrimaryAction> {

    private final boolean acceptDataLoss;

    @Nonnull
    private final String index;

    @Nonnull
    private final String node;

    private final int shard;

    // ---------------------------------------------------------------------------------------------

    private CommandAllocatePrimaryAction(Builder builder) {
        this.acceptDataLoss = ApiTypeHelper.requireNonNull(builder.acceptDataLoss, this, "acceptDataLoss");
        this.index = ApiTypeHelper.requireNonNull(builder.index, this, "index");
        this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
        this.shard = ApiTypeHelper.requireNonNull(builder.shard, this, "shard");
    }

    public static CommandAllocatePrimaryAction of(
        Function<CommandAllocatePrimaryAction.Builder, ObjectBuilder<CommandAllocatePrimaryAction>> fn
    ) {
        return fn.apply(new Builder()).build();
    }

    /**
     * Required - If a node which has a copy of the data rejoins the cluster later on, that data will be deleted. To ensure that these
     * implications are well-understood, this command requires the flag <code>accept_data_loss</code> to be explicitly set to
     * <code>true</code>.
     * <p>
     * API name: {@code accept_data_loss}
     * </p>
     */
    public final boolean acceptDataLoss() {
        return this.acceptDataLoss;
    }

    /**
     * Required - API name: {@code index}
     */
    @Nonnull
    public final String index() {
        return this.index;
    }

    /**
     * Required - API name: {@code node}
     */
    @Nonnull
    public final String node() {
        return this.node;
    }

    /**
     * Required - API name: {@code shard}
     */
    public final int shard() {
        return this.shard;
    }

    /**
     * Serialize this object to JSON.
     */
    @Override
    public void serialize(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeStartObject();
        serializeInternal(generator, mapper);
        generator.writeEnd();
    }

    protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {
        generator.writeKey("accept_data_loss");
        generator.write(this.acceptDataLoss);

        generator.writeKey("index");
        generator.write(this.index);

        generator.writeKey("node");
        generator.write(this.node);

        generator.writeKey("shard");
        generator.write(this.shard);
    }

    // ---------------------------------------------------------------------------------------------

    @Override
    @Nonnull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @Nonnull
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link CommandAllocatePrimaryAction}.
     */
    public static class Builder extends ObjectBuilderBase implements CopyableBuilder<Builder, CommandAllocatePrimaryAction> {
        private Boolean acceptDataLoss;
        private String index;
        private String node;
        private Integer shard;

        public Builder() {}

        private Builder(CommandAllocatePrimaryAction o) {
            this.acceptDataLoss = o.acceptDataLoss;
            this.index = o.index;
            this.node = o.node;
            this.shard = o.shard;
        }

        private Builder(Builder o) {
            this.acceptDataLoss = o.acceptDataLoss;
            this.index = o.index;
            this.node = o.node;
            this.shard = o.shard;
        }

        @Override
        @Nonnull
        public Builder copy() {
            return new Builder(this);
        }

        /**
         * Required - If a node which has a copy of the data rejoins the cluster later on, that data will be deleted. To ensure that these
         * implications are well-understood, this command requires the flag <code>accept_data_loss</code> to be explicitly set to
         * <code>true</code>.
         * <p>
         * API name: {@code accept_data_loss}
         * </p>
         */
        @Nonnull
        public final Builder acceptDataLoss(boolean value) {
            this.acceptDataLoss = value;
            return this;
        }

        /**
         * Required - API name: {@code index}
         */
        @Nonnull
        public final Builder index(String value) {
            this.index = value;
            return this;
        }

        /**
         * Required - API name: {@code node}
         */
        @Nonnull
        public final Builder node(String value) {
            this.node = value;
            return this;
        }

        /**
         * Required - API name: {@code shard}
         */
        @Nonnull
        public final Builder shard(int value) {
            this.shard = value;
            return this;
        }

        /**
         * Builds a {@link CommandAllocatePrimaryAction}.
         *
         * @throws NullPointerException if some of the required fields are null.
         */
        @Override
        @Nonnull
        public CommandAllocatePrimaryAction build() {
            _checkSingleUse();

            return new CommandAllocatePrimaryAction(this);
        }
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link CommandAllocatePrimaryAction}
     */
    public static final JsonpDeserializer<CommandAllocatePrimaryAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
        Builder::new,
        CommandAllocatePrimaryAction::setupCommandAllocatePrimaryActionDeserializer
    );

    protected static void setupCommandAllocatePrimaryActionDeserializer(ObjectDeserializer<CommandAllocatePrimaryAction.Builder> op) {
        op.add(Builder::acceptDataLoss, JsonpDeserializer.booleanDeserializer(), "accept_data_loss");
        op.add(Builder::index, JsonpDeserializer.stringDeserializer(), "index");
        op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
        op.add(Builder::shard, JsonpDeserializer.integerDeserializer(), "shard");
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + Boolean.hashCode(this.acceptDataLoss);
        result = 31 * result + this.index.hashCode();
        result = 31 * result + this.node.hashCode();
        result = 31 * result + Integer.hashCode(this.shard);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        CommandAllocatePrimaryAction other = (CommandAllocatePrimaryAction) o;
        return this.acceptDataLoss == other.acceptDataLoss
            && this.index.equals(other.index)
            && this.node.equals(other.node)
            && this.shard == other.shard;
    }
}
