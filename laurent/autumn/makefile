# ------------------------------------------------------------------------------

default: build

# ------------------------------------------------------------------------------
# PATHS

ifeq ($(OS) , Windows_NT)
SEP := ;
else
SEP := :
endif

$(shell mkdir -p lib)

output  := out/production/autumn
space	:= $(eval) $(eval)

jars	= $(subst $(space),$(SEP),$(shell find lib -name "*.jar"))
#           (java supports "lib/*", but not kotlin)
basecp	= $(output)$(SEP)$(jars)
cp		= "$(basecp)"
testcp	= "$(basecp)$(SEP)out/test"

# ------------------------------------------------------------------------------
# DEPS

NAME		:= autumn
VERSION		:= 0.1.0
KOTLIN_VER	:= 1.0.3
TESTNG_VER	:= 6.9.10
DOKKA_VER	:= 0.9.8
VIOLIN_VER	:= 0.1.0

MAVEN		:= http://central.maven.org/maven2
VIOLIN_P	:= https://dl.bintray.com/norswap/maven/com/norswap/violin
COMPILER_P	:= https://github.com/JetBrains/kotlin/releases/download
DOKKA_P		:= https://github.com/Kotlin/dokka/releases/download
TESTNG_P	:= $(MAVEN)/org/testng/testng
REFLECT_P	:= $(MAVEN)/org/jetbrains/kotlin/kotlin-reflect

TESTNG		:= "$(TESTNG_P)/$(TESTNG_VER)/testng-$(TESTNG_VER).jar"
DOKKA		:= "$(DOKKA_P)/$(DOKKA_VER)/dokka-fatjar.jar"
COMPILER	:= "$(COMPILER_P)/v$(KOTLIN_VER)/kotlin-compiler-$(KOTLIN_VER).zip"
REFLECT		:= "$(REFLECT_P)/$(KOTLIN_VER)/kotlin-reflect-$(KOTLIN_VER).jar"
VIOLIN		:= "$(VIOLIN_P)/$(VIOLIN_VER)/violin-$(VIOLIN_VER).jar"
VIOLIN_SRC	:= "$(VIOLIN_P)/$(VIOLIN_VER)/violin-$(VIOLIN_VER)-sources.jar"

lib/violin.jar:
	curl -L $(VIOLIN) > $@

lib/violin-sources.jar:
	curl -L $(VIOLIN_SRC) > $@

lib/kotlin-reflect.jar:
	curl -L $(REFLECT) > $@

lib/dokka.jar:
	curl -L $(DOKKA) > $@

lib/testng.jar:
	curl -L $(TESTNG) > $@

DEPS 	:= kotlin lib/violin.jar lib/kotlin-reflect.jar
TDEPS	:= $(DEPS) lib/testng.jar

sources: lib/violin-sources.jar

offline: $(TDEPS) lib/dokka.jar lib/violin-sources.jar

# ------------------------------------------------------------------------------
# KOTLIN

kotlinc:
	mkdir -p out
	curl -L $(COMPILER) > out/compiler.zip
	unzip out/compiler.zip -d .
	rm out/compiler.zip

KOTLINC_COMMAND		:= command -v kotlinc > /dev/null && kotlinc -version 2>&1
KOTLINC_ACTUAL		:= $(shell $(KOTLINC_COMMAND))
KOTLINC_EXPECTED	:= info: Kotlin Compiler version 1.0.3

ifeq ($(KOTLINC_ACTUAL) , $(KOTLINC_EXPECTED))

KOTLINC := kotlinc
KOTLIN  := kotlin
kotlin:;

else

KOTLINC := kotlinc/bin/kotlinc
KOTLIN  := kotlinc/bin/kotlin
kotlin: kotlinc

endif

# ------------------------------------------------------------------------------
# CLEAN

clean:
	rm -rf out

clean-deps:
#   leave the jars added by IntelliJ
	find lib ! -name 'kotlin-*.jar' -type f -exec rm -f {} +

clean-kotlin:
	rm -rf kotlinc

reset: clean clean-kotlin
	rm -rf lib

# ------------------------------------------------------------------------------
# BUILD & TEST

build: $(DEPS)
	mkdir -p $(output)
	javac -cp $(cp) -d $(output) src/norswap/autumn/utils/JUtils.java
	$(KOTLINC) -cp $(cp) src -d $(output)

build-tests: $(TDEPS)
	mkdir -p out/test
	$(KOTLINC) -cp $(testcp) test -d out/test

test:
	java -cp $(testcp) org.testng.TestNG test/testng.xml -d out/test-output

# ------------------------------------------------------------------------------
# JAR

STAGING	 := out/fatjar_staging
META_INF := $(STAGING)/META-INF

jar:
	find out -name .DS_Store -type f -delete
	jar cf out/$(NAME)-$(VERSION).jar -C $(output) .

fatjar:
	find out -name .DS_Store -type f -delete
	mkdir -p $(STAGING)
	unzip lib/violin.jar -d $(STAGING)
	mv $(META_INF)/main.kotlin_module $(META_INF)/violin.kotlin_module
	cp -R $(output)/* $(STAGING)
	jar cf out/$(NAME)-$(VERSION)-fat.jar -C $(STAGING) .
	rm -rf $(STAGING)

jars: jar
	find src -name .DS_Store -type f -delete
	jar cf out/$(NAME)-$(VERSION)-sources.jar -C src .
	jar cf out/$(NAME)-$(VERSION)-kdoc.jar -C out/docs/kotlin .

#	To generate javadoc jar:

#	jar cf out/$(NAME)-$(VERSION)-javadoc.jar -C out/docs/java .

# ------------------------------------------------------------------------------
# DOCS

docs: lib/dokka.jar
	mkdir -p out/docs/java
	mkdir -p out/docs/kotlin
	java -jar lib/dokka.jar src \
		-output out/docs/kotlin \
		-classpath $(cp) \
		-include src/norswap/$(NAME)/stream/package.md

#	To generate javadoc:

#	java -cp "$(JAVA_HOME)/lib/tools.jar$(SEP)lib/dokka.jar" \
#		org.jetbrains.dokka.MainKt src \
#		-output out/docs/java -format javadoc -classpath $(cp)

# ------------------------------------------------------------------------------
# TARGETED

target ?= benchmark.benchmark.AutumnBenchKt

trace:
	$(KOTLIN) -cp $(cp) -agentlib:hprof=cpu=samples,interval=1 $(target)

run:
	$(KOTLIN) -cp $(cp) $(target)

# ------------------------------------------------------------------------------
# ARTIFACTS

build-examples:
	mkdir -p out/examples
	$(KOTLINC) -cp $(cp) example -d out/examples

run-examply:
	$(KOTLIN) -cp "$(basecp)$(SEP)out/examples" examply.MainKt

examply: build build-examples run-examply

# ------------------------------------------------------------------------------

.PHONY: \
  default \
  deps \
  kotlin \
  clean \
  clean-deps \
  clean-kotlin \
  reset \
  build \
  build-tests \
  test \
  jar \
  fatjar \
  jars \
  docs \
  trace \
  run \
  build-examples \
  run-examply \
  examply

#.SILENT:

# ------------------------------------------------------------------------------
