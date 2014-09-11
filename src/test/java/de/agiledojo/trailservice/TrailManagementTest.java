package de.agiledojo.trailservice;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TrailManagementTest {

	@Mock
	private TrailRepository repository;

	@Test(expected = TrailNotFoundException.class)
	public void getTrail_whenIdIsNotValid_throwException() {
		TrailManagement sut = new TrailManagement(repository);
		Long invalidId = 1000L;
		when(repository.getById(invalidId)).thenThrow(
				new TrailNotFoundException());
		sut.getTrail(invalidId);
	}

	@Test
	public void getTrail_whenIdIsFound_returnsTrail() {
		TrailManagement sut = new TrailManagement(repository);
		Long id = 1000L;
		Trail trail = new Trail();
		when(repository.getById(id)).thenReturn(trail);
		assertThat(sut.getTrail(id)).isEqualTo(trail);
	}
}
