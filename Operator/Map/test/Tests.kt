import io.reactivex.Observable
import org.junit.Test
import kotlin.random.Random

class MapTest {

    @Test
    fun solve() {
        val random1 = Random.nextInt()
        val random2 = Random.nextInt()
        val random3 = Random.nextInt()

        Map.solve(Observable.just(random1, random2, random3))
                .test()
                .assertResult("$random1", "$random2", "$random3")
    }
}
