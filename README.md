# Reproducing

In this repo, with `clj` installed run:

```
rm -r out; rm -r ~/.cljs/; clj -Srepro --main cljs.main --compile hello.core --repl-options "{:launch-browser false}" --repl
```

Which logs these warnings:

```
WARNING: Use of undeclared Var goog.math.Long/fromBits at line 64 /home/adam/.cljs/.aot_cache/1.10.741/7B43C05/clojure/test/check/random/longs.cljs
WARNING: Use of undeclared Var goog.math.Long/fromString at line 77 /home/adam/.cljs/.aot_cache/1.10.741/7B43C05/clojure/test/check/random/longs.cljs
WARNING: Use of undeclared Var goog.math.Long/fromNumber at line 81 /home/adam/.cljs/.aot_cache/1.10.741/7B43C05/clojure/test/check/random/longs.cljs
WARNING: Use of undeclared Var goog.math.Long/fromNumber at line 87 /home/adam/.cljs/.aot_cache/1.10.741/7B43C05/clojure/test/check/random/longs.cljs
WARNING: Use of undeclared Var goog.math.Long/getOne at line 92 /home/adam/.cljs/.aot_cache/1.10.741/7B43C05/clojure/test/check/random/longs.cljs
WARNING: cljs.core/<=, all arguments must be numbers, got [#{nil js/Number} number] instead at line 1193 /home/adam/.cljs/.aot_cache/1.10.741/26FED25/clojure/test/check/generators.cljc
```

The one I am most interested in is the last one.
