package util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class StringUtilsTest {

    @DisplayName("String to int 정상 테스트")
    @Test
    fun name() {
        assertEquals(StringUtils.parseInt("1000"), 1000)
    }

    @DisplayName("String to int 비정상 테스트")
    @Test
    fun name2() {
        assertEquals(StringUtils.parseInt("asdasd"), 0)
    }

    @DisplayName("빈 문자열 테스트")
    @Test
    fun name3() {
        assertEquals(StringUtils.isEmpty(""), true)
    }

    @DisplayName("비지 않은 문자열 테스트")
    @Test
    fun name4() {
        assertEquals(StringUtils.isEmpty("aaa"), false)
    }

    @DisplayName("split 테스트")
    @Test
    fun name5() {

        // when
        val actual = StringUtils.split("hi,hello,my,name", ",")

        // then
        assertNotNull(actual)
        assertEquals(actual.size, 4)
    }
}