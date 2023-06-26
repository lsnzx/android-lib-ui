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

package com.lsn.lib.ui.widget.rv.animation

import android.animation.ObjectAnimator
import android.view.View


class SlideLeftItemAnimation : ItemAnimation {

    override fun onItemEnterAnimation(view: View) {
        ObjectAnimator.ofFloat(view, "translationX", -view.rootView.width.toFloat(), 0F)
                .setDuration(300)
                .start()
    }
}
