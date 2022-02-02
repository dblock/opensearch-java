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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.elasticsearch.indices.stats;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.JsonpSerializable;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import org.opensearch.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.stats.ShardRouting

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/indices/stats/types.ts#L138-L143">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShardRouting implements JsonpSerializable {
	private final String node;

	private final boolean primary;

	@Nullable
	private final String relocatingNode;

	private final ShardRoutingState state;

	// ---------------------------------------------------------------------------------------------

	private ShardRouting(Builder builder) {

		this.node = ApiTypeHelper.requireNonNull(builder.node, this, "node");
		this.primary = ApiTypeHelper.requireNonNull(builder.primary, this, "primary");
		this.relocatingNode = builder.relocatingNode;
		this.state = ApiTypeHelper.requireNonNull(builder.state, this, "state");

	}

	public static ShardRouting of(Function<Builder, ObjectBuilder<ShardRouting>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code node}
	 */
	public final String node() {
		return this.node;
	}

	/**
	 * Required - API name: {@code primary}
	 */
	public final boolean primary() {
		return this.primary;
	}

	/**
	 * API name: {@code relocating_node}
	 */
	@Nullable
	public final String relocatingNode() {
		return this.relocatingNode;
	}

	/**
	 * Required - API name: {@code state}
	 */
	public final ShardRoutingState state() {
		return this.state;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("node");
		generator.write(this.node);

		generator.writeKey("primary");
		generator.write(this.primary);

		if (this.relocatingNode != null) {
			generator.writeKey("relocating_node");
			generator.write(this.relocatingNode);

		}
		generator.writeKey("state");
		this.state.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShardRouting}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ShardRouting> {
		private String node;

		private Boolean primary;

		@Nullable
		private String relocatingNode;

		private ShardRoutingState state;

		/**
		 * Required - API name: {@code node}
		 */
		public final Builder node(String value) {
			this.node = value;
			return this;
		}

		/**
		 * Required - API name: {@code primary}
		 */
		public final Builder primary(boolean value) {
			this.primary = value;
			return this;
		}

		/**
		 * API name: {@code relocating_node}
		 */
		public final Builder relocatingNode(@Nullable String value) {
			this.relocatingNode = value;
			return this;
		}

		/**
		 * Required - API name: {@code state}
		 */
		public final Builder state(ShardRoutingState value) {
			this.state = value;
			return this;
		}

		/**
		 * Builds a {@link ShardRouting}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShardRouting build() {
			_checkSingleUse();

			return new ShardRouting(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShardRouting}
	 */
	public static final JsonpDeserializer<ShardRouting> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShardRouting::setupShardRoutingDeserializer);

	protected static void setupShardRoutingDeserializer(ObjectDeserializer<ShardRouting.Builder> op) {

		op.add(Builder::node, JsonpDeserializer.stringDeserializer(), "node");
		op.add(Builder::primary, JsonpDeserializer.booleanDeserializer(), "primary");
		op.add(Builder::relocatingNode, JsonpDeserializer.stringDeserializer(), "relocating_node");
		op.add(Builder::state, ShardRoutingState._DESERIALIZER, "state");

	}

}