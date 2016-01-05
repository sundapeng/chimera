/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intel.chimera.codec;

public abstract class AesCbcCryptoCodec extends CryptoCodec {

  protected static final CipherSuite SUITE = CipherSuite.AES_CBC_NOPADDING;

  /**
   * For AES, the algorithm block is fixed size of 128 bits.
   * @see http://en.wikipedia.org/wiki/Advanced_Encryption_Standard
   */
  private static final int AES_BLOCK_SIZE = SUITE.getAlgorithmBlockSize();

  @Override
  public CipherSuite getCipherSuite() {
    return SUITE;
  }

  /**
   * The IV is produced by adding the initial IV to the counter. IV length
   * should be the same as {@link #AES_BLOCK_SIZE}
   */
  @Override
  public void calculateIV(byte[] initIV, long counter, byte[] IV) {
  }
}
