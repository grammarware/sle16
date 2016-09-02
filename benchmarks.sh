#!/bin/bash

mkdir -p $1

pushd $1
git clone --branch benchmark https://github.com/monto-editor/broker.git
git clone --branch benchmark https://github.com/monto-editor/services-java.git
git clone --branch benchmark https://github.com/monto-editor/services-base-java.git
popd

pushd $1/broker
stack setup
stack init
stack build
popd

pushd $1/services-java
./gradlew benchmarks:plot
popd

if [ -e $1/services-java/benchmarks/build/filelengths.png -a $1/services-java/benchmarks/build/roundtriploc.png ];
then
    mkdir -p $1/artifact
    cp $1/services-java/benchmarks/build/{*.csv,*.png} $1/artifact
    DIR=$1/artifact
    echo "benchmarks ran successfully. The artifact can be found in $DIR"
else
    echo "benchmarks failed, please contact s.keidel@tudelft.nl"
fi
