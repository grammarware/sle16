The benchmarks for the paper have been performed on a MacBook Pro (Retina, 15-inch, Early 2013)

# Build Requirements

* pkg-config
* ZeroMQ 4
* Haskell Stack
* cloc
* java 8
* R with the following packages
  - ggplot2
  - outliers
  - dplyr

# Instructions for Mac

```sh
$ brew install pkg-config
$ brew install zeromq
$ brew install haskell-stack
$ brew install cloc
$ brew cask install java
$ brew tap homebrew/science
$ brew install r
$ R
> install.packages("ggplot2")
> install.packages("outliers")
> install.packages("dplyr")
# press ctrl-d to leave the R environment
```

Please check that all of the executables `pkg-config`, `java`, `stack`, `cloc` and `Rscript` are in the `PATH` before continuing.

# Running of the Benchmarks

```sh
$ git clone https://github.com/monto-editor/benchmark.git
$ cd benchmark
$ ./benchmarks.sh ./monto
```

If after the the benchmarks finished, the plots are in `./monto/service-java/benchmarks/build/*.png`.
