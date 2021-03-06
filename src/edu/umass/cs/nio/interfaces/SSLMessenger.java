/*
 * Copyright (c) 2015 University of Massachusetts
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You
 * may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * Initial developer(s): V. Arun
 */
package edu.umass.cs.nio.interfaces;

import java.net.InetSocketAddress;

/**
 * @author arun
 *
 * @param <NodeIDType>
 * @param <MessageType>
 */
public interface SSLMessenger<NodeIDType, MessageType> extends
		Messenger<NodeIDType, MessageType> {

	/**
	 * @return Default client messenger if different from self.
	 */
	public AddressMessenger<MessageType> getClientMessenger();

	/**
	 * @param clientMessenger
	 */
	public void setClientMessenger(
			AddressMessenger<?> clientMessenger);

	/**
	 * @param sslClientMessenger
	 */
	public void setSSLClientMessenger(
			AddressMessenger<?> sslClientMessenger);

	/**
	 * @return Default client messenger if different from self.
	 */
	public AddressMessenger<MessageType> getSSLClientMessenger();

	/**
	 * @param rcvSockAddr 
	 * @return clientMessenger corresponding to (local) rcvSockAddr
	 */
	public AddressMessenger<MessageType> getClientMessenger(InetSocketAddress rcvSockAddr);
}
