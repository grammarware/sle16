# Efficient Data Partitioning for Distributed Model Tranformations (Class2Relational example)

This is a demo of a distributed transformation of the [Class2Relational](http://www.eclipse.org/atl/atlTransformations/#Class2Relational) example. The artefacte is provided in the form of a docker cluster, of two images, a **"hadoop-master"** and a **"hadoop-slave"**.
The docker images are made public for this convenience. Alongside with the hadoop/Hbase installs, the two images contain [ATL-MR][atlmr] and [NeoEMF/HBase][neoemf] libraries and dependencies. **ATL-MR** is distributed transformation engine for ATL on MapReduce, while  **NeoEMF/HBase** is a distributed persistence engine for EMF models. 


## Content and description 
The demo contains 2 scripts to build and launch a docker cluster. 
Each machine contains a **hadoop-2.6.0** and **hbase-0.98.13** binaries and configuration. The default configuration can handle up to 10 slave machines.

## Prerequisites

1. [Docker](https://www.docker.com/): is mandatory for using the artefact. It enables the deployment of the image instances (containers)
2. [Git](https://git-scm.com/): is dedicated for **advanced usage**. It will be used to fetch the original repository, which contains materials to rebuild the machines and reconfigure the cluster (e.g. resizing the hadoop/hbase cluster)
3. [Git lfs](https://git-lfs.github.com/): (**Advanced**) same as **Git**. Used to fetch large files (mainly binaries and 3rd party libraries)

## Steps to use the artefact
In the current demo, we provide our artefact with two different usage modes. The first one targets simple users, which want to set up a running environment for ATL-MR. The second mode concerns advanced users.  It enables in one side  the reconfiguration and build of the docker cluster. In the other side, it describes the usage of the random generator of EMF models in  NeoEMF/HBase,  as well as their transformations.   
### Simple usage 
The simple usage starts with the set up of our transformation environment. After we verify that our environment is operational, we launch the generation/transformation script.

1. **Installing docker**: 
 To install docker please follow the instructions provided in the official [documentation](https://docs.docker.com/engine/installation/linux/ubuntulinux/).	
2. **Pulling the images**: 
The hadoop cluster is composed of 2 images, a **hadoop-master**, and a **hadoop-slave**. 
In order to pull these images use the following instructions: 
    - Pulling the master image: 
    ```sh
    $ sudo docker pull amineben/hadoop-master:sle16 
    ```
    - Pulling the slave image: 
    ```sh
    $ sudo docker pull amineben/hadoop-slave:sle16 
    ```

**N.B: the use of sudo is mandatory, unless you create a docker group and add users to it. More information can be found in the official [documentation](https://docs.docker.com/engine/installation/linux/ubuntulinux/#/create-a-docker-group)**.

3. **Deploying the cluster**: 
- To deploy the cluster please use the script ```start-cluster.sh```: 
```sh
$ ./start-container.sh $cluster_size
```

- The script takes as argument the size of the cluster --master included. If no argument is provided, the script creates a mini-cluster of 1 *master* and 2 *slaves*. Moreover, if the ```$cluster_size``` is greater than 11, only eleven is considered. If users wish to launch a bigger cluster, please refer to the ['Cluster resize section' ](#Advanced Usage)
- The scripts creates a master container with ID="master" and slave containers with ID="`slave$i`"  ( ```for $i in 1.. $cluster_size-1```)
- If the script executes correctly, you should go directly to the "*$/root*" directory of the   
    >Warning: If the containers are already up, the script removes them, and launches new ones. 
4. **Running Hadoop/HBase**
- First of all, users have to make sure that a passwordless ssh channel is operational between the master and slaves. To do so, simply run an ```ssh``` command as follows: 

    ```sh
    $ ssh root@slave$i      #where slave$i is a valid slave ID
    ```
    > Notice: Give it few seconds before executing the command
    
    >If the channels are well set up, make sure you ```exit``` the slave and go back to the master container
- From the root directory run the script ``` start-hadoop.sh```
5. **Checking Hadooop/Hbase Envs**

In what follows we check that Hadoop and HBase  are up and running through the UI facilities.   
- In order to get `IP_ADDRESS` of the master container, open a new terminal and run the following command:

``` sh
$ docker inspect --format="{{.NetworkSettings.IPAddress}}" master
```

- Go to you favorite internet browser and type the IP_ADDRESS resulting from the previous command appended with 'IP_ADDRESS:8088' for Hadoop UI and 'IP_ADDRESS:60010' for HBase UI
- Make sur the total number of available slaves corresponds to ```$cluster_size```

6. **Launch the experiments**

After making  sure that Hadoop and HBase are up and running, go back to the *master* container, then:
- Access the directory */root/dist/dist-trans*
```sh
$ cd /root/dist/dist-trans/
```

- Launch the script ```run-all-class.sh```:
```sh
$ ./run-all-class.sh
```
- The script is responsible for generating input models with variating sizes. For each iteration, it run s the transformation on greedy mode, then in random mode, finally, it cleans the resource by removing source abd target models. The following algorithm summarizes how the experiments  proceed:

```
    foreach size in sizes do
        foreach pass in 1..3 do
            input <-- generateInputModel(size) 
            foreach mappers in 2..8 do
                transformUsingRandomDist(input, mappers)
                transformUsingGreedyDist(input, mappers)
                cleanRound()
            end 
        end
        deleteInputModel()
    end
```
 - Output logs are stored in the folder *data-experiments*

###Advanced usage
This section is dedicated to users wishing to reconfigure the default settings of the Hadoop cluster, using the random generator, or the distributed engine on a different transformation.  Docker build scripts are available on the cluster's github. [repository](https://raw.githubusercontent.com/atlanmod/hadoop-cluster-docker).
1. **Installing Git and Git lfs**		
 First of all,  the user is required to have both of git and git-lfs installed in the machine. Below you find instructions on how to install both softwares.

- Instructions on how to install git can be found in this [link](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git).		
 - Instructions on how to install git lfs can be found [here](https://git-lfs.github.com/).		
2. **Building the docker machines**

- After installing git properly, clone the  [repository](https://raw.githubusercontent.com/atlanmod/hadoop-cluster-docker) of the docker cluster, then  access its directory.
```sh
$ git clone  git@github.com:atlanmod/hadoop-cluster-docker.git 
$ cd hadoop-cluster-docker
```
- Afterwards checkout the **sle16 branch**

 ```sh
$ git checkout sle16
```

By default, the configuration files provided in this repository enable the deployment of a cluster having 1 **master** and up to 10 **slave** containers. Steps on how to resize the cluster are described below. 

The bash script ```build-image.sh``` is responsible for building the docker images. It takes as argument the image name ***{hadoop-(base|slave|master)}**. The image  **hadoop-base** is the parent image of both **hadoop-master** and **hadoop-slave**. Any changes that should affect all the machines has to be done at **hadoop-base**.

```sh
$ ./build-image.sh {hadoop-(base|slave|master)}
```

3. **Using the  Random Generator**

The source code of our random generator is available [online](https://github.com/atlanmod/fr.inria.atlanmod.instantiator.neoEMF).
The generation parameters are provided by the means of arguments. Below the usage:

```
usage: java -jar <this-file.jar> -c <path to the ePackage implementation> 
                                 -v <properties deviation>] 
                                 [-u <neoEMF output uri>] 
                                 [-e <seed>] 
                                 [-n <models>]
                                 [-s <size>] 
                                 [-p <proportion>] 
                                 [-d <degree>] 
                                 [-z <size>] 
                                 [-f] 
                                 [-g]
 -c,--package <path to the ePackage implementation>   PackgeImpl
 -v,--properties-variation <properties deviation>     Variation ([0..1]) in the properties' size (defaults to 0.1)
 -u,--suffixe <neoEMF-HBase output uri>               neoemfhba > The NeoEMF/HBase URI is composed of the protocol `neoemfhbase` :port number used in HBase is ":2181"se://HOST_ADDRESS:PORT/
 -e,--seed <seed>                                     Seed number (random by default)
 -n,--number-models <models>                          Number of generated models (defaults to 1)
 -s,--size <size>                                     Average models' size (defaults to 1,000)
 -p,--variation <proportion>                          Variation ([0..1]) in the models' size (defaults to 0.1)
 -d,--references-degree <degree>                      Average number of references per EObject (defaults to 8). Actual  sizes may vary +/- 10%.
 -z,--values-size <size>                              Average size for attributes with variable length (defaults to 24). Actual sizes may vary +/- 10%.
 -f,--force                                           Force the generation, even if input metamodels contain errors
 -g,--diagnose                                        Run diagnosis on the result model
```
    

 > The NeoEMF/HBase URI is composed of the protocol `neoemfhbase`,an IP address or hostname `HOST_ADDRESS`, and finally, ZooKeeper's port number `PORT`. By default, this port is ":2181"
 
-  A script example to launch the generator can be found under ``` /root/dist/dist-trans/gen-class.sh```

4. **Running different transformation** 
The transformation parameters are provided by the means of arguments. Below the usage:

```
usage: yarn jar <this-file.jar> -f <transformation.emftvm> 
                                -s <packageName.impl.SourcePackageImpl> 
                                -t <packageName.impl.TargetPackageImpl>  
                                -i <neoemfhbase://host:port/inputModelName> 
                                -o <neoemfhbase://host:port/outputModelName> 
                                [-m <mappers_hint> | -n <recors_per_mapper>]
                                [-v | -q]
                                [-g | -r] 
                                [-c]
 -f,--file <transformation.emftvm>                          URI of the ATL transformation file.
 -s,--source-package <packageName.impl.SourcePackageImpl>   the name of the source packageImple
 -t,--target-package <packageName.impl.TargetPackageImpl>   the name of target packageImpl.
 -r,--random                                                Random data distribution mode. Optional, enable by default. Mutually exclusive with  -g|--greedy.
 -i,--input <neoemfhbase://host:port/inputModelName>        URI of the input model
 -o,--output <neoemfhbase://host:port/outputModelName>      URI of the output file
 -m,--recommended-mappers <mappers_hint>                    The recommended number of mappers  (not strict, used only as a hint). Optional, defaults to 1. Excludes the use of '-n'.
 -n,--records-per-mapper <recors_per_mapper>                Number of records to be processed by mapper. Optional, defaults to all records. Excludes the use of '-m'.
 -v,--verbose                                               Verbose mode. Optional, disabled by default.
 -q,--quiet                                                 Do not print any information about the transformation execution on the standard output.  Optional, disabled by default.
 -g,--greedy                                                Random data distribution mode.  Optional, disabled by default. Mutually exclusive with -r|--random.
 -c,--counters                                              Resource statistics mode. Optional, disabled by default
```

- A script example to launch a single transformation can be found under 
```/root/dist/dist-trans/run-class-single.sh```


### Using the cluster in [AWS](https://console.aws.amazon.com)

As a proof of concept we tested the deployment of our cluster in a AWS instance of type **r3.4xlarge** type.
In order to ease the installation of Docker, it is recommended to choose **Linux** as OS.		
Hereafter, we will walk you through the **AWS** instance configuration and the cluster deployment.	

#### Making the EBS Volume available for use in Linux

Once your *ec2* instance is launched, only the principal partition with limited size is available for use. An unallocated *EBS* volume is there waiting for your intervention to partition it according to your need. This volume is exposed as a block device. You can format it with any file system and then mount it. After you make the EBS volume available for use, you can access it in the same ways that you access any other volume. We recommend you to use the principal partition to install packages, and the EBS one to deploy the cluster.
- Instructions on how to format and mount an *EBS* volume can be found in this [link](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-using-volumes.html).

- After configuring the instance, you can resume from the docker installation section.

   [atlmr]: <https://github.com/atlanmod/ATL_MR>
   [neoemf]: <https://github.com/atlanmod/NeoEMF>
                                                      
