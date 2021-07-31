package com.ng.nguilib.utils

/**
 * 描述:
 * @author Jzn
 * @date 2020-05-07
 */

data class ParrotPillarNew(
        var name: String,
        var value: Number,
        var ratio: Float = 0.toFloat(),
        var color: Int = 0
) : Comparable<ParrotPillarNew> {

    var length: Float = 0.toFloat()
    var animLength: Float = 0.toFloat()

    var thickness: Float = 0.toFloat()


    override fun compareTo(other: ParrotPillarNew): Int {
        return other.value.toFloat().compareTo(this.value.toFloat())
    }

}
