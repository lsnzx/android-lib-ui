package com.lsn.lib.ui.widget.rv.item

/**
 * 请先配置[com.lsn.lib.ui.widget.rv.BindingAdapter.setHasStableIds]为true才会生效
 */
interface ItemStableId {

    /**
     * 每个item数据模型都要实现本方法返回唯一ID
     * 请勿返回列表位置position
     */
    fun getItemId(): Long
}