package de.agiledojo.trailservice;

public class TrailManagement {

	private TrailRepository repository;

	public TrailManagement(TrailRepository repository) {
		this.repository = repository;
	}

	public Trail getTrail(Long id) {
		return repository.getById(id);
	}

}
