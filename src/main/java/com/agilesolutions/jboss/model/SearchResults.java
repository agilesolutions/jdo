package com.agilesolutions.jboss.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * JAXB POJO returning the NEXUS REST call search results returned.
 *
 */
@XmlRootElement(name = "search-results")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResults {

	@XmlElement(name = "totalCount")
	private int count;

	@XmlElementWrapper(name = "data")
	@XmlElement(name = "artifact")
	private List<Artefact> artefacts;

	public List<Artefact> getArtifactsCollection() {
		return artefacts;
	}

	public void setArtifactsCollection(List<Artefact> artefacts) {
		this.artefacts = artefacts;
	}

	public int getTotalCount() {
		return count;
	}

	public void setTotalCount(int count) {
		this.count = count;
	}

}
