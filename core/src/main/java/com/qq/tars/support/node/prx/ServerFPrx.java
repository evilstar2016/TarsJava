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

package com.qq.tars.support.node.prx;

import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsCallback;
import com.qq.tars.protocol.tars.annotation.TarsContext;

@Servant
public interface ServerFPrx {
	/**
	 * 向node定时上报serverInfo
	 * @param serverInfo  服务状态
	 * @return  int 
	 */
	public int keepAlive(ServerInfo serverInfo);
	/**
	 * 向node定时上报serverInfo
	 * @param serverInfo  服务状态
	 * @return  int 
	 */
	public int keepAlive(ServerInfo serverInfo, @TarsContext java.util.Map<String, String> ctx);
	/**
	 * 向node定时上报serverInfo
	 * @param serverInfo  服务状态
	 * @return  int 
	 */
	public void async_keepAlive(@TarsCallback ServerFPrxCallback callback, ServerInfo serverInfo);
	/**
	 * 向node定时上报serverInfo
	 * @param serverInfo  服务状态
	 * @return  int 
	 */
	public void async_keepAlive(@TarsCallback ServerFPrxCallback callback, ServerInfo serverInfo, @TarsContext java.util.Map<String, String> ctx);
	/**
	 * 向node上报TARS版本信息
	 * @param string  版本信息
	 * @return  int 
	 */
	public int reportVersion(String app, String serverName, String version);
	/**
	 * 向node上报TARS版本信息
	 * @param string  版本信息
	 * @return  int 
	 */
	public int reportVersion(String app, String serverName, String version, @TarsContext java.util.Map<String, String> ctx);
	/**
	 * 向node上报TARS版本信息
	 * @param string  版本信息
	 * @return  int 
	 */
	public void async_reportVersion(@TarsCallback ServerFPrxCallback callback, String app, String serverName, String version);
	/**
	 * 向node上报TARS版本信息
	 * @param string  版本信息
	 * @return  int 
	 */
	public void async_reportVersion(@TarsCallback ServerFPrxCallback callback, String app, String serverName, String version, @TarsContext java.util.Map<String, String> ctx);
}
