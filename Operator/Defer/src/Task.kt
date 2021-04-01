import io.reactivex.Observable


object DeferExample {

    // the observable value is what evaluated when calling Observable.just()
    fun observableWithoutDefer(): Observable<Int> {
        var dummy = 1
        val observable = Observable.just(dummy)
        dummy += 1

        return observable
    }

    // the observable value is what evaluated when the returned observable of this function is subscribed
    fun observableWithDefer(): Observable<Int> {
        var dummy = 1
        val observable = Observable.defer {
            Observable.just(dummy)
        }
        dummy += 1

        return observable
    }
}
