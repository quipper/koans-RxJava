## Defer

[Defer](https://github.com/ReactiveX/RxJava/wiki/Creating-Observables#defer) allow us to lazily create observable on subscribe time.
The two example methods should tell the difference between using defer and not. 

`Defer` is useful when you want to create observable of a mutable value that  might change on subscribe time, and you want to use the latest value.
In most cases, you should use defer whenever you create your own observable.
