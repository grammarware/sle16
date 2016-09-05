The repository contains the cdoserver and the benchmark client we used. For both software components we assume Java version 7.

# CDO Server

On the machine where the cdo server runs, a MySQL/MariaDB server is required. Before starting the cdo server, import the dump `cdoserver/repo1.sql` to the database server. To start the cdo server, change to the subfolder `cdoserver` and execute `./eclipse` to start the binaries of the cdo server.

The cdo server provided by us is based on version 4.4.1 and uses in our setup mysql server version 5.5 on a Ubuntu 14.04 virtual machine. 

# Benchmark Client

To run the benchmark an equinox osgi environment is required. The three bundles CDOBenchmarkClient, eu.cactosfp7.cdosession, eu.cactosfp7.cdosessionclient can then be imported and executed. An Eclipse IDE with CDO/EMF support can be used to run the benchmarks. The IDE we used can be downloaded here "https://www.eclipse.org/downloads/packages/eclipse-modeling-tools/mars2".
The benchmark needs EMF models from one of our EC funded projects CACTOS, which can be installed via Eclipse and the update site "https://sdqweb.ipd.kit.edu/eclipse/cactos/optimisationplan/nightly/".

In our benchmark setup, we used Eclipse Mars.1 Release 4.5.1 with the EMF plugins installed. 