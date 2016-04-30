package ch.agilesolutions.jboss.model;

import com.google.gson.annotations.Expose;


public class Build {
	@Expose(serialize = true)
	private String releaseTag;
	@Expose(serialize = true)
	private String name;
	@Expose(serialize = true)
	private Boolean defaultBuild;
	@Expose(serialize = true)
	private String description;
	@Expose(serialize = true)
	private Integer id;

	public String getReleaseTag() {
		return releaseTag;
	}
	public void setReleaseTag(String releaseTag) {
		this.releaseTag = releaseTag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getDefaultBuild() {
		return defaultBuild;
	}
	public void setDefaultBuild(Boolean defaultBuild) {
		this.defaultBuild = defaultBuild;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
