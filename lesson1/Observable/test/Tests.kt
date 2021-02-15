import org.junit.Test

class Test {
    @Test
    fun solve() {
        solve(5)
            .test()
            .assertResult(5)
    }
}
