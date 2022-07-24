package nextstep.subway.applicaion.line.domain;

import nextstep.subway.applicaion.station.domain.Station;

import javax.persistence.*;

@Entity
public class LineStation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name="station_id")
	private Station station;

	@ManyToOne
	@JoinColumn(name = "line_id")
	private Line line;
}
