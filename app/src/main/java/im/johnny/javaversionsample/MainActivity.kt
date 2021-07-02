package im.johnny.javaversionsample

import android.app.Activity
import android.os.Bundle
import java.nio.ByteBuffer
import java.nio.ByteOrder

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        1.toByteArray()
    }
}

fun Int.toByteArray(order: ByteOrder = ByteOrder.LITTLE_ENDIAN): ByteArray =
    ByteBuffer.allocate(Int.SIZE_BYTES).apply {
        order(order)
        putInt(this@toByteArray)
        rewind()
    }.array()
