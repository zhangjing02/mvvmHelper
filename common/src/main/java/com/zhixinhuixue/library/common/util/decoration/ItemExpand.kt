package com.zhixinhuixue.library.common.util.decoration

/**
 * 作者　: hegaojian
 * 时间　: 2021/1/26
 * 描述　:
 */
/**
 * 可展开/折叠的条目
 */
interface ItemExpand {

    // 同级别的分组的索引位置
    var itemGroupPosition: Int

    // 是否已展开
    var itemExpand: Boolean

    // 子列表
    var itemSublist: List<Any?>?
}