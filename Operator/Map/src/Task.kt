import io.reactivex.Observable

object Map {
    fun solve(source: Observable<Int>): Observable<String> {
        return source.map { "$it" }
    }
}
