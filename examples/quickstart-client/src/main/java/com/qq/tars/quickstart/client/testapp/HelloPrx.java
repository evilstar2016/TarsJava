/**
 * Tencent is pleased to support the open source community by making Tars available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.quickstart.client.testapp;

import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsCallback;
import com.qq.tars.protocol.tars.annotation.TarsContext;

import java.util.concurrent.CompletableFuture;

@Servant
public interface HelloPrx {

    public String hello(int no, String name);

    CompletableFuture<String> promise_hello(int no, String name);

    public String hello(int no, String name, @TarsContext java.util.Map<String, String> ctx);

    public void async_hello(@TarsCallback HelloPrxCallback callback, int no, String name);

    public void async_hello(@TarsCallback HelloPrxCallback callback, int no, String name, @TarsContext java.util.Map<String, String> ctx);
}
