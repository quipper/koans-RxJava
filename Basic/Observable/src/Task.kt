import io.reactivex.Observable

fun solve(value: Int): Observable<Int> {
    return Observable.just(value)
}
