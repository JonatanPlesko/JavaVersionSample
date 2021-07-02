package im.johnny.javaversionsample

import java.nio.ByteBuffer
import java.nio.ByteOrder

fun Int.toByteArray(order: ByteOrder = ByteOrder.LITTLE_ENDIAN): ByteArray =
    ByteBuffer.allocate(Int.SIZE_BYTES).apply {
        order(order)
        putInt(this@toByteArray)
        rewind()
    }.array()