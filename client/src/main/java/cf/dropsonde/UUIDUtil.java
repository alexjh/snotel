/*
 *   Copyright (c) 2015 Intellectual Reserve, Inc.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package cf.dropsonde;

import org.cloudfoundry.dropsonde.events.UUID;

/**
 * @author Mike Heath
 */
public class UUIDUtil {

	public static UUID javaUUIDtoEventUUID(java.util.UUID javaUUID) {
		return new UUID(
				Long.reverseBytes(javaUUID.getLeastSignificantBits()),
				Long.reverseBytes(javaUUID.getMostSignificantBits())
		);
	}

	public static java.util.UUID eventUUIDtoJavaUUID(UUID uuid) {
		return new java.util.UUID(Long.reverseBytes(uuid.low), Long.reverseBytes(uuid.high));
	}
}
