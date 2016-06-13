package ch.agilesolutions.jboss.cache;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import javax.inject.Inject;

import ch.agilesolutions.jboss.data.NexusDao;
import ch.agilesolutions.jboss.model.Artefact;

/**
 * http://www.adam-bien.com/roller/abien/entry/singleton_the_perfect_cache_facade
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class ReferenceCache {

	@Inject 
	NexusDao nexusDao;
	
	private List<String> runtimes = Collections.synchronizedList(new ArrayList<>());

	private List<String> machines = Collections.synchronizedList(new ArrayList<>());
	
	
	
	@PostConstruct
    public void initialize() {
		List<Artefact> eaps = nexusDao.listArtefacts("jboss", "eap", "", "binaries");
		
		eaps.stream().forEach(a-> {
			runtimes.add(String.format("%s-%s", a.getArtifactId(),a.getVersion()));
		});
		List<Artefact> jdks = nexusDao.listArtefacts("java", "jdk", "", "binaries");
		
		eaps.stream().forEach(a-> {
			machines.add(String.format("%s-%s", a.getArtifactId(),a.getVersion()));
		});
	}

	public List<String> getRuntimes() {
		return runtimes;
	}

	public List<String> getMachines() {
		return machines;
	}
	
	
	
	
}
