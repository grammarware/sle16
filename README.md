# Artifact

The artifact is the plot of the file lengths and the plot of the respond times of Monto.

The benchmarks for the paper have been performed on a MacBook Pro (Retina, 15-inch, Early 2013)

The plotting script can be found at https://github.com/monto-editor/services-java/blob/master/plot.r

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

Please check that all executables (`pkg-config`, `java`, `stack`, `cloc`, `Rscript`) are in the `PATH` before continuing.

# Running of the Benchmarks

```sh
$ git clone https://github.com/monto-editor/benchmark.git
$ cd benchmark
$ ./benchmarks.sh ./monto
```

After the the benchmarks finished, the artifact can be found in `./monto/artifact/`.
