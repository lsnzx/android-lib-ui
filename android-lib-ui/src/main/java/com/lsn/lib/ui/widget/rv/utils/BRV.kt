/*
 * Copyright (C) 2018 Drake, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lsn.lib.ui.widget.rv.utils

object BRV {

    /**
     * 即item的layout布局中的<variable>标签内定义变量名称
     * 示例:
     * ```
     * <variable
     *      name="m"
     *      type="com.lsn.lib.ui.widget.rv.sample.model.CheckModel" />
     * ```
     * 则应在Application中的onCreate函数内设置:
     * `BRV.modelId = BR.m`
     */
    var modelId: Int = -1

    /**
     * 防抖动点击事件默认的间隔时间, 单位毫秒
     * @see com.lsn.lib.ui.widget.rv.BindingAdapter.onClick
     */
    var clickThrottle: Long = 500
}