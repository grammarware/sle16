package eu.cactosfp7.cdosession.util;

import javax.measure.quantity.DataRate;
import javax.measure.quantity.Dimensionless;
import javax.measure.unit.NonSI;
import javax.measure.unit.SI;

import org.jscience.physics.amount.Amount;

import eu.cactosfp7.infrastructuremodels.load.logical.LogicalFactory;
import eu.cactosfp7.infrastructuremodels.load.logical.LogicalLoadModel;
import eu.cactosfp7.infrastructuremodels.load.logical.VirtualMemoryMeasurement;
import eu.cactosfp7.infrastructuremodels.load.logical.VirtualProcessingUnitsMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.InterconnectMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.MemoryMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalFactory;
import eu.cactosfp7.infrastructuremodels.load.physical.PhysicalLoadModel;
import eu.cactosfp7.infrastructuremodels.load.physical.PuMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.StorageMeasurement;
import eu.cactosfp7.infrastructuremodels.load.physical.Utilization;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.Hypervisor;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.LogicalDCModel;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.PuAffinity;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImage;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VMImageInstance;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMachine;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualMemory;
import eu.cactosfp7.infrastructuremodels.logicaldc.core.VirtualProcessingUnit;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorFactory;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorRepository;
import eu.cactosfp7.infrastructuremodels.logicaldc.hypervisor.HypervisorType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureType;
import eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitectureTypeRepository;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ComputeNode;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.CoreFactory;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.MemorySpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.PhysicalDCModel;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.ProcessingUnitSpecification;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.Rack;
import eu.cactosfp7.infrastructuremodels.physicaldc.core.StorageSpecification;

public class CdoSetter {

	public static ComputeNode setComputeNode(Rack rack, String nodeName) {
		ComputeNode computeNode = CoreFactory.INSTANCE.createComputeNode();
		computeNode.setRack(rack);
		computeNode.setName(nodeName);
		computeNode.setId(nodeName);

		return computeNode;
	}

	public static HypervisorType setHypervisorType(HypervisorRepository hypervisorRepository, String name) {
		HypervisorType hypervisorType = HypervisorFactory.INSTANCE.createHypervisorType();
		hypervisorType.setName(name); // manual
		// hypervisorType.setId(nodeName);
		hypervisorType.setHypervisorRepository(hypervisorRepository);

		return hypervisorType;
	}

	public static HypervisorType setHypervisorType(HypervisorRepository hypervisorRepository) {
		return setHypervisorType(hypervisorRepository, "kvm");
	}

	public static ArchitectureType setArchitectureType(ArchitectureTypeRepository architectureTypeRepository, String name) {
		ArchitectureType architectureType = eu.cactosfp7.infrastructuremodels.physicaldc.architecturetype.ArchitecturetypeFactory.INSTANCE.createArchitectureType();
		architectureType.setArchitectureTypeRepository(architectureTypeRepository);
		architectureType.setName(name);

		return architectureType;
	}

	public static Rack setRack(PhysicalDCModel physicalDCModel) {
		Rack rack = CoreFactory.INSTANCE.createRack();
		rack.setPhysicalDCModel(physicalDCModel);
		rack.setName("rack01");
		rack.setId("rack01");

		return rack;
	}

	public static Utilization setVCpuUtilization(VirtualProcessingUnitsMeasurement vCpuMeasurement, int counter, double vmCpuUtil) {
		Utilization vCpuUtilization = PhysicalFactory.INSTANCE.createUtilization();
		vCpuUtilization.setVirtualProcessingUnitMeasurement(vCpuMeasurement);
//		vCpuUtilization.setId("cpu" + counter);
		vCpuUtilization.setValue(Amount.valueOf(vmCpuUtil, Dimensionless.UNIT));

		return vCpuUtilization;
	}

	public static VirtualProcessingUnit setVCpu(VirtualMachine vm, String vmName) {
		VirtualProcessingUnit vCpu = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVirtualProcessingUnit();
		vCpu.setVirtualMachine(vm);
		return vCpu;
	}

	public static VirtualProcessingUnitsMeasurement setVCpuMeasurement(VirtualProcessingUnit vCpu, LogicalLoadModel logicalLoadModel, String vmName) {
		VirtualProcessingUnitsMeasurement vCpuMeasurement = LogicalFactory.INSTANCE.createVirtualProcessingUnitsMeasurement();
		vCpuMeasurement.setObservedVirtualProcessingUnit(vCpu);
		vCpuMeasurement.setLogicalLoadModel(logicalLoadModel);
//		vCpuMeasurement.setId(vmName);

		return vCpuMeasurement;
	}

	public static VirtualMemoryMeasurement setVMemoryMeasurement(VirtualMemory vMemory, String vmName, LogicalLoadModel logicalLoadModel) {
		VirtualMemoryMeasurement vMemoryMeasurement = LogicalFactory.INSTANCE.createVirtualMemoryMeasurement();
		vMemoryMeasurement.setObservedVirtualMemory(vMemory);
		vMemoryMeasurement.setLogicalLoadModel(logicalLoadModel);
//		vMemoryMeasurement.setId(vmName);

		return vMemoryMeasurement;
	}

	public static Utilization setVMemoryUtilization(VirtualMemoryMeasurement vMemoryMeasurement, String vmName, double vmMemoryUtilFinal) {
		Utilization vMemoryUtilization = PhysicalFactory.INSTANCE.createUtilization();
		vMemoryUtilization.setVirtualMemoryMeasurement(vMemoryMeasurement);
//		vMemoryUtilization.setId(vmName);
		vMemoryUtilization.setValue(Amount.valueOf(vmMemoryUtilFinal, Dimensionless.UNIT));

		return vMemoryUtilization;
	}

	public static VirtualProcessingUnit setVCpu_old(VirtualMachine vm, String vmName) {
		VirtualProcessingUnit vCpu = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVirtualProcessingUnit();
		vCpu.setVirtualMachine(vm);
		return vCpu;
	}

	public static VirtualMachine setVirtualMachine(VMImageInstance vmImageInstance, String vmName, Hypervisor hypervisor) {
		VirtualMachine vm = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVirtualMachine();
		vm.setVMImageInstance(vmImageInstance);
		vm.setId(vmName);
		vm.setHypervisor(hypervisor);

		return vm;
	}

	public static PuAffinity setPuAffinity(VirtualMachine vm) {
		PuAffinity puAffinity = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createPuAffinity();
		puAffinity.setVirtualMachine(vm);
		vm.setPuAffinity(puAffinity);

		return puAffinity;
	}
//FIXME: ki edw handle
//	public static VMImageInstance setVMImageInstance(VMImage vmImage, String nodeName, int j) {
//		VMImageInstance vmImageInstance = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVMImageInstance();
//		vmImageInstance.setExecutedVMImage(vmImage);
//		vmImageInstance.setId(nodeName + ".vmImageInstance." + j);
//		vmImageInstance.setIsRunLocally(true);
//		vmImageInstance.setLocalStorageSize(Amount.valueOf(0.0, SI.KILO(NonSI.BYTE)));
//
//		return vmImageInstance;
//	}
	//FIXME: ki edw handle
//	public static VMImageInstance setVMImageInstance(VMImage vmImage, String id) {
//		VMImageInstance vmImageInstance = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVMImageInstance();
//		vmImageInstance.setExecutedVMImage(vmImage);
//		vmImageInstance.setId(id);
//		vmImageInstance.setIsRunLocally(true);
//		vmImageInstance.setLocalStorageSize(Amount.valueOf(0.0, SI.KILO(NonSI.BYTE)));
//
//		return vmImageInstance;
//	}

	public static VMImage setVMImage(LogicalDCModel logicalDCModel) {
		VMImage vmImage = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVMImage();
		vmImage.setLogicalDCModel(logicalDCModel);
		vmImage.setName(vmImage.getId());

		return vmImage;
	}

	public static Hypervisor setHypervisor(String nodeName, LogicalDCModel logicalDCModel, ComputeNode node, HypervisorType hypervisorType) {
		Hypervisor hypervisor = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createHypervisor();
		hypervisor.setId(nodeName);
		hypervisor.setLogicalDCModel(logicalDCModel);
		hypervisor.setNode(node);
		hypervisor.setHypervisorType(hypervisorType);

		return hypervisor;
	}

	public static VirtualMemory setVMemory(long vmMemoryProvisioned, VirtualMachine vm, String vmName) {
		VirtualMemory vMemory = eu.cactosfp7.infrastructuremodels.logicaldc.core.CoreFactory.INSTANCE.createVirtualMemory();
		vMemory.setProvisioned(Amount.valueOf(vmMemoryProvisioned / 1024, SI.MEGA(NonSI.BYTE)));
		vMemory.setVirtualMemoryConsumingEntity(vm);
		vMemory.setId(vmName);

		return vMemory;
	}

	// public static MeasuredThroughput setMeasuredThroughput
	// (InterconnectMeasurement interConnectMeasurement, double
	// totalMeasuredThroughput, String nodeName){
	// MeasuredThroughput measuredThroughput =
	// PhysicalFactory.INSTANCE.createMeasuredThroughput();
	// measuredThroughput.setInterconnectMeasurement(interConnectMeasurement);
	// measuredThroughput.setValue(totalMeasuredThroughput);
	// measuredThroughput.setId(nodeName);
	//
	// return measuredThroughput;
	// }

	public static InterconnectMeasurement setInterconnectMeasurement(PhysicalLoadModel physicalLoadModel, double totalMeasuredThroughput, String nodeName) {
		InterconnectMeasurement interConnectMeasurement = PhysicalFactory.INSTANCE.createInterconnectMeasurement();
		interConnectMeasurement.setPhysicalLoadModel(physicalLoadModel);
		interConnectMeasurement.setMeasuredThroughput(Amount.valueOf(totalMeasuredThroughput, DataRate.UNIT));
		interConnectMeasurement.setObservedInterconnect(null);
//		interConnectMeasurement.setId(nodeName);

		return interConnectMeasurement;
	}

	public static Utilization setStorageUtilization(StorageMeasurement storageMeasurement, double totalStorageUsed, String nodeName) {
		Utilization storageUtilization = PhysicalFactory.INSTANCE.createUtilization();
		// storageUtilization.setStoragestate(storageMeasurement);
		storageUtilization.setValue(Amount.valueOf(totalStorageUsed, Dimensionless.UNIT));
//		storageUtilization.setId(nodeName);

		return storageUtilization;
	}

	public static StorageMeasurement setStorageMeasurement(PhysicalLoadModel physicalLoadModel, StorageSpecification storage, String nodeName) {
		StorageMeasurement storageMeasurement = PhysicalFactory.INSTANCE.createStorageMeasurement();
		storageMeasurement.setPhysicalLoadModel(physicalLoadModel);
		storageMeasurement.setObservedStorage(storage);
//		storageMeasurement.setId(nodeName);

		return storageMeasurement;
	}

	public static Utilization setMemoryUtilization(MemoryMeasurement memoryMeasurement, double totalMemoryUsed, String nodeName) {
		Utilization memoryUtilization = PhysicalFactory.INSTANCE.createUtilization();
		memoryUtilization.setMemoryMeasurement(memoryMeasurement);
		memoryUtilization.setValue(Amount.valueOf(totalMemoryUsed, Dimensionless.UNIT));
//		memoryUtilization.setId(nodeName);

		return memoryUtilization;
	}

	public static MemoryMeasurement setMemoryMeasurement(PhysicalLoadModel physicalLoadModel, MemorySpecification memory, String nodeName) {
		MemoryMeasurement memoryMeasurement = PhysicalFactory.INSTANCE.createMemoryMeasurement();
		memoryMeasurement.setPhysicalLoadModel(physicalLoadModel);
		memoryMeasurement.setObservedMemory(memory);
//		memoryMeasurement.setId(nodeName);

		return memoryMeasurement;
	}

	public static MemorySpecification setMemorySpecification(ComputeNode node, String nodeName, long totalMemorySize) {
		MemorySpecification memory = CoreFactory.INSTANCE.createMemorySpecification();
		memory.setNode(node);
		memory.setId(nodeName);
		memory.setSize(Amount.valueOf(totalMemorySize / 1024, SI.MEGA(NonSI.BYTE)));

		return memory;
	}

	public static Utilization setCpuUtilization(PuMeasurement cpuMeasurement, double totalCpuUsed, String nodeName) {
		Utilization cpuUtilization = PhysicalFactory.INSTANCE.createUtilization();
		cpuUtilization.setPuMeasurement(cpuMeasurement);
		cpuUtilization.setValue(Amount.valueOf(totalCpuUsed, Dimensionless.UNIT));
//		cpuUtilization.setId(nodeName);

		return cpuUtilization;
	}

	public static StorageSpecification setStorage(ComputeNode node, String nodeName, long totalStorage) {
		StorageSpecification storage = CoreFactory.INSTANCE.createStorageSpecification();
		storage.setNode(node);
		storage.setId(nodeName);
		storage.setSize(Amount.valueOf(totalStorage / 1024, SI.MEGA(NonSI.BYTE)));

		return storage;
	}

	public static PuMeasurement setCpuMeasurement(PhysicalLoadModel physicalLoadModel, ProcessingUnitSpecification cpu, String nodeName) {
		PuMeasurement cpuMeasurement = PhysicalFactory.INSTANCE.createPuMeasurement();
		cpuMeasurement.setPhysicalLoadModel(physicalLoadModel);
		cpuMeasurement.setObservedPu(cpu);
//		cpuMeasurement.setId(nodeName);

		return cpuMeasurement;
	}

	public static ProcessingUnitSpecification setCpu(int i, ComputeNode node, String nodeName, double frequency, int totalNumberOfCores, ArchitectureType architectureType) {
		ProcessingUnitSpecification cpu = CoreFactory.INSTANCE.createProcessingUnitSpecification();
		cpu.setPuId(i);
		cpu.setNode(node);
		cpu.setId(nodeName);
		cpu.setFrequency(Amount.valueOf(frequency, SI.MEGA(SI.HERTZ)));
		cpu.setNumberOfCores(totalNumberOfCores);
		cpu.setSupportsTurboMode(true);
		cpu.setArchitectureType(architectureType);

		return cpu;
	}
}
