import org.junit.Test

class DeferExampleTest {

    @Test
    fun withoutDefer() {
        DeferExample.observableWithoutDefer()
                .doOnNext {
                    println("without defer emit $it")
                }.test()
    }

    @Test
    fun withDefer() {
        DeferExample.observableWithDefer()
                .doOnNext {
                    println("with defer emit $it")
                }.test()
    }
}
