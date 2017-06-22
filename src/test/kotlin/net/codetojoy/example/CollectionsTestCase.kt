
package net.codetojoy.example

import kotlin.test.assertEquals
import org.junit.*

class CollectionsTestCase {
    @Test fun testMap() {
        val names = listOf("Beethoven", "Paganini", "Bach")

        // test
        val composers = names.map { n -> Composer(n, "") } 

        assertEquals(3, composers.size)
        assertEquals("Bach", composers[2].name)
    }
}

